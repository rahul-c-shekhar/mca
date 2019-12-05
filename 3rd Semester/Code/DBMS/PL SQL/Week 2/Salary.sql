DECLARE
ename varchar2(20);
eno varchar2(10);
basic number;
tax number;
da number;
netsal number;
pf number;
hra number;

BEGIN
ename:='&ename';
eno:='&eno';
basic:=&basic;
dbms_output.put_line('Employee Details : ');
dbms_output.put_line('Employee Name : '||ename);
dbms_output.put_line('Employee ID : '||eno);
da:=trunc(0.41*basic);
hra:=trunc(0.15*basic);
if basic<3000
then
	pf:=trunc(0.005*basic);
elsif basic>3000 and basic<5000
then
	pf:=trunc(0.007*basic);
elsif basic>5000 and basic<7500
then
	pf:=trunc(0.008*basic);
else
	pf:=trunc(0.01*basic);
end if;
tax:=trunc(0.2*basic);
netsal:=basic+hra+da-(pf+tax);
dbms_output.put_line('Basic Salary : '||basic);
dbms_output.put_line('DA : '||da);
dbms_output.put_line('HRA : '||hra);
dbms_output.put_line('PF : '||pf);
dbms_output.put_line('Tax : '||tax);
dbms_output.put_line('Net Salary : '||netsal);
END;
/