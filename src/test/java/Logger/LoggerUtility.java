package Logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import java.io.*;

public class LoggerUtility {

    //path-ul catre toate log-urile:
    private static String suiteLogsPath = "target/logs/suite/";

    //path-ul catre un singur log:
    private static String regressionLogsPath = "target/logs/";
    private static Logger logger = LogManager.getLogger();

    //Metoda care logg-eaza pornirea unu test
    //synchronized = keyword care se aplica in momentul in care vrem sa blocam apelarea metodei in doua thread-uri diferite


    public static synchronized void startTestCase(String testName) {
        ThreadContext.put("threadName", testName);
        logger.info("=========================== Execution started : " + testName + "===========================");
    }

    //Metoda care logg-eaza opirea unu test

    public static synchronized void endTestCase(String testName) {
        logger.info("=========================== Execution finished : " + testName + "===========================");
    }

    //Metoda care logg-eaza o actiune din test

    public static synchronized void info(String message) {
        logger.info(Thread.currentThread().getName() + " : " + getCallInfo() + " " + message); // get, clasa, metoda, mesajul pe care il vreau
    }

    //Metoda care ne returneaza informatii despre actiunea curenta

    private static synchronized String getCallInfo() {
        String className = Thread.currentThread().getStackTrace()[3].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        return className + " : " + methodName + " ==> ";
    }

    //Metoda care returneaza mesaj de eroare

    public static synchronized void error(String message) {
        logger.error(Thread.currentThread().getName() + " : " + getCallInfo() + " " + message); // get, clasa, metoda, mesajul p0e care il vreau
        logger.info("=========================== Test failed: ===========================");
    }

    //Metoda care pune tot continutul fisierelor intr-unul singur

    public static void mergeLogsIntoOne() {

        File dir = new File(suiteLogsPath);
        // create object of PrintWriter for output file
        // Get list of all the files in form of String Array
        String[] fileNames = dir.list();

        try {
            // create object of PrintWriter for output file
            PrintWriter pw = new PrintWriter(regressionLogsPath + "output.log");

            // loop for reading the contents of all the files
            // in the directory GeeksForGeeks
            for (String fileName : fileNames) {
                if (fileName.contains(".log")) {

                    // create instance of file from Name of
                    // the file stored in string Array
                    File f = new File(dir, fileName);

                    // create object of BufferedReader
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    pw.println("Contents of file " + fileName);

                    // Read from current file
                    String line = br.readLine();
                    while (line != null) {

                        // write to the output file
                        pw.println(line);
                        line = br.readLine();
                    }
                    pw.flush();

                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}