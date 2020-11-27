package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		List<Funcionario> ListaFuncionarios = new ArrayList<>();
		String path = "src\\application\\nomes.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String funcionarioCsv = br.readLine();
			while(funcionarioCsv!=null) {
				String[] separarPorVigula = funcionarioCsv.split(",");
				ListaFuncionarios.add(new Funcionario(separarPorVigula[0],Double.parseDouble(separarPorVigula[1]) ) );
				funcionarioCsv = br.readLine();
			}
			Collections.sort(ListaFuncionarios);//ordena coleção
			for(Funcionario funcionario:ListaFuncionarios) {
				System.out.println(funcionario.getNome()+","+ String.format("%.2f", funcionario.getSalario()) );
			}
			
			
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		

		
		
		

	}

}
