package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		
		//sadece ve sadece db erisim kodlari buraya yazilir
		System.out.println("JDBC ile veri tabanina eklendi");
	}

}
