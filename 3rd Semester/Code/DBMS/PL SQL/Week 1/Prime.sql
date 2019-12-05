DECLARE
	n number;
	i number;
	pr number;

BEGIN
	for n in 2..50
	loop
		pr:=1;

		for i in 2..n/2
		loop
			if mod(n,i)=0 
			then
				pr:=0;

			end if;

		end loop;
		if pr=1
		then
			dbms_output.put_line(n);
		end if;
	end loop;
END;
/
