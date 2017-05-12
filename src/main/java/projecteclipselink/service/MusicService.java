package projecteclipselink.service;

import java.io.Serializable;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import projecteclipselink.entity.Music;
import projecteclipselink.repository.YourJpaRepository;

@Service
@Configuration
public class MusicService extends YourJpaRepository<Music> implements Serializable {

	private static final long serialVersionUID = 1L;

}
