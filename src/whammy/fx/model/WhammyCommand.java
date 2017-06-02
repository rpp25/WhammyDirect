package whammy.fx.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
//import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.StringProperty;

/**
 * Model class for a whammy command. This includes a program change and an expression change.
 *
 * @author Raj Patel
 */
public class WhammyCommand {

    private final IntegerProperty programNumber;
    private final IntegerProperty expNumber;


    /**
     * Default constructor.
     */
    public WhammyCommand() {
        this(1, 0);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public WhammyCommand(int programNumber, int expNumber) {
        this.programNumber = new SimpleIntegerProperty(programNumber);
        this.expNumber = new SimpleIntegerProperty(expNumber);
    }

//    public String getName() {
//        return name.get();
//    }
//
//    public void setFirstName(String name) {
//        this.name.set(name);
//    }
//
//    public StringProperty nameProperty() {
//        return name;
//    }

    public int getProgramNumber() {
        return programNumber.get();
    }

    public void setProgramNumber(int programNumber) {
        this.programNumber.set(programNumber);
    }

    public IntegerProperty programNumberProperty() {
        return programNumber;
    }
    
    public int getexpNumber() {
        return expNumber.get();
    }

    public void setExpNumber(int expNumber) {
        this.expNumber.set(expNumber);
    }

    public IntegerProperty expNumberProperty() {
        return expNumber;
    }

}
