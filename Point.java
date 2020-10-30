public class Point{
  private double x, y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
   x= p.x;
   y= p.y;
 }

 public double getX(){
   return x;
 }

 public double getY(){
   return y;
 }

 public double distanceTo(Point other){
   double dist = Math.sqrt(Math.pow((this.x-other.x), 2) + Math.pow((this.y-other.y), 2));
   System.out.println(dist);
   return dist;
 }

 public boolean equals( Point other){
   if ((this.x == other.x) && (this.y == other.y)){
     return true;
   }
   return false;
 }
}
