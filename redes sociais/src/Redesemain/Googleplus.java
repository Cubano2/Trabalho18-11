package Redesemain;

public class Googleplus extends Redesocial implements compartilhamento,Videoconferencia{

    //Construtor do GooglePlus
    public Googleplus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Métodos que o google plus usa
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Google plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Google plus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Google plus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no Google plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Google plus");
    }

}