package com.kazmazschool.kasmazschool.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity(name = "TableSchool")
@Data
public class Contact extends BaseEntity {
    
    @Id
    @Column(nullable= false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contactId;

    /*
    * @NotNull: Checks if a given field is not null but allows empty values & zero elements inside collections.
      @NotEmpty: Checks if a given field is not null and its size/length is greater than zero.
      @NotBlank: Checks if a given field is not null and trimmed length is greater than zero.
    * */
    @Column(nullable=false)
    @NotBlank(message="Name must not be blank")
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @Column(nullable=false,unique=true)
    @NotBlank(message="Mobile number must not be blank")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNum;

    @Column(nullable=false,unique=true)
    @NotBlank(message="Email must not be blank")
    @Email(message = "Please provide a valid email address" )
    private String email;

  @Column(nullable=false)
    @NotBlank(message="Subject must not be blank")
    @Size(min=5, message="Subject must be at least 5 characters long")
    private String subject;

    @Column(nullable=false)
    @NotBlank(message="Message must not be blank")
    @Size(min=10, message="Message must be at least 10 characters long")
    private String message;

    @Column(nullable=false)
    @NotBlank(message="pin  must not be blank")
    @Size(min=4,max=6)
    private Integer pin;

    @Column(nullable=false)
    private String status;
}
