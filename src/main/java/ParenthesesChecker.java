public class ParenthesesChecker {

    //create a method that takes in a string

    public ParenthesesChecker() {

    }

    public boolean checkParentheses(String message) {
        if (message.contains("(())")){
            return true;
        } else if (message.isBlank()){
            return true;
        } else if(message.contains("(()")||message.contains("())")){
           return false;
        } else if(message.contains("()")) {
            return true;
        } else if(message.contains("(")&& message.contains(")")&& message.contains(")")){
            return false;

        } else if (message.contains("(")&& message.contains(")")){
            return true;
        }
        return false;
    }

    // maybe using a stack instead
    // for (int i = 0; i < message.Length; i++) {
        // If the message[i] is a starting
        // bracket then push it
        //if (message[i] == '{' || message[i] == '('
                //|| message[i] == '[')
            //st.Push(message[i]);



}
