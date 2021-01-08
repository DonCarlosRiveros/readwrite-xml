import groovy.xml.MarkupBuilder 
import groovy.util.*

def call()
{
	def parser = new XmlParser()
	def doc    = parser.parse("resources/versiones.xml")

	String var_version = ''
		
    var_version = ${bk['@version']
    doc.movie.each
    {
    	bk->
    	print("Version archivo:")
    	println "${bk['@version']}"
    }
}
