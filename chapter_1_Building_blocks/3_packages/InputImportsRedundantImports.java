/**
 * Two possible ways of import:
 *      1. Use a wildcard to import both at the same time.
 *      2. Import both classes explicitely.
 */

// 1. Use a wildcard to import both at the same time.
import java.nio.file.*;

// 2. Import both classes explicitely.
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Some wrong attempts:
 */

// a wildcard only matches classnames, not file.Files
import java.nio.*;

// can only have one wildcard, and it must be at the end
import java.nio.*.*;

// cannot import methods, only classnames
import java.nio.file.Paths.*;


public class InputImportsRedundantImports {

    public void read(Files files) {
        Paths.get("name");
    }
    
}
