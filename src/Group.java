import java.util.ArrayList;

public class Group {

    private String groupName;
    private ArrayList<User> group = new ArrayList<User>();
    private int questNum;
    private int taskNum;
    private int step;
    private Quest groupQuest;

    public Group() {
        this.groupName = "None";
        this.questNum = 0;
        this.taskNum = 0;
        this.step = 0;
        this.groupQuest = null;
    }

    public Group(User user) {
        group.add(user);
        this.groupName = "None";
        this.questNum = 0;
        this.taskNum = 0;
        this.step = 0;
        this.groupQuest = null;
    }

    public Group(String groupName, ArrayList<User> group, int questNum, int taskNum, int step) {
        this.groupName = groupName;
        this.group = group;
        this.questNum = questNum;
        this.taskNum = taskNum;
        this.step = step;
        this.groupQuest = null;
    }

    public boolean contains(long chatId){
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i).getChatId() == chatId) {
                return true;
            }
        }
        return false;
    }

    public void addQuest(){
        groupQuest = new Quest();
    }

    public void addQuest(long chatId){
        groupQuest = new Quest(chatId);
    }

    public void addUser(User user){
        group.add(0, user);
    }

    public void addUser(long userId){
        group.add(0, new User(userId));
    }

    public void addUser(int index, User user){
        group.add(0, user);
    }

    public void addUser(int index, long chatId){
        group.add(0, new User(chatId));
    }

    public void delUser(int chatId){
        for (int i = 0; i < group.size(); i++){
            if (group.get(i).getChatId() == chatId){
                group.remove(i);
            }
        }
    }

    public void delUser(User user){
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i).equal(user)){
                group.remove(i);
            }
        }
    }

    public int getQuestNum() {
        return questNum;
    }

    public void setQuestNum(int questNum) {
        this.questNum = questNum;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public User at(int index){
        return group.get(index);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public ArrayList<User> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<User> group) {
        this.group = group;
    }

    public Quest getGroupQuest() {
        return groupQuest;
    }

    public void setGroupQuest(Quest groupQuest) {
        this.groupQuest = groupQuest;
    }


    public void remove(long chatId){
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i).getChatId() == chatId){
                group.remove(i);
            }
        }
    }

    public boolean isEmpty(){
        if (group.size() == 0) {
            return true;
        }

        return false;
    }

}

