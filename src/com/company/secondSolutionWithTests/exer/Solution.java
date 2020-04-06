package com.company.secondSolutionWithTests.exer;
import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String line;

        try {
            while (null != (line = bufferedReader.readLine())) {
                line = line.trim();

                if ("WAIT".equals(line)) {
                    Thread.sleep(10);
                } else {
                    Printer printer = Printer.getInstance();
                    String result = printer.print(line);
                    bufferedWriter.write(result + "\n");
                }
            }
        } catch (Exception e) {
            bufferedWriter.write("EXCEPTION");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Printer {
    private static int lastId = 1;
    private final int id; // ID of the printer. Unique.
    private LocalDateTime busyEndTime;
    private static Printer single_instance = null;

    private Printer() {
        this.id = lastId++;
    }


    public static Printer getInstance() throws Exception {
        if (single_instance == null && single_instance.isAvailable()) {
            single_instance = new Printer();
        } else {
            throw new Exception();
        }
        return single_instance;
    }

    // Prints out the given String
    public String print(String toPrint) throws UnsupportedOperationException {
        if (this.isAvailable()) {
            // Its not needed to actually print with a printer in this exercise
            this.busyEndTime = LocalDateTime.now().plusNanos(5000000);
            return String.format("Printer #%s prints: %s", this.id, toPrint);
        } else {
            throw new UnsupportedOperationException();
        }

    }

    public boolean isAvailable() {
        return this.busyEndTime == null || LocalDateTime.now().isAfter(this.busyEndTime);
    }
}