public class Main{
    public static void main(String[] args){
        Lingkaran c1 = new Lingkaran();
        Lingkaran c2 = new Lingkaran();
        c2.radius = 15;
        Lingkaran c3 = new Lingkaran(15);


        System.out.println(c1.getLuas());
        System.out.println(c2.getLuas());
        System.out.println(c3.getLuas());
    }
}