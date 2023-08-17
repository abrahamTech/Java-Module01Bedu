package Session08.Challenge02.myChallenge16082023;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {
    public static void main(String[] args) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Abraham Gonz\u00E1lez\\Documents\\GitHub\\ReposPubliGitHub\\CursoJavaBedu\\ModulesGitRepo\\Java-Module01Bedu\\Session08\\Challenge02\\myChallenge16082023\\beto.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Abraham Gonz\u00E1lez\\Documents\\GitHub\\ReposPubliGitHub\\CursoJavaBedu\\ModulesGitRepo\\Java-Module01Bedu\\Session08\\Challenge02\\myChallenge16082023\\beto_copia.png"));


        byte[] buffer = new byte[1024];

        int bytesLeidos = 0;

        while ((bytesLeidos = bis.read(buffer)) > 0){
            bos.write(buffer, 0, bytesLeidos);
        }

        bos.close();
        bis.close();
    }
}
