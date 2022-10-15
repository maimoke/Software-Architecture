public class Square extends Shape {

    Square(){}
    Square(int side) {
        this.setSide(side);
    }

    public void setWidth(int width) {
        this.setSide(width);
    }

    public void setHeight(int height) {
        this.setSide(height);
    }

    public void setSide(int side) {
        super.width = side;
        super.height = side; 
    }
    
    public int getArea() {
        return width * height;
    }
}
