import groovy.xml.MarkupBuilder 
import groovy.util.*
import groovy.xml.DOMBuilder;
import groovy.xml.dom.DOMCategory;

def call()
{
	def archivoxml = "/SSD/Personales/Dip-DevOps/readwrite-xml/resources/versiones.xml"
    def xml        = new XmlParser().parse(archivoxml)

	String var_version    = ''
    String var_paso       = ''
    String var_newversion = ''
    String[] arr_version

    arr_version = var_version.split('.');
    var_version = xml.release[0].version
    var_paso    = ((arr_version[2].toInteger)+1).toString;

    var_newversion = arr_version[0] + '.' + arr_version[1] + var_paso

    print("Version archivo:")
    println var_version

    print("Nueva Version archivo:")
    println var_newversion


}
