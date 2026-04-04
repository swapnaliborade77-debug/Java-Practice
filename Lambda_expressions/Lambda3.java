interface Draw{
    public void draw();
}
class Lambda3{
    public static void main(String[] args){
        int width =10;


       /*  Draw d = new Draw(){
            public void draw(){
                System.out.println("width is " + width);
            }
        } */

        Draw d =() ->System.out.println("width is " + width);
        d.draw();
    }
}