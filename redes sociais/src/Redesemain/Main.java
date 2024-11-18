package Redesemain;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Criando 2 instancias de redes
        Facebook face = new Facebook("bbhhh",2090);
        Twitter twitter = new Twitter("ggghhhjk",540);
        //Criando o hashSet para armazenar as redes
        Set <Redesocial> hashRedes = new HashSet<>();

        //Adiciona no hashSet
        hashRedes.add(face);
        hashRedes.add(twitter);

        //Cria o usuario e insere as redes
        Usuario user = new Usuario(hashRedes);
        //Setando as características do usuário
        user.setNome("Bruno");
        user.setEmail("bruno.cuba@get.inatel.br");

        //Usuário chamando a função das redes
        user.utilizandoRedes();
    }
}