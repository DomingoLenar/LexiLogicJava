package org.amalgam.backend.microservices.game;

import org.amalgam.Utils.Exceptions.LobbyDoesNotExistException;
import org.amalgam.Utils.Exceptions.WinnerDoesNotExistException;
import org.amalgam.backend.microservices.serverconnection.ORBConnection;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class FetchWinner {

    public String process (ORBConnection orbConnection, int lobbyID){
        try {
            return orbConnection.retrieveGameService().fetchWinner(lobbyID);
        } catch (LobbyDoesNotExistException | WinnerDoesNotExistException | InvalidName | CannotProceed | NotFound e) {
            throw new RuntimeException(e);
        }
    }
}
