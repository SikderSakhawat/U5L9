public class LogMessage {
    private String machineID;
    private String description;

    public LogMessage(String message){
        int colon = message.indexOf(':');
        this.machineID = message.substring(0, colon);
        this.description = message.substring(colon + 1);
    }

    public boolean containsWord(String word){
        String message = machineID + ":" + description;
        if(word.contains(message)){
            if(message.indexOf(word) == 0 || message.indexOf(word) == message.length() - word.length() || message.charAt()))
        }
    }
}
