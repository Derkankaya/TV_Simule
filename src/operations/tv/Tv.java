package operations.tv;

import operations.channel.Channel;

import java.util.ArrayList;


public class Tv {
    private String marka;
    private String model;
    private String tv_name;
    Channel channel;

    public Channel getChannel() {
        return channel;
    }
    private ArrayList<Channel> channelArrayList = new ArrayList<>() ;

    @Override
    public String toString() {
        return "Tv özellikleri:" + "\n" +
                "marka= " + marka + "\n" +
                "model= " + model + "\n" +
                "Tv adı= " + tv_name + "\n" +
                "Kayıtlı Kanallar = " + getArrayListAsString();
    }
    public String getArrayListAsString() {

        if (getChannelArrayList().isEmpty()) {
            return "Kayıtlı kanal bulunamadı";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Channel channel : getChannelArrayList()) {
                sb.append(channel.getChannel_name()).append(" (").append(channel.getChannel_no()).append("), ");
            }
            sb.delete(sb.length() - 2, sb.length());
            return sb.toString();
        }
    }


    public Tv(String marka, String model, String tv_name) {
        this.marka = marka;
        this.model = model;
        this.tv_name = tv_name;

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public ArrayList<Channel> getChannelArrayList() {
        return channelArrayList;
    }

    public void setChannelArrayList(ArrayList<Channel> channelArrayList2) {
        this.channelArrayList = channelArrayList2;
    }
}


