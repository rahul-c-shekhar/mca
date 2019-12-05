class Singlefor
{
    public static void main(String[] args) {
        long    i = 1;
        for(int j = 1; j < 10; j++, i = (i *10) + 1)
            System.out.println(i*i);
    }
}