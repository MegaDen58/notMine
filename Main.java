package com.company;

import java.util.Locale;
import java.util.regex.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
            String s;
            String x = "";
            while((s = br.readLine()) != null){
                x += s + " ";
            }
            String text = x.toLowerCase(Locale.ROOT);
            String forIndex = text.replace("\r\n", " ");
            char[] gg = forIndex.toCharArray();

            String result = "";
            BufferedReader br1 = new BufferedReader(new FileReader("numbers.txt"));
            String jj = "";
            int i = 0;
            while ((s = br1.readLine()) != null) {
                jj += s;
            }
            String reg = "\\d+(\s*);(\s*)\\d+";
            String reg1 = ";\\d+";
            Pattern p = Pattern.compile(reg);
            Pattern p1 = Pattern.compile(reg1);
            Matcher m = p.matcher(jj);
            while(m.find()){
                String t = m.group().replaceAll(" ", "");
                Matcher m1 = p1.matcher(t);
                while(m1.find()){
                    String g = m1.group().replaceAll(";", "");
                    int index = Integer.parseInt(g) - 1;
                    result += gg[index];
                }
            }
            System.out.println(result);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}