package pictures.spring.modelo.persistencia.querys;

public class SQLQuerys {

	public static final String GET_ALL_REGIONS = "SELECT * FROM REGIONS";
	public static final String GET_ALL_DEPARTMENTS = "SELECT * FROM DEPARTMENTS";
	public static final String GET_ALL_EMPLOYEES = "SELECT * FROM EMPLOYEES";
	public static final String GET_ALL_JOBS = "SELECT * FROM JOBS";
	public static final String GET_ALL_COUNTRIES = "SELECT * FROM COUNTRIES";
	public static final String GET_ALL_LOCATIONS = "SELECT * FROM LOCATIONS";
	
	
	public static final String getNeededQuery(String className){
	
		className = className.toUpperCase();
		String sql = null;
		
		switch (className) {
		case "REGIONS": sql = GET_ALL_REGIONS; break;
		case "EMPLOYEES": sql = GET_ALL_DEPARTMENTS; break;
		case "DEPARTMENTS": sql = GET_ALL_EMPLOYEES; break;
		case "JOBS": sql = GET_ALL_JOBS; break;
		case "COUNTRIES": sql = GET_ALL_COUNTRIES; break;
		case "LOCATIONS": sql = GET_ALL_LOCATIONS; break;
		}
		
		return sql;
	}
}
