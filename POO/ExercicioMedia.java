import javax.swing.JOptionPane;

public class ExercicioMedia{


public static void main(String[] args) {

Nota nota = new Nota();


nota.n1 = Double.parseDouble(JOptionPane.showInputDialog("  Digite a primeira nota: "));
nota.n2 = Double.parseDouble(JOptionPane.showInputDialog("  Digite a segunda nota: "));
nota.n3 = Double.parseDouble(JOptionPane.showInputDialog("  Digite a terceira nota: "));
nota.n4 = Double.parseDouble(JOptionPane.showInputDialog("  Digite a quarta nota: "));


double media = (nota.n1 + nota.n2 + nota.n3 + nota.n4)/4;
JOptionPane.showMessageDialog(null, String.format("A média é:"+ media));



if((nota.n1 > nota.n2) && (nota.n1 > nota.n3) && (nota.n1 > nota.n4)){

    JOptionPane.showMessageDialog(null,"A nota 1 é a maior nota");
}

if((nota.n2 > nota.n1) && (nota.n2 > nota.n3) && (nota.n2 > nota.n4)){

    JOptionPane.showMessageDialog(null,"A nota 2 é a maior nota");
}

if((nota.n3 > nota.n1) && (nota.n3 > nota.n2) && (nota.n3 > nota.n4)){

    JOptionPane.showMessageDialog(null,"A nota 3 é a maior nota");
}

if((nota.n4 > nota.n1) && (nota.n4 > nota.n2) && (nota.n4 > nota.n3)){

    JOptionPane.showMessageDialog(null,"A nota 4 é a maior nota");

}else{
 
    JOptionPane.showMessageDialog(null,"As notas são iguais");



}


}


}