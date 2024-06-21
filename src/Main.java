import br.com.alura.Challenge.ApiKeyPackge.APIJSON;

import java.io.IOException;
import java.util.Scanner;

public class Main extends APIJSON {


    public static void main(String[] args) throws IOException, InterruptedException {

        APIJSON apikey = new APIJSON();

        Double add;

        Scanner scanner = new Scanner(System.in);

        String opcaoConversao;

        do {

            System.out.println("""
                    *******************************************************
                    
                    Seja Bem-Vindo/a ao Conversor de Moedas 
                    
                    1) Dólar =>> Peso Argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar =>> Real Brasileiro
                    4) Real Brasileiro =>> Dólar
                    5) Dólar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dólar
                    7) Dólar =>> dirham
                    8) dirham =>> Dólar
                    9) Sair
                    
                    Escolha uma opção válida:
                    *******************************************************
                    """);

            opcaoConversao = scanner.next();

            if (opcaoConversao.equals("9")) {
                System.out.println("Sessão encerrada, obrigado por usar o conversor");
                break;
            }

            System.out.println("Qual o valor que você quer converter");

            long valorMoeda = scanner.nextLong();

            switch (opcaoConversao) {
                case "1":
                    apikey.httpRequest("USD", "ARS");
                    add = apikey.getJsonCoin().conversion_rate() * valorMoeda;
                    System.out.println("Valor " + valorMoeda + "[USD] equivale à =>>> " + add + "[ARS]");
                    break;
                case "2":
                    apikey.httpRequest("ARS", "USD");
                    add = apikey.getJsonCoin().conversion_rate() * valorMoeda;
                    System.out.println("Valor " + valorMoeda + "[ARS] equivale à =>>> " + add + "[USD]");
                    break;
                case "3":
                    apikey.httpRequest("USD", "BRL");
                    add = apikey.getJsonCoin().conversion_rate() * valorMoeda;
                    System.out.println("Valor " + valorMoeda + "[USD] equivale à =>>> " + add + "[BRL]");
                    break;
                case "4":
                    apikey.httpRequest("BRL", "USD");
                    add = apikey.getJsonCoin().conversion_rate() * valorMoeda;
                    System.out.println("Valor " + valorMoeda + "[BRL] equivale à =>>> " + add + "[USD]");
                    break;
                case "5":
                    apikey.httpRequest("USD", "COP");
                    add = apikey.getJsonCoin().conversion_rate() * valorMoeda;
                    System.out.println("Valor " + valorMoeda + "[USD] equivale à =>>> " + add + "[COP]");
                    break;
                case "6":
                    apikey.httpRequest("COP", "USD");
                    add = apikey.getJsonCoin().conversion_rate() * valorMoeda;
                    System.out.println("Valor " + valorMoeda + "[COP] equivale à =>>> " + add + "[USD]");
                    break;
                case "7":
                    apikey.httpRequest("USD", "AED");
                    add = apikey.getJsonCoin().conversion_rate() * valorMoeda;
                    System.out.println("Valor " + valorMoeda + "[USD] equivale à =>>> " + add + "[AED]");
                    break;
                case "8":
                    apikey.httpRequest("AED", "USD");
                    add = apikey.getJsonCoin().conversion_rate() * valorMoeda;
                    System.out.println("Valor " + valorMoeda + "[AED] equivale à =>>> " + add + "[USD]");
                    break;
                default:
                    System.out.println("Digite uma opção valida: 1 ao 9");
                    break;
            }
        } while (true);


    }}
