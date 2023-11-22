import java.util.Scanner;

abstract class LegalProfessional {
    private String name;
    private String specialization;

    public LegalProfessional(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public abstract void performDuties();

    public final void attendCourt() {
        System.out.println(name + " is attending court.");
    }
}

class Lawyer extends LegalProfessional {
   

    public Lawyer(String name, String specialization) {
        super(name, specialization);
        
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is representing clients in legal matters.");
    }

    public void argueCase() {
        super.attendCourt();
        System.out.println(getName() + " is arguing a case in court.");
    }
}

class Judge extends LegalProfessional {
    private String courtType;

    public Judge(String name, String specialization, String courtType) {
        super(name, specialization);
        this.courtType = courtType;
    }
    public void performDuties() {
        System.out.println(getName() + " is presiding over legal proceedings in a " + courtType + " court.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lawyer's name:");
        String lawyerName = scanner.nextLine();
        System.out.println("Enter lawyer's specialization:");
        String lawyerSpecialization = scanner.nextLine();
        System.out.println("Enter lawyer's bar association:");
        

        Lawyer lawyer = new Lawyer(lawyerName, lawyerSpecialization);
        lawyer.performDuties();
        lawyer.argueCase();

        System.out.println("\nEnter judge's name:");
        String judgeName = scanner.nextLine();
        System.out.println("Enter judge's specialization:");
        String judgeSpecialization = scanner.nextLine();
        System.out.println("Enter judge's court type:");
        String courtType = scanner.nextLine();

        Judge judge = new Judge(judgeName, judgeSpecialization, courtType);
        judge.performDuties();

        scanner.close();
    }
}
