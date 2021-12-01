import java.io.File;
        import java.util.ArrayList;
        import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> measures= new ArrayList<Integer>();
        File input = new File("/Users/*********/Desktop/AdventofCode21/src/day1.txt");
        Scanner sc = new Scanner(input);
        int count = 0;
        int increases = 0;
        int secondCount= 0;

        while (sc.hasNextLine()){
            int nextMeasure = Integer.parseInt(sc.nextLine());
            measures.add(nextMeasure);
            count++;
        }
        ArrayList<Integer> conMeasures = new ArrayList<Integer>();
        for (int i=0; i<count+1; i++){
            if (measures.size()> i+2){
                int newMeasure = measures.get(i) + measures.get(i+1) + measures.get(i+2);
                conMeasures.add(newMeasure);
                secondCount++;
            }
        }

        for (int i=0; i<secondCount-1; i++){
            if (conMeasures.get(i) < conMeasures.get(i+1)){
                increases++;
            }
        }

        System.out.println(increases);

    }

}
