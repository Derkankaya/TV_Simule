package operations.tv;



import java.util.LinkedList;
import java.util.UUID;

import static operations.Show_menu.scan;

public class TvManager {
    public static Tv getnewTV;
    Tv newtv;

    public void open_Tv(){
        System.out.println("Televizyon açılıyor...");
    }
    public void volume_Settings(){
        LinkedList<String> volumeSettings = new LinkedList<>() ;
        if( volumeSettings.isEmpty()) {
            volumeSettings.add("Eğlence");
            if (newtv != null) {
                boolean exit = false;
                while (exit == false) {
                    System.out.println("Ses ayarları "+"\n"+" 1 - Film "+"\n"+ " 2 - Eğlence "+"\n"
                            +" 3 - Belgesel "+ "\n"+" 4 - Haber "+ "\n"+" 5 - Çıkış ");
                    int secim = scan.nextInt();
                    switch (secim) {
                        case 1: volumeSettings.removeFirst();
                            volumeSettings.add("Film") ;
                            System.out.println("Ses ayarı Film modu olarak ayarlandı");
                            break;
                        case 2: volumeSettings.removeFirst();
                            volumeSettings.add("Eğlence");
                            System.out.println("Ses ayarı Eğlence modu olarak ayarlandı");
                            break;
                        case 3: volumeSettings.removeFirst();
                            volumeSettings.add("Haber");
                            System.out.println("Ses ayarı Haber modu olarak ayarlandı");
                            break;
                        case 4: volumeSettings.removeFirst();
                            volumeSettings.add("Belgesel");
                            System.out.println("Ses ayarı Belgesel modu olarak ayarlandı");
                            break;
                        case 5:exit = true; break;
                        default:
                            System.out.println("Hatalı bir sayı girdiniz.");break;
                    } exit = true;
                }
            }else {
                System.out.println("Kurulu bir televizyon bulunamadı ! ");
            }
        }else{            if (newtv != null) {
            System.out.println("Ses ayarınız "+volumeSettings.getFirst());
            boolean exit = false;
            while (exit == false) {
                System.out.println("Ses ayarları "+"\n"+" 1 - Film "+"\n"+ " 2 - Eğlence "+"\n"
                        +" 3 - Belgesel "+ "\n"+" 4 - Haber "+ "\n"+" 5 - Çıkış ");
                int secim = scan.nextInt();
                switch (secim) {
                    case 1: volumeSettings.removeFirst();
                        volumeSettings.add("Film") ;
                        System.out.println("Ses ayarı Film modu olarak ayarlandı");
                        break;
                    case 2: volumeSettings.removeFirst();
                        volumeSettings.add("Eğlence");
                        System.out.println("Ses ayarı Eğlence modu olarak ayarlandı");
                        break;
                    case 3: volumeSettings.removeFirst();
                        volumeSettings.add("Haber");
                        System.out.println("Ses ayarı Haber modu olarak ayarlandı");
                        break;
                    case 4: volumeSettings.removeFirst();
                        volumeSettings.add("Belgesel");
                        System.out.println("Ses ayarı Belgesel modu olarak ayarlandı");
                        break;
                    case 5:exit = true; break;
                    default:
                        System.out.println("Hatalı bir sayı girdiniz.");break;
                } exit = true;
            }

        }else {
            System.out.println("Kurulu bir televizyon bulunamadı ! ");
        }
     }
    }
    public void graphigs_Settings(){
        LinkedList<String> graphisSettings = new LinkedList<>() ;
        if(graphisSettings.isEmpty()) {
            graphisSettings.add("Eğlence");
            if (newtv != null) {
                boolean exit = false;
                while (exit == false) {
                    System.out.println("Görüntü ayarları "+"\n"+" 1 - Film "+"\n"+ " 2 - Eğlence "+"\n"
                            +" 3 - Belgesel "+ "\n"+" 4 - Haber "+ "\n"+" 5 - Çıkış ");
                    int secim = scan.nextInt();
                    switch (secim) {
                        case 1: graphisSettings.removeFirst();
                            graphisSettings.add("Film") ;
                            System.out.println("Görüntü ayarı Film modu olarak ayarlandı");
                            break;
                        case 2: graphisSettings.removeFirst();
                            graphisSettings.add("Eğlence");
                            System.out.println("Görüntü ayarı Eğlence modu olarak ayarlandı");
                            break;
                        case 3: graphisSettings.removeFirst();
                            graphisSettings.add("Haber");
                            System.out.println("Görüntü ayarı Haber modu olarak ayarlandı");
                            break;
                        case 4: graphisSettings.removeFirst();
                            graphisSettings.add("Belgesel");
                            System.out.println("Görüntü ayarı Belgesel modu olarak ayarlandı");
                            break;
                        case 5:exit = true; break;
                        default:
                            System.out.println("Hatalı bir sayı girdiniz.");break;
                    } exit = true;
                }
            }else {
                System.out.println("Kurulu bir televizyon bulunamadı ! ");
            }
        }else{            if (newtv != null) {
            System.out.println("Görüntü ayarınız "+graphisSettings.getFirst());
            boolean exit = false;
            while (exit == false) {
                System.out.println("Görüntü ayarları "+"\n"+" 1 - Film "+"\n"+ " 2 - Eğlence "+"\n"
                        +" 3 - Belgesel "+ "\n"+" 4 - Haber "+ "\n"+" 5 - Çıkış ");
                int secim = scan.nextInt();
                switch (secim) {
                    case 1: graphisSettings.removeFirst();
                        graphisSettings.add("Film") ;
                        System.out.println("Görüntü ayarı Film modu olarak ayarlandı");
                        break;
                    case 2: graphisSettings.removeFirst();
                        graphisSettings.add("Eğlence");
                        System.out.println("Görüntü ayarı Eğlence modu olarak ayarlandı");
                        break;
                    case 3: graphisSettings.removeFirst();
                        graphisSettings.add("Haber");
                        System.out.println("Görüntü ayarı Haber modu olarak ayarlandı");
                        break;
                    case 4: graphisSettings.removeFirst();
                        graphisSettings.add("Belgesel");
                        System.out.println("Görüntü ayarı Belgesel modu olarak ayarlandı");
                        break;
                    case 5:exit = true; break;
                    default:
                        System.out.println("Hatalı bir sayı girdiniz.");break;
                } exit = true;
            }
        }else {
            System.out.println("Kurulu bir televizyon bulunamadı ! ");
        }
    }
    }

