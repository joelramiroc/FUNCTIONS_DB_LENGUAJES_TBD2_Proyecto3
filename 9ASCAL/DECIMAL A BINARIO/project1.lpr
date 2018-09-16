library DEC2BINDLL;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs,crt,strutils;

var r,n,n2: integer;
var st:String = '';
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
  r:= strtoint(st);
  Result:=r;
  end;

Exports
  DEC2BIN;


begin
end.

