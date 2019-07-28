package OCR;
import java.io.File;
import   net.sourceforge.tess4j.*;
public class principal {
    public  static void main (String [] args) throws TesseractException {
        System.out.println( "--1" );
        ITesseract tesseract = new Tesseract();

        System.out.println( "--2" );
        //String datapath = "src/main/resources/tessdata";
        String datapath = "C:\\Users\\ALEX\\Desktop\\java-tesseract-ocr\\OcrTest\\src\\main\\resources\\tessdata_best";
        tesseract.setDatapath(new File(datapath).getPath());
        //tesseract.setDatapath("D:/tesseract/tessdata_best/");

        tesseract.setLanguage("spa");

        System.out.println( "--3" );
        String fullText = tesseract.doOCR(new File("C:\\Users\\ALEX\\Desktop\\1.jpg"));

        System.out.println( "--4" );
        System.out.println(fullText);

    }
}
