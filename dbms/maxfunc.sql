Set Serveroutput ON
create or replace function findmax(x in number,y in number)
return number is
z number;
begin
  if x>y then 
    z:=x;
  else
    z:=y;
  end if;
  return z;
end findmax;
/
declare
  a number:=&a;
  b number:=&b;
  c number;
  begin
    c:=findmax(a,b);
    dbms_output.put_line('Maximum of (' || a || ',' || b ||') = ' ||c);
  end;
/

/*
SQL> @maxprgm
Enter value for a: 45
old   2:   a number:=&a;
new   2:   a number:=45;
Enter value for b: 23
old   3:   b number:=&b;
new   3:   b number:=23;
Maximum of (45,23) = 45

PL/SQL procedure successfully completed

*/
