package daggerok.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
@NoArgsConstructor
@Accessors(chain = true)
@RequiredArgsConstructor(staticName = "of")
public class Profile implements Serializable {
    public static String MODEL_NAME = "profile";
    public static String MODEL_LIST_NAME = "profiles";
    private static final long serialVersionUID = 3834429806715738570L;

    @Id String id;
    @NonNull String name;
}
