package org.amalgam.Utils.ObjectExceptions;

/**
* org/amalgam/Utils/ObjectExceptions/SQLErrorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramObjects.idl
* Friday, May 3, 2024 11:33:44 PM SGT
*/

public final class SQLErrorHolder implements org.omg.CORBA.portable.Streamable
{
  public SQLError value = null;

  public SQLErrorHolder ()
  {
  }

  public SQLErrorHolder (SQLError initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SQLErrorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SQLErrorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SQLErrorHelper.type ();
  }

}
