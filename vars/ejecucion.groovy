import groovy.xml.MarkupBuilder 
import groovy.util.*

def call()
{
	def parser  = new XmlParser()
	def archivo = parser.parse("resources/versiones.xml")

	String var_version = ''
		
    var_version = archivo.release.version
    print("Version archivo:")
    println var_version

}
