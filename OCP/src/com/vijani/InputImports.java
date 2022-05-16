package com.vijani;

import java.nio.file.Files;
import java.nio.file.Paths;

// import java.nio.file.*; // this is correct.
// import java.nio.*; // this doesn't import the classes inside file package.
// import java.nio.*.*; // this is also wrong.
// import java.nio.file.Paths.*; // this is also wrong, cannot import methods like this.


public class InputImports {
    public void read(Files files){
    Paths.get("name");
    }
}
