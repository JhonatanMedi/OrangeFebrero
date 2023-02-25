package Orange.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultDataBase {

    private ConetionDataBase conectionDataBase;

    public ConsultDataBase() {
        this.conectionDataBase = new ConetionDataBase();
    }

    public static void consultUsers() throws SQLException {
        Connection testCon = ConetionDataBase.getConnection();
        if(testCon != null){
            System.out.println("Conecto");
            Statement stm  = testCon.createStatement();
            ResultSet rst  = stm.executeQuery("Select * From [Users]");
            while (rst.next()){
                System.out.println("Users: " +rst.getString(1) + rst.getString(2));
            }

        }else{
            System.out.println("No conecto");
        }
    }
}
