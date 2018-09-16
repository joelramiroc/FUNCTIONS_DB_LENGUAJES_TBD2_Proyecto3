library F2C;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs;

function F2C(var farenheit:Double):Double;cdecl;export;
begin
  Result:=(farenheit - 32)* (9/5);
end;

Exports
  F2C;


begin
end.

