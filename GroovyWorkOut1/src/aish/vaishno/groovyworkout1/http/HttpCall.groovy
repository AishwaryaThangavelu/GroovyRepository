package aish.vaishno.groovyworkout1.http

import groovyx.net.http.HTTPBuilder;


class HttpCall {

	def google=new HTTPBuilder("www.google.com");
		
	
	static void main(def args){
		def url=("http://www.aishwaryvaishno.wordpress.com").toURL().getText();
		println url;
		
		/*def postReq=Http().post("http://www.google.com",[[fr:'sfp'],[p:'groovy']]).text;
		println postReq;*/
	}
}
