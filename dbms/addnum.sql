Set Serveroutput ON
create or replace function addnum(v1 in number,v2 in number)
return number is
r number;
begin
  r:=v1+v2;
  return r;
end addnum;
/

/*

Set Serveroutput ON
create or replace function addnum(v1 in number,v2 in number)
return number is
r number;
begin
  r:=v1+v2;
  return r;
end addnum;
/


*/
