public class DomesticCylinder extends LPGCylinder{

    private double subsidyAmount;
    private String citizenshipNumber;

    DomesticCylinder(String cylinderId, String cylinderType, double basePrice, double weight, String bookingId, String month,
                     double subsidyAmount, String citizenshipNumber) {
        super(cylinderId, cylinderType, basePrice, weight, bookingId, month);
        setSubsidyAmount(subsidyAmount);
        setCitizenshipNumber(citizenshipNumber);
    }

    public double getSubsidyAmount() {
        return subsidyAmount;
    }

    public void setSubsidyAmount(double subsidyAmount) {
        if(subsidyAmount > 0 && subsidyAmount <= this.getBasePrice()){
            this.subsidyAmount = subsidyAmount;
        }
        else{
            System.out.println("Invalid subsidy amount");
        }
    }

    public String getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(String citizenshipNumber) {
        if(citizenshipNumber.length() != 12 || !citizenshipNumber.matches("[0-9]+")){
            System.out.println("Invalid Citizenship Number");
        }
        else{
            this.citizenshipNumber = citizenshipNumber;
        }
    }

    @Override
    public double calculateFinalPrice(){
        return this.getBasePrice() - this.subsidyAmount;
    }

    public void display(){
        System.out.println("-----------------------------------------------");
        System.out.println("Domestic Cylinder Details:");
        System.out.println("Cylinder ID: " + this.getCylinderId());
        System.out.println("Cylinder Type: " + this.getCylinderType());
        System.out.println("Base Price: " + this.getBasePrice());
        System.out.println("Weight in Cylinder: " + this.getWeight());
        System.out.println("Booking ID: " + this.getBookingId());
        System.out.println("Subsidy Amount: " + this.getSubsidyAmount());
        System.out.println("Final Price: " + this.calculateFinalPrice());
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

}
