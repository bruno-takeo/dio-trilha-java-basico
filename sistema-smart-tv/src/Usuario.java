public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(true, 6, 30);

        smartTv.diminuirVolume();
        smartTv.diminuirCanal();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);
        System.out.println();

        smartTv.aumentarVolume();
        smartTv.desligar();
        smartTv.aumentarCanal();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);
        System.out.println();
        
        smartTv.mudarCanal(10);
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);
        System.out.println();


    }
}
