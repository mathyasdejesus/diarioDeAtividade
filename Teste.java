
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        CadastroDeAtividades lazer = new Lazer();
        CadastroDeAtividades fisica = new Fisica();
        CadastroDeAtividades trabalho = new Trabalho();
        ArrayList<CadastroDeAtividades> arrayatividades= new ArrayList<>();

        System.out.println("Olá, seja bem vindo(a) ao seu diário de atividades\n");
        System.out.println("Primeiro, realize um cadastro: ");
        System.out.println("\nAtividade de Lazer [1]\nAtividade Física[2]\nAtividade de Trabalho[3]");
        System.out.print("\nQual tipo de atividade:");
        int escolhainicial = scan1.nextInt();
        if(escolhainicial == 1){
            lazer.cadastro();
            arrayatividades.add((CadastroDeAtividades) lazer);
        } else if(escolhainicial == 2){
            fisica.cadastro();
            arrayatividades.add((CadastroDeAtividades)fisica);
        } else if(escolhainicial == 3){
            trabalho.cadastro();
            arrayatividades.add((CadastroDeAtividades)trabalho);
        }

        

        System.out.println("=====Cadastro concluído======");

        
        boolean rodando = true;
        while (rodando) {
        System.out.println("Você tem as seguintes opções:\n");
        System.out.println("Cadastro de Atividade [1]");
        System.out.println("Pesquisa de Atividade [2]");
        System.out.println("Atualização de Atividade [3]");
        System.out.println("Remoção de Atividade [4]");
        System.out.println("Parar o programa [5]\n");
        System.out.print("O que você deseja fazer:");

        int escolha = scan1.nextInt();
        
         if(escolha == 1){
            System.out.println("\nAtividade de Lazer [1]\nAtividade Física[2]\nAtividade de Trabalho[3]");
            System.out.print("\nQual tipo de atividade:");
            escolha = scan1.nextInt();
            if(escolha == 1){
                lazer.cadastro();
                arrayatividades.add((CadastroDeAtividades) lazer);
            } else if(escolha == 2){
                fisica.cadastro();
                arrayatividades.add((CadastroDeAtividades)fisica);
            } else if(escolha == 3){
                trabalho.cadastro();
                arrayatividades.add((CadastroDeAtividades)trabalho);
            }

            System.out.println("=====Cadastro concluído======");
    
            // PESQUISA :

        } else if(escolha == 2){  
            
            System.out.println("\nEscolha o Dia, Mês ou Ano que você deseja pesquisar a atividade:\n");
            System.out.print("Dia[1] \nMês[2] \nAno[3] \n");
            System.out.print("Sua escolha: ");
            escolha = scan1.nextInt();

            if(escolha == 1){
                System.out.print("Digite o dia: ");
                escolha = scan1.nextInt();
            
                for (CadastroDeAtividades cadastroDeAtividades : arrayatividades) {
                    if(escolha == cadastroDeAtividades.getDia()){

                      cadastroDeAtividades.mostrar_dados();
                    } else{
                        System.out.println("Não tem atividade cadastrada nesse dia!");
                    }
                }
            } else if(escolha == 2){
              System.out.println("Digite o mês: ");
              escolha = scan1.nextInt();

              for (CadastroDeAtividades cadastroDeAtividades : arrayatividades) {
                if(escolha == cadastroDeAtividades.getMes()){
                   cadastroDeAtividades.mostrar_dados();
                }  else{
                    System.out.println("Não tem atividade cadastrada nesse mês!");
                }
            }
            } else if(escolha == 3){
                System.out.println("Digite o ano: ");
                escolha = scan1.nextInt();

                for (CadastroDeAtividades cadastroDeAtividades : arrayatividades) {
                    if(escolha == cadastroDeAtividades.getAno()){
                        cadastroDeAtividades.mostrar_dados();

                    }  else{
                        System.out.println("Não tem atividade cadastrada nesse ano!");
                    }
                }
            }
            // atualização
        } else if(escolha == 3){
            System.out.println("atualizaçao");

            System.out.println("\nEscolha a atividade que você deseja atualizar:\n");

            for (int i = 0; i < arrayatividades.size(); i++) {
             CadastroDeAtividades atualiza = arrayatividades.get(i);
             System.out.println(" [" + i + "] " + atualiza.getDescrição());
            }
            System.out.println("Digite a atividade de acordo com sua [referência]: ");
            escolha = scan1.nextInt();
            arrayatividades.remove(escolha);

            System.out.println("\nAtividade de Lazer [1]\nAtividade Física[2]\nAtividade de Trabalho[3]");
            System.out.print("\nQual tipo da nova atividade:");
            escolha = scan1.nextInt();
            if(escolha == 1){
                lazer.cadastro();
                arrayatividades.add((CadastroDeAtividades) lazer);
            } else if(escolha == 2){
                fisica.cadastro();
                arrayatividades.add((CadastroDeAtividades)fisica);
            } else if(escolha == 3){
                trabalho.cadastro();
                arrayatividades.add((CadastroDeAtividades)trabalho);
            }
    

            System.out.println("=====Atualização concluída======");
        
            // remoção 
        } else if(escolha == 4){
            System.out.println("\nEscolha a atividade que você deseja remover:\n");

               for (int i = 0; i < arrayatividades.size(); i++) {
                CadastroDeAtividades remove = arrayatividades.get(i);
                System.out.println(" [" + i + "] " + remove.getDescrição());
               }
               System.out.println("Digite a atividade de acordo com sua [referência] ");
               escolha = scan1.nextInt();
               arrayatividades.remove(escolha);

            System.out.println("=====Atividade removida======");
        } else if(escolha == 5){
            break;
        }else{
           System.out.println("Escolha errada!");
        }
    }
   }
}


