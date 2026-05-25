public class CommercialCylinder extends LPGCylinder {

    private String businessLicense;
    private int quantity;

    public CommercialCylinder(String cylinderId, String cylinderType, double basePrice, double weight,
                       String bookingId, String month, String businessLicense, int quantity) {
        super(cylinderId, cylinderType, basePrice, weight, bookingId, month);
        setBusinessLicense(businessLicense);
        setQuantity(quantity);
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        if(businessLicense == null || businessLicense.isEmpty()) {
            System.out.println("Invalid Business License");
        }
        else{
            this.businessLicense = businessLicense;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.out.println("Invalid Quantity");
        }
        else{
            this.quantity = quantity;
        }
    }

    @Override
    public double calculateFinalPrice() {
        double totalPrice = this.getBasePrice() * this.quantity;

        // Bulk discounts for commercial customers having more than
        // 5 cylinders and 10 or more cylinders respective
        if(this.quantity >=10){
            totalPrice -=(totalPrice * 0.05);
        }
        else if(this.quantity >=5){
            totalPrice -=(totalPrice * 0.03);
        }
        return totalPrice;
    }

    @Override
    public void display() {
        System.out.println("-----------------------------------------------");
        System.out.println("Commercial Cylinder: ");
        System.out.println("Cylinder ID: " + this.getCylinderId());
        System.out.println("Cylinder Type: " + this.getCylinderType());
        System.out.println("Base Price: " + this.getBasePrice());
        System.out.println("Weight in Cylinder: " + this.getWeight());
        System.out.println("Booking ID: " + this.getBookingId());
        System.out.println("Business License: " + this.getBusinessLicense());
        System.out.println("Quantity: " + this.getQuantity());
        System.out.println("Final Price: " + this.calculateFinalPrice());
        System.out.println("-----------------------------------------------");
        System.out.println();
    }
}
