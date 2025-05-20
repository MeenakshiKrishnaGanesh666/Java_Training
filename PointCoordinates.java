class PointCoordinates{
    private int x, y;
    public PointCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
public static void main(String args[]){
    PointCoordinates point = new PointCoordinates(10,10);
    System.out.println("Object.toString() method:"+point);

    String s = point+"testing";
    System.out.println(s);
}
}