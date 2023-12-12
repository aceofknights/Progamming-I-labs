//Author: Chris wells
//Date: 3/4
//1111 P01
//Lab 4
//this is the lottype1 class that implements methods from lot 
//it preforms methonds for triangles
package testlots;

class LotType1 extends Lot implements Comparable<Lot> {

    //instance variables for triangles
    int height;
    int base;
    String ID;

    //constructor for the triangle
    LotType1(String ID, int height, int base) {
        this.ID = ID;
        this.height = height;
        this.base = base;

    }

    //calculates trianges area
    @Override
    public double calculateArea() {
        return (this.base / 2) * this.height;
    }

    //returns the id of the triangle
    @Override
    public String getID() {
        return this.ID;
    }

    //sorts the triangeles
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
