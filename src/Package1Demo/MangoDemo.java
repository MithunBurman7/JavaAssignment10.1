package Package1Demo;

/*
* Using the import keyword is used to make the classes and interface
* of another package accessible to the current package.
* */
/*
* using Package2Demo.* then all the classes and interfaces of this
* package will be accessible but not subpackages.
*
* */
import Package2Demo.*;

// Below here by Creating Class.

public class MangoDemo {

	//Below here applying Main Method.
	
	public static void main(String[] args) {
		
		GrapesDemo grpsd = new GrapesDemo();
		// In here calling Apple class
		grpsd.accessPack();
		}

}
