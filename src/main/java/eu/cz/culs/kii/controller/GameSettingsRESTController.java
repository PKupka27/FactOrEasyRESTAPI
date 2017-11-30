package eu.cz.culs.kii.controller;

import eu.cz.culs.kii.model.GameSettingsModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/settings")
public class GameSettingsRESTController {

    @GET
    @Path("/getSettings")
    @Produces(MediaType.APPLICATION_JSON)
    public GameSettingsModel getStudentRecord(){
        GameSettingsModel settings = new GameSettingsModel();
        settings.setNumberOfPlayers(5);
        settings.setInitialNumberOfGamesPerPlayer(3);
        settings.setInitialCapital(50000);
        return settings;
    }

    @POST
    @Path("{numberOfPlayers}/{initNumberofGames}/{initCapital}")
    public Response createSettings(
            @PathParam("numberOfPlayers") int year,
            @PathParam("initNumberofGames") int month,
            @PathParam("initCapital") int day) {

        String resp = "Settings created";

        return Response.status(200)
                .entity(resp)
                .build();
    }

    /*
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postStudentRecord(GameSettingsModel student){
        String result = "Record entered: "+ student;
        return Response.status(201).entity(result).build();
    }

    @GET
    @Path("/{name}")
    public Response getMsg(@PathParam("name") String name) {
        String output = "<html> " + "<title>" + "Java WebService Example" + "</title>"  + "<body><h1><div style='font-size: larger;'>"
                + "Hello <span style='text-transform: capitalize; color: green;'>" + name + "</span></div></h1></body>" + "</html>";
        return Response.status(200).entity(output).build();
    }*/
}