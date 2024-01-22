package com.arieljtyson.languagetranslator;

import org.junit.jupiter.api.Test;
import com.arieljtyson.languagetranslator.SayHello;
import java.io.IOException;

public class SayHelloTest {
  @Test
  public void testSayHello() throws IOException {
    SayHello.main(new String[] { "en" });
  }
}
