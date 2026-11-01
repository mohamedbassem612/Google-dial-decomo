package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class djr implements android.text.Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, java.lang.String str, android.text.Editable editable, org.xml.sax.XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !aooh.n(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new defpackage.djk(xMLReader.getContentHandler(), editable));
    }
}
