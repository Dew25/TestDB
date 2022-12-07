/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Melnikov
 */
@Entity
public class GroupStudents implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(orphanRemoval = true,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Student student;
    @OneToOne(orphanRemoval = true,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private GroupName group;

    public GroupStudents() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public GroupName getGroup() {
        return group;
    }

    public void setGroup(GroupName group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "GroupStudents{" 
                + "id=" + id 
                + ", student=" + student 
                + ", group=" + group 
                + '}';
    }
    
}
