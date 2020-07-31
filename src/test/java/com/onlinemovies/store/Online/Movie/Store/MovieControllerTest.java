package com.onlinemovies.store.Online.Movie.Store;

import com.onlinemovies.store.Online.Movie.Store.controller.MovieController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(MovieController.class)
public class MovieControllerTest {

    @Autowired
    private MovieController controller;

    @Test
    public void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }

}
