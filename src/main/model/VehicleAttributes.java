package model;

import java.util.Arrays;

//Represents a License Plate having License Plate number, type of vehicle, model of vehicle,
//colour of vehicle, declare commercial or private, add comment/complaint
public class VehicleAttributes {

    //fields
    private String vehicleColourAndType;        // colour and type of the vehicle (i.e black sedan, white truck,etc)
    private String vehicleModel;                // model of vehicle
    private String vehicleComment;              // comment on vehicle
    private boolean vehicleIsPrivate;           // whether commercial or private use (true = private use)

    //constructor

    /*MODIFIES: this
     *EFFECTS:  vehicleColourAndType is initialized as "Not set.";
     *          vehicleModel is initialized as "Not set.";
     *          vehicleComment is initialized as "Not set.";
     *          vehicleUse is initialized as "true" by default;
     */
    public VehicleAttributes() {
        this.setVehicleColourAndType("Not set.");
        this.setVehicleModel("Not set.");
        this.setVehicleComment("Not set.");
        this.setVehicleIsPrivate(true);
    }
    //methods
    //getters

    //MODIFIES: this
    //EFFECT: returns vehicle colour and type
    public String getVehicleColourAndType() {
        return this.vehicleColourAndType;
    }

    //MODIFIES: this
    //EFFECT: returns vehicle model
    public String getVehicleModel() {
        return this.vehicleModel;
    }

    //MODIFIES: this
    //EFFECT: returns comment on vehicle
    public String getVehicleComment() {
        return this.vehicleComment;
    }

    //MODIFIES: this
    //EFFECT:   returns "Vehicle of Commercial use." if isVehiclePrivate is false.
    //          returns "Vehicle of Private use." if isVehiclePrivate is true.
    public String getVehiclePrivateOrNot() {
        if (!(this.isVehicleIsPrivate())) {
            return "Vehicle is of Commercial use.";
        } else {
            return "Vehicle is of Private use.";
        }
    }

    //MODIFIES: this
    //EFFECT: returns vehicleIsPrivate;
    public boolean isVehicleIsPrivate() {
        return this.vehicleIsPrivate;
    }

    //setters

    //MODIFIES: this
    //EFFECTS:  sets vehicleType;
    public void setVehicleColourAndType(String vehicleColAndType) {
        this.vehicleColourAndType = vehicleColAndType;
    }

    //MODIFIES: this
    //EFFECTS:  sets vehicleModel;
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    //MODIFIES: this
    //EFFECTS:  sets vehicleComment
    public void setVehicleComment(String vehicleComment) {
        this.vehicleComment = vehicleComment;
    }

    //MODIFIES: this
    //EFFECTS:  sets vehicleIsPrivate;
    public void setVehicleIsPrivate(boolean vehicleIsPrivate) {
        this.vehicleIsPrivate = vehicleIsPrivate;
    }

    //MODIFIES: this
    //EFFECTS:  returns the toString() of VehicleAttributes;
    @Override
    public String toString() {
        return "Vehicle Attributes { Colour and Type ='"
                + this.getVehicleColourAndType() + '\'' + ", Model ='" + this.getVehicleModel()
                + '\'' + " Comment ='" + this.getVehicleComment() + '\'' + ", Is vehicle private? = "
                + this.getVehiclePrivateOrNot() + '}';
    }

}
