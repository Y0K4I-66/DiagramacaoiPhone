package iphone;

//Interface para o Reprodutor Musical
interface ReprodutorMusical {
 void tocar();
 void pausar();
 void selecionarMusica(String musica);
}

//Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
 void ligar(String numero);
 void atender();
 void iniciarCorreioVoz();
}

//Interface para o Navegador na Internet
interface NavegadorInternet {
 void exibirPagina(String url);
 void adicionarNovaAba();
 void atualizarPagina();
}

//Classe que representa o iPhone, implementando as interfaces
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
 private boolean ligado;
 private String musicaAtual;
 private String numeroChamada;
 private String paginaAtual;

 public IPhone() {
     this.ligado = false;
     this.musicaAtual = "";
     this.numeroChamada = "";
     this.paginaAtual = "";
 }

 public void ligar() {
     this.ligado = true;
     System.out.println("iPhone ligado.");
 }

 public void desligar() {
     this.ligado = false;
     System.out.println("iPhone desligado.");
 }

 @Override
 public void tocar() {
     if (ligado) {
         System.out.println("Reproduzindo música: " + musicaAtual);
     } else {
         System.out.println("Ligue o iPhone para reproduzir música.");
     }
 }

 @Override
 public void pausar() {
     if (ligado) {
         System.out.println("Música pausada.");
     } else {
         System.out.println("Ligue o iPhone para pausar a música.");
     }
 }

 @Override
 public void selecionarMusica(String musica) {
     if (ligado) {
         this.musicaAtual = musica;
         System.out.println("Música selecionada: " + musica);
     } else {
         System.out.println("Ligue o iPhone para selecionar música.");
     }
 }

 @Override
 public void ligar(String numero) {
     if (ligado) {
         this.numeroChamada = numero;
         System.out.println("Chamando: " + numero);
     } else {
         System.out.println("Ligue o iPhone para fazer uma chamada.");
     }
 }

 @Override
 public void atender() {
     if (ligado && !numeroChamada.isEmpty()) {
         System.out.println("Atendendo chamada de: " + numeroChamada);
     } else {
         System.out.println("Ligue o iPhone para atender uma chamada.");
     }
 }

 @Override
 public void iniciarCorreioVoz() {
     if (ligado) {
         System.out.println("Iniciando correio de voz.");
     } else {
         System.out.println("Ligue o iPhone para acessar o correio de voz.");
     }
 }

 @Override
 public void exibirPagina(String url) {
     if (ligado) {
         this.paginaAtual = url;
         System.out.println("Exibindo página: " + url);
     } else {
         System.out.println("Ligue o iPhone para exibir uma página.");
     }
 }

 @Override
 public void adicionarNovaAba() {
     if (ligado) {
         System.out.println("Abrindo nova aba.");
     } else {
         System.out.println("Ligue o iPhone para abrir uma nova aba.");
     }
 }

 @Override
 public void atualizarPagina() {
     if (ligado && !paginaAtual.isEmpty()) {
         System.out.println("Atualizando página: " + paginaAtual);
     } else {
         System.out.println("Ligue o iPhone para atualizar a página.");
     }
 }
}

public class Main {
 public static void main(String[] args) {
     IPhone iPhone = new IPhone();
     iPhone.ligar();

     // Teste das funcionalidades
     iPhone.selecionarMusica("Música 1");
     iPhone.tocar();
     iPhone.pausar();
     iPhone.ligar("123-456-789");
     iPhone.atender();
     iPhone.iniciarCorreioVoz();
     iPhone.exibirPagina("www.example.com");
     iPhone.adicionarNovaAba();
     iPhone.atualizarPagina();

     iPhone.desligar();
 }
}

