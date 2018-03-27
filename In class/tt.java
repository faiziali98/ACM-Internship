import java.util.*;

class Triangle {

    public void drawTriangle(int scale){
     scale = 1 << scale;
     StringBuilder line = new StringBuilder();
     char t = 0;

     for (int i = 0; i <= scale; i++){
           line.append(" ");
     }
     line.setCharAt(scale, '*');

     for(int i = 0; i < scale; i++){
           System.out.println(line);

     for(int j = scale-i; j <= scale; j++){
                 t = line.charAt(j)==line.charAt(j-1) ? ' ':'*';
                 line.setCharAt(j-1,t);
           }

     }

}
}
public class tt
{
    public static void main(String args[]){
        Triangle t = new Triangle();
        t.drawTriangle(4);
    }
}