package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class yiq extends defpackage.yhz {
    protected yiq() {
    }

    @Override // defpackage.yhz, defpackage.yib
    public final void b(defpackage.yif yifVar) throws org.xml.sax.SAXException {
        if (!(yifVar instanceof defpackage.yip)) {
            throw new org.xml.sax.SAXException(a.bJ(yifVar, "Text content elements cannot contain ", " elements."));
        }
        this.i.add(yifVar);
    }
}
