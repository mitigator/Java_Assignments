public class ParalegalService implements LegalService {
    @Override
    public void fileLegalDocument() {
        System.out.println("Paralegal is filing a legal document.");
    }
    @Override
    public void provideLegalAdvice() {
        System.out.println("Paralegal is providing legal advice.");
    }
}
