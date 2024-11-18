package Redesemain;

public class Facebook extends Redesocial implements Videoconferencia, compartilhamento {

    //Construtor do facebook
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Métodos que o facebook vai usar
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Facebook");
    }
}