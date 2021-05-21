package prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Shallow copy
        Sheep sheep = new Sheep("tom", 1, "White");
        sheep.friend = new Sheep("jack", 2, "Black");
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();
        System.out.println("sheep2 =" + sheep2 + " sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + " sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + " sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + " sheep5.friend=" + sheep5.friend.hashCode());


        //Deep Copy Sample


        DeepProtoType p = new DeepProtoType();
        p.name = "John";
        p.deepCloneableTarget = new DeepCloneableTarget("Old Cow", "Young Cow");


        //1. Override clone() method
//		DeepProtoType p2 = (DeepProtoType) p.clone();
//		System.out.println("p.name=" + p.name + " p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + " p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());


        //2. Serialize Object to deep copy (Recommended)
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.name + " p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p3.name=" + p.name + " p3.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());

    }
}
