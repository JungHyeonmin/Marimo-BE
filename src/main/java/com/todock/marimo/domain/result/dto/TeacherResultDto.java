package com.todock.marimo.domain.result.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherResultDto {

    private Long LessonId; // 수업Id (상세 조회용)

    private String bookTitle; // 책 제목

    private List<String> participantList = new ArrayList<>(); // 참가자 명단

    private String createdAt; // 수업 생성 시간

}
