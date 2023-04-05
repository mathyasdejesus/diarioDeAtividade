import java.util.Scanner;

public class Fisica extends CadastroDeAtividades{
    private int intensidade;
    int escolha;

    Scanner scanner = new Scanner(System.in);

    boolean perguntar = true;

    // MÉTODOS

    @Override
    public void cadastro() {
        super.cadastro();
        System.out.print("Intensidade: ");

        while (perguntar)
            try {
                setIntensidade(scanner.nextInt());
                perguntar = false;
            } catch (ValorInseridoErrado e) {
                System.out.print("Erro. Digite novamente: ");
            } 
    }
   
    @Override
    public int Gasto_De_Energia() {

        return getDuração() * intensidade * 3;

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
        if(getIntensidade() == 2){
         System.out.println("Intensidade: Fraco");
        } else if(getIntensidade() == 3){
            System.out.println("Intensidade: Intenso");
        } else if(getIntensidade() == 4){
            System.out.println("Intensidade: Vigoroso");
        }
        System.out.println("O gasto de energia foi: "+Gasto_De_Energia());
        System.out.println("O bem estar foi: "+ bem_estar());
        System.out.println("==========================");
    }

    // MÉTODOS GETTERS AND SETTERS

    public int getIntensidade() {
        
        return intensidade;
    }

    public void setIntensidade(int intensidade) throws ValorInseridoErrado {
        if(intensidade != 2 && intensidade != 3 && intensidade != 4){
            throw new ValorInseridoErrado("O dado informado estar incorreto!");
        } else{
        this.intensidade = intensidade;
       }
    }
}
