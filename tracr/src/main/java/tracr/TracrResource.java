package tracr;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "tracr" path)
 */
@Path("tracr")
public class TracrResource {

	/**
	 * Method adding user.
	 * @param userId
	 * @param userDetails
	 * @return
	 */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users")
    public String addUser(User userDetails) {
        return "Got it!";
    }	
	
    /**
     * Method get user detail.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users/{userId}")
    public User getUser(@PathParam("username") String userId) {
    	User userDetail = new User();
        return userDetail;
    }

    /**
     * Method modify user detail
     * @param userId
     * @param userDetails
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users/{userId}")
    public String modifyUser(@PathParam("username") String userId, User userDetails) {
        return "Got it!";
    }
}
