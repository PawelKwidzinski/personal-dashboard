package pl.mydashboard.tricity_news_ms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.mydashboard.tricity_news_ms.model.Article;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {

    Optional<Article> findByUrl(String url);
    List<Article> findAllByDate(LocalDate date);
    List<Article> findAllByTag(String tag);
}
