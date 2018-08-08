import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import loja.Loja;
import solicitacao.Solicitacao;
import util.Util;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util util = new Util();
		Loja southCar = new Loja("SouthCar",210.0,150.0,200.00,90.0,4,0.0,"Gol");
		Loja westCar = new Loja("WestCar",530.0,150.0,200.00,90.0,2,0.0,"Ferrari");
		Loja northCar = new Loja("NorthCar",630.0,580.0,600.0,590.0,7,0.0,"Volvo");
		
		try {
		      FileReader arq = new FileReader("C:/Users/lucas/Documents/entrada.txt");
		      BufferedReader lerArq = new BufferedReader(arq);
		 
		      String linha = lerArq.readLine(); // lê a primeira linha
		// a variável "linha" recebe o valor "null" quando o processo
		// de repetição atingir o final do arquivo texto
		      while (linha != null) {
		    	  
		    	  Solicitacao solicitacao = new Solicitacao();
		    	  String parametros[] = linha.split(":"); 
		    	  solicitacao.setTipo(parametros[0]);
		    	  solicitacao.setQuantidade(parametros[1]);
		    	  solicitacao.setDias(parametros[2]);	
		    		
		    	  if(Integer.parseInt(solicitacao.getQuantidade().trim())<=7 && Integer.parseInt(solicitacao.getQuantidade().trim())>0) {
			    	  for(String dia : solicitacao.getDias().split(",")) {
			    		  if(dia.toUpperCase().contains("DOM") || dia.toUpperCase().contains("SAB")) {
			    			  util.calculaTotalFinalDeSemana(solicitacao,southCar);
			    			  util.calculaTotalFinalDeSemana(solicitacao,westCar);
			    			  util.calculaTotalFinalDeSemana(solicitacao,northCar);
			    		  }else {
			    			  util.calculaTotalSemana(solicitacao,southCar);
			    			  util.calculaTotalSemana(solicitacao,westCar);
			    			  util.calculaTotalSemana(solicitacao,northCar);
			    		  }
			    			
			    	  }
			    	  
			    	 // calculaValorDeAcordoComQauntidadeDePassageiros(solicitacao,southCar,westCar,northCar);
			    	
			    	  System.out.println(linha);
			    	  
			    	  Loja menorValor = util.verificaMenorValor(southCar,westCar,northCar,Integer.parseInt(solicitacao.getQuantidade().trim()));
			    	  
			    	  System.out.println(menorValor.getCarro().toUpperCase()+":"+menorValor.getNome()+"="+menorValor.getTotal());
			    	  System.out.println();
		    	  }else {
		    		  System.out.println(linha);
		    		  System.out.println("Numero de passageiros deve ser entre 1 e 7");
		    		  System.out.println();
		    	  }
		    	  
		    	  southCar.setTotal(0.0);
		    	  westCar.setTotal(0.0);
		    	  northCar.setTotal(0.0);
		    	  linha = lerArq.readLine(); // lê da segunda até a última linha
		      }
		 
		      arq.close();
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.\n",
		          e.getMessage());
		    }

	}
	
	
	

}
