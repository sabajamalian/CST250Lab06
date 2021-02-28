
public class Rectangle {

    int width;
    int height;
    boolean filled = false;
//contructors are useful for not having to define all attributed
//everytime you create a new class

    public Rectangle(int width, int height, Boolean filled) {
        this.width = width;
        this.height = height;
        this.filled = filled;
    }

    public void draw(){
        if(filled){
            drawfilled();
        }
        else{
            drawUnfilled();
        }
    }
    public void drawfilled() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*"); //print and println are different, println will go to next line, print will keep going on the same line
            }
            System.out.println("");
        }
    }

    public void drawUnfilled() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j == width - 1)){
                    System.out.println("*");
                }
                else if ((i == 0) || (j == 0) || (i == height - 1)) {
                    System.out.print("*"); //print and println are different, println will go to next line, print will keep going on the same line
                }
                else{
                    System.out.print(" ");
                }
                
            }
        }

    }

}
//end of draw method