    public void setUp_tv  (){

        scan.nextLine();
        if (newtv== null){ System.out.println("TV markası giriniz : ");
            String marka = scan.nextLine();
            System.out.println("Tv model giriniz : ");
            String model = scan.nextLine();
            System.out.println("Tv yi kişiselleştirmek ister misiniz ?\n" +
                    "Cevabınız evet ise 1 tuşuna basınız");
            int kisisel_cevap1 = scan.nextInt();
            scan.nextLine();
            String tv_name;
            if(kisisel_cevap1 ==1){

                System.out.println("Tv adı oluşturunuz : ");
                System.out.println("");
                tv_name = scan.nextLine();
                //            ThreadDelay.delaySeconds(2);
            }else {
                String defaultName = UUID.randomUUID().toString();
                tv_name = defaultName;
            }
            System.out.println("Televizyon başarıyla oluşturuldu!");
            newtv = new Tv(marka, model, tv_name);
            newtv.setTv_name(tv_name);
            newtv.setMarka(marka);
            newtv.setModel(model);
            //         ThreadDelay.delaySeconds(2);
        }else System.out.println("Halihazırda kurulu bir televizyon mecvut."+"\n"+newtv.toString() );

    }

    public void volumeBrightnessLevel(){
        boolean exit = false;
        while (exit==false){
            System.out.println("Ses ayarı için 1 e basınız."+"\n"+"Işık seviyesi için 2 ye basınız.");
            int secim = scan.nextInt();
            switch (secim){
                case 1 :
                    System.out.println("Ses Ayarı");
                    volumeLevel();
                case 2 :
                    System.out.println("Işık Seviyesi Ayarı");
                    brightnessLevel();
            }

        }
    }
    public void volumeLevel(){
        int volumeLvl = 0;
        System.out.println("Sesi artırmak için 1 e basınız."+"\n"+"Sesi azaltmak için 0 ye basınız."+
                "\n"+"Sesi kapatmak için 2 ye basınız"+"\n"+"Çıkış için diğer tuşlara basınız.");
        boolean exit = true;
        while (exit) {
            int volumeUpDown = scan.nextInt();
            if (volumeUpDown == 1) {
                volumeLvl+=5;

            } else if (volumeUpDown == 0) {
                volumeLvl-=5;

            } else if (volumeUpDown == 2) {
                volumeLvl=0;

            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                exit=false;

            }
        }
    }
    public void brightnessLevel(){
        int brightnessLvl = 0;
        boolean exit = true;
        System.out.println("Parlaklığı artırmak için 1 e basınız."+"\n"+"Parlaklığı azaltmak için 0 ye basınız."
                +"\n"+"Çıkış için diğer tuşlara basınız.");
        while (exit) {
            int brightnessUpDown = scan.nextInt();
            if (brightnessUpDown == 1) {
                brightnessLvl+=5;

            } else if (brightnessUpDown == 0) {
                brightnessLvl-=5;

            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                exit=false;

            }
        }
    }
    public void tv_open(){
        System.out.println("Televizyon açılıyor...");


    }
    public void tv_close(){

    }
    public Tv getNewtv() {
        return newtv;
    }

    public void setNewtv(Tv newtv) {
        this.newtv = newtv;
    }

}
