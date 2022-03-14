# Tech Talks: Tri 3 #

Important Links for GitHub:
[Team Scrum Board](https://github.com/mistylavender/RedTailedHawks/projects/1)
[Team Wiki](https://github.com/mistylavender/RedTailedHawks/wiki)

## Tech Talks: Table of Contents ##

[Tech Talk 0 - Data Structures](#tech-talk-0---data-structures)


## Tech Talk 0 - Data Structures ##

[Week 0 Ticket](https://github.com/mistylavender/RedTailedHawks/projects/1#card-79098981)
[Week 0: Repl for Coding Challenge](https://replit.com/@MistyLavender/Data-Structures#Main.java)

* Prep for AP EXAM:
  * review one online FRQ, MCQ every week and revise concepts that I got wrong to remember and improve on
  * understand the weekly coding assignment and if not running by the due time, eventually get it running to fully understand why the code was not working
  * will discuss every week on Wed, Thurs with study group on how to improve weekly coding assignment and what to look for in the following week that we must all revise as a whole group

* Data Structures
  * meant to organize data
  * primitive data: a variable holding a single value (integer, float, string, boolean) 
  * non-primitive data: a sequence / table of data or databases (array, list, dictionary, set, file)
  * algorithms interact with the data structures to get data and use it fully
  * stacks and queues are more important in lists
  * tuple & dictionary - hashmap for python and java respectively
  * Imperative and Procedural Programming:
  * usually use code in a sequence and if repetitive it can be put into a procedures -> procedural programming
  * procedures enhance imperative paradigm / improve quality
  * "Press 1 to go here Press 2 to go here" / menus -> sequence of events to choose and then choose a specific procedure
  * object oriented -> hello "object" which method would you like me to execute for you -> knows concept of classes and objects, knows gives specific solution/method for object
  * uml/class chart (object) vs flowchart (procedural)
  * Data Structures: need structures to input data and need algorithm to put to use
  * array vs hashmap: 
  * array stores primitive types, index for each value (nondirect)
  * hashmap stores in key value pairs (direct access)

     ```//package hacks

    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    // The Menu Class has a HashMap of Menu Rows
    public class Menu {
    // Format: Key {0, 1, 2, ...} created based on order of input menu, Value {MenuRow0, MenuRow1, MenuRow2,...} each corresponds to key
    Map<Integer, MenuRow> menu = new HashMap<>();

    public Menu(MenuRow[] rows) {
        int i = 0;
        for (MenuRow row : rows) {
            // Build HashMap for lookup convenience
            menu.put(i++, new MenuRow(row.getTitle(), row.getAction()));
        }
    }

    /**
     *  Get Row from Menu,
     *
     * @param  i,  HashMap key (k)
     *
     * @return  MenuRow, the selected menu
     */
    public MenuRow get(int i) {
        return menu.get(i);
    }

    /**
     *  Iterate and print rows in HashMap
     *
     */
    public void print() {
        for (Map.Entry<Integer, MenuRow> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
        }
    }

    public static void main(String[] args) {
        Main.main(args);
    }

 }

 // The MenuRow Class has title and action for individual line item in menu
class MenuRow {
    String title;       // menu item title
    Runnable action;    // menu item action, using Runnable

    /**
     *  Constructor for MenuRow,
     *
     * @param  title,  is the description of the menu item
     * @param  action, is the run-able action for the menu item
     */
    public MenuRow(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    /**
     *  Getters
     */
    public String getTitle() {
        return this.title;
    }
    public Runnable getAction() {
        return this.action;
    }

    /**
     *  Runs the action using Runnable (.run)
     */
    public void run() {
        action.run();
    }
 }

 // The Main Class illustrates initializing and using Menu with Runnable action
 class Main {
    /**
     *  Menu Control Example
     */
    public static void main(String[] args) {
        // Row initialize
        MenuRow[] rows = new MenuRow[]{
                new MenuRow("Exit", () -> main(null)),
                new MenuRow("Swap", () -> IntByReference.main(null)),  // lambda style, () -> to point to Class.Method
                new MenuRow("Matrix", () -> Matrix.main(null)),
               // new MenuRow("Number", () -> IntByReference.main(null))

        };

        // Menu construction
        Menu menu = new Menu(rows);

        // Run menu forever, exit condition contained in loop
        while (true) {
            System.out.println("Hacks Menu:");
            // print rows
            menu.print();

            // Scan for input
            try {
                Scanner sc = new Scanner(System.in);
                int selection = sc.nextInt();

                // menu action
                try {
                    MenuRow row = menu.get(selection);
                  
                    if (row.getTitle().equals("Exit"))
                        return;
                   
                    row.run();
                } catch (Exception e) {
                    System.out.printf("Invalid selection %d\n", selection);
                }
            } catch (Exception e) {
                System.out.println("Not a number");
            }
        }
    }
 }```

  * goal: make a data structure and makes a menu -> try and catch / except or array -> should be able to work with a different value of numbers

