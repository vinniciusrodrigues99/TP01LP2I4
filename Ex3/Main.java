package Ex3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Sophia", "Rua Oito, 54", "CSc", 2, 5);
        System.out.println("Nome do aluno: " + student.getName());
        System.out.println("Endereço: " + student.getAddress());
        student.setAddress("Avenida do Vale, 6");
        System.out.println("Endereço atualizado: " + student.getAddress());
        System.out.println("Programa do aluno: " + student.getProgram());
        student.setProgram("MBA");
        System.out.println("Programa atualizado do aluno: " + student.getProgram());
        System.out.println("Ano de curso: " + student.getYear());
        student.setYear(6);
        System.out.println("Ano de curso atualizado: " + student.getYear());
        System.out.println("Débito estudantil: " + student.getFee());
        student.setFee(2000);
        System.out.println("Débito estudantil atualizado: " + student.getFee());
        System.out.println(student.toString());

        System.out.println();

        // Criar um objeto Staff
        Staff staff = new Staff("Wellington", "Rua Visconde, 10", "IFSP", 6000);
        System.out.println("Escola: " + staff.getSchool());
        staff.setSchool("UFABC");
        System.out.println("Escola atualizada: " + staff.getSchool());
        System.out.println("Pagamento: R$" + staff.getPay());
        staff.setPay(9000);
        System.out.println("Pagamento atualizado: R$" + staff.getPay());
        System.out.println(staff.toString());
    }
}


