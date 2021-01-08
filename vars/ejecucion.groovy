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

    figlet 'Antes'

    var_version = xml.release[0].version;
    figlet 'Paso 1'
    println var_version
    arr_version = var_version.split('.');
    figlet 'Paso 2'
    var_paso    = arr_version[1];
    figlet 'Paso 3'
    var_newversion = arr_version[0] + '.' + arr_version[1] + var_paso;

    

    print("Version archivo:")
    println var_version

    print("Nueva Version archivo:")
    println var_newversion


}
