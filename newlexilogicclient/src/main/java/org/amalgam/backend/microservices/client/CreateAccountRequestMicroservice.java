package org.amalgam.backend.microservices.client;

import org.amalgam.Utils.Exceptions.AccountCreationFailedException;
import org.amalgam.backend.microservices.serverconnection.ORBConnection;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class CreateAccountRequestMicroservice {

    private final ORBConnection orbConnection;

    public CreateAccountRequestMicroservice(ORBConnection orbConnection) {
        this.orbConnection = new ORBConnection(1099, "localhost");
    }

    public void process (ORBConnection orbConnection, String username, String password)  {
        try {
            orbConnection.retrievePlayerRequestStub().createAccount(username,password);
        } catch (AccountCreationFailedException | InvalidName | CannotProceed | NotFound e) {
            throw new RuntimeException(e);
        }
    }
}
