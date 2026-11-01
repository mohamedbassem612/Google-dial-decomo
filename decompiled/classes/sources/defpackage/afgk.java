package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgk {
    public static final java.util.concurrent.TimeUnit a = java.util.concurrent.TimeUnit.MILLISECONDS;
    public final android.content.Context b;
    public final defpackage.ajat c;
    public final java.lang.String d;
    public final android.os.Handler e;
    public final defpackage.ahzi f;
    public final java.util.concurrent.TimeUnit g;
    public final defpackage.aiii h;
    public final java.lang.Object i;

    public afgk(defpackage.afgh afghVar) {
        defpackage.aijg aijgVar = new defpackage.aijg(defpackage.aiju.a);
        j$.util.Objects.requireNonNull(aijgVar);
        this.h = defpackage.ahvr.az(aijgVar);
        this.i = new java.lang.Object();
        this.b = afghVar.a;
        this.c = afghVar.b;
        this.d = afghVar.c;
        this.e = afghVar.d;
        this.f = afghVar.e;
        this.g = afghVar.f;
    }

    public final void a(android.net.Uri uri) {
        defpackage.aift aiftVar = new defpackage.aift(4);
        synchronized (this.i) {
            aiftVar.k(this.h.c(uri));
        }
        defpackage.aify aifyVarG = aiftVar.g();
        int i = ((defpackage.aike) aifyVarG).d;
        for (int i2 = 0; i2 < i; i2++) {
            ((java.lang.Runnable) aifyVarG.get(i2)).run();
        }
    }
}
