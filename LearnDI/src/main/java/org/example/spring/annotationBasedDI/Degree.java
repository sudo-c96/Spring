package org.example.spring.annotationBasedDI;

import org.springframework.stereotype.Component;

@Component
public class Degree {

    private String degreeName = "Bachelor of Technology";
    private String branch = "CSE";

    public String getDegree() {
        return this.degreeName + " in " + this.branch;
    }
}
