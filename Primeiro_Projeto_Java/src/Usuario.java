public class Usuario {
    public static void main(String[] args) throws  Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ?" +smartTv.ligada);
        System.out.println("Volume atual :" +smartTv.volume);
        System.out.println("Canal atual :" +smartTv.canal);


        smartTv.ligar ();
        System.out.println("Novo status -- TV ligada ?" +smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual :" +smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual :" +smartTv.canal);
    }
}
