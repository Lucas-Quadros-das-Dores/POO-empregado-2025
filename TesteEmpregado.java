public class TesteEmpregado {

    public static void main(String[] args) {

        Empregado emp1 = new Empregado();
        Empregado emp2 = new Empregado();
        Empregado emp3 = new Empregado();

        emp1.setTipo(1);
        emp2.setTipo(2);
        emp3.setTipo(3);

        emp1.setSalario(5000);
        emp2.setSalario(1700);
        emp2.setComissao(0.2);
        emp3.setSalario(1500);
        emp3.setBonus(400);

        System.out.println(emp1.CalculaSalario());
        System.out.println(emp2.CalculaSalario());
        System.out.println(emp3.CalculaSalario());

    
    }

 


}
