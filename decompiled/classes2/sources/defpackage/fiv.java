package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fiv implements java.lang.Runnable {
    private final defpackage.fiu a;

    public fiv(defpackage.fiu fiuVar) {
        this.a = fiuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [flj, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.fgm fgmVar = (defpackage.fgm) this.a;
        for (defpackage.fgu fguVar : fgmVar.j) {
            fguVar.r(true);
            fguVar.q();
        }
        defpackage.fey feyVar = fgmVar.t;
        ?? r0 = feyVar.b;
        if (r0 != 0) {
            r0.c();
            feyVar.b = null;
        }
        feyVar.c = null;
    }
}
