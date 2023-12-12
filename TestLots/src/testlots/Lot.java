/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlots;
/* abstract class, parent of LotType1 and LotType2 */

public abstract class Lot {
    
    public abstract double calculateArea();
    public abstract String getID();
    
    @Override // Implement the toString method in GeometricObject
    public String toString() {
      return "Lot ID "+ getID() +" has area: "+ calculateArea();
  }
}
