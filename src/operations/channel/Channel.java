package operations.channel;



public class Channel {
    private String channel_name;
    private String channel_no;


    public Channel(String channel_name, String channel_no) {
        this.channel_name = channel_name;
        this.channel_no = channel_no;

    }

    @Override
    public String toString() {
        return "Channel{" +
                "channel_name='" + channel_name + '\'' +
                ", channel_no='" + channel_no + '\'' +
                '}';
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getChannel_no() {
        return channel_no;
    }

    public void setChannel_no(String channel_no) {
        this.channel_no = channel_no;
    }
}
