import java.sql.*;

public class SQL {

	private String server = "jdbc:mysql://140.119.19.73:3315/";
	private String database = "109308028";
	private String url = server + database + "?useSSL=false&characterEncoding=utf-8";
	private String username = "109308028";
	private String password = "4tghq";
	private Connection connection;
	private Statement statement;

	//preparing
	public SQL() {
		try {
			this.connection = DriverManager.getConnection(url, username, password);
			this.statement = connection.createStatement();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	public ResultSet query(String command) throws SQLException {
		ResultSet resultSet = null;
		try {
			boolean guard = this.statement.execute(command);
			if (guard) {
				resultSet = this.statement.getResultSet();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	/*
	 * TODO: different return type of String
	 * for example: return 'Linear Algebra 4.0' or 'Linear Algebra'
	 * design until DB is already prepared
	 */

}
