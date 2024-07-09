public class ParametrosInvalidosException extends Exception {
    private static final String SEGUNDO_PARAMETRO_DEVE_SER_MAIOR_QUE_O_PRIMEIRO = "O segundo par?metro deve ser maior que o primeiro";
    String message;
    public ParametrosInvalidosException(){
        System.out.println(SEGUNDO_PARAMETRO_DEVE_SER_MAIOR_QUE_O_PRIMEIRO);
    }

    public ParametrosInvalidosException(String message){
        this.message = message;
    }
    
}
