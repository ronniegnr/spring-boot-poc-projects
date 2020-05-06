package bd.com.ronnie.springbootmarkdowneditorpoc.utility;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class MarkdownUtility {

    /**
     * Converts a Mardown content to HTML content
     * @param markdownContent
     * @return
     */
    public static String markdownToHTML(String markdownContent) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdownContent);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(document);
    }

}
