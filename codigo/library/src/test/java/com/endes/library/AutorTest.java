package com.endes.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {
    @Test
    void testAuthorCreation() {
        Autor autor = new Autor();
        assertNotNull(autor);
    }
}
