package com.example.sml.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private Integer pkey;
    private String name;
    private String description;
    private Integer order_id;
    private Integer coline_id;
    private Integer is_display_only;
    private String display_name;
    private String type_name;
    private String created_by;
    private LocalDateTime date_created;
    private String modified_by;
    private LocalDateTime date_modified;

}
