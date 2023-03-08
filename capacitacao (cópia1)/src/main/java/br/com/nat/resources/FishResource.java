package br.com.nat.resources;

//import br.com.nat.aplication.commands.insertFishCommand;
import br.com.nat.aplication.commands.CreateFishComand;
import br.com.nat.aplication.commands.GetFishCommand;
import br.com.nat.domain.entities.Fish;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/fishes")
public class FishResource {


    @Inject
    GetFishCommand getFishCommand;

    @Inject
    CreateFishComand createFishComand;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response get() {
        return Response.ok(getFishCommand.execute()).build();
    }
    @POST
    public Fish add(Fish fish) {
        return createFishComand.execute(fish);

    }
}
