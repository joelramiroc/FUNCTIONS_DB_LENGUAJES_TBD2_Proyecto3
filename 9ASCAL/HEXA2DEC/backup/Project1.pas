library project1;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs,crt,strutils,math;

function ib_util_malloc(l: integer): pointer; cdecl; external 'ib_util.dll';

FUNCTION Hex2Dec(const Hexa:PAnsiChar):integer;

VAR T1,T2: longint;
var dec: double;
Error : Boolean;
var Hex

BEGIN
Error:=False;
T1:=0;T2:=0;DEC:=0;
FOR T1:=1 TO LENGTH(Hex) DO
BEGIN
T2:=Length(Hex)-T1;
CASE Hex[T1] OF
'0' : DEC:=DEC+0;
'1' : DEC:=DEC+Power(16,T2);
'2' : DEC:=DEC+2*Power(16,T2);
'3' : DEC:=DEC+3*Power(16,T2);
'4' : DEC:=DEC+4*Power(16,T2);
'5' : DEC:=DEC+5*Power(16,T2);
'6' : DEC:=DEC+6*Power(16,T2);
'7' : DEC:=DEC+7*Power(16,T2);
'8' : DEC:=DEC+8*Power(16,T2);
'9' : DEC:=DEC+9*Power(16,T2);
'A','a' : DEC:=DEC+10*Power(16,T2);
'B','b' : DEC:=DEC+11*Power(16,T2);
'C','c' : DEC:=DEC+12*Power(16,T2);
'D','d' : DEC:=DEC+13*Power(16,T2);
'E','e' : DEC:=DEC+14*Power(16,T2);
'F','f' : DEC:=DEC+15*Power(16,T2);
ELSE
  Error:=True;
END;
END;
Hex2Dec:=trunc(Dec);
IF Error THEN Hex2Dec:=0;
Result:=Hex2Dec;
END;

Exports
Hex2Dec;


begin
end.

