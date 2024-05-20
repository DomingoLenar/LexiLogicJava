package org.amalgam.Service.GameServiceModule;


/**
* org/amalgam/Service/GameServiceModule/GameServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Monday, May 20, 2024 2:19:19 PM SGT
*/

abstract public class GameServiceHelper
{
  private static String  _id = "IDL:org/amalgam/Service/GameServiceModule/GameService:1.0";

  public static void insert (org.omg.CORBA.Any a, GameService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static GameService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (GameServiceHelper.id (), "GameService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static GameService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GameServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, GameService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static GameService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof GameService)
      return (GameService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _GameServiceStub stub = new _GameServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static GameService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof GameService)
      return (GameService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _GameServiceStub stub = new _GameServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
