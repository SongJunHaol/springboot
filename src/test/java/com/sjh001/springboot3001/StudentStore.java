package com.sjh001.springboot3001;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class StudentStore implements Comparable<StudentStore> {
    private String StudentName;
    private String sex;
    private Integer store;
    private String StudentId;

    @Override
    public int compareTo(@NotNull StudentStore o) {
        return this.getStore() - o.getStore();
    }
}
