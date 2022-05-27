package com.jsy.scoremanager.service;


import com.jsy.scoremanager.domain.Score;
import com.jsy.scoremanager.domain.ScoreStats;
import com.jsy.scoremanager.util.PageBean;

import java.util.List;
import java.util.Map;

public interface ScoreService {
    PageBean<Score> queryPage(Map<String, Object> paramMap);

    boolean isScore(Score score);

    int addScore(Score score);

    int editScore(Score score);

    int deleteScore(Integer id);

    List<Score> getAll(Score score);

    ScoreStats getAvgStats(Integer courseid);
}
