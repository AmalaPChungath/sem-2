Set Serveroutput ON
declare
  i number;
  str varchar(10):='&string';
  rev varchar(10);
  len number;
  begin
    len:=length(str);
    for i in reverse 1..len
    loop
    rev:=rev||SUBSTR(str,i,1);
    end loop;
    dbms_output.put_line('original string :  '||str);
    dbms_output.put_line('reversed string :  '||rev);
  end;
/   
    
