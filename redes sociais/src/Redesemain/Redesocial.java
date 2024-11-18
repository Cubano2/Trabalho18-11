package Redesemain;

public abstract class Redesocial {

    //Atributos
    protected String senha;
    protected int numAmigos;

    //Construtor das redes
    public Redesocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    //Métodos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("Publicação curtida");
    }
}