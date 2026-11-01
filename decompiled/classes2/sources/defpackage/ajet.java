package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajet {
    public final java.util.List a = new java.util.ArrayList();
    public ajel b;
    public final java.util.Map c;
    public boolean d;

    public ajet() {
        this.b = defpackage.ajiq.b.ad() ? null : b();
        this.c = new java.util.HashMap();
        this.d = false;
    }

    private static ajel b() {
        try {
            return defpackage.ajfj.b;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public final void a() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.ajer) it.next()).a = false;
        }
    }
}
