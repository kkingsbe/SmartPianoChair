package sample;

import com.pi4j.io.gpio.*;
import javafx.scene.input.MouseEvent;

public class ChairController {
    // create gpio controller
    final GpioController gpio = GpioFactory.getInstance();
    // provision gpio pin #20 as an output pin
    final GpioPinDigitalOutput upPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_20, "UpPin", PinState.LOW);
    // provision gpio pin #21 as an output pin
    final GpioPinDigitalOutput downPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_21, "DownPin", PinState.LOW);

    public void startMovingUp() {
        downPin.setState(true);
        upPin.setState(false);
    }

    public void stopMovingUp() {
        downPin.setState(true);
        upPin.setState(true);
    }

    public void startMovingDown() {
        downPin.setState(false);
        upPin.setState(true);
    }

    public void stopMovingDown() {
        downPin.setState(true);
        upPin.setState(true);
    }
}
