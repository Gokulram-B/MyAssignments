package week1.day3;

import org.apache.commons.math3.geometry.spherical.oned.Arc;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser arc= new Browser();
		String lb = arc.launchBrowser("Chrome");
		System.out.println(lb);
	    arc.loadUrl();
	}

}
