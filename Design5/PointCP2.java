// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP2 extends PointCP5
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */

  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP2(char type, double xOrRho, double yOrTheta)
  {
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;

  }
	
  
  //Instance methods **************************************************
 
 


	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public String convertStorageToCartesian()
  {
  
      
      double tempy = getY();
      double tempx = getX();
      return tempx + "," + tempy ;

  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */


  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return xOrRho + "," + yOrTheta ;
  }
}
