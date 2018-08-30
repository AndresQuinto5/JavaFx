package Lists;

import javafx.beans.property.*;

public class Objects {
    //Propiedades de cada objeto//
    SimpleStringProperty Name;
    SimpleBooleanProperty Status;
    SimpleIntegerProperty Quantity;
    SimpleDoubleProperty UnitPrice;
    SimpleDoubleProperty Total;

// Construimos los objetos

    public Objects (String Name, Integer Quantity, Double UnitPrice){
        this.Name = new SimpleStringProperty(Name);
        this.Quantity = new SimpleIntegerProperty(Quantity);
        this.UnitPrice = new SimpleDoubleProperty(UnitPrice);
        this.Total = new SimpleDoubleProperty(UnitPrice*Quantity);
        this.Status = new SimpleBooleanProperty(false);

    }
    // Setters and Getters

    public String getName() {
        return Name.get();
    }

    public SimpleStringProperty NameProperty() {
        return Name;
    }

    public boolean isStatus() {
        return Status.get();
    }

    public SimpleBooleanProperty StatusProperty() {
        return Status;
    }

    public int getQuantity() {
        return Quantity.get();
    }

    public SimpleIntegerProperty QuantityProperty() {
        return Quantity;
    }

    public double getUnitPrice() {
        return this.UnitPrice.get();
    }

    public SimpleDoubleProperty UnitPriceProperty() {
        return this.UnitPriceProperty();
    }

    public double getTotal() {
        return Total.get();
    }

    public SimpleDoubleProperty TotalProperty() {
        return Total;
    }

    public void setStatus(boolean Status) {
        this.Status.set(Status);
    }

    // Con esto se coloca el estado diferente (Comprado o pendiente)
    public void ChangeStatus (boolean state){
        this.Status.set(state);


    }


}
