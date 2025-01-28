package student;

/**
 * The greeting class is one student will build from scratch.
 * You can use the javadoc to help guide the building of the class.
 * Until this class is built, the auto grader will not be available/fail to run.
 * The greeting class stores the locality ID, locality name, and a string format of the greeting both ascii and Unicode.
 * That way the various ways to look at the greeting are paired together,
 * which could simplify the process of looking up the greeting making it easier to add additional greeting types
 * without having to change code in other places.
 * For HW01 you won't have to explore how to do that, but you are encouraged to about
 * how you could integrate this class to make the final program more versatile.
 * The following examples are ways the class can be built and used:
 *  Greeting g = new Greeting(2, "English"); // sets up greeting to be "Hello, {name}!"
 *  Greeting h = new Greeting(1, "Hawaii", "Aloha"); // setups up greeting to be "Aloha, {name}!"
 *  Greeting c = new Greeting(3, "China", "你好", "Ni Hao", "%%s, %s!"); // sets up greeting to be
 *                                                                     // "{name}, 你好!"
 */
public class Greeting {
    /**
     * The unique identifier for the locality.
     */
    private final int localityID;
    /**
     * The name of the locality.
     */
    private final String localityName;
    /**
     * The ASCII representation of the greeting.
     */
    private final String asciiGreeting;
    /**
     * The Unicode representation of the greeting.
     */
    private final String unicodeGreeting;
    /**
     * The format string used to construct the greeting.
     */
    private final String formatStr;
    /**
     * @param localityID - id of the locality
     * @param localityName  - name of the locality
     */
    public Greeting(int localityID,
                    String localityName) {
        this(localityID, localityName, "Hello");
    }
    /**
     * @param localityID - id of the locality
     * @param localityName  - name of the locality
     * @param greeting -  greeting using ascii characters
     */
    public Greeting(int localityID,
                    String localityName,
                    String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }
    /**
     * @param localityID - id of the locality
     * @param localityName  - name of the locality
     * @param asciiGreeting - greeting using ascii characters
     * @param unicodeGreeting - greeting using Unicode characters
     * @param formatStr - format string for the greeting
     */
    public Greeting(int localityID,
                    String localityName,
                    String asciiGreeting,
                    String unicodeGreeting,
                    String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
        this.asciiGreeting = asciiGreeting;
    }
    /**
     * Returns the locality id number.
     * @return the locality id as an Int
     */
    public int getLocalityID() {
        return localityID;
    }
    /**
     * Returns the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the ascii greeting. Just the greeting, no formatting.
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Returns the Unicode greeting. Just the greeting, no formatting.
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }
    /**
     * Gets the Unicode format string. This string will have an %s,
     * so that the name can be inserted into the greeting in the correct location.
     */
    public String getFormatStr() {
        return this.getFormatStr(false);
    }
    /**
     * Returns the format string with the greeting inserted into the format.
     * This string will have an %s, so that the name can be inserted into the greeting in the correct location.
     * An example use is as follows
     *  Greeting g = new Greeting(2, "English");
     *  // later in code
     *  String name = "Alice";
     *  String greet = String.format(g.getFormatStr(false), name);
     *  System.out.println(greet); // Hello, Alice!
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(formatStr, asciiGreeting);
        } else {
            return String.format(formatStr, unicodeGreeting);
        }
    }
    /**
     * Returns the full greeting details as a string. Primarily for debugging purposes. Example string format:
     *  {localityID:1, localityName:"Hawaii", asciiGreeting:"Aloha", unicodeGreeting:"Aloha"}
     */

    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
