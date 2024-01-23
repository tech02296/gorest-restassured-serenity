package com.gorest.crudoperation;

import com.gorest.utils.TestUtils;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PostCrud {
    String id = TestUtils.getRandomValue();
    String user_id = TestUtils.getRandomValue();
    String title = "Mehul" + TestUtils.getRandomValue();
    String body = "abc";
    static int postId;
}
