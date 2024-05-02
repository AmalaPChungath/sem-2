Set Serveroutput ON
create or replace procedure deposit(id in number,amt in number) is
begin
	update  customers set balance=balance+amt where accno=id;
end;
/
declare
	ano number(10):=&Account_no;
	amount number(10,2):=&Amount;
	begin
		deposit(ano,amount);
		commit;
	end;
/

/*

SQL> select * from customers;

     ACCNO    BALANCE
---------- ----------
      1001	60000
      1002	70000
      1003	30000
      1004	50000
      1005	90000

SQL> @deposit2

Procedure created.

Enter value for account_no: 1001
old   2: 	ano number(10):=&Account_no;
new   2: 	ano number(10):=1001;
Enter value for amount: 500
old   3: 	amount number(10,2):=&Amount;
new   3: 	amount number(10,2):=500;

PL/SQL procedure successfully completed.

SQL> select * from customers;

     ACCNO    BALANCE
---------- ----------
      1001	60500
      1002	70000
      1003	30000
      1004	50000
      1005	90000



*/
