library project1;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs;

function C2F(var celcius:Double):Double;cdecl;export;
begin
  Result:=(celcius * (9/5)) + 32;
end;

Exports
  C2F;


begin
end.

