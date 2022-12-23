package model;

import java.util.UUID;

public class Group {
    private UUID ticherId;
    private UUID StudentId;

    public Group() {
    }

    public Group(UUID ticherId, UUID StudentId) {
        this.ticherId = ticherId;
        StudentId = StudentId;
    }

    public UUID getTicherId() {
        return ticherId;
    }

    public void setTicherId(UUID ticherId) {
        this.ticherId = ticherId;
    }

    public UUID getStudentId() {
        return StudentId;
    }

    public void setStudentId(UUID studentId) {
        StudentId = studentId;
    }
}
