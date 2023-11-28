import Legal.LawyerService;
import Legal.ParalegalService;
import Legal.LegalService;

public class Main {
    public static void main(String[] args) {
        LegalService lawyer = new LawyerService();
        LegalService paralegal = new ParalegalService();

        lawyer.fileLegalDocument();
        lawyer.provideLegalAdvice();

        paralegal.fileLegalDocument();
        paralegal.provideLegalAdvice();
    }
}
