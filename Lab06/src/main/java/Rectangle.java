public class Rectangle {
    
    int width;
    int height;
    boolean filled = false;
//contructors are useful for not having to define all attributed
//everytime you create a new class
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void draw(){
            for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print("*"); //print and println are different, println will go to next line, print will keep going on the same line
        }
            System.out.println("");
        }
        }
    
    public void drawUnfilled(){
        for (int i = 0; i <= height; i++){
            for (int j = 0; j <= width; j++){
                if ((i == 0 || height) || (j == 0 || width)){
                System.out.print("*"); //print and println are different, println will go to next line, print will keep going on the same line
        }
            System.out.println("");
        }
        }
        
    }
    
}
    //end of draw method
    

