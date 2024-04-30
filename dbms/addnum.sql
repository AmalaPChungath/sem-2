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

SQL> select addnum(5,6) "sum = " from dual;

    sum =
----------
	11


*/
