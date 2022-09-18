package mybatis.pol;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Portfolio {

    @Id
    private Long id;
    private String name;
    private String title;
    private String contents;
    private String file;

}
