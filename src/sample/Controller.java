package sample;

import com.pi4j.io.gpio.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import static com.pi4j.system.SystemInfo.getOsName;

//http://pi4j.com/install.html
//TODO: Install correct raspbian backup0
public class Controller {

    public ImageView downBtn;
    public ImageView upBtn;
    ChairController chairController;

    private static boolean linux(){
        return getOsName().startsWith("Linux");
    }

    public void startMovingUp(MouseEvent mouseEvent) {
        if(linux()){
            chairController.startMovingUp(); //Checks to see if running on Linux, and then runs the startMovinUp method
        }
        System.out.println("Moving Up...");
    }

    public void stopMovingUp(MouseEvent mouseEvent) {
        if(linux()){
            chairController.stopMovingUp(); //Checks to see if running on Linux, and then runs the stopMovinUp method
        }
        System.out.println("Stationary...");
    }

    public void startMovingDown(MouseEvent mouseEvent) {
        if(linux()){
            chairController.startMovingDown(); //Checks to see if running on Linux, and then runs the startMovinDown method
        }
        System.out.println("Moving Down...");
    }

    public void stopMovingDown(MouseEvent mouseEvent) {
        if(linux()){
            chairController.stopMovingDown(); //Checks to see if running on Linux, and then runs the stopMovingDown method
        }
        System.out.println("Stationary...");
    }
}
