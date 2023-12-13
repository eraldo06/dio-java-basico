public class MSS {
    
        public void enviarMensagem(){
            validarConectadoInternet();
            System.out.println("Enviando mensagem");
            salvarHistorico();
        }
    
        public void rebecerMesagem(){
            System.out.println("recebendo mensagem");
        }

        private void validarConectadoInternet(){
            System.out.println("conectado a internet");
        }

        private void salvarHistorico(){
            System.out.println("salvando historico");
        }
}
