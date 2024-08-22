package infytq1;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String time[]=s.split(":");
    String hour=time[0];
    String mins=time[1];
    String secAMPM=time[2];
    String seconds = secAMPM.substring(0,secAMPM.length()-2);
    String meridiem = secAMPM.substring(secAMPM.length()-2);
    String militaryTime="";
    int hours=Integer.parseInt(hour);
    if((hours>=0 && hours<12) && (meridiem.equals("AM"))){
        militaryTime = String.format("%02d",hours)+":"+mins+":"+seconds;
    }
    else if((hours>=0&&hours<12) && (meridiem.equals("PM"))){
        militaryTime=(hours +12)+":"+mins+":"+seconds;
    }
    else if((hours==12) && meridiem.equals("AM")){
        militaryTime="00" +":"+seconds;
    }
    else if((hours==12) && meridiem.equals("PM")){
        militaryTime=hours +":"+mins+":"+seconds;

    }
    return militaryTime;

}
}

public class Infytq2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

