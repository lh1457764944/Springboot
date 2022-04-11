import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author liuheng
 * @date 2021/12/11
 */
public class Test {


    public static void main(String[] args) throws Exception {
        try {
          /*
           加载驱动
         */
            Class.forName ("com.mysql.jdbc.Driver");
          /*
        获取连接
         */
            Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306", "root", "root");
            Statement statement = connection.createStatement ();
            statement.executeQuery ("select * from  test.student");
//            if (!conn.isClosed ()) {
//                System.out.println ("数据库连接成功");
//            }
        } catch (ClassNotFoundException e) {
            System.out.println ("数据库驱动没有安装");
        } catch (SQLException e) {
            e.printStackTrace ();
            System.out.println ("数据库连接失败");
        }
    }
}
