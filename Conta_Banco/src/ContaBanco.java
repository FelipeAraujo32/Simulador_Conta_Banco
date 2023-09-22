
public class ContaBanco {

    // Atributos ----------------------------------------------------------------------------
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Método Construtor
    public ContaBanco(){
        saldo = 0;
        status = false;
    }

    //Getters e Setters ---------------------------------------------------------------------
    public void setNumConta(int Num_Conta){
        this.numConta = Num_Conta;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String tipo_conta){
        this.tipo = tipo_conta;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String nome_dono){
        this.dono = nome_dono;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float saldo_conta){
        this.saldo = saldo_conta;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean logico){
        this.status = logico;
    }

    public boolean getStatus(){
        return this.status;
    }


    // Métodos ------------------------------------------------------------------------------
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC"){
            setSaldo(50);
        }
        else if (tipo == "CP"){
            setSaldo(150);
        }
    }

    public void fecharConta(){
        saldo = getSaldo();
        if(saldo > 0){
            System.out.println("Conta com dinheiro");
        }
        else if(saldo < 0){
            System.out.println("Conta em débito");
        }
        else{
            setStatus(false);
        }
    }

    public depositar(){

    }

    public sacar(){

    }

    public pegarMensal(){

    }
}
