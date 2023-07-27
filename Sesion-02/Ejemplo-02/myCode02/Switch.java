public class Switch {
    public static void main(String[] args) {

        System.out.println("\n**If**");
        boolean b = true;

        if(b) {
            System.out.println("B is true");
        } else {
            System.out.println("B is false");
        }

        System.out.println("\n**Switch with Break**");
        String message;
        byte score = 4;
        
        switch(score) {
            case 10:
                message = "Excelent";
                break;
            case 9:
            case 8:
                message = "Very Good";
                break;
            case 7:
                message = "Good Work";
                break;
            case 6:
                message = "You Pass";
                break;
            default :
                message = "Failed";
        }

        System.out.println("Your score is: " + score + " - " + message);


        // Months for the end of the year
        System.out.println("\n**Switch without Break use**");
        String month = "May";

        System.out.println("Current month: " + month + "\nMonths to the end of the year: ");

        switch (month) {
            case "January" :
                System.out.println("February");
            case "February" :
                System.out.println("March");
            case "March" :
                System.out.println("April");
            case "April" :
                System.out.println("May");
            case "May" :
                System.out.println("June");
            case "June" :
                System.out.println("July");
            case "July" :
                System.out.println("August");
            case "August" :
                System.out.println("September");
            case "September" :
                System.out.println("October");
            case "October" :
                System.out.println("November");
            case "November" :
                System.out.println("December");
                break;
            default:
                System.out.println("We are in the last month of the year");
        }
    }
}
