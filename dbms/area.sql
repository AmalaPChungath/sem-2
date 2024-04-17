Set Serveroutput ON
declare 
  area number(5,2);
  pi number(3,2):=3.14;
  radius number(3):=&radius;
  begin
  area:=pi*radius*radius;
  dbms_output.put_line('Area='||area);
  end;
  
  /
