DECLARE
    str varchar2(50):='&str';
    newstr varchar2(50);
    len number;
    i number;
 
BEGIN
    len:=length(str);
    
    for i in reverse 1..len
    loop
        newstr:=newstr || substr(str,i,1);
    end loop;
    
    dbms_output.put_line('Reverse of String is : '||newstr);
END;
/
