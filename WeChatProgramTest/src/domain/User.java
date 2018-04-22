package domain;

public class User {
    private String status;
    private boolean msg;
    private String nickname;
    private String rank;
    private String share;
    private String count;
    private String imgurl;
    public String getstatus(){ return status; }
    public void setstatus(String status){ this.status = status; }

    public boolean getmsg(){return msg;}
    public void setmsg(boolean msg){this.msg = msg;}

    public String getnickname(){return nickname; }
    public void setnickname(String nickname){this.nickname = nickname;}

    public String getrank(){return rank;}
    public void setrank(String rank){this.rank = rank;}

    public String getshare(){return share;}
    public void setshare(String share){this.share = share;}

    public String getcount(){return count;}
    public void setcount(String count){this.count = count;}

    public String getimgurl(){return imgurl;}
    public void setimgurl(String imgurl){this.imgurl = imgurl;}
}
