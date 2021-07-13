public class Motoca {

    private int potencia;
    private int tempo;
    private Pessoa pessoa;

    public Motoca(int potencia){
        this.potencia = potencia;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public int getTempo() {
        return this.tempo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public boolean subir(Pessoa pessoa){
        if(this.pessoa == null){
            this.pessoa = pessoa;

            return true;
        }
        return false;
    }

    public boolean descer(){
        if(this.pessoa != null){
            this.pessoa = null;

            return true;
        }
        return false;
    }

    public void colocarTempo(int tempo){
        this.tempo += tempo;
    }

    public boolean dirigir(int tempo){
        if((this.pessoa != null) && (this.pessoa.idade <= 10) && (this.tempo > 0)){
            if(this.tempo < tempo){
                this.tempo = 0;
            }else{
                this.tempo -= tempo;
            }

            return true;
        }
        return false;
    }

    public String buzinar(){
        String barulho = "";
        if((potencia > 0) && (this.pessoa != null)){
            barulho = "P";

            for(int i = 0; i < this.potencia; i++){
                barulho = barulho + "e";
            }

            barulho = barulho + "m";
        }
        return barulho;
    }
}