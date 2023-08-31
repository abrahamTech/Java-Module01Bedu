package Session08.Example01.myCode16082023;

import java.io.File;

public class Example01 {
    public static void main(String[] args) {
        File file01 = new File("C:/Users/Abraham González/Documents/GitHub/ReposPubliGitHub/CursoJavaBedu/ModulesGitRepo/Java-Module01Bedu/Session08/resources/cursos/cursos.txt");

        //File Query
        System.out.println("File Name: " + file01.getName());
        System.out.println("Path: " + file01.getPath());
        System.out.println("Absolute Path: " + file01.getAbsolutePath());

        //Directory of the file
        System.out.println("Father: " + file01.getParent());

        //Check if the file exists
        System.out.println("Exist: " + file01.exists());

        //Check if the Hidden files exists
        System.out.println("Hidden: " + file01.isHidden());

        System.out.println("\n------------------------");
        System.out.println("If the file Exist: ");

        if(file01.exists()) {
            System.out.println("Writing: " + file01.canWrite());
            System.out.println("Reading: " + file01.canRead());
            System.out.println("Execute: " + file01.canExecute());
            System.out.println("Directory: " + file01.isDirectory());
            System.out.println("Lenght: " + file01.length());
        }
    }
}
