package org.amalgam.Service.Player.PlayerServicePackage;


/**
* org/amalgam/Service/Player/PlayerServicePackage/LobbyHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Monday, April 29, 2024 7:32:02 PM SGT
*/

abstract public class LobbyHelper
{
  private static String  _id = "IDL:org/amalgam/Service/Player/PlayerService/Lobby:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.Service.Player.PlayerServicePackage.Lobby that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.Service.Player.PlayerServicePackage.Lobby extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "lobbyId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "created_by",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "winner",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.amalgam.Service.Player.PlayerServicePackage.LobbyHelper.id (), "Lobby", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.Service.Player.PlayerServicePackage.Lobby read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.Service.Player.PlayerServicePackage.Lobby value = new org.amalgam.Service.Player.PlayerServicePackage.Lobby ();
    value.lobbyId = istream.read_long ();
    value.created_by = istream.read_string ();
    value.winner = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.Service.Player.PlayerServicePackage.Lobby value)
  {
    ostream.write_long (value.lobbyId);
    ostream.write_string (value.created_by);
    ostream.write_string (value.winner);
  }

}
