import javax.print.attribute.SetOfIntegerSyntax;

public class TesteEmpregado {
    public static void main (String[] args){
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();
        e1.setTipo(tipo: 0);
        e2.setTipo(tipo: 1);
        e3.setTipo(tipo: 2);
        

        e1.setSalario(2000);
        e2.setSalario(1000);
        e1.setComissao(comissao: 0.1);
        e3.setSalario(3000);
        e3.setBonus(0.5);
        }
}
