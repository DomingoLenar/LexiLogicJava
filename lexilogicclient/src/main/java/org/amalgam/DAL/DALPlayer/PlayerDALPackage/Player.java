package org.amalgam.DAL.DALPlayer.PlayerDALPackage;


/**
* org/amalgam/DAL/DALPlayer/PlayerDALPackage/Player.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 5:44:43 PM SGT
*/

public final class Player implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public String name = null;
  public String password = null;
  public String lastLogin = null;

  public Player ()
  {
  } // ctor

  public Player (int _id, String _name, String _password, String _lastLogin)
  {
    id = _id;
    name = _name;
    password = _password;
    lastLogin = _lastLogin;
  } // ctor

} // class Player
