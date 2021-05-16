
package Atividades;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        int nascimento, idadeatual,anoatual;
        System.out.println("Saluton, eniru la jaron de via naskiĝo: ");
        Scanner idadetecl=new Scanner(System.in);
        nascimento=idadetecl.nextInt();
        System.out.println("Nun tajpu la nunan jaron");
        Scanner anotecl=new Scanner(System.in);
        anoatual=anotecl.nextInt();
        idadeatual=anoatual-nascimento;
        System.out.println("Via aĝo estas:"+idadeatual);
    }
    
}
