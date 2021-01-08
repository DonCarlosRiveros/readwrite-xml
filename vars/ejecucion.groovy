
def call()
{
	def archivo = "/SSD/Personales/Dip-DevOps/readwrite-xml/resources/versiones.txt"

	String var_version    = ''
    String var_inversa    = ''
    String var_newversion = ''
    String var_pos        = ''
    Number var_nropos     = 0
    Number var_largo      = 0
    String var_release    = ''
    Number var_newrelease = 0

    /* String[] arr_version */

    figlet 'Antes'

    var_version = new File(archivo).getText('UTF-8')
    println var_version
    var_largo = var_version.length();
    println "Largo string : " + var_largo;

    figlet 'Paso 1'

    var_inversa = var_version.reverse();
    println var_inversa

    var_pos = var_inversa.indexOf('.');
    println 'Posicion del . en texto : ' + var_pos;
    var_nropos = var_pos.toInteger();
    println 'Posicion del . en numero : ' + var_nropos;

    var_release = var_inversa.substring(1, var_nropos);

    println "Release : " + var_release;

    figlet 'Paso 2'

    var_nropos = var_nropos + 1;

    var_newversion = var_version.substring(1, (var_largo-var_nropos)) + '.'

    print("Version archivo:")
    println var_version

    print("Nueva Version archivo:")

    println var_newversion


}
