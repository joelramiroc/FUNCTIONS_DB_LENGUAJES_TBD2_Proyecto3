library project1;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs,crt,strutils,math;

function ib_util_malloc(l: integer): pointer; cdecl; external 'ib_util.dll';

function DEC2HEX(var dec :integer ):PAnsiChar;cdecl;export;
VAR H1:INTEGER;
Hex,HexDigit:STRING;

BEGIN
HexDigit:='0123456789ABCDEF';
HEX:='';
REPEAT
H1:=DEC MOD 16;
DEC:=DEC DIV 16;
Hex:=CONCAT(Hexdigit[H1+1],Hex);
UNTIL DEC<1;
Result := ib_util_malloc(Length(Hex) + 1);
  StrPCopy(Result, AnsiString(Hex));

  end;

Exports
  DEC2HEX;


begin
end.

