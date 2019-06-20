package iducs.springboot.board.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iducs.springboot.board.entity.QuestionEntity;
import iducs.springboot.board.entity.UserEntity;

@Repository
public interface QuestionRepository 
	extends JpaRepository<QuestionEntity, Long> {		
	List<QuestionEntity> findAll(Sort sort); 
	Page<QuestionEntity> findAllBy(Pageable pageable); 
	
	// Page<QuestionEntity> findAllByCategory(Pageable pageable, String category); 
	Page<QuestionEntity> findAllByTitle(PageRequest pageRequest, String title);
}
