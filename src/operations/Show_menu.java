package operations;

import operations.channel.Channel;
import operations.channel.ChannelManager;
import operations.tv.TvManager;

import java.util.Scanner;

public class Show_menu {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    ChannelManager ChannelManager = new ChannelManager();
    TvManager TvManager = new TvManager();
        TvManager.open_Tv();
    boolean cikis = false;
    while (cikis==false){


        System.out.println("Seçiminiz : ");
        show_menu();
        int secim = scan.nextInt();
        switch (secim){
            case 0 : cikis = true; break;
            case 1 :
                TvManager.setUp_tv(); break;
            case 2 :
                 ChannelManager.chance_channel(); break;
            case 3 :
                TvManager.volume_Settings();break;
            case 4 :
                TvManager.graphigs_Settings();break;
            case 5 :
                ChannelManager.add_channel(TvManager.getNewtv());break;
            case 6 :TvManager.volumeBrightnessLevel();break;
            case 7 : TvManager.getNewtv().getArrayListAsString();break;
            case 8 : show_menu();break;
            default:
       //         ThreadDelay.delaySeconds(2);
                System.out.println("0-9 arası değer giriniz!"); break;

        }
    }
    }


    private static void show_menu(){
        System.out.println("-- Menu --");
        System.out.println("0 - Çıkış\n" +
                "1 - Tv kurulum\n"+
                "2 - Kanal değiştir\n"+
                "3 - Ses ayarı \n"+
                "4 - Görüntü ayarı \n"+
                "5 - Kanal ekle\n"+
                "6 - Ses ve Görüntü Ayarı\n"+
                "7 - Kanal bilgisi göster\n"+
                "8 - TV kapat\n"+
                "9 - Menu göster\n");
    }

}