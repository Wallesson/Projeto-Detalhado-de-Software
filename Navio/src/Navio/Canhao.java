package Navio;

public class Canhao implements IArma{
    Municao municao;
    public Canhao(Municao municaoCanhao){
        this.municao = municaoCanhao;
    }
    public void setMunicao(Municao municao){
        this.municao = municao;
    }
    
    public void atirar(){
        this.atirarComoUmCanhao();
    }
    
    private void atirarComoUmCanhao(){
        //atirar a municao escolhida = bala de Ferro
        //calcula a força e atira
    }
}