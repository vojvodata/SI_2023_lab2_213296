package org.example;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    User userNull = null;
    User dion = new User("Dion", "softver123!", "dion@gmail.com");
    User dionish = new User("dionish", "soft pas123", "dionminevcom");
    User nulti = new User(null, "softversko123!", "dion,gmail,com");
    User dioni6 = new User("dioni6", "softpass123", "dionm@gmail.com");
    User []allUsers = {new User("dion", null, "dion@gmail.com"), new User("dion1", null, null), new User(null, null, "dion2@gmail.com")};
    User noPass = new User("Dionis", null,"dmail@gmail.com");
    User noMail = new User("trajcho", "trajcho123!",null);

    @Test
    void everyBranch() {
        assertThrows(RuntimeException.class, ()-> SILab2.function(userNull, null));
        assertTrue(() -> SILab2.function(dion, new ArrayList<>()));
        assertFalse(() -> SILab2.function(dionish, new ArrayList<>()));
        assertFalse(() -> SILab2.function(nulti, List.of(allUsers)));
        assertFalse(() -> SILab2.function(dioni6, List.of(allUsers)));
    }
    @Test
    void multipleCondition() {
        assertThrows(RuntimeException.class, ()->SILab2.function(userNull, new ArrayList<>()));
        assertThrows(RuntimeException.class, ()->SILab2.function(noPass, new ArrayList<>()));
        assertThrows(RuntimeException.class, ()->SILab2.function(noMail, new ArrayList<>()));
        assertFalse(()->SILab2.function(new User("Dionish", "Dionish!123", "dionish@gmail.com"), new ArrayList<>()));
    }
}