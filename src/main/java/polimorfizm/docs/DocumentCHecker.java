package polimorfizm.docs;

public class DocumentCHecker {
    public static void main(String[] args) {

        Document excel = new ExcelDocument();
        Document pdf = new PdfDocument();

        excel.getDescription();
        pdf.getDescription();
    }
}
