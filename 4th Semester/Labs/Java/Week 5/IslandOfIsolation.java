class IslandOfIsolation
{
    int     i;
    public static void main(String[] args) {
        IslandOfIsolation ioi1 = new IslandOfIsolation();
        IslandOfIsolation ioi2 = new IslandOfIsolation();
        IslandOfIsolation ioi3 = new IslandOfIsolation();

        ioi1.i = 10;
        ioi2.i = 20;
        ioi3.i = 30;

        ioi1.i = ioi2.i;
        ioi2.i = ioi3.i;
        ioi3.i = ioi1.i;

        System.out.println("i1 = "+ioi1.i);
        System.out.println("i2 = "+ioi2.i);
        System.out.println("i3 = "+ioi3.i);

        ioi1 = null;
        ioi2 = null;
        ioi3 = null;
    }
}