package Computer;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private String model;
    private int amountOfButtons;
    private boolean gestureSupport;

    public Touchpad(String model, int amountOfButtons, boolean gestureSupport) {
        this.model = model;
        this.amountOfButtons = amountOfButtons;
        this.gestureSupport = gestureSupport;
    }

    public String getModel() {
        return model;
    }

    public int getAmountOfButtons() {
        return amountOfButtons;
    }

    public boolean isGestureSupport() {
        return gestureSupport;
    }

    @Override
    public String toString() {
        return "Touchpad{" +
                "model='" + model + '\'' +
                ", amountOfButtons=" + amountOfButtons +
                ", gestureSupport=" + gestureSupport +
                '}';
    }
}
