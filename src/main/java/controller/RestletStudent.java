package controller;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 *
 */
public class RestletStudent extends ServerResource{

        	@Get ("xml")
	public String getStudentById() {


            	return null;
            }

}





