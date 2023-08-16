package Ex1;
public class TestAuthor {
    public static void main(String[] args) {
        // Testando o construtor
        Author author = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        System.out.println("Author criado:");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
        System.out.println(author); // Testando o método toString()

        // Testando o setter (não permitido, não deve mudar o name e gender)
        // author.setName("Novo Nome"); // Comentado para evitar erro de compilação
        // author.setGender('f'); // Comentado para evitar erro de compilação

        // Testando os getters novamente após tentativa de alteração
        System.out.println("Após tentativa de alteração:");
        System.out.println("Name: " + author.getName());
        System.out.println("Gender: " + author.getGender());
    }
}
