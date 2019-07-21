package prototype_pattern;

public class SqlServer extends DatabasePrototype {

	   public SqlServer() {
	      setCorporate("Microsoft");
	      setName("Sql Server");
	      setPort(1433);
	   }
	}
