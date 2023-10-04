
    import shapes.Circle;
    import shapes.Rectangle;
    import shapes.Shape;

    public class Mainn{
        public static void main (String[] args){
            Circle circle = new Circle(5.0);
            Rectangle rectangle =  new Rectangle(4.0 , 6.0);

            System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
            System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
        }
    }

