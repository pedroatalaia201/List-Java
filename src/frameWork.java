import java.util.List;
import java.util.ArrayList;

class testeLista{
    public static void main(String[] args) {
        //List alunos = new ArrayList();//embora enha array no nome, o ArrayList se comporta como uma lista normal.
        List<String> alunos = new ArrayList<>();
        alunos.add("Alex");
        alunos.add("João");
        alunos.add("Maria'");

        System.out.println("The size of the list is " + alunos.size());

        for(int i = 0; i < alunos.size(); i++){
            System.out.println("Aluno: " + alunos.get(i));//.get -- pegar o obj que está em determinada posição da lsta.
        }

        alunos.remove("Alex");//remover item da lista;

        System.out.println("The size of the list is " + alunos.size());

        /* 
            foreach
        */
        for(String name : alunos){
            System.out.println("Name of the student: " + name);
        }
    }
}