package projeto;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Principal {

	public static void main(String[] args) {
		//Criando um objeto para serializar
		Pessoa p = new Pessoa("Ricardo", 30);
		
		//Convertendoo objeto em um JSON Object
		JSONObject json = new JSONObject();
		json.put("nome", p.getNome());
		json.put("idade", p.getIdade());
		String jsonString = json.toJSONString();
		
		gravaArquivo(jsonString);
		try {
			lerArquivo();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
	}
	public static void gravaArquivo(String jsonString) {
		try (FileWriter fileWriter = new FileWriter("pessoa.json")) {
			fileWriter.write(jsonString);
			System.out.println("Arquivo person.json salvo com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivo() throws org.json.simple.parser.ParseException {
		//Lendo o arquivo e desserializando o JSON para o objeto
		try (FileReader fileReader = new FileReader("pessoa.json")){
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
			
			//Criando um objeto Person a partir do json
			String nome = (String) jsonObject.get("nome");
			long idade =  (long) jsonObject.get("idade");
			Pessoa desserializedPerson = new Pessoa(nome,(int) idade);
			
			System.out.println("Objeto desserializado: "+ desserializedPerson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
