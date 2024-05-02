Set Serveroutput On
create or replace procedure squarenum(x in out number) is
begin
  x:=x*x;
end;
/
declare
  a number:=&a;
  begin
  squarenum(a);
  dbms_output.put_line('square = ' ||a);
  end;
/

/*

SQL> @squareprcdr

Procedure created.

Enter value for a: 3
old   2:   a number:=&a;
new   2:   a number:=3;
square = 9

PL/SQL procedure successfully completed.

/
