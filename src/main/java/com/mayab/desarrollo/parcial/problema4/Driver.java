package com.mayab.desarrollo.parcial.problema4;

public class Driver {
	
    public static void main( String[] args ){
  
    	MySqlStrategy sql = new MySqlStrategy();
    	OracleStrategy oracle = new OracleStrategy();
    	MongoDBStrategy mongo = new MongoDBStrategy();
   
    	System.out.println(sql);
    	sql.abrirConexion();
    	sql.performSentencia();
    	sql.setBDStrategy(new BDCStrategy());
    	sql.performSentencia();
    	sql.ejecutarSentencia();
    	
    	System.out.println(oracle);
    	oracle.abrirConexion();
    	oracle.performSentencia();
    	oracle.ejecutarSentencia();
    	
    	System.out.println(mongo);
    	mongo.abrirConexion();
    	mongo.performSentencia();
    	mongo.setBDStrategy(new BDAStrategy());
    	mongo.performSentencia();
    	mongo.setBDStrategy(new BDCStrategy());
    	mongo.performSentencia();
    	mongo.ejecutarSentencia();
   
    	
    }

}
