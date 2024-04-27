package org.amalgam.DAL.SQLExceptions;


/**
* org/amalgam/DAL/SQLExceptions/SQLCreateError.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 5:44:43 PM SGT
*/

public final class SQLCreateError extends org.omg.CORBA.UserException
{
  public String reason = null;

  public SQLCreateError ()
  {
    super(SQLCreateErrorHelper.id());
  } // ctor

  public SQLCreateError (String _reason)
  {
    super(SQLCreateErrorHelper.id());
    reason = _reason;
  } // ctor


  public SQLCreateError (String $reason, String _reason)
  {
    super(SQLCreateErrorHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class SQLCreateError
