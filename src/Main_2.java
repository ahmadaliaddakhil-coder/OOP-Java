import pens.it.Lingkaran;

public class Main_2 {
    
    public static void main(String[] args) {
        Lingkaran c1 = new Lingkaran();                    // default package (src/), tanpa import, radius=5
        Lingkaran c2 = new Lingkaran();          // dari src/pens/
        c2.radius = 10;
        Lingkaran c3 = new Lingkaran(15);  // dari src/pens/it/

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}