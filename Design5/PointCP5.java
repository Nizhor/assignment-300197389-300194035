public abstract class PointCP5 {
    protected double xOrRho;
    protected double yOrTheta;

    public double getX()
    {
  
        return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    }
    
    public double getY()
    {
   
        return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    }

    public double getDistance(PointCP3 pointB)
    {
      // Obtain differences in X and Y, sign is not important as these values
      // will be squared later.
      double deltaX = getX() - pointB.getX();
      double deltaY = getY() - pointB.getY();
      
      return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }
    
    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param point The point to rotate
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP3 rotatePoint(double rotation)
    {
      double radRotation = Math.toRadians(rotation);
      double X = getX();
      double Y = getY();
          
      return new PointCP3('C',
        (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
        (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }
}
