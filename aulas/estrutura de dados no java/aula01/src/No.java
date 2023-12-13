public class No<t> {

    private t conteudo;
    private No<t> proximo;

    public No(t conteudo){
        this.proximo = null;
        this.conteudo = conteudo;
    }
    

    public t getConteudo(){
        return conteudo;
    }

    public void setConteudo(t conteudo){
        this.conteudo = conteudo;
    }

    public No<t> getProximo(){
        return proximo;
    }

    public void setProximo(No<t> proximo){
        this.proximo = proximo;
    }

    public String toString(){
        return "No{" +
            "conteudo='"+conteudo + "\'" + 
            "}";
    }
}
