package projecteclipselink.service;

import java.io.Serializable;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import projecteclipselink.entity.Author;
import projecteclipselink.repository.YourJpaRepository;

@Service
@Configuration
public class AuthorService extends YourJpaRepository<Author> implements Serializable {

	private static final long serialVersionUID = 1L;

}
