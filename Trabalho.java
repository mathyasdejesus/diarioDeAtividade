import java.util.Scanner;

public class Trabalho extends CadastroDeAtividades {

    private int dificuldade;
    boolean perguntar = true;
    
    Scanner scanner = new Scanner(System.in);
    

    // MÉTODOS

    @Override
    public void cadastro() {
        super.cadastro();
        System.out.print("Dificuldade: ");

        while (perguntar)
        try {
            setDificuldade(scanner.nextInt());
            perguntar = false;
        } catch (ValorInseridoErrado e) {
            System.out.print("Erro. Digite novamente: ");
        }
    }
    @Override
    public int Gasto_De_Energia() {

        return getDuração() * dificuldade * 2;
    }
    @Override
    public double bem_estar() {
    
        return super.bem_estar();
    }

    @Override
    public void mostrar_dados() {
        System.out.println("==========================");
        System.out.println(getDescrição());
        System.out.println("Dia: "+ getDia());
        System.out.println("Mês: "+ getMes());
        System.out.println("Ano: "+ getAno());
        System.out.println("Duração: "+ getDuração());
        if(getSatisfação() == 1){
            System.out.println("Satisfação: Agradável");
        }else if(getSatisfação() == -1){
            System.out.println("Satisfação: Desagradável");
        }
        System.out.println("Descrição: "+ getDescrição());
        if(getDificuldade() == 1){
          System.out.println("Dificuldade: Fácil");
        } else if(getDificuldade() == 2){
            System.out.println("Dificuldade: Médio");
        } else if(getDificuldade() == 3){
            System.out.println("Dificuldade: Difícil");
        }

        System.out.println("O gasto de energia foi: "+Gasto_De_Energia());
        System.out.println("O bem estar foi: "+ bem_estar());
        System.out.println("==========================");
    }
    
     

      // MÉTODOS GETTERS AND SETTERS

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) throws ValorInseridoErrado {
        if(dificuldade != 1 && dificuldade != 2 && dificuldade != 3){
            throw new ValorInseridoErrado("O dado informado estar incorreto!");
        }else{
        this.dificuldade = dificuldade;
      }
    }

    
}