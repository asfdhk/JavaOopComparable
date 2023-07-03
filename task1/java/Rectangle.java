public class Rectangle implements Comparable<Rectangle> {
    private int height;
    private int width;

    public int area(){
        return  height*width;
    }

    public Rectangle(int height,int width){
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public int compareTo(Rectangle o) {

        if(area() < o.area()){
            return -1;
        }else if(area() > o.area()){
            return 1;
        }
        return 0;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
