package org.amalgam.backend.microservices.game;

import org.amalgam.Utils.Exceptions.DuplicateWordException;
import org.amalgam.Utils.Exceptions.InvalidWordFormatException;
import org.amalgam.backend.microservices.serverconnection.ORBConnection;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class VerifyWordMicroservice {
    public void process(ORBConnection orbConnection, String word){
//        try {
////            orbConnection.retrieveGameService().verifyWord(word);
//        } catch (InvalidWordFormatException | DuplicateWordException | InvalidName | CannotProceed | NotFound e) {
//            throw new RuntimeException(e);
//        }
    }
}
