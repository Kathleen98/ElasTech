package exercises.constructor;

public class Scheduling {
    private String namePet;
    private String service;
    private String time;
    private boolean parfum;
    private boolean ribbon;
    private boolean hidration;
    private String remark;
    private double discount;


    public Scheduling(String namePet, String service, String time, boolean parfum, boolean ribbon, boolean hidration, String remark,  double discount) {
        this.namePet = namePet;
        this.service = service;
        this.time = time;
        this.parfum = parfum;
        this.ribbon = ribbon;
        this.hidration = hidration;
        this.remark = remark;
        this.discount = discount;
    }

    public String getNamePet() {
        return namePet;
    }
    public String getService() {
        return service;
    }

    public String getTime() {
        return time;
    }

    public boolean isParfum() {
        return parfum;
    }
    public boolean isRibbon() {
        return ribbon;
    }
    public boolean isHidration() {
        return hidration;
    }
    public String getRemark() {
        return remark;
    }
    public double getDiscount() {
        return discount;
    }

}
