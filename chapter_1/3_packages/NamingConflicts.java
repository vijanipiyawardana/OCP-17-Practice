/*
 * import a class which can be found in multiple places
*/

/* when class is found in multiple packages: COMPILE ERROR - reference to Date is ambiguous */
// import java.util.*;
// import java.sql.*;
// public class NamingConflicts {
//     Date date;
// }

/* explicitely imports java.util.Date: takes precedence over any wildcards present. COMPILE SUCCESS */
import java.util.Date;
import java.sql.*;
public class NamingConflicts {
    Date date;
}

/* explicitely imports both: there can't be two defaults!
COMPILE ERROR: reference to Date is ambiguous, imports are ambiguous*/
// import java.util.Date;
// import java.sql.Date;
// public class NamingConflicts {
//     Date date;
// }

/* when you want to use two classes with the same name. COMPILE SUCCESS */
// public class NamingConflicts {
//     java.util.Date utilDate;
//     java.sql.Date sqlDate;
// }