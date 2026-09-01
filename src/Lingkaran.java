public class Lingkaran {
    public double radius;

    public Lingkaran(){
        radius = 5;
    }

    public Lingkaran (double r){
        radius = r;
    }

    public double getLuas(){
        return  Math.PI * radius * radius;
    }
    
    public double getDiameter(){
        return radius * 2;
    }

    public double getKeliling(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Nilai luas lingkaran: " + getLuas() + "\n" + "Nilai diameter lingkaran: " + getDiameter() + "\n" + "Nilai keliling lingkaran: " + getKeliling() + "\n";
    }
}