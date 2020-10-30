public class Triangle{

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    double perimeter = v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
    return perimeter;
  }

  public double getArea(){
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    double s = (a + b + c)/2;

    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return area;

  }


  public String classify(){
    double dist1 = (double)(Math.round(v1.distanceTo(v2)*10000))/10000;
    double dist2 = (double)(Math.round(v2.distanceTo(v3)*10000))/10000;
    double dist3 = (double)(Math.round(v3.distanceTo(v1)*10000))/10000;

      if (dist1 == dist2 && dist2 == dist3){
          return "equilateral";
        }else if (dist1 == dist2 || dist1 == dist3 || dist2 == dist3){
          return "isosceles";
        }else{
          return "scalene";
        }
  }
  public String toString(){
    String str = ("v1(" + v1.getX() + ", " + v1.getY() + ") "+
                  "v2(" + v2.getX() + ", " + v1.getY() + ") "+
                  "v3(" + v3.getX() + ", " + v1.getY() + ") ");
    return str;
  }
  
  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }
    if (index == 1){
      v2 = newP;
    }
    else {v3 = newP;}
  }
}
