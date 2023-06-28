package io.quarkus.mailer.deployment;

import io.quarkus.deployment.IsDevelopment;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.devui.spi.page.CardPageBuildItem;
import io.quarkus.devui.spi.page.Page;

public class MailerDevUIProcessor {
    @BuildStep(onlyIf = IsDevelopment.class)
    public CardPageBuildItem emails() {

        CardPageBuildItem pageBuildItem = new CardPageBuildItem();

        pageBuildItem.addPage(Page.webComponentPageBuilder()
                .icon("font-awesome-solid:envelope")
                //                .componentLink("qwc-arc-beans.js")

                .staticLabel(String.valueOf(0)));

        return pageBuildItem;
    }

}
