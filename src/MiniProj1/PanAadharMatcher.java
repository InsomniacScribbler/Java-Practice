package MiniProj1;

import java.util.Scanner;

public class PanAadharMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        try {
            System.out.println("Enter the Aadhaar Number:");
            String aadhaarNum = sc.nextLine();

            // Fetch Aadhaar and PAN records
            Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNum);
            Pan pan = panService.getPanByAadhaarNumber(aadhaarNum);

            // Check if records exist
            if (aadhaar == null) {
                throw new RecordNotFoundException("Aadhaar record not found for number: " + aadhaarNum);
            }

            if (pan == null) {
                throw new RecordNotFoundException("PAN record not found for Aadhaar number: " + aadhaarNum);
            }

            // Display records if found
            System.out.println("PAN Details: " + pan.toString());
            System.out.println("Aadhaar Details: " + aadhaar.toString());

        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();  // Close the scanner to prevent resource leaks
        }
    }
}

// Custom exception class
class RecordNotFoundException extends Exception {
    public RecordNotFoundException(String message) {



    }
}
