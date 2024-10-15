package com.yaazhtech.tradeAnalysis.pactise;

import java.util.Objects;

public class Branch {

    String name;
    String branchcode;

    public String toString()
    {
        return name + " " +  branchcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(name, branch.name) && Objects.equals(branchcode, branch.branchcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, branchcode);
    }
}
