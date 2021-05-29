package VM11.PascalCompiller.Test;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.testng.Assert;
import org.testng.annotations.Test;

import VM11.PascalCompiller.ThrowingErrorListener;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalLexer;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.*;

public class ParserTest {
	private PascalParser CreateDefaultParser(String code) {
		CharStream stream = CharStreams.fromString(code);
		PascalLexer lexer = new PascalLexer(stream);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	PascalParser parser = new PascalParser(tokens);
    	parser.removeErrorListeners();
    	parser.addErrorListener(new ThrowingErrorListener());
    	return parser;
	}
	
	@Test
	public void programmTokenTest() {
		PascalParser SUT = CreateDefaultParser("programm myProg");
    	
		ProgrammContext ctx = SUT.programm();
		
		Assert.assertTrue(ctx != null);
	}

	@Test
	public void declareBlockTokenTest() {
		PascalParser SUT = CreateDefaultParser("var ");
    	
		Declare_blockContext ctx = SUT.declare_block();
		
		Assert.assertTrue(ctx != null);
	}

	@Test
	public void blockTokenTest() {
		PascalParser SUT = CreateDefaultParser("begin end");
    	
		BlockContext ctx = SUT.block();
		
		Assert.assertTrue(ctx != null);
	}
	
	@Test
	public void declareTokenTest() {
		PascalParser SUT = CreateDefaultParser("i : integer;");
    	
		DeclareContext ctx = SUT.declare();
		
		Assert.assertTrue(ctx != null);
		Assert.assertTrue(ctx.NAME().size() == 1);
		Assert.assertTrue(ctx.TYPE() != null);
		Assert.assertTrue(ctx.set() == null);
	}

	@Test
	public void declareWithSetTokenTest() {
		PascalParser SUT = CreateDefaultParser("i : integer := 10;");
    	
		DeclareContext ctx = SUT.declare();
		
		Assert.assertTrue(ctx != null);
		Assert.assertTrue(ctx.NAME().size() == 1);
		Assert.assertTrue(ctx.TYPE() != null);
		Assert.assertTrue(ctx.set().expr().expr_pr3().expr_pr2().expr_pr1().NUMBER() != null);
	}
	

	@Test
	public void declareArrayTokenTest() {
		PascalParser SUT = CreateDefaultParser("i : integer[10];");
    	
		DeclareContext ctx = SUT.declare();
		
		Assert.assertTrue(ctx != null);
		Assert.assertTrue(ctx.NAME().size() == 1);
		Assert.assertTrue(ctx.TYPE() != null);
		Assert.assertTrue(ctx.INDEX() != null);
		Assert.assertTrue(ctx.set() == null);
	}
}
