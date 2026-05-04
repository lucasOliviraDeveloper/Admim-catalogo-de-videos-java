package com.fullcycle.admin.catalogo.domain.category;

public class AgregateRoot <ID extends Identifier> extends Entity <ID> {

    protected AgregateRoot(ID id) {
        super(id);
    }
}
