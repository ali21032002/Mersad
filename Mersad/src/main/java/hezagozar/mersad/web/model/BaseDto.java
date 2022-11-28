package hezagozar.mersad.web.model;

import lombok.*;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BaseDto {

    @NonNull
    @Builder.Default
    private UUID id = UUID.randomUUID();

    @NonNull
    @Builder.Default
    private Date createDate= new Date();

    @NonNull
    @Builder.Default
    private Date updateDate=new Date();

}
