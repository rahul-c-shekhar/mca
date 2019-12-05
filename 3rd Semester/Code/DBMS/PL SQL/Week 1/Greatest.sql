DECLARE
	a number:=&a;
	b number:=&b;
	c number:=&c;

BEGIN
	if a>b and a>c
	then
		dbms_output.put_line('Greatest number is : '||a);
	elsif b>a and b>c
	then
		dbms_output.put_line('Greatest number is : '||b);
	else
		dbms_output.put_line('Greatest number is : '||c);
	end if;
END;
/
