public class MainTest {

    public static void main(String[] args) {

        System.out.println("===== VALID DOMESTIC TEST =====");
        DomesticCylinder d1 = new DomesticCylinder(
                "NOC-001",
                "Domestic",
                1800,
                14.2,
                "B001",
                "Baishakh",
                200,
                "123456789012"
        );
        d1.display();


        System.out.println("===== VALID COMMERCIAL TEST =====");
        CommercialCylinder c1 = new CommercialCylinder(
                "NOC-002",
                "Commercial",
                2500,
                19,
                "B002",
                "Jestha",
                "LIC-123",
                10
        );
        c1.display();


        System.out.println("===== INVALID CYLINDER ID TEST =====");
        DomesticCylinder d2 = new DomesticCylinder(
                "ABC-001",
                "Domestic",
                1800,
                14.2,
                "B003",
                "Ashadh",
                200,
                "123456789012"
        );
        d2.display();


        System.out.println("===== INVALID PRICE TEST =====");
        DomesticCylinder d3 = new DomesticCylinder(
                "NOC-003",
                "Domestic",
                -1800,
                14.2,
                "B004",
                "Shrawan",
                200,
                "123456789012"
        );
        d3.display();


        System.out.println("===== INVALID WEIGHT TEST =====");
        CommercialCylinder c2 = new CommercialCylinder(
                "NOC-004",
                "Commercial",
                2500,
                -19,
                "B005",
                "Bhadra",
                "LIC-456",
                5
        );
        c2.display();


        System.out.println("===== INVALID CITIZENSHIP TEST =====");
        DomesticCylinder d4 = new DomesticCylinder(
                "NOC-005",
                "Domestic",
                1800,
                14.2,
                "B006",
                "Ashwin",
                200,
                "12345"
        );
        d4.display();


        System.out.println("===== INVALID QUANTITY TEST =====");
        CommercialCylinder c3 = new CommercialCylinder(
                "NOC-006",
                "Commercial",
                2500,
                19,
                "B007",
                "Kartik",
                "LIC-789",
                0
        );
        c3.display();


        System.out.println("===== INVALID SUBSIDY TEST =====");
        DomesticCylinder d5 = new DomesticCylinder(
                "NOC-007",
                "Domestic",
                1800,
                14.2,
                "B008",
                "Mangsir",
                2000,
                "123456789012"
        );
        d5.display();
    }
}