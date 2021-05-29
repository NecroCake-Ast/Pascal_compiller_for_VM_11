package VM11.PascalCompiller;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import VM11.PascalCompiller.Data.CodeLine;
import VM11.PascalCompiller.Data.ErrorsTable;
import VM11.PascalCompiller.Data.VariableTable;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalLexer;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser;

public class Main {
    private static final String EXTENSION = "g4";
    
    public  static ErrorsTable Errors = new ErrorsTable();
    public  static VariableTable Variables = new VariableTable();
    private static ArrayList<CodeLine> Code = new ArrayList<CodeLine>();
    
    private static int FindMaxLineLength () {
    	int maxLen = 0;
    	for (var line : Code)
    		if (line.getCode().length() > maxLen)
    			maxLen = line.getCode().length();
    	return maxLen;
    }
    
    private static void NormilizeCodeLength() {
    	int len = FindMaxLineLength();
    	for(var line : Code) {
    		String code = line.getCode();
    		while (code.length() < len) code += ' ';
    		line.setCode(code);
    	}
    }
    
    private static CommonTokenStream createTokens(String file) {
    	try {
    		CharStream in = CharStreams.fromFileName(file);
        	PascalLexer lexer = new PascalLexer(in);
        	lexer.removeErrorListeners();
        	lexer.addErrorListener(new ThrowingErrorListener());
        	CommonTokenStream tokens = new CommonTokenStream(lexer);
        	return tokens;
    	} catch (Exception E) { Errors.CriticalError(E.getMessage()); }
    	return null;
    }
    
    private static PascalParser.ProgrammContext createTree(String file) {
    	CommonTokenStream tokens = createTokens(file);
    	if (tokens != null) {
    		try {
    			PascalParser parser = new PascalParser(tokens);
    			parser.removeErrorListeners();
    			parser.addErrorListener(new ThrowingErrorListener());
        		PascalParser.ProgrammContext tree = parser.programm();
        		if (tree != null)
        			return tree;
        		else
        			Errors.CriticalError("Tree is not created");
    		} catch (Exception E) { Errors.CriticalError(E.getMessage()); }
    	}
    	return null;
    }
    
    private static boolean createTables(PascalParser.ProgrammContext root) {
    	try {
    		Variables.clear();
    		PascalTableGenerator tableGenerator = new PascalTableGenerator();
        	tableGenerator.visit(root);
        	return true;
    	} catch (Exception E) { Errors.CriticalError(E.getMessage()); }
    	return false;
    }

    private static void createCode(PascalParser.ProgrammContext root) {
    	try {
    		Code.clear();
    		PascalCodeGenerator codeGenerator = new PascalCodeGenerator(Code);
    		codeGenerator.visit(root);
        	NormilizeCodeLength();
    	} catch (Exception E) { Errors.CriticalError(E.getMessage()); }
    }
    
    private static void printErrors() {
    	for (var error : Errors.getErrors())
    		System.out.println(error);
    }
    
    private static void saveCode(String file) {
    	try {
    		//String fileName = file.substring(0, file.lastIndexOf('.')) + ".vas";
    		//FileWriter writer = new FileWriter(fileName);
    		for(var curLine : Code)
    			System.out.println(curLine.getCode() + "; " + curLine.getComment());
    			//writer.write(curLine.getCode() + "; " + curLine.getComment() + "\n");
    		//writer.close();
    	}
    	catch (Exception E) { System.out.println(E.getMessage()); }
    }
    
    public static void main(String[] args) throws IOException {
        
    	String files[] = args.length==0? new String[]{ "./src/test/resources/test." + EXTENSION } : args;
        for (String file : files) {
        	System.out.println("Compile " + file);
        	
            PascalParser.ProgrammContext tree = createTree(file);
            if (createTables(tree) && Errors.getErrors().size() == 0) {
            	createCode(tree);
            	if (Errors.getErrors().size() != 0) {
            		System.out.println("Code generation error: ");
                	printErrors();
            	}
            	else saveCode(file);
            }
            else {
        		System.out.println("Code analyze error: ");
            	printErrors();
            }
            System.out.println("End " + file);
        }
    }
}
