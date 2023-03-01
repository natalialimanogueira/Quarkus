package br.com.nat.resources;

import br.com.nat.aplication.commands.GetFishCommand;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/fishes")
public class FishResource {


    @Inject
    GetFishCommand getFishCommand;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response get() {
        return Response.ok(getFishCommand.escecute()).build();
    }





//    @POST
//    public void add(Fish fish) {
//        addFishCommand.addFishPost();
//
//    }
}
