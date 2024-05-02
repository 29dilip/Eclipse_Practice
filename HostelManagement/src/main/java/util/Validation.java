package util;

public class Validation {
 public static final String regularExpression ="^[A-Za-z]{1,}[\\.]{0,1}[\\s]{0,1}[A-Za-z]{0,}[\\s]{0,1}[A-Za-z]{0,}$";
 public static final String rgExpression="/^(\\d{1,}) [a-zA-Z0-9\\s]+(\\,)? [a-zA-Z]+(\\,)? [A-Z]{2}[0-9]{5,6}$/\r\n";
 public static final String roomExpression="^\\d[0-9]{1,4}$";
 public static final String regxEmail="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
      + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
 public static final String rgMobileNum = "^\\d[0-9]\\d{1,10}$";
 public static final String rgPayment = "^^((0?\\\\.(0[1-9]|[1-9]\\\\d))|([1-9]\\\\d*(\\\\.\\\\d{2})?))$\r\n"
 		+ "";
 public static final String rgTypeAC = "^[A-Za-z0-9\\s-]*$";
 public static final String rgAddress="^[A-Za-z0-9\\s-,]*$";
 public static final String rgSharing="^[A-Za-z0-9\\s-]*$";
 public static final String rgClass1="^[A-Za-z0-9\\s-]*$";

}


