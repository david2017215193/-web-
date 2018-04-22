package Serve;

import domain.User;

public class logical {


    public static User Logical(User user) {
        if (Integer.parseInt (user.getcount ()) > 40 || Integer.parseInt (user.getcount ()) < 0) {
            return null;
        }
    return user;
    }
}
