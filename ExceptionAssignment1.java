package LMS2;

//Exception classes
class CountryNotValidException extends Exception {
 public CountryNotValidException(String message) {
     super(message);
 }
}

class EmployeeNameInvalidException extends Exception {
 public EmployeeNameInvalidException(String message) {
     super(message);
 }
}

class TaxNotEligibleException extends Exception {
 public TaxNotEligibleException(String message) {
     super(message);
 }
}

//TaxCalculator class
class TaxCalculator {
 public static double calculateTax(String empName, boolean isIndian, double empSal)
         throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
     if (!isIndian) {
         throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
     }

     if (empName == null || empName.isEmpty()) {
         throw new EmployeeNameInvalidException("The employee name cannot be empty");
     }

     if (empSal > 100000) {
         return empSal * 8 / 100;
     } else if (empSal >= 50000 && empSal <= 100000) {
         return empSal * 6 / 100;
     } else if (empSal >= 30000 && empSal < 50000) {
         return empSal * 5 / 100;
     } else if (empSal >= 10000 && empSal < 30000) {
         return empSal * 4 / 100;
     } else {
         throw new TaxNotEligibleException("The employee does not need to pay tax");
     }
 }
}

//CalculatorSimulator main class
public class ExceptionAssignment1 {
 public static void main(String[] args) {
     try {
         // Example 1: Eligible for tax calculation
         String empName1 = "Jojo";
         boolean isIndian1 = true;
         double empSal1 = 120000;
         double taxAmount1 = TaxCalculator.calculateTax(empName1, isIndian1, empSal1);
         System.out.println("Tax amount is " + taxAmount1);

         // Example 2: Empty employee name
         String empName2 = "";
         boolean isIndian2 = true;
         double empSal2 = 80000;
         double taxAmount2 = TaxCalculator.calculateTax(empName2, isIndian2, empSal2);
         System.out.println("Tax amount is " + taxAmount2);

     } catch (CountryNotValidException e) {
         System.out.println("Country not valid: " + e.getMessage());
         e.printStackTrace();
     } catch (EmployeeNameInvalidException e) {
         System.out.println("Employee name not valid: " + e.getMessage());
         e.printStackTrace();
     } catch (TaxNotEligibleException e) {
         System.out.println("Not eligible for Tax calculation: " + e.getMessage());
         e.printStackTrace();
     }
 }
}
