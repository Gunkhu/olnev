package dev.tanto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Storage {
    public static ArrayList<NameDict> readContent(){
        try {
            return tryReadContent();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    private static ArrayList<NameDict> tryReadContent() throws FileNotFoundException{
        ArrayList<NameDict> nameDictList = new ArrayList<>();
        String filenName = Prop.getFilename();
        File file = new File(filenName);
        try(Scanner sc = new Scanner(file,"utf8")){
            sc.nextLine();
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                NameDict nameDict = new NameDict();
                String[] lineArray = line.split(":");
                nameDict.setHuName(lineArray[0]);
                nameDict.setItName(lineArray[1]);
                nameDictList.add(nameDict);
                //System.out.println(line);
            }


        }
        return nameDictList;
    }
}
