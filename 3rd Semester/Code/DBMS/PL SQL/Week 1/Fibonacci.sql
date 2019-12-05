DECLARE
    a number:=0;
    b number:=1;
    c number;
    n number:=&n;
    i number;
 
BEGIN
    dbms_output.put_line('Fibonacci series is : ');
    dbms_output.put_line(a);
    dbms_output.put_line(b);    
 
    for i in 2..n
    loop
        c:=a+b;
        a:=b;
        b:=c;
        dbms_output.put_line(c);
    end loop;
END;
/
