%{
    int capital =0,small = 0,number = 0;
%}
%%
[A-Z] {
    printf("%s capital letter \n",yytext);
    capital++;}
[0-9] {printf("%s Numbers \n",yytext);
    number++;}
. {printf("%s not a capital letter \n ",yytext);
    small++;}
    \n {return 0;}
%%
int yywrap(){}
int main(){
    yylex();
    printf("\nCapital letters are %d\nsmall letters :%d \nnumbers are :%d\n",capital,small,number);
    return 0;
}    
