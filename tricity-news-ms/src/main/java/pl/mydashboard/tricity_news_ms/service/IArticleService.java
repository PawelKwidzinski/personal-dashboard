package pl.mydashboard.tricity_news_ms.service;

import pl.mydashboard.tricity_news_ms.model.Article;

import java.time.LocalDate;
import java.util.List;

public interface IArticleService {
    void save();
    List<Article> getAllArticles();
    List<Article> getAllArticlesByDate(LocalDate date);
    List<Article> getAllArticlesByTag(String tag);
}
