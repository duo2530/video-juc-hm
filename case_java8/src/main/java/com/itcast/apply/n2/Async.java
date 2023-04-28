package com.itcast.apply.n2;

import com.itcast.apply.Constants;
import com.itcast.apply.n2.util.FileReader;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liujie
 * @date 2023-04-28 14:27
 **/
@Slf4j(topic = "c.Async")
public class Async {

    public static void main(String[] args) {
        new Thread(() -> FileReader.read(Constants.MP4_FULL_PATH)).start();
        log.debug("do other things ...");
    }

}
