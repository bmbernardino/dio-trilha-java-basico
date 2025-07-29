// Classe de teste para demonstrar o funcionamento
public class TesteiPhone {
    public static void main(String[] args) {
        // Criando uma instância do iPhone
        iPhone meuiPhone = new iPhone();
        
        System.out.println("=== TESTANDO REPRODUTOR MUSICAL ===");
        meuiPhone.selecionarMusica("Hotel California - Eagles");
        meuiPhone.tocar();
        meuiPhone.pausar();
        
        System.out.println("\n=== TESTANDO APARELHO TELEFÔNICO ===");
        meuiPhone.ligar("(11) 99999-9999");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();
        meuiPhone.encerrarChamada();
        
        System.out.println("\n=== TESTANDO NAVEGADOR INTERNET ===");
        meuiPhone.exibirPagina("https://www.apple.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
        
        System.out.println("\n=== STATUS FINAL ===");
        System.out.println(meuiPhone.getStatus());
    }
}