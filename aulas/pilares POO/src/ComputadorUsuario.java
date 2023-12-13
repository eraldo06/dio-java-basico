public class ComputadorUsuario {
    public static void main(String[] args) {
        MSS msn = new MSS();

        msn.enviarMensagem();
        msn.rebecerMesagem();

        Facebook fmsn = new Facebook();
        fmsn.enviarMensagem();
        fmsn.rebecerMesagem();

        Telegram tmns = new Telegram();
        tmns.enviarMensagem();
        tmns.rebecerMesagem();



    }
}
