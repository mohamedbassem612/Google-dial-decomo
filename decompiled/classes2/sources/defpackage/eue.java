package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eue {
    final /* synthetic */ defpackage.iay a;
    private int b;
    private boolean c;
    private long d;

    public eue(defpackage.iay iayVar) {
        j$.util.Objects.requireNonNull(iayVar);
        this.a = iayVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [etk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [etk, java.lang.Object] */
    public final void a() {
        defpackage.iay iayVar = this.a;
        ?? r1 = iayVar.e;
        int iL = r1.l();
        if (!r1.x() || r1.k() == 1 || r1.k() == 4 || iL == 0 || iL == 1) {
            if (this.c) {
                iayVar.g.b(4);
            }
            this.c = false;
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.c && this.b == iL) {
            if (jElapsedRealtime - this.d >= 600000) {
                ((defpackage.exy) iayVar.f).a(new defpackage.euf(4, 600000));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iL;
        ?? r8 = iayVar.g;
        r8.b(4);
        r8.g(4, 600000);
    }
}
