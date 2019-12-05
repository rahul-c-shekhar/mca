DECLARE
	n number;
	m number;
	rev number:=0;
	r number;

BEGIN
	n:=&n;
	m:=n;

	while n>0
	loop
		r:=mod(n,10);
		rev:=(rev*10)+r;
		n:=trunc(n/10);
	end loop;
	
	if m=rev
	then
		dbms_output.put_line('Number is a palindrome');
	else
		dbms_output.put_line('Number is not a palindrome');
	end if;
END;
/
