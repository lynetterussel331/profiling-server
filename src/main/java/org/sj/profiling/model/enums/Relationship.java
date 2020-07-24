package org.sj.profiling.model.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Relationship {

    SPOUSE("Spouse"),
    FATHER("Father"),
    MOTHER("Mother"),
    CHILD("Child"),
    BROTHER("Brother"),
    SISTER("Sister"),
    GUARDIAN("Guardian"),
    OTHER("Other");

    private String label;

    private Relationship(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public List<String> getList() {
        return new ArrayList<>(
            Arrays.asList( SPOUSE.getLabel(), FATHER.getLabel(), MOTHER.getLabel(), CHILD.getLabel(),
                BROTHER.getLabel(), SISTER.getLabel(), GUARDIAN.getLabel(), OTHER.getLabel() )
        );
    }

}
