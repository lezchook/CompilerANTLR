grammar lang;

program     : 'begin' stat+ 'end' ;
stat    : assign
      | add
      | sub
      | mul
      | div
      | print
      | factorial
      | input
      ;

assign      : 'let' ID 'be' (ID | NUM) ;
add         : 'add' (NUM | ID) 'to' ID;
sub         : 'sub' (NUM | ID) 'from' ID;
mul         : 'mul' ID 'by' (NUM | ID);
div         : 'div' ID 'by' (NUM | ID);
factorial   : 'fact' ID 'of' (NUM | ID);
input       : 'input' ID;
print       : 'print' (NUM | ID);


ID  :   [a-z]+ ;
NUM :   [0-9]+ ;
WS  :   [ \r\t\n]+ -> skip;
COMMENT     : '/*' .*? '*/' -> skip; // Многострочные комментарии
LINE_COMMENT: '//' ~[\r\n]* -> skip; // Однострочные комментарии