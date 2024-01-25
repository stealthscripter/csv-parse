import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class parse {
    parse(){
        String file = "bootlist.csv";
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

//                for(String index : row){
//                    if(index.length() == 0){
//                        break;
//                    }
//                    else {
//                        System.out.printf("%-10s", index);
//                    }
                for (int i = 0; i < row.length; i++) {
                    if (row[i].contains("    ")) {
                        continue;

                    } else {
                        System.out.printf("%-10s", row[i]);
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
