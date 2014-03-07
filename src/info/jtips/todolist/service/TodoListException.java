package info.jtips.todolist.service;

public class TodoListException extends RuntimeException {

    public TodoListException(Throwable cause) {
        super(cause);
    }

    public TodoListException(String message, Throwable cause) {
        super(message, cause);
    }

    public TodoListException(String message) {
        super(message);
    }

    public TodoListException() {
    }

}
