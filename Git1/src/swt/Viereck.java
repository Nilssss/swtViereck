package swt;

import java.awt.Point;

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
            int ab = Math.abs(a.y - b.y);
            int bc = Math.abs(b.x - c.x);
            int cd = Math.abs(c.y - d.y);
            int da = Math.abs(d.x - a.x);
            if (ab == bc && cd == da && bc == cd) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isParallelogramm() {
    	if((a.y == d.y) && (b.y == c.y) && (a.y != b.y)) {
    		int ab = Math.abs(a.x - b.x);
    		int cd = Math.abs(c.x - d.x);
    		if(ab == cd) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean isViereck() {
    	if((a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d)) {
    		return true;
    	}
    	return false;
    }
}