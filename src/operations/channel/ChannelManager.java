package operations.channel;

import operations.Show_menu;
import operations.tv.Tv;
import operations.tv.TvManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ChannelManager {
     Scanner scan = new Scanner(System.in);
     Channel channel ;
     Tv newtv;



    public void add_channel(Tv newtv) {


        ArrayList<Channel> channelArrayList = new ArrayList<>();


        System.out.println("Kanal eklemek için 1 e basınız. çıkmak için 0 a basınız");
        try {


            boolean kisisel_cevap_bool = false;
            int secim = scan.nextInt();
            switch (secim) {
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                case 1:
                    int kisisel_cevap2 = scan.nextInt();
                    scan.nextLine();
                    if (newtv != null) {
                        if (kisisel_cevap2 == 1) {
                            kisisel_cevap_bool = true;
                        }
                        while (kisisel_cevap_bool) {
                            System.out.println("Kanal adını giriniz");
                            String channel_name = scan.nextLine();
                            System.out.println("Kanal numarasını giriniz");
                            String channel_no = scan.nextLine();
                            channel = new Channel(channel_name, channel_no);
                            channel.setChannel_no(channel_no);
                            channel.setChannel_name(channel_name);
                            channelArrayList.add(channel);
                            newtv.setChannelArrayList(channelArrayList);


                            //                     channelArrayList.add(channel);
                            //                      tv.getChannelArrayList();
// tam burada patlıyor null point hatası veriyor
                            //büyük ihtimalle buradaki arraylisti Tv deki arrayliste göndermiyor .

                            //ArrayList<Channel> channelArrayList1= new ArrayList<>(tv.getChannelArrayList());
                            //    channelArrayList1=channelArrayList;


                            System.out.println("Yeni bir kanal eklemek istiyorsanız 1'e basınız");
                            int kisisel_cevap2_kontrol = scan.nextInt();
                            scan.nextLine();
                            kisisel_cevap_bool = kisisel_cevap2_kontrol == 1;
                        }
                        for (Channel channel : channelArrayList) ;
                        System.out.println(channel);
                        System.out.println("Çıkış yapılıyor.");
                        break;
                    } else {
                        System.out.println("Kurulu bir televizyon bulunamadı." + "\n" + "Televizyon kurulumu için menüye hidniz");
                        int kisisel_cevap3 = scan.nextInt();
                        if (kisisel_cevap3 == 1) {

                        } else break;
                    }
                    break;
                default:
                    System.out.println("Hatalı bir sayı girdiniz");
                    break;
            }
        }catch(Exception e){
            System.out.println("Bir hata oluştu...");

        }
    }

   public void chance_channel(){
            Channel channel1;
            ArrayList<Channel> channelArrayList = new ArrayList<>();

            if (channelArrayList.isEmpty()) {
                int currentIndex = scan.nextInt();
                if (equals(currentIndex)==1) {
                    String previousObject = String.valueOf(channelArrayList.get(currentIndex - 1));
                    System.out.println("Previous object: " + previousObject);
                }
                String nextObject = String.valueOf(channelArrayList.get(currentIndex + 1));
                System.out.println("Next object: " + nextObject);
            }


   }


}
