class Legal_Services {
    private String serviceName;
    private int serviceCode;
    private double serviceFee;
    private boolean isActive;

    public Legal_Services() {
        this.serviceName = "Default Service";
        this.serviceCode = 0;
        this.serviceFee = 0.0;
        this.isActive = false;
    }

    public Legal_Services(String serviceName, int serviceCode, double serviceFee, boolean isActive) {
        this.serviceName = serviceName;
        this.serviceCode = serviceCode;
        this.serviceFee = serviceFee;
        this.isActive = isActive;
    }


    public Legal_Services(String serviceName) {
        this.serviceName = serviceName;
        this.serviceCode = 0;
        this.serviceFee = 0.0;
        this.isActive = false;
    }

    public void displayService() {
        System.out.println("Service Name: " + serviceName);
        System.out.println("Service Code: " + serviceCode);
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Active Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println();
    }
}

class Case_Files {
    public int caseNumber;
    private String caseType;
    private String clientName;
    private boolean isClosed;

    public void createCaseFile() {
        this.caseNumber = 0;
        this.caseType = "Default Case";
        this.clientName = "No Client";
        this.isClosed = false;
        System.out.println("New case file created.");
        System.out.println();
    }

    public void createCaseFile(int caseNumber) {
        this.caseNumber = caseNumber;
        this.caseType = "Default Case";
        this.clientName = "No Client";
        this.isClosed = false;
        System.out.println("Case file created for Case #" + caseNumber);
        System.out.println();
    }

    public void createCaseFile(int caseNumber, String caseType) {
        this.caseNumber = caseNumber;
        this.caseType = caseType;
        this.clientName = "No Client";
        this.isClosed = false;
        System.out.println("Case file created for Case #" + caseNumber + " of type " + caseType);
        System.out.println();
    }
    
    public void createCaseFile(int caseNumber, String caseType, String clientName) {
        this.caseNumber = caseNumber;
        this.caseType = caseType;
        this.clientName = clientName;
        this.isClosed = false;
        System.out.println("Case file created for Case #" + caseNumber + " of type " + caseType + " for client: " + clientName);
        
    }
}

public class Main {
    public static void main(String[] args) {
        Legal_Services service1 = new Legal_Services();
        Legal_Services service2 = new Legal_Services("Divorce", 12345, 500.0, true);
        Legal_Services service3 = new Legal_Services("Real Estate");

        service1.displayService();
        service2.displayService();
        service3.displayService();

        Case_Files caseFiles = new Case_Files();
        caseFiles.createCaseFile();
        caseFiles.createCaseFile(1001);
        caseFiles.createCaseFile(2001, "Criminal Law");
        caseFiles.createCaseFile(3001, "Family Law", "John Doe");
    }
}
