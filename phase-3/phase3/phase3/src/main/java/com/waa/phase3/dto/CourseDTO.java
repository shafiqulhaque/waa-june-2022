package com.waa.phase3.dto;

import com.waa.phase3.entity.Course;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDTO {

    private Integer id;

    private String name;

    private String code;

//    public static CourseDTO toDTO(Course course) {
//        CourseDTO dto = new CourseDTO();
//        dto.setId(course.getId());
//        dto.setName(course.getName());
//        dto.setCode(course.getCode());
//        return dto;
//    }
//
//    public static Course toCourse(CourseDTO dto) {
//        Course course = new Course();
//        course.setId(dto.getId());
//        course.setName(dto.getName());
//        course.setCode(dto.getCode());
//        return course;
//    }
}
