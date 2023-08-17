package Session08.Challenge01.myChallenge16082023;

import java.io.File;

public class Challenge01 {
    public static void main(String[] args) {
        File initialDirectory = new File( "C:/Users/Abraham Gonz\u00E1lez/Documents/GitHub/ReposPubliGitHub/CursoJavaBedu/ModulesGitRepo/Java-Module01Bedu/Session08");

        showDirectoryContent(initialDirectory);

    }
    
    private static void placeSpaces(String fatherDirectory, char simbol){
        System.out.print("[" + simbol + "]");

        //I write "-100" because the fatherDirectory is very large, so with this they will get less "-"
        for (int i = 0; i < fatherDirectory.length() - 100; i++) {
            System.out.print("-");
        }
    }

    private static void showDirectoryContent(File directory) {
        placeSpaces(directory.getParent(), 'D');
        System.out.println(directory.getName());

        File[] subdirectories = directory.listFiles();

        for (File archivo : subdirectories) {
            if (archivo.isFile()) {
                placeSpaces(archivo.getParent(), 'A');
                System.out.println(archivo.getName());
            } else if (archivo.isDirectory()) {
                showDirectoryContent(archivo);
            }
        }
    }

}
