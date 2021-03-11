package covidhappinesstracker;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;
import javax.swing.*;
import java.text.SimpleDateFormat;
public class activityTracker {
    private ResultSet rs;
    DB_Comms db = new DB_Comms();
    private SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
    public activityTracker(){
        //nothing
    }
    public int updateHistory(int eAmount, int oAmount, int sAmount,boolean routineBool,int wAmount, boolean saunaBool, int nuChoice, int soChoice){
        Timestamp tm = new Timestamp(System.currentTimeMillis());
        //sf.format(tm)
        String _date= sf.format(tm);
        try {
            String sql = "INSERT INTO daylyData (act_ID, whenDid, amountDone) " +
                    "VALUES (4, '" + _date + "'," + eAmount + ");"; 
            
            db.update(sql);

            db.update("INSERT INTO daylyData (ID, act_ID, whenDid, amountDone) " +
                    "VALUES (0," + 5 + ",'" + _date + "'," + oAmount + ");");

            db.update("INSERT INTO daylyData (ID, act_ID, whenDid, amountDone) " +
                    "VALUES (0," + 6 + ",'" + _date + "'," + sAmount + ");");

            db.update("INSERT INTO daylyData (ID, act_ID, whenDid, amountDone) " +
                    "VALUES (0," + 7 + ",'" + _date + "'," + convertBoolean(routineBool) + ");");

            db.update("INSERT INTO daylyData (ID, act_ID, whenDid, amountDone) " +
                    "VALUES (0," + 8 + ",'" + _date + "'," + wAmount + ");");

            db.update("INSERT INTO daylyData (ID, act_ID, whenDid, amountDone) " +
                    "VALUES (0," + 9 + ",'" + _date + "'," + convertBoolean(saunaBool) + ");");

            db.update("INSERT INTO daylyData (ID, act_ID, whenDid, amountDone) " +
                    "VALUES (0," + 10 + ",'" + _date+ "'," + nuChoice + ");");
            
            db.update("INSERT INTO daylyData (ID, act_ID, whenDid, amountDone) " +
                    "VALUES (0," + 11 + ",'" + _date + "'," + soChoice + ");");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update unsuccesful");
            Logger.getLogger(activityTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
        
    }
    private int convertBoolean(boolean test){
        if(test){
            return 1;
        }
        return 0;
    }
    public ResultSet getValues() throws SQLException{
        ResultSet rs;
        rs = db.query("SELECT * \n" + 
                      "FROM daylyData\n" +
                      "Order BY whenDid;");
        return rs;       
    }
    public void deleteTodaysDate(){
        Timestamp tm = new Timestamp(System.currentTimeMillis());
        String sql = "DELETE * FROM daylyData WHERE whenDid = '" + sf.format(tm) + "';";
        try {
            db.update(sql);
        } catch (SQLException ex) {
            Logger.getLogger(activityTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
