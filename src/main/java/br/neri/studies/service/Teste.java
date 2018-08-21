package br.neri.studies.service;

public class Teste {

	public static void main(String [] args) {
	String xml = "<requisicao-transacao id='f7a2d04a-1957-45f8-aed7-bf60237c44be' versao='1.3.0'><dados-ec><numero>1065238514</numero>    <chave>a2bef49781b3a076429f6937229a56932e22033eced45d1c0e3c96859d516b35</chave>  </dados-ec>  <dados-portador>    <numero>5155900467754647</numero>    <validade>201601</validade>    <indicador>1</indicador>    <codigo-seguranca>111</codigo-seguranca>    <nome-portador>DANIEL ELIAS KLAVA</nome-portador>  </dados-portador>  <dados-pedido>    <numero>24513107</numero>    <valor>400</valor>    <moeda>986</moeda>    <data-hora>2015-12-28T10:01:52-02:00</data-hora>    <idioma>PT</idioma>    <soft-descriptor>Residencial </soft-descriptor>  </dados-pedido>  <forma-pagamento>    <bandeira>mastercard</bandeira>    <produto>1</produto>    <parcelas>1</parcelas>  </forma-pagamento>  <url-retorno>null</url-retorno>  <autorizar>3</autorizar>  <capturar>false</capturar>  <gerar-token>true</gerar-token>\\n</requisicao-transacao>";

	
	String xml2 = "<requisicao-transacao id=\"f7a2d04a-1957-45f8-aed7-bf60237c44be\" versao=\"1.3.0\">\n  <dados-ec>\n    <numero>1065238514</numero>\n    <chave>a2bef49781b3a076429f6937229a56932e22033eced45d1c0e3c96859d516b35</chave>\n  </dados-ec>\n  <dados-portador>\n    <numero>5155900467754647</numero>\n    <validade>201601</validade>\n    <indicador>1</indicador>\n    <codigo-seguranca>111</codigo-seguranca>\n    <nome-portador>DANIEL ELIAS KLAVA</nome-portador>\n  </dados-portador>\n  <dados-pedido>\n    <numero>24513107</numero>\n    <valor>400</valor>\n    <moeda>986</moeda>\n    <data-hora>2015-12-28T10:01:52-02:00</data-hora>\n    <idioma>PT</idioma>\n    <soft-descriptor>Residencial </soft-descriptor>\n  </dados-pedido>\n  <forma-pagamento>\n    <bandeira>mastercard</bandeira>\n    <produto>1</produto>\n    <parcelas>1</parcelas>\n  </forma-pagamento>\n  <url-retorno>null</url-retorno>\n  <autorizar>3</autorizar>\n  <capturar>false</capturar>\n  <gerar-token>true</gerar-token>\n</requisicao-transacao>";
	
	xml = pegaValorFilho(xml,"<dados-portador>","</dados-portador>","<numero>","</numero>");
	xml = removeNumeroCartao(xml,"<numero>","</numero>");
	xml = removeNumeroCartao(xml,"<validade>","</validade>");
	xml = removeNumeroCartao(xml,"<codigo-seguranca>","</codigo-seguranca>");
	xml = removeNumeroCartao(xml,"<bandeira>","</bandeira>");

    System.out.println(xml);
	}
	
	
	public static String removeNumeroCartao(String numeroCartao, String inicio, String fim) {
		try {
		int um = numeroCartao.indexOf(inicio);
	    int dois = numeroCartao.lastIndexOf(fim);
	    String nova =  numeroCartao.substring(um + inicio.length(), dois);
	    String nova2 =nova.replaceAll(nova, " ");
	    numeroCartao = numeroCartao.replaceAll(nova, nova2);
        return numeroCartao;
		}catch(Exception e) {
			return numeroCartao;
		}
	}
	
	
	public static String pegaValorFilho(String elementoPai, String inicio, String fim,String elementoFilhoInicio, String elementoFilhoFim) {
		try {
			int um = elementoPai.indexOf(inicio);
			String newString = null;
		    int dois = elementoPai.lastIndexOf(fim);
		    String nova =  elementoPai.substring(um + inicio.length(), dois);
		    if(nova !=null) {
		    	 newString = removeNumeroCartao(nova,elementoFilhoInicio, elementoFilhoFim);
		    }
		    return elementoPai.replaceAll(nova, newString);
		}catch(Exception e) {
			return elementoPai;
		}

	}
	
	
}
