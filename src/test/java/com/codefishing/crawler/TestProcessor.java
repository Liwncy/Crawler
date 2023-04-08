/**
 * FileName: TestProcessor
 * Author:   90934
 * Date:     2020/3/2 18:25
 * Description: 重写PageProcessor方法
 */

package com.codefishing.crawler;

import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @description 重写PageProcessor方法
 */
@Component
public class TestProcessor implements PageProcessor {
    @Override
    public void process(Page page) {

    }

    @Override
    public Site getSite() {
        return null;
    }
}
