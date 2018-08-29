package blogSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import blogSystem.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
