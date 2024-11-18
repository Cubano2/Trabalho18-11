package Redesemain;

import excecoes.usuariominimoderedeException;
import excecoes.redesemusuariosException;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    //Coisas que o usuario precisa pra usar a rede social
    private String nome;
    private String email;
    Set <Redesocial> hashRedes = new HashSet<>();

    //Constructor do usuário
    public Usuario(Set<Redesocial> hashRedes) {
        this.hashRedes = hashRedes;
    }

    //Setter dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //método que usa as redes -> não sei pq tá brilhando
    public void utilizandoRedes(){
        int contador = 0; //Contador do número de redes

        for(Redesocial rede : hashRedes){
            if(rede != null)
                contador++;
        }

        //Verifica se o número mínimo de redes do usuario foi adicionado
        try{
            if(contador < 2){
                throw new usuariominimoderedeException("Usuaro possui menos de 2 redes");
            }
        } catch (usuariominimoderedeException e) {
            e.printStackTrace();
        }

        //Executa  métodos das redes
        for(Redesocial rede : hashRedes){
            //Verificando se teve valor nulo
            try {
                if(rede == null){
                    throw new redesemusuariosException("Valor nulo adicionado, sem dados");
                }

                if (rede instanceof Facebook) {
                    Facebook fx = (Facebook) rede;
                    fx.postarFoto();
                    fx.postarComentario();
                    fx.fazStreaming();
                }

                if (rede instanceof Twitter) {
                    Twitter tx = (Twitter) rede;
                    tx.postarVideo();
                    tx.curtirPublicacao();
                    tx.compartilhar();
                }
            }catch (redesemusuariosException e){
                System.out.println(e);
            }
        }
    }
}