Set Serveroutput ON
declare 
  i number(5);
  num number(5):=&number;
  fact number(5):=1;
  begin
  for i in 1..num
  loop
  fact:=fact*i;
  end loop;
  dbms_output.put_line('factorial ='||fact);
  end;
  /
