package com.vijani;

import java.util.Date;


// here java.util.Date or java.sql.Date ?
// what if 2 classes with same name in 2 different packages
// if both classes imported?
// you need to explicitly, specifically define which class of which package you need.
// otherwise, compile error.

public class Conflicts {
    Date date;
}
