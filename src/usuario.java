public class usuario {
    private String nome = "Duda";
    private String cpf = "12345678900";

    public usuario(String nome){
        this.nome = nome;
    }

    public String getnome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public Boolean verificadorCpf(){
        return true;
    }

}
