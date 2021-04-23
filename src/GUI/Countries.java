package GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONArray;

/**
 *
 * @author luisdiegomontealegrebadilla
 */
public class Countries {
    
    //Atributos 
    
    private String url;
    private int count;
    private int sCode;
    
    
    //Contructor

    public Countries() {
        this.url = "";
        this.count = 0;
        this.sCode = 0;
    }

    //GET and SET 

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }
    
    //Método que imprime en pantalla los países desde el API
    
    //Manejador de excepciones en caso de error al consumir la url de la web del API
    public void PrintCountries () throws MalformedURLException, IOException{
        
        //Objeto que contiene la url del api
        URL url = new URL ("https://restcountries.eu/rest/v1/all");
        
        //Objeto que permite crear la conexión con la url
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        // Bufer de lectura de los datos en esa dirección
        
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream())); 
        
        String str, responsestring="";
        
        //Leo la respuesta de la url y la incluyo completa en una variable de cadena 
        while ((str=in.readLine())!=null){
            
            responsestring+= str +"\n";
            
        }
        
        //System.out.println(responsestring);
        
        in.close();
        
        //Objeto de tipo JSON 
        
        JSONArray array = new JSONArray(responsestring);  
        
        
        System.out.println("País   - -   Capital  - -    Código Alpha   - -   Población  - -   Región   - -  Subregión  - -  Demonym  ");
        
        for (int i=0; i <array.length(); i++){
            
            //Asigna a un objeto cada uno de los países que encuentre en la estructura.
            JSONObject object = array.getJSONObject(i);
            
            System.out.print(object.getString("Pais"));
            System.out.print("  |  ");     
            System.out.print(object.getString("Capital"));
            System.out.print("  |  ");
            
            System.out.print(object.getInt("Poblacion"));
            System.out.print("  |  ");
            System.out.print(object.getString("Region"));
            System.out.print("  |  ");
            System.out.print(object.getString("Subregion"));
            System.out.print("  |  ");
            
        }
        
        
    }
    
    
    public JSONArray GetCountries () throws MalformedURLException, IOException{
        
           //Objeto que contiene la url del api
        URL url = new URL ("https://restcountries.eu/rest/v1/all");
        
                
        //Objeto que permite crear la conexión con la url
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        // Métodos HTTP :  GET, POST, PATCH, DELETE, PUT, etc
        con.setRequestMethod("GET");
        
        // Bufer de lectura de los datos en esa dirección
        
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream())); 
        
        String str, responsestring="";
        
        //Leo la respuesta de la url y la incluyo completa en una variable de cadena 
        while ((str=in.readLine())!=null){
            
            responsestring+= str +"\n";
            
        }
        
        in.close();
        
        JSONArray array =  new JSONArray(responsestring);
        
        return array;
        
    }
    
}
