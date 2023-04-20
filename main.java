import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class CarRentalSystem {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int c;
            System.out.println("Hello!...");
            System.out.println("enter 1 if you want to rent a car");
            System.out.println("enter 2 if you want to give your car for rent");
            c=in.nextInt();
            Scanner scanner = new Scanner(System.in);
            if(c==2){
                
               
                String name = "";
                String contactNumber = "";
                String emailAddress = "";
                String carModel = "";
                int rentalDuration = 0;
                double rentalPrice = 0.0;

            try {
                System.out.print("Enter your name: ");
                name = scanner.nextLine();
                
                System.out.print("Enter your contact number: ");
                contactNumber = scanner.nextLine();
                validateContactNumber(contactNumber);

                System.out.print("Enter your email address: ");
                emailAddress = scanner.nextLine();
                validateEmail(emailAddress);

                System.out.print("Enter the car model: ");
                carModel = scanner.nextLine();

                System.out.print("Enter the rental duration (in days): ");
                rentalDuration = scanner.nextInt();

                System.out.print("Enter the rental price per day(in rupees): ");
                rentalPrice = scanner.nextDouble();
                scanner.nextLine(); 
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
            scanner.close();
            return;
        }

        try {
            File outputFile = new File("rentals.txt");
            FileWriter writer = new FileWriter(outputFile, true);
            //writer.write("{"+ "\n"+"\""+"name of car owner "+"\""+": "+"\""+name+"\""+ ","+ "\n"+"\""+"contact number  "+"\""+": "+"\"" + contactNumber+"\"" + ","+ "\n"+"\""+"emailAddress "+"\""+": "+"\"" + emailAddress+"\""+ ","+ "\n"+"\""+"carModel "+"\""+": "+"\"" + carModel+"\"" + ","+ "\n"+"\""+"rentalDureation "+"\""+": "+"\"" + rentalDuration+"\"" + ","+ "\n"+"\""+"rentalprice "+"\""+": " +"\""+ rentalPrice+"\""+ "\n"+"}"+ "\n"+ "\n");
            writer.write(name + "," + contactNumber + "," + emailAddress + "," + carModel + "," + rentalDuration + "," + rentalPrice + "\n");
            writer.close();

            System.out.println("Rental information saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save rental information.");
        }

        scanner.close();
            }
            

            else if(c==1)
            {
                int k;
                System.out.println("enter 1 for entering car model ");
                System.out.println("enter 2 for entering rental duration ");
                System.out.println("enter 3 for entering rental price ");
                System.out.println("chose the given number to enter required credintials .");
                k=in.nextInt();
                if(k==1)
                {
                    System.out.print("Enter a car model to search for: ");
                    String searchCarModel = scanner.nextLine();
   
                    try {
                    System.out.println("here are some found cars...");
                    System.out.println();
                    File inputFile = new File("rentals.txt");
                    Scanner fileScanner = new Scanner(inputFile);

                    boolean found = false;

                    while (fileScanner.hasNextLine()) {
                        String line = fileScanner.nextLine();
                        String[] tokens = line.split(",");

                        if (tokens[3].equals(searchCarModel)) {
                            System.out.println();
                            System.out.println("Name: " + tokens[0]);
                            System.out.println("Contact Number: " + tokens[1]);
                            System.out.println("Email Address: " + tokens[2]);
                            System.out.println("Car Model: " + tokens[3]);
                            System.out.println("Rental Duration: " + tokens[4]);
                            System.out.println("Rental Price: " + tokens[5]);
                            System.out.println();
                            found = true;
                        }
                    }
                    
                    

                    fileScanner.close();

                    if (!found) {
                        System.out.println("No rental found for the specified car model.");
                    }

                    }
                    catch (IOException e) {
                        System.out.println("Failed to search for rental information.");
                    }

                    scanner.close();
                }

                else if(k==2)
                {

                    System.out.print("Enter rental duration to search for: ");
                    String searchCarModel = scanner.nextLine();
   
                    try {
                    System.out.println("here are some found cars...");
                    File inputFile = new File("rentals.txt");
                    Scanner fileScanner = new Scanner(inputFile);

                    boolean found = false;

                    while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] tokens = line.split(",");

                    if (tokens[4].equals(searchCarModel)) {
                        System.out.println();
                        System.out.println("Name: " + tokens[0]);
                        System.out.println("Contact Number: " + tokens[1]);
                        System.out.println("Email Address: " + tokens[2]);
                        System.out.println("Car Model: " + tokens[3]);
                        System.out.println("Rental Duration: " + tokens[4]);
                        System.out.println("Rental Price: " + tokens[5]);
                        System.out.println();
                        found = true;

                    }
                    }

                    fileScanner.close();

                    if (!found) {
                        System.out.println("No rental found for the specified car model.");
                    }

                    }
                    catch (IOException e) {
                        System.out.println("Failed to search for rental information.");
                    }

                    scanner.close();
                }

                else if(k==3)
                {

                    System.out.print("Enter rentalPrice to search for: ");
                    String searchCarModel = scanner.nextLine();
   
                    try {
                    System.out.println("here are some found cars...");
                    File inputFile = new File("rentals.txt");
                    Scanner fileScanner = new Scanner(inputFile);

                    boolean found = false;

                    while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] tokens = line.split(",");

                    if (tokens[5].equals(searchCarModel)) {
                        System.out.println();
                        System.out.println("Name: " + tokens[0]);
                        System.out.println("Contact Number: " + tokens[1]);
                        System.out.println("Email Address: " + tokens[2]);
                        System.out.println("Car Model: " + tokens[3]);
                        System.out.println("Rental Duration: " + tokens[4]);
                        System.out.println("Rental Price: " + tokens[5]);
                        System.out.println();
                        found = true;

                    }
                    }

                    fileScanner.close();

                    if (!found) {
                        System.out.println("No rental found for the specified car model.");
                    }

                    }
                    catch (IOException e) {
                        System.out.println("Failed to search for rental information.");
                    }

                    scanner.close();
                }

                else{
                    System.out.println("Failed to load the information!... ,please enter correct number");
                }

            }

            else{
                System.out.println("Failed to load the information!... ,please enter correct number");
            }
        }


    }

     private static void validateContactNumber(String contactNumber) throws Exception {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(contactNumber);
        if (!matcher.matches()) {
            throw new Exception("Contact number should be a 10-digit number.");
        }
    }

   
    private static void validateEmail(String email) throws Exception {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new Exception("Invalid email address format.");
        }
    }

}
