public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;


    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVomule(){
        volume++;
    }
    public void abaixarVomule(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void abaixarCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }



}
