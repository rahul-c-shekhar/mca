class CO
{
    CO()
    {
        this(5);
        System.out.println("This is default constructor");
    }
    CO(int  x)
    {
        System.out.println("This is 1 Argument constructor");
    }

    public static void main(String[] args) {
        CO co = new CO();
    }
}