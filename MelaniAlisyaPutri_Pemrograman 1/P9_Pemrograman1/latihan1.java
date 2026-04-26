package P9_Pemrograman1;
class line {
    private double x1, x2, y1, y2;

    public line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLenght() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean isGreater(Object a, Object b) {
        return ((line) a).getLenght() == ((line) b).getLenght();
    }

    public boolean isLess(Object a, Object b) {
        return ((line) a).getLenght() < ((line) b).getLenght();
    }

    public boolean isEqual(Object a, Object b) {
        return ((line) a).getLenght() == ((line) b).getLenght();
    }
}

public class latihan1 {
    public static void main(String [] args) {
        line line1 = new line(0, 3, 0, 4);
        line line2 = new line(0, 6, 0, 8);

        System.out.println("Panjang Line 1: " + line1.getLenght());
        System.out.println("Panjang Line 2: " + line2.getLenght());

        System.out.println("Line1 > Line2: " + line1.getLenght());
        System.out.println("Line1 < Line2: " + line2.getLenght());
        
        System.out.println("Line1 > Line2 ? " + line1.isGreater(line1, line2));
        System.out.println("Line1 < Line2 ? " + line1.isLess(line1, line2));
        System.out.println("Line1 == Line2 ? " + line1.isEqual(line1, line2));
    }
}