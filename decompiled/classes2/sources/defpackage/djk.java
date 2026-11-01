package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class djk implements org.xml.sax.ContentHandler {
    private final org.xml.sax.ContentHandler a;
    private final android.text.Editable b;
    private int c;
    private defpackage.djo d;

    public djk(org.xml.sax.ContentHandler contentHandler, android.text.Editable editable) {
        this.a = contentHandler;
        this.b = editable;
    }

    private final void a() {
        defpackage.djo djoVar = this.d;
        if (djoVar != null) {
            android.text.Editable editable = this.b;
            editable.setSpan(djoVar, djoVar.c, editable.length(), 33);
        }
        this.d = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) throws org.xml.sax.SAXException {
        this.a.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws org.xml.sax.SAXException {
        this.a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(java.lang.String str, java.lang.String str2, java.lang.String str3) throws org.xml.sax.SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        a();
                        this.c--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    a();
                    return;
                }
            } else if (str2.equals("annotation")) {
                android.text.Editable editable = this.b;
                java.lang.Object[] spans = editable.getSpans(0, editable.length(), defpackage.djl.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : spans) {
                    if (editable.getSpanFlags((defpackage.djl) obj) == 17) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    defpackage.djl djlVar = (defpackage.djl) arrayList.get(i);
                    int spanStart = editable.getSpanStart(djlVar);
                    int length = editable.length();
                    editable.removeSpan(djlVar);
                    if (spanStart != length) {
                        editable.setSpan(djlVar, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.a.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(java.lang.String str) throws org.xml.sax.SAXException {
        this.a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i, int i2) throws org.xml.sax.SAXException {
        this.a.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(java.lang.String str, java.lang.String str2) throws org.xml.sax.SAXException {
        this.a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(org.xml.sax.Locator locator) {
        this.a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(java.lang.String str) throws org.xml.sax.SAXException {
        this.a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws org.xml.sax.SAXException {
        this.a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(java.lang.String str, java.lang.String str2, java.lang.String str3, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        a();
                        this.c++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    a();
                    this.d = new defpackage.djo(defpackage.djn.b, this.c, this.b.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i = 0; i < length; i++) {
                        java.lang.String localName = attributes.getLocalName(i);
                        if (localName == null) {
                            localName = "";
                        }
                        java.lang.String value = attributes.getValue(i);
                        java.lang.String str4 = value != null ? value : "";
                        if (localName.length() > 0 && str4.length() > 0) {
                            android.text.Editable editable = this.b;
                            int length2 = editable.length();
                            editable.setSpan(new defpackage.djl(localName, str4), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.a.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(java.lang.String str, java.lang.String str2) throws org.xml.sax.SAXException {
        this.a.startPrefixMapping(str, str2);
    }
}
