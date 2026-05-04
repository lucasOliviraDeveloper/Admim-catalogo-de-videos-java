package com.fullcycle.admin.catalogo.application;

import com.fullcycle.admin.catalogo.domain.category.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {

    @Test
    public void testCreateUseCase() {
        final var useCase = new UseCase<String, Category>() {
            @Override
            public Category execute(String anIn) {
                return Category.newCategory(anIn, "A description", true);
            }
        };

        Assertions.assertNotNull(useCase);
        Assertions.assertNotNull(useCase.execute("A category"));
    }
}
