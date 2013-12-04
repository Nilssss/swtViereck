
public class Viereck {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Viereck(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean isQuadrat() {
        if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
            double ab = Math.abs(a.y - b.y);
            double bc = Math.abs(b.x - c.x);
            double cd = Math.abs(c.y - d.y);
            double da = Math.abs(d.x - a.x);
            if (ab == bc && cd == da && bc == cd) {
                return true;
            }
        }
        return false;
    }
    public boolean isRechteck(){
    	if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
    		double ab = Math.abs(a.y - b.y);
            double bc = Math.abs(b.x - c.x);
            double cd = Math.abs(c.y - d.y);
            double da = Math.abs(d.x - a.x);
            if (ab == cd && bc == da && bc != cd) {
                return true;
            }
        }
    	return false;
    }
   
}
