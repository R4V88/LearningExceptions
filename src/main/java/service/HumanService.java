package service;

import exception.HumanLastnameWrongFormat;
import exception.HumanNameWrongFormat;
import exception.HumanNotFoundException;
import model.Human;

import java.util.ArrayList;
import java.util.List;

public class HumanService {
    List<Human> humanList = new ArrayList<>();

    public int getNextHuman(){
        return humanList.size();
    }

    public void getHumans() throws HumanNameWrongFormat, HumanLastnameWrongFormat {
        addHuman("Marco", "Polo");
        for (Human human : humanList){
            System.out.println(human.toString());
        }
    }

    public void addHuman(String name, String lastname) throws HumanNameWrongFormat, HumanLastnameWrongFormat {
        Human human = new Human(getNextHuman() , HumanValidator.isNameLongerThan3(name), HumanValidator.isLastnameLongerThan5(lastname));
        humanList.add(human);
    }

    public void addHumans() {

        humanList.add(new Human(1, "Himan", "Himan"));
        humanList.add(new Human(2, "Batman", "Batman"));
        humanList.add(new Human(3, "Superman", "Superman"));
        humanList.add(new Human(4, "Ironman", "Ironman"));
        humanList.add(new Human(5, "Hitman", "Hitman"));


    }

    public Human getHumanByLastName(String lastname) throws HumanNotFoundException {
        List<Human> humans = humanList;
        Human person;
        for (Human human : humans) {
            if (human.getLastname().equals(lastname)) {
                person = human;
                return person;
            }
        }
        throw new HumanNotFoundException("Lastname: " + lastname + " not found!");
    }

    public Human getHumanById(int id) throws HumanNotFoundException {
        List<Human> humans = humanList;
        Human person;
        for (Human human : humans) {
            if (human.getId() == id) {
                person = human;
                return person;
            }
        }
        throw new HumanNotFoundException("Id: " + id + " not found!");
    }
}
