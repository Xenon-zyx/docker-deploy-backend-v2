package camt.se234.deployment.service;

import camt.se234.deployment.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        // 💡 我们把新版本的 A/B/C 分数边界调高，作为新旧版本的区分
        if (score > 89.5) { 
            return "A";
        }
        else if (score > 79.5){
            return "B";
        }else if (score > 69.5){
            return "C";
        }else if (score > 49.5) {
            return "D";
        } else
            return "F";
    }
}