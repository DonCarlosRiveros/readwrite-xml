
def call()
{
	def archivo = "/SSD/Personales/Dip-DevOps/readwrite-xml/resources/versiones.txt"

	String var_version    = ''
    String var_inversa    = ''
    String var_newversion = ''
    String var_pos        = ''
    Number var_nropos     = 0
    Number var_largo      = 0
    String var_newrelease = ''

    /* String[] arr_version */

    figlet 'Antes'

    var_version = new File(archivo).getText('UTF-8')
    println var_version
    var_largo = var_version.length();
    println "Largo string : " + var_largo;

    figlet 'Paso 1'

    println var_version.reverse();
    println(var_version.indexOf('.'));
    var_pos = (var_version.reverse()).indexOf('.');
    println var_pos;
    var_nropos = var_pos.toInteger();

    var_inversa = var_version.reverse();
    var_newrelease = var_inversa.substring(1, (var_largo-var_nropos)) + '.'

    println "Nuevo release : " + var_newrelease;

    figlet 'Paso 3'

    var_nropos = var_nropos + 1;

    var_newversion = var_version.substring(1, (var_largo-var_nropos)) + '.'

    print("Version archivo:")
    println var_version

    print("Nueva Version archivo:")

    println var_newversion


}
