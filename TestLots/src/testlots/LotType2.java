//Author: Chris wells
//Date: 3/4
//1111 P01
//Lab 4
//this is the lottype2 class that implements methods from lot 
//it preforms methonds for rectangles
package testlots;

public class LotType2 extends Lot implements Comparable<Lot> {

    //instance variables for the rectangles
    int height;
    int width;
    String ID;

    //constructor for the rectangles
    LotType2(String ID, int height, int width) {
        this.ID = ID;
        this.height = height;
        this.width = width;

    }

    //calculates area for rectangle
    @Override
    public double calculateArea() {
        return this.width * this.height;

    }

    //returns id for rectangle
    @Override
    public String getID() {
        return this.ID;
    }

    //sorts rectangles
    @Override
    public int compareTo(Lot that) {
        if (this.calculateArea() > that.calculateArea()) {
            return 1;
        } else if (this.calculateArea() < that.calculateArea()) {
            return -1;
        } else {
            return 0;
        }
    }

}
