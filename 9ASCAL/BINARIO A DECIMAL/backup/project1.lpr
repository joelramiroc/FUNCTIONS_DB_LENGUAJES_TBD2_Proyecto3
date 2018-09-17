library project1;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs,crt,math;

var bin:string;
var i,longitud,bit:byte;
var acumulador:Double=0;

function BIN2DEC(var value : integer):Integer;cdecl;export;
begin
  bin:= IntToStr(value);
  longitud := Length(bin);
  for i:=longitud downto 1 do begin
    Val(bin[i],bit);
    acumulador += bit*power(2,(longitud-1));
  end;
  Result:= StrToInt(FloatToStr(acumulador));
end;

Exports
  BIN2DEC;


begin
end.

