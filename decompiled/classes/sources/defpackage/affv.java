package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class affv implements defpackage.affu {
    @Override // defpackage.affu
    public final long a(android.net.Uri uri) {
        return q().a(p(uri));
    }

    @Override // defpackage.affu
    public final defpackage.afew b() {
        return ((defpackage.afel) q()).a;
    }

    @Override // defpackage.affu
    public /* synthetic */ java.io.File c(android.net.Uri uri) {
        throw null;
    }

    @Override // defpackage.affu
    public java.io.InputStream d(android.net.Uri uri) {
        throw null;
    }

    @Override // defpackage.affu
    public final java.io.OutputStream e(android.net.Uri uri) {
        return q().e(p(uri));
    }

    @Override // defpackage.affu
    public final java.io.OutputStream f(android.net.Uri uri) {
        return q().f(p(uri));
    }

    @Override // defpackage.affu
    public final java.lang.Iterable g(android.net.Uri uri) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = q().g(p(uri)).iterator();
        while (it.hasNext()) {
            arrayList.add(o((android.net.Uri) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.affu
    public final void i(android.net.Uri uri) {
        q().i(p(uri));
    }

    @Override // defpackage.affu
    public final void j(android.net.Uri uri) {
        q().j(p(uri));
    }

    @Override // defpackage.affu
    public final void k(android.net.Uri uri) {
        q().k(p(uri));
    }

    @Override // defpackage.affu
    public final void l(android.net.Uri uri, android.net.Uri uri2) {
        q().l(p(uri), p(uri2));
    }

    @Override // defpackage.affu
    public boolean m(android.net.Uri uri) {
        throw null;
    }

    @Override // defpackage.affu
    public final boolean n(android.net.Uri uri) {
        return q().n(p(uri));
    }

    protected android.net.Uri o(android.net.Uri uri) {
        throw null;
    }

    protected android.net.Uri p(android.net.Uri uri) {
        throw null;
    }

    protected abstract defpackage.affu q();
}
