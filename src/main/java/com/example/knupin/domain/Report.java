package com.example.knupin.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Report {
    @Id
    private int pin_id;

    private int report_count;

    private Boolean is_ignored;
}
