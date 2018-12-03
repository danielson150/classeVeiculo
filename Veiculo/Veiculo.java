public class Veiculo {
	boolean estadoInicial;
	String marca;
	String modelo;
	String tipoCombustivel; //Tipo de Combustivel:(Diesel, alcool ou gasolina)
	String tipoVeiculo; //Tipo de Veiculo:(aéreo, terrestre ou aquático)
	int numPassageiro;
	float capacidadeTanque; 
	float nivelCombustivel;
	float velocidadeAtual;
	float velocidadeMax;
	int cambio;
	
	
    void Ligar() {
    	if(estadoInicial == true) {
    		System.out.println("O veiculo já está ligado");
    	}
    	 	
    	else {
    		System.out.println("Ligando o veiculo...");
    		estadoInicial = true;
    	}
    }
    
    void Desligar() {
    	if(estadoInicial==false) {
    		System.out.println("O veiculo já está desligado");
    	}
    	
    	else {
            System.out.println("Desligando o veiculo...");
            estadoInicial = false;
        }

    }
    
    void Acelerar() {
    	if((estadoInicial == true) && (velocidadeAtual<velocidadeMax)) {
    		System.out.println("Acelerando o veiculo...");
            velocidadeAtual += 10;
    	}
    	else {
    		System.out.println("Você não pode ultrapassar a velocidade máxima permitida no veiculo");
    	}
    	
    	
    }
    
    void Freiar() {
    	if (velocidadeAtual == 0) {
    		System.out.println("O veiculo já se encontra parado");
    	}
    	else {
    		System.out.println("Você pisou no freio...");
    		velocidadeAtual -= 10;
    		
    	}
    	
    }
    
    void Trocar_Marcha(int nova_marcha) {
        if((nova_marcha<0)||(nova_marcha>5)){
        	System.out.println("Marcha inválida. Operação não foi concluida!");
        }    
        else {
            cambio= nova_marcha;
        }    		
    }

    void Abastecer(int quantidadeL) {
    	
    	nivelCombustivel += quantidadeL;
    	
    	if(quantidadeL>capacidadeTanque) {
    		System.out.println("Quantidade maior que a capacidade do tanque");
    		nivelCombustivel = nivelCombustivel - quantidadeL;
            System.out.println("Capacidade Máxima:" + capacidadeTanque +  "litros");
    	}    
        if(nivelCombustivel>capacidadeTanque) {
        	System.out.println("O tanque está cheio!");
            nivelCombustivel = nivelCombustivel - quantidadeL;
            System.out.println("Nível do combustivel:" + nivelCombustivel + "litros");
    			
        }		
    }
    
    void Mostrar_Status() {
    	System.out.println("Estado inicial: " + estadoInicial);
    	System.out.println("Marca: " + marca);
    	System.out.println("Modelo: " + modelo);
	System.out.println("Tipo de Combustivel: "+ tipoCombustivel);
	System.out.println("Tipo de Veiculo: "+ tipoVeiculo);
	System.out.println("Numeros de Passageiros: " + numPassageiro);
	System.out.println("Nivel de combustivel:"+ nivelCombustivel +  "litros");
	System.out.println("Capacidade do Tanque: " + capacidadeTanque);
	System.out.println("Velocidade atual: "+ velocidadeAtual + "KM");
	System.out.println("Velocidade Maxima:"+ velocidadeMax + "KM");
    }
  
	
}