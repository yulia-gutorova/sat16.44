package com.Gutorova.Yulia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public  class WriteToFile {

    public  void writeToFile (String filename, List<Digit> list, String str) throws IOException {

        PrintWriter write_to_file = new PrintWriter( new BufferedWriter(new FileWriter(filename)));
        write_to_file.println("Even numbers");
        write_to_file.println("Count of " + str + " numbers: "   + list.size() + "\n");
        list.stream().forEach(dig -> write_to_file.println(dig));
        write_to_file.close();

    }

}
