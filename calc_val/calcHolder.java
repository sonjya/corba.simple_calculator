package calc_val;

/**
* calc_val/calcHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from calc.idl
* Friday, February 5, 2021 3:53:44 PM CST
*/

public final class calcHolder implements org.omg.CORBA.portable.Streamable
{
  public calc_val.calc value = null;

  public calcHolder ()
  {
  }

  public calcHolder (calc_val.calc initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = calc_val.calcHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    calc_val.calcHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return calc_val.calcHelper.type ();
  }

}