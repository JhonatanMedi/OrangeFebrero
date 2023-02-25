package Orange.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDataBase {

    private ConetionDataBase conectionDataBase;

    private InsertDataBase() {
        this.conectionDataBase = new ConetionDataBase();
    }

    public static void insertEmployee(String firstName, String lastName, String middle) {
        Connection testCon = ConetionDataBase.getConnection();
        String insertSql = "INSERT INTO newEmployee(firtsName, lastName, middleName) VALUES" +
                "('" + firstName + "','" + lastName + "','" + middle + "')";

        ResultSet resultSet = null;

        try (Connection connection = ConetionDataBase.getConnection();
             PreparedStatement prepsInsert = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

            prepsInsert.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
