package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidRoomIDExceptionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 3:01:31 PM PST
*/

abstract public class InvalidRoomIDExceptionHelper
{
  private static String  _id = "IDL:org/amalgam/Utils/Exceptions/InvalidRoomIDException:1.0";

  public static void insert (org.omg.CORBA.Any a, InvalidRoomIDException that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static InvalidRoomIDException extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "message",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (InvalidRoomIDExceptionHelper.id (), "InvalidRoomIDException", _members0);
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

  public static InvalidRoomIDException read (org.omg.CORBA.portable.InputStream istream)
  {
    InvalidRoomIDException value = new InvalidRoomIDException ();
    // read and discard the repository ID
    istream.read_string ();
    value.message = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, InvalidRoomIDException value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.message);
  }

}
