grammar Pascal;
// PARSER
     programm:   KW_PROGRAMM NEXT_OP NAME (NEXT_OP declare_block)? (NEXT_OP block KW_DOT NEXT_OP?)? NEXT_OP? EOF;
     declare_block: KW_VAR NEXT_OP (declare KW_SEMICOLON NEXT_OP?)*;
     block:      KW_BEGIN NEXT_OP
                 (operator NEXT_OP?)*
                 KW_END NEXT_OP?;
     operator:   read_operator  | if_operator | while_operator
               | write_operator | set_operator;
     
     // OPERATORS
     declare:        NAME
                     (NEXT_OP? KW_COMMA NEXT_OP? NAME)* NEXT_OP?
                     KW_COLON NEXT_OP? TYPE
                     (NEXT_OP? (set | INDEX))?;
     read_operator:  KW_READLN NEXT_OP? KW_LPAR
                     name_list
                     NEXT_OP? KW_RPAR NEXT_OP? KW_SEMICOLON;
     write_operator: KW_WRITELN NEXT_OP? KW_LPAR
                     param_list
                     NEXT_OP? KW_RPAR NEXT_OP? KW_SEMICOLON;
     if_operator:    KW_IF NEXT_OP
                     compare NEXT_OP KW_THEN NEXT_OP
                     (operator | block NEXT_OP? KW_SEMICOLON)
                     (NEXT_OP? else_operator)?;
     else_operator:  KW_ELSE NEXT_OP
                     (operator | block NEXT_OP? KW_SEMICOLON);
     while_operator: KW_WHILE NEXT_OP?
                     compare NEXT_OP KW_DO NEXT_OP 
                     (operator | block NEXT_OP? KW_SEMICOLON);
     set_operator: name_list NEXT_OP? set NEXT_OP? KW_SEMICOLON;
     // LOGIC
     compare:    expr NEXT_OP? COMPAR_OPS NEXT_OP? expr;

     // ARITHMETIC
     expr: expr_pr3 (NEXT_OP? ( KW_PLUS | KW_MINUS ) NEXT_OP? expr)?;
     expr_pr3: expr_pr2 (
               NEXT_OP? ( KW_MULT | KW_SLASH | KW_DIV | KW_MOD ) NEXT_OP?
               expr_pr3)?;
     expr_pr2: (KW_PLUS | KW_MINUS)? NEXT_OP? expr_pr1;
     expr_pr1: unsigned_real_number | NUMBER | variable
             | KW_LPAR NEXT_OP? expr NEXT_OP? KW_RPAR;

     // NUMBERS
     signed_number:        (KW_PLUS | KW_MINUS)? NUMBER;
     unsigned_real_number: NUMBER KW_DOT NUMBER (EXP)?
                         | NUMBER (KW_DOT NUMBER)? EXP;
     real_number:          (KW_PLUS | KW_MINUS)? unsigned_real_number;

     set: KW_SET NEXT_OP? (expr | STRING);
     variable: NAME INDEX?;
     value: any_number | STRING;
     param: value | NAME;
     name_list: variable (NEXT_OP? KW_COMMA NEXT_OP? variable)*;
     param_list: param (NEXT_OP? KW_COMMA NEXT_OP? param)*;
     any_number: NUMBER | real_number | signed_number;
// LEXER
     // KEYWORDS
     KW_PROGRAMM  : 'programm';
     KW_VAR       : 'var';
     KW_BEGIN     : 'begin';
     KW_END       : 'end';
     KW_READLN    : 'readln';
     KW_WRITELN   : 'writeln';
     KW_IF        : 'if';
     KW_ELSE      : 'else';
     KW_THEN      : 'then';
     KW_WHILE     : 'while';
     KW_DO        : 'do';
     KW_OR        : 'or';
     KW_AND       : 'and';
     KW_DIV       : 'div';
     KW_MOD       : 'mod';
     KW_SET       : ':=';
     KW_LPAR      : '(';
     KW_RPAR      : ')';
     KW_LQPAR     : '[';
     KW_RQPAR     : ']';
     KW_DOT       : '.';
     KW_COMMA     : ',';
     KW_COLON     : ':';
     KW_SEMICOLON : ';';
     KW_PLUS      : '+';
     KW_MINUS     : '-';
     KW_MULT      : '*';
     KW_SLASH     : '/';
     KW_EXP       : 'e';

     // TYPES OF VARIABLES
     TYPE: 'integer'
         | 'longword'
         | 'single'
         | 'char'
         | 'boolean';
     
     // NUMBERS
     NUMBER: DIGIT+;
     EXP: KW_EXP (KW_PLUS | KW_MINUS)? NUMBER;

     // COMPARISON OPERATORS
     COMPAR_OPS: '<'
               | '>'
               | '='
               | '<='
               | '>=';

     // OTHER LEXEMS
     NAME: CHARACTER (DIGIT | CHARACTER)*;
     STRING: '"' ('\u0000'..'\u0009' | '\u000B'..'\u0021' | '\u0023'..'\uFFFF')* '"';
     DIGIT: '0'..'9';
     CHARACTER: 'A'..'Z'
              | 'a'..'z'
              | '_';
     NEXT_OP: END_SYMBOL+;
     INDEX: KW_LQPAR NEXT_OP? NUMBER NEXT_OP? KW_RQPAR;
     END_SYMBOL: '\n' | ' ' | '\t';
     COMMENT: NEXT_OP? '//' (
     		  '\u0000'..'\u0009' | '\u000B'..'\uFFFF'
     		  )* '\n' -> skip;
