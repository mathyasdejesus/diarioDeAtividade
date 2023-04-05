import java.util.Scanner;

public abstract class CadastroDeAtividades {

    
    
    private int dia;
    private int mes;
    private int ano;
    private int duração;
    private int  satisfação;
    private String descrição;
    


    public void cadastro()  {
        Scanner cadastro = new Scanner(System.in);
        System.out.print("Descrição: ");
        setDescrição(cadastro.nextLine());
        System.out.print("Dia:");
        boolean diaa = true;
        while (diaa){
            try {
                setDia(cadastro.nextInt()); 
                diaa = false;
            } catch (ValorInseridoErrado e) {
                System.out.print("Erro. Digite novamente: ");
            }
        }
        System.out.print("Mês:");
        boolean mess = true;
        while (mess){
            try {
                setMes(cadastro.nextInt());
                mess = false;
            } catch (ValorInseridoErrado e) {
                System.out.print("Erro. Digite novamente: ");
            }
        }
        
        System.out.print("Ano:");

        boolean anooo = true;
        while (anooo){
            try {
                setAno(cadastro.nextInt());
                anooo = false;
            } catch (ValorInseridoErrado e) {
                System.out.print("Erro. Digite novamente: ");
            }
        }

        System.out.print("Duração:");

        setDuração(cadastro.nextInt());

        System.out.print("Satisfação:"); 
        boolean Satisfaçãoo = true;  
        while (Satisfaçãoo){
            try {
                setSatisfação(cadastro.nextInt());
                Satisfaçãoo = false;
            } catch (ValorInseridoErrado e) {
                System.out.print("Erro. Digite novamente: ");
            }
        }
    }
    public abstract int Gasto_De_Energia();

    public double bem_estar(){
        
        return Gasto_De_Energia() * (getSatisfação() / 360);
    }

    public abstract void  mostrar_dados();

    // MÉTODOS GETTERS AND SETTERS

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) throws ValorInseridoErrado {
        if(dia < 0 || dia > 31){
            throw new ValorInseridoErrado("o dado informado estar incorreto! ");

        }else{
         this.dia = dia;
        } 
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) throws ValorInseridoErrado {
        if(mes < 0 || mes > 12){
            throw new ValorInseridoErrado("o dado informado estar incorreto! ");
        }else{
        this.mes = mes;
        }
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) throws ValorInseridoErrado {
        if(ano < 1900 || ano > 2023){
            throw new ValorInseridoErrado("o dado informado estar incorreto!");
        }else{
        this.ano = ano;
        }
    }
    public int getDuração() {
        return duração;
    }
    public void setDuração(int duração) {
        this.duração = duração;
    }
    public int getSatisfação() {
        return satisfação;
    }
    public void setSatisfação(int satisfação) throws ValorInseridoErrado {
        if(satisfação != -1 && satisfação != 1){
            throw new ValorInseridoErrado("O dado informado estar incorreto! "+satisfação);
        }else{
        this.satisfação = satisfação;
        }
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
}
