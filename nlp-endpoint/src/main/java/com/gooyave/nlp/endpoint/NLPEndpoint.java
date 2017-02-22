package com.gooyave.nlp.endpoint;

import com.gooyave.nlp.endpoint.model.TextRequest;
import com.gooyave.nlp.endpoint.model.TextResponse;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("nlp")
@Stateless
public class NLPEndpoint {


    public NLPEndpoint() {
    }

    @PUT
    @Path("/request")
    @Produces(MediaType.APPLICATION_JSON)
    public TextResponse textRequest(@Valid @NotNull TextRequest textRequest) {

        TextResponse response = new TextResponse();
        response.setRaw(textRequest.getSentence());

        return response;
    }
}
