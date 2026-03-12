public class Point {
    private String name;
    double xCord;

    public Point(String n, double y){
        name=n;
        xCord=y;
    }
    void printer(){
        System.out.println("point name is : "+name+" | x-cordinates are : "+ xCord);
    }
    void translate(double offset){
        xCord=xCord+offset;
        System.out.println("the new x-cords are:"+xCord);
    }
    public void access(String name1){
        name=name1;
    }
}
