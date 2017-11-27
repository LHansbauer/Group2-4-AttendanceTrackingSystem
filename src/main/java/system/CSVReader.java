package system;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSVReader {

        public static void main(String[] args) {

            String csvFile = "C:\\Users\\Lorenz Hansbauer\\IdeaProjects\\AttendanceTrackingSystem\\Group2-4-AttendanceTrackingSystem\\src\\data\\initData.csv";

            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";

            try {

                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    String[] currentLine = line.split(cvsSplitBy);
                    String[] from = line.split(cvsSplitBy);
                    String[] to = line.split(cvsSplitBy);
                    String[] location = line.split(cvsSplitBy);
                    String[] groupNumber = line.split(cvsSplitBy);
                    // todo get information about tutors names
                    // String[] nameOfTutor = line.split(cvsSplitBy);

                    System.out.println("Country [date= " + currentLine[2]
                                    + " , from=" + currentLine[3]
                                    + " , to=" + currentLine[4]
                                    + " , location=" + currentLine[10]
                                    + " , to=" + currentLine[9] + "]");

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
}
