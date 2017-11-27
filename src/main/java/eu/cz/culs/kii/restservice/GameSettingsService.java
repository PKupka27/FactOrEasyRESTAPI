package eu.cz.culs.kii.restservice;

import eu.cz.culs.kii.model.GameSettingsModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/settings")
public class GameSettingsService {

    @GET
    @Path("/getSettings")
    @Produces(MediaType.APPLICATION_JSON)
    public GameSettingsModel getStudentRecord(){
        GameSettingsModel settings = new GameSettingsModel();
        settings.setNumberOfPlayers(5);
        settings.setInitialNumberOfGamesPerPlayer(3);
        settings.setInitialCaptial(50000);
        return settings;
    }

    @GET
    @Path("{year}/{month}/{day}")
    public Response getUserHistory(
            @PathParam("year") int year,
            @PathParam("month") int month,
            @PathParam("day") int day) {

        String date = year + "/" + month + "/" + day;

        return Response.status(200)
                .entity("getUserHistory is called, year/month/day : " + date)
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
*/
    @GET
    @Path("/{name}")
    public Response getMsg(@PathParam("name") String name) {
        String output = "<html> " + "<title>" + "Java WebService Example" + "</title>"  + "<body><h1><div style='font-size: larger;'>"
                + "Hello <span style='text-transform: capitalize; color: green;'>" + name + "</span></div></h1></body>" + "</html>";
        return Response.status(200).entity(output).build();
    }
}