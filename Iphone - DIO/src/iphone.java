public class iphone {

    // ReprodutorMusical.java
    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    // AparelhoTelefonico.java
    public interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarCorreioVoz();
    }

    // NavegadorInternet.java
    public interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }

    // iPhone.java
    public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        private ReprodutorMusical reprodutorMusical;
        private AparelhoTelefonico aparelhoTelefonico;
        private NavegadorInternet navegadorInternet;

        public iPhone() {
            this.reprodutorMusical = new ReprodutorMusicalImpl();
            this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
            this.navegadorInternet = new NavegadorInternetImpl();
        }

        @Override
        public void tocar() {
            reprodutorMusical.tocar();
        }

        @Override
        public void pausar() {
            reprodutorMusical.pausar();
        }

        @Override
        public void selecionarMusica(String musica) {
            reprodutorMusical.selecionarMusica(musica);
        }

        @Override
        public void ligar(String numero) {
            aparelhoTelefonico.ligar(numero);
        }

        @Override
        public void atender() {
            aparelhoTelefonico.atender();
        }

        @Override
        public void iniciarCorreioVoz() {
            aparelhoTelefonico.iniciarCorreioVoz();
        }

        @Override
        public void exibirPagina(String url) {
            navegadorInternet.exibirPagina(url);
        }

        @Override
        public void adicionarNovaAba() {
            navegadorInternet.adicionarNovaAba();
        }

        @Override
        public void atualizarPagina() {
            navegadorInternet.atualizarPagina();
        }
    }

    // ReprodutorMusicalImpl.java
    public class ReprodutorMusicalImpl implements ReprodutorMusical {
        @Override
        public void tocar() {
            System.out.println("Tocando música...");
        }

        @Override
        public void pausar() {
            System.out.println("Pausando música...");
        }

        @Override
        public void selecionarMusica(String musica) {
            System.out.println("Selecionando música: " + musica);
        }
    }

    // AparelhoTelefonicoImpl.java
    public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para: " + numero);
        }

        @Override
        public void atender() {
            System.out.println("Atendendo chamada...");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz...");
        }
    }

    // NavegadorInternetImpl.java
    public class NavegadorInternetImpl implements NavegadorInternet {
        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Adicionando nova aba...");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando página...");
        }
    }
}