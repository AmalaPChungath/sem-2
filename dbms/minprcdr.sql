Set Serveroutput ON
create or replace procedure findmin(x in number,y in number,z out number) is
begin
  if x<y then
    z:=x;
  else
    z:=y;
  end if;
end;
/
declare
a number:=&a;
b number:=&b;
c number;
begin
  findmin(a,b,c);
  dbms_output.put_line('Minimum of (' || a || ',' || b ||') = ' ||c);
end;
/

/*

SQL> @minprcdr

Procedure created.

Enter value for a: 23
old   2: a number:=&a;
new   2: a number:=23;
Enter value for b: 45
old   3: b number:=&b;
new   3: b number:=45;
Minimum of (23,45) = 23

PL/SQL procedure successfully completed.



*/
