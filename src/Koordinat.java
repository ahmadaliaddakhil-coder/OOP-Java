public class Koordinat{
    double x, y, radius;

    public Koordinat(){
        x = 5;
        y = 10;
        radius = 5;
    }

    public Koordinat(double r, double x, double y){
        this.radius = r * r; 
    }

    public double getLuas(){
        return Math.PI * this.radius;
    }
}