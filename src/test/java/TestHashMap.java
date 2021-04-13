import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;


public class TestHashMap {

    private HashMap hash = new HashMap();

    @Test
    void testGet(){

        hash.put(1, "One");
        hash.put(2, "Two");
        hash.put(3, "Three");
        hash.put(4, "Four");
        assertThat(hash.get(1)).withFailMessage("get вернул неверное значение").isEqualTo("One");
        assertThat(hash.get(2)).withFailMessage("get вернул неверное значение").isEqualTo("Two");
        assertThat(hash.get(3)).withFailMessage("get вернул неверное значение").isEqualTo("Three");
        assertThat(hash.get(4)).withFailMessage("get вернул неверное значение").isEqualTo("Four");

    }

    @Test
    void testSameKey(){
        hash.put(1, "Один");
        hash.put(2, "Два");
        hash.put(3, "Три");
        hash.put(4, "Четыре");
        assertThat(hash.get(1)).withFailMessage("ключ не поменял свое значение").isEqualTo("Один");
        assertThat(hash.get(2)).withFailMessage("ключ не поменял свое значение").isEqualTo("Два");
        assertThat(hash.get(3)).withFailMessage("ключ не поменял свое значение").isEqualTo("Три");
        assertThat(hash.get(4)).withFailMessage("ключ не поменял свое значение").isEqualTo("Четыре");

    }

    @Test
    void testClear(){
        hash.clear();
        assertThat(hash.isEmpty()).withFailMessage("clear не очистил коллекцию").isTrue();
    }

    @Test
    void testNull(){
        hash.put(null, "NULL");
        assertThat(hash.get(null)).withFailMessage("проблема с ключем null").isEqualTo("NULL");
    }
}
