package soaljavaweek;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1.2f,3.4f);
        Rectangle rectangle2 = new Rectangle(1.0f, 1.0f);
        Rectangle rectangle3 = new Rectangle(5.6f, 7.8f);

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());
        System.out.println("length is : "+rectangle3.getLength());
        System.out.println("width is : "+rectangle3.getWidth());
        System.out.println("area is : "+rectangle3.getArea());
        System.out.println("perimeter is : "+ rectangle3.getPerimeter() );
    }

    private float getLength() {
        return this.length;
    }

    private void setLength(float length){

    }
    private float getWidth(){
        return  this.width;
    }
    private void setWidth(float width){

    }
    private double getArea(){
        return (this.width * this.length);
    }
    private double getPerimeter(){
        return 2*(this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
