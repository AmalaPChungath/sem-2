create table squares(num number(10),square number(20));
Set Serveroutput ON
create or replace function findsq(num in number)
return number is
s number(20);
begin
s:=num*num;
return s;
end findsq;
/
declare
  i number(10);
  sq number(20);
  begin
    for i in 1..10
    loop
      sq:=findsq(i);
      insert into squares values(i,sq);
    end loop;
  end;
/
select * from squares;


/*

SQL> @square

Table created.


Function created.


PL/SQL procedure successfully completed.


       NUM     SQUARE
---------- ----------
	 1	    1
	 2	    4
	 3	    9
	 4	   16
	 5	   25
	 6	   36
	 7	   49
	 8	   64
	 9	   81
	10	  100

10 rows selected.


*/
