
/**
 *
 * @author chadsisk
 */
import java.util.Scanner;

public class UserInterface {
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            else if(command.equals("add")){
                System.out.println("To add:");
                String addTask = scanner.nextLine();
                todoList.add(addTask);
            }
            else if(command.equals("list")){
                todoList.print();
            }
            else if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int removed = Integer.valueOf(scanner.nextLine());
                todoList.remove(removed);
            }
        }
    }
}
