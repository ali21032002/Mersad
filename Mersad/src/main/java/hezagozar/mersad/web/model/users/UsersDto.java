package hezagozar.mersad.web.model.users;


import hezagozar.mersad.web.model.BaseDto;
import lombok.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UsersDto extends BaseDto {

    @NonNull
    private String userName;
    @NonNull
    private String password;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;

    @NonNull
    @Builder.Default
    private char active='Y';

    @NonNull
    @Builder.Default
    private char locked='F';

    private Date lastLoginDate;

}
