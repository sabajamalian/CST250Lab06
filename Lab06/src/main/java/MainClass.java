public class MainClass {
    
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5, 8);
        if (Rectangle.filled = false){ //how do I properly call the "filled" from the Rectangle class?//
            r1.draw();
        }
        else {
            r1.drawUnfilled();
                    }
        
        Rectangle r2 = new Rectangle(8, 5);
        if (Rectangle.filled = false){
            r2.draw();
        }
        else{
            r2.drawUnfilled();
        }
        //this is another advantage of constructors is that you can use the same attributes for different method inputs
    }
    
}
