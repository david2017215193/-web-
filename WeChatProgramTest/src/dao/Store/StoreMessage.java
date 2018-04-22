package dao.Store;

import domain.User;
import util.DBCPUtil;
import warper.MyDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StoreMessage implements StoreUserMessage{
       public User StoreStatus(User user) throws Exception{
           Connection conn = null;
           PreparedStatement ps = null;
           DataSource ds = new MyDataSource ();

           try{
               conn = ds.getConnection ();
               ps = conn.prepareStatement ("INSERT INTO usermessage(status,msg) VALUES(?,?,?,?,?,?)");
               ps.setString (1,user.getstatus ());
               ps.setString (2, String.valueOf (user.getmsg ()));
               ps.executeUpdate ();
           }catch(Exception e){
               if(user.getstatus () == null){throw new RuntimeException ("没有得到状态码");}
           }finally{
               DBCPUtil.release (conn,ps,null);
           }
           return user;
       }
       public User StoreData(User user) throws Exception{
           Connection conn2 = null;
           PreparedStatement ps2 = null;
           DataSource ds = null;

           try{
               conn2 = ds.getConnection ();
               ps2 = conn2.prepareStatement ("INSERT INTO usermessage(nickname,rank,count,imgurl) VALUES(?,?,?,?,?,?)");
               ps2.setString(3,user.getnickname ());
               ps2.setString (4,user.getrank ());
               ps2.setString (5,user.getcount ());
               ps2.setString (6,user.getimgurl ());
               ps2.executeUpdate ();
           }catch (Exception e){
                e.printStackTrace ();
           }finally{
               DBCPUtil.release (conn2,ps2,null);
           }
           return user;
       }
}

