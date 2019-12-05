class Multimain
{
    public static void main()
    {
        System.out.println(("This is No Argument Main method"));
    } 
    public static void main(String[] args) {
        System.out.println("This is the actual Main method");
        
        Multimain mm = new Multimain();
        mm.main();
    }
}