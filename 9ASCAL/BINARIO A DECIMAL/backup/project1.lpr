library project1;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs;

function BIN2DEC(const Bin: string):Integer;cdecl;export;
var
i: Integer;
begin
Result:= 0;
for i:= 1 to Length(Bin) do
Result:= Result*2 + Ord(Bin[i]) - Ord('0');
end;

Exports
  BIN2DEC;


begin
end.

