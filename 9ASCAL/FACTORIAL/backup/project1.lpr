library FACTORIALDLL;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs,Crt;
var Contador : Integer;
var Result: Integer;
Result:= 1;
function FACTORIAL(var Value:Integer):Integer;cdecl;export;
begin
     ClrScr;
     GotoXY( 4, 2 );

     for Contador := 1 to Value do
        begin
             Result:= Result*Contador;
        end
end;

Exports
  FACTORIAL;


begin
end.
