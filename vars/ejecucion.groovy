
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

    var_version = new File(archivo).getText('UTF-8')
    var_largo = var_version.length();
    var_inversa = var_version.reverse();
    var_pos = var_inversa.indexOf('.');
    var_nropos = var_pos.toInteger();
    var_release = var_inversa.substring(1, var_nropos);
    var_newrelease = var_release.toInteger() + 1;
    figlet 'Paso 2'
    var_nropos = var_nropos + 1;
    var_newversion = var_version.substring(1, (var_largo-var_nropos)) + '.' + var_newrelease;

    print("Version archivo:")
    println var_version

    print("Nueva Version archivo:")

    println var_newversion

    archivo.write(var_newversion);
}
