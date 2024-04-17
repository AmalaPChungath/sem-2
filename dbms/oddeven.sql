Set Serveroutput ON;
declare
  num number(5):=&number;
  begin
    if(MOD(num,2)=0) then
      dbms_output.put_line('even');
    else
      dbms_output.put_line('odd'); 
    end if; 
  end;
/
