package dao.Store;

import domain.User;
import util.DBCPUtil;
import warper.MyDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StoreMessage implements StoreUserMessage{
       public void StoreMessage(User user) throws Exception{
           Connection conn = null;
           PreparedStatement ps = null;
           DataSource ds = new MyDataSource ();

           try{
               conn = ds.getConnection ();
               ps = conn.prepareStatement ("INSERT INTO usermessage(status,msg) VALUES(?,?)");
               ps.setString (1,user.getstatus ());
               ps.setString (2,user.getmsg ());
               ps.executeUpdate ();
           }catch(Exception e){
               if(user.getstatus () == null){throw new RuntimeException ("没有得到状态码");}
           }finally{
               DBCPUtil.release (conn,ps,null);
           }
       }
}
