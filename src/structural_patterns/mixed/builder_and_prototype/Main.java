package structural_patterns.mixed.builder_and_prototype;

public class Main {
    static void main() {
        Character warrior = new Character.CharacterBuilder()
                    .setName("Şamil Basayev")
                        .setHealth(999)
                            .setArmor(999)
                                .setHarmful(false).build();
        
        Character warriorClone = warrior.clone();

        System.out.println(warriorClone == warrior);
    }
}
