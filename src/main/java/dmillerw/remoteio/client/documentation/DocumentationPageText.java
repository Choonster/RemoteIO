package dmillerw.remoteio.client.documentation;

import dmillerw.remoteio.client.gui.GuiDocumentation;
import dmillerw.remoteio.client.helper.TextFormatter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;

import java.util.LinkedList;
import java.util.List;

/**
 * @author dmillerw
 */
public class DocumentationPageText implements IDocumentationPage {

    private String unlocalizedPrefix;

    private LinkedList<TextFormatter.FormattedString>[] localizedText;

    public DocumentationPageText(String unlocalizedPrefix) {
        this.unlocalizedPrefix = unlocalizedPrefix;
        String text = StatCollector.translateToLocal(unlocalizedPrefix);
        List<String> trimmedText = Minecraft.getMinecraft().fontRenderer.listFormattedStringToWidth(text, GuiDocumentation.XSIZE - GuiDocumentation.XPADDING);
        localizedText = new LinkedList[trimmedText.size()];
        for (int i=0; i<localizedText.length; i++) {
            localizedText[i] = TextFormatter.format(trimmedText.get(i));
        }
    }

    @Override
    public void renderScreen(GuiScreen guiScreen, int mouseX, int mouseY) {

    }

    @Override
    public void updateScreen(GuiScreen guiScreen) {

    }
}
