package com.kosasih.enemax;

import com.kosasih.enemax.EnemaxApp;
import com.kosasih.enemax.config.AsyncSyncConfiguration;
import com.kosasih.enemax.config.EmbeddedElasticsearch;
import com.kosasih.enemax.config.EmbeddedKafka;
import com.kosasih.enemax.config.EmbeddedSQL;
import com.kosasih.enemax.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { EnemaxApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
