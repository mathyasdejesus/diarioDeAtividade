
public class Lazer extends CadastroDeAtividades {

     @Override
     public void cadastro() {
         super.cadastro();
     }
   
    @Override
    public int Gasto_De_Energia() {

        return getDuração() * 1;
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
        System.out.println("O gasto de energia foi: "+Gasto_De_Energia());
        System.out.println("O bem estar foi: "+ bem_estar());
        System.out.println("==========================");
    }
    
}
