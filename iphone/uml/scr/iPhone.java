// Classe iPhone que implementa todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Atributos privados
    private String musicaAtual;
    private String paginaAtual;
    private boolean emChamada;
    private boolean tocandoMusica;
    
    // Construtor
    public iPhone() {
        this.musicaAtual = "";
        this.paginaAtual = "";
        this.emChamada = false;
        this.tocandoMusica = false;
    }
    
    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            tocandoMusica = true;
            System.out.println("▶️ Tocando música: " + musicaAtual);
        } else {
            System.out.println("❌ Nenhuma música selecionada");
        }
    }
    
    @Override
    public void pausar() {
        if (tocandoMusica) {
            tocandoMusica = false;
            System.out.println("⏸️ Música pausada: " + musicaAtual);
        } else {
            System.out.println("❌ Nenhuma música está tocando");
        }
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("🎵 Música selecionada: " + musica);
    }
    
    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        if (!emChamada) {
            emChamada = true;
            System.out.println("📞 Ligando para: " + numero);
        } else {
            System.out.println("❌ Já existe uma chamada em andamento");
        }
    }
    
    @Override
    public void atender() {
        if (emChamada) {
            System.out.println("📞 Chamada atendida");
        } else {
            System.out.println("❌ Não há chamadas para atender");
        }
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📧 Correio de voz iniciado");
    }
    
    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("🌐 Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("🔗 Nova aba adicionada no navegador");
    }
    
    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("🔄 Atualizando página: " + paginaAtual);
        } else {
            System.out.println("❌ Nenhuma página carregada para atualizar");
        }
    }
    
    // Métodos auxiliares para demonstração
    public void encerrarChamada() {
        if (emChamada) {
            emChamada = false;
            System.out.println("📞 Chamada encerrada");
        }
    }
    
    public String getStatus() {
        StringBuilder status = new StringBuilder();
        status.append("📱 Status do iPhone:\n");
        status.append("🎵 Música atual: ").append(musicaAtual.isEmpty() ? "Nenhuma" : musicaAtual).append("\n");
        status.append("🎶 Tocando: ").append(tocandoMusica ? "Sim" : "Não").append("\n");
        status.append("📞 Em chamada: ").append(emChamada ? "Sim" : "Não").append("\n");
        status.append("🌐 Página atual: ").append(paginaAtual.isEmpty() ? "Nenhuma" : paginaAtual);
        return status.toString();
    }
}

