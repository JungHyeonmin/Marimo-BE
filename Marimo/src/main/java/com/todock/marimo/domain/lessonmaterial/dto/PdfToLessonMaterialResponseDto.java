package com.todock.marimo.domain.lessonmaterial.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PdfToLessonMaterialResponseDto {

    private List<QuizResponseDto> quizzes;
    private List<OpenQuestionResponseDto> openQuestions;
}
