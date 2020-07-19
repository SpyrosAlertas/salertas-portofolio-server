package gr.salertas.portofolioserver.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Service;

@Service
public class GamesServiceImpl implements GamesService {

	@Autowired
	ResourcePatternResolver patternResolver;

	@Override
	public ArrayList<String> getCardNames(int numberOfCards) {

		ArrayList<String> fileNames = new ArrayList<>();

		try {
			Resource[] resources = patternResolver.getResources("classpath:/static/games/match-match/*");
			ThreadLocalRandom.current().ints(0, resources.length - 1).distinct().limit(numberOfCards)
					.forEach(index -> fileNames.add(resources[index].getFilename()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileNames;

	}

}
