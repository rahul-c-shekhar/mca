DECLARE
i number;
sum1 number:=0;
n number;
BEGIN
n:=&n;
i:=1;
for i in 1..n
loop
   if mod(i,2)=1
   then
      sum1:=sum1+i;
   end if;
end loop;
dbms_output.put_line(' sum  =  '||sum1);
END;
/