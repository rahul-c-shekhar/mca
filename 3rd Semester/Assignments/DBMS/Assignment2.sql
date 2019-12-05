CREATE OR REPLACE PROCEDURE details AS
BEGIN	
	dbms_output.put_line(CHR(9) || '        Product Details');
	dbms_output.put_line('Product Name      ' || CHR(9) || '-' || CHR(9) || 'Code');
	dbms_output.put_line('Computer Stationery' || CHR(9) || '-' || CHR(9) || ' 1');
	dbms_output.put_line('Fixed Disks        ' || CHR(9) || '-' || CHR(9) || ' 2');
	dbms_output.put_line('Computers          ' || CHR(9) || '-' || CHR(9) || ' 3');	
END details;
/	

SET SERVEROUTPUT ON

exec details;
	
DECLARE
	code		number;
	amount		number;
	total		number;	
	discount	number;
	net			number;


BEGIN
	code:=&code;
	amount:=&amount;
	CASE code
		when 1 then
			if amount >= 5000 then
				discount:=(12 * amount) / 100;
			elsif amount >= 3000 and amount < 5000 then
				discount:=(8 * amount) / 100;
			else
				discount:=(2 * amount) / 100;
			end if;

			net:=amount - discount;
			
			dbms_output.put_line('Net Order Amount = Rs.' || net);

		when 2 then
			if amount >= 20000 then
				discount:=(10 * amount) / 100;
			elsif amount >= 15000 and amount < 20000 then
				discount:=(5 * amount) / 100;
			end if;

			net:=amount - discount;

			dbms_output.put_line('Net Order Amount = Rs.' || net);

		when 3 then
			if amount >= 50000 then
				discount:=(10 * amount) / 100;
			elsif amount >= 25000 and amount < 50000 then
				discount:=(5 * amount) / 100;
			end if;

			net:=amount - discount;

			dbms_output.put_line('Net Order Amount = Rs.' || net);
			
		else 
			dbms_output.put_line('You have entered the wrong code!!!!');
	END CASE;
END;
/