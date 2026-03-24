package structural_patterns.mixed.builder_and_prototype;

public class Character implements Cloneable {
    private String name;
    private int health;
    private int armor;
    private boolean harmful;

    public Character(CharacterBuilder characterBuilder) {
        this.name = characterBuilder.name;
        this.health = characterBuilder.health;
        this.armor = characterBuilder.armor;
        this.harmful = characterBuilder.harmful;
    }

    @Override
    public Character clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Character) clone;
    }

    public static class CharacterBuilder {
        private String name;
        private int health;
        private int armor;
        private boolean harmful;

        public CharacterBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public CharacterBuilder setHarmful(boolean harmful) {
            this.harmful = harmful;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
