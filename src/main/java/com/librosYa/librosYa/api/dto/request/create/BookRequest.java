package com.librosYa.librosYa.api.dto.request.create;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    @NotBlank(message = "Title must not be null")
    @Size(
        max = 100,
        message = "Title cannot be longer than 100 characteres"
    )
    private String title;

    @NotBlank(message = "Author must not be null")
    @Size(
        max = 100,
        message = "Author cannot be longer than 100 characteres"
    )
    private String author;

    @NotNull(message = "Publication Year must not be null")
    @Min(value = 4, message = "Year must be at least 4 numbers")
    @Max(value = 11, message = "Year cannot be longer than 11 numbers")
    private Integer publicationYear;

    @NotBlank(message = "Genre must not be null")
    @Size(
        max = 50,
        message = "Title cannot be longer than 50 characteres"
    )
    private String genre;

    @NotBlank(message = "isbn must not be null")
    @Size(
        max = 20,
        message = "isbn cannot be longer than 20 characteres"
    )
    private String isbn;
    
}
