library DEC2BINDLL;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs,crt,strutils;

var r,n2,i: integer;
var st:String = '';
var stn:String = '';
tm :String= '';
function DEC2BIN(var n3 :integer ):integer;cdecl;export;

begin
  while n3 > 0 do
    begin
      n2:= n3 mod 2;
      n3 := n3 div 2;
      tm := IntToStr(n2);
      st := st + tm;
    end;
  for i:=0 to (Length(st)-1)do
  begin
    stn += Copy(st,Length(st)-i,1);
  end;
  r:= StrToInt(stn);
  Result:=r;
  end;

Exports
  DEC2BIN;


begin
end.

