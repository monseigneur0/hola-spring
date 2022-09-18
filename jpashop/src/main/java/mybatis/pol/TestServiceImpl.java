package mybatis.pol;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

    private final TestMapper testMapper;
    @Override
    public List<Portfolio> getAllDataList() {
        return testMapper.getAllDataList();
    }


}
