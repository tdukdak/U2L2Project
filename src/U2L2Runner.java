public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(150, 200);
        rect1.setWidth(125);
        rect1.printRectangleInfo();
        Rectangle rect2 = new Rectangle(100);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect2.printRectangleInfo();
        Rectangle rect3 = new Rectangle();
        rect3.setWidth(125);
        rect3.printRectangleInfo();
        System.out.println("you will need " + (rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea()) + " sq ft of fencing");
        System.out.println("your total fence perimeter will be " + (rect1.calculatePerimeter() + rect2.calculatePerimeter() + rect3.calculatePerimeter()) + " sq ft");





    }
}
