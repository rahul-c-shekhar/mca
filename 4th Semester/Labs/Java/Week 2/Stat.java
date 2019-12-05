class Stat
{
    static
    {
        System.out.println("This is Static Block");
    }
    {
        System.out.println("This is Instance Block");
    }
    Stat()
    {
        this(2);
        System.out.println("This is Zero Argument Constructor");
    }
    Stat(int a)
    {
        System.out.println(("This is 1 Argument Constructor"));
    }
    public static void main(String[] args) {
        Stat st = new Stat();
        System.out.println("This is Main Method");
    }
}