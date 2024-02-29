package Database.Queries;

import ObjectData.WebTableObject;

import java.sql.SQLException;
import java.sql.Statement;

public class WebTable extends BaseTable{

    //In aceasta clasa vom defini diferite Queries pe care sa le executam pe acest tabel

    public synchronized void insertWebTableData(WebTableObject webTableObject) {

        try {
            //Pentru a face un INSERT avem nevoie de un obiect de tipul "statement"
            Statement statement = databaseConnection.getConnection().createStatement();
            String query = "insert into WebTable (firstname, lastname, email, age, salary, department, entrydate)\n" +
                    "values ('" + webTableObject.getFirstnamevalue() + "', '" + webTableObject.getLastnamevalue() + "', '" + webTableObject.getEmailvalue() + "', '" + webTableObject.getSalaryvalue() + "', '" + webTableObject.getDepartmentvalue() + "','" + getCurrentDate() + "');";
            statement.execute(query);
        }
        catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
