library project1;

{$mode objfpc}{$H+}

uses
  Classes,sysutils;
var com: Integer;
function COMPARE(const s1,s2: PAnsiChar):Integer;cdecl;export;
begin
  com := CompareStr(s1,s2);
  if com > 0 then
     begin
     Result:=1;
     end
  else if com <0 then
     begin
     Result:= -1;
     end
  else
  begin
      Result:= 0;
  end;

  Exports
    COMPARE;


  begin
  end.
