public abstract class LPGCylinder {
    private String cylinderId;
    private String cylinderType;
    private double basePrice;
    private double weight;
    private String bookingId;
    private String month;

    LPGCylinder(String cylinderId, String cylinderType, double basePrice, double weight, String bookingId, String month) {
        this.cylinderId = cylinderId;
        this.cylinderType = cylinderType;
        this.basePrice = basePrice;
        this.weight = weight;
        this.bookingId = bookingId;
        this.month = month;
    }

    public String getCylinderId() {
        return cylinderId;
    }

    public void setCylinderId(String cylinderId) {
        this.cylinderId = cylinderId;
    }

    public String getCylinderType() {
        return cylinderType;
    }

    public void setCylinderType(String cylinderType) {
        this.cylinderType = cylinderType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if(basePrice < 0){
            System.out.println("Invalid price");
        }
        else{
            this.basePrice = basePrice;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    // Abstract methods to be implemented classes domestic and commercial
    public abstract double calculateFinalPrice();
    public abstract void display();
}