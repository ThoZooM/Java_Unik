public class Revizor {
    public String closeStore(String name) {
        //null полю name класса Store если до этого оно имело значение «IKEA» (если нет, то оставить как было).
        if (name.equals("IKEA")){
            name = null;
        }
        return name;
    }

    public String rebrand(String name) {
        //на «Вкусно и точка», если до этого оно имело значение «MacDonalds»; если
        // же поле имело любое другое значение, то необходимо убрать только первый символ названия.
        if (name.equals("MacDonalds")){
            name = "Вкусно и точка";
        }else{
            name = name.substring(1);
        }
        return name;
    }
}
