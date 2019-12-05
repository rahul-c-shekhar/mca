DECLARE
    n number:=&n;
    s number:=0;
    r number;
    len number;
    m number;
 
BEGIN
    m:=n;
 
    len:=length(to_char(n));
    
    while n>0
    loop
        r:=mod(n,10);
        s:=s+power(r,len);
        n:=trunc(n/10);
    end loop;
    
    if m=s then
        dbms_output.put_line(m||' is an armstrong number');
    else
        dbms_output.put_line(m||' is not an armstrong number');
    end if;
    
END;
/