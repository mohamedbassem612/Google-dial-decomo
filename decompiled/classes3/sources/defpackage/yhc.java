package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class yhc extends defpackage.yid implements defpackage.yib {
    public java.util.List a = new java.util.ArrayList();
    public java.lang.Boolean b;
    public android.graphics.Matrix c;
    public java.lang.String d;
    public int e;

    protected yhc() {
    }

    @Override // defpackage.yib
    public final void b(defpackage.yif yifVar) throws org.xml.sax.SAXException {
        if (!(yifVar instanceof defpackage.yhv)) {
            throw new org.xml.sax.SAXException(a.bJ(yifVar, "Gradient elements cannot contain ", " elements."));
        }
        this.a.add(yifVar);
    }

    @Override // defpackage.yib
    public final java.util.List n() {
        return this.a;
    }
}
