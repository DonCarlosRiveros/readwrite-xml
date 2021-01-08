import groovy.xml.MarkupBuilder 
import groovy.util.*

def call()
{
	def parser  = new XmlParser()
	def archivo = parser.parse("resources/versiones.xml")

	String var_version = ''
		
    var_version = ${bk['@version']
    archivo.release.each
    {
    	bk->
    	print("Version archivo:")
    	println "${bk['@version']}"
    }
}
