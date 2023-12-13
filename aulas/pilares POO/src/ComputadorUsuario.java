public class ComputadorUsuario {
    public static void main(String[] args) {
        SevicoMsn smi = null;

        String appEscolhido="MSS";

        if(appEscolhido.equals("MSS"))
        smi = new MSS();
        else if(appEscolhido.equals("FACEBOOK"))
        smi = new Facebook();
        else if(appEscolhido.equals("TELEGRAM"))
        smi = new Telegram();

        smi.enviarMensagem();
        smi.rebecerMesagem();
        



    }
}
