package document;


public class DocumentChecker {

    public static void main(String[] args) {

        ExcelDocument excel = new ExcelDocument();
        Document excelDocument = new ExcelDocument(); //wielopostaciowowść Documentu - Document może występować w kilku postaciach - być dokumentem excla i pdf. To jest polimorfizm
        Document pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();

        // Polimorfizm możemy osiągnąć za pomocą class i interfejsu np. nasza klasa bazowa może występować pod różnymi postaciami.
        //Analogicznie może być z interfejsem
    }
}
