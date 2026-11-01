package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgh extends defpackage.flr {
    public final defpackage.fgu a;
    public final java.util.concurrent.atomic.AtomicBoolean b;
    private final defpackage.flg c;

    public fgh(defpackage.fgu fguVar) {
        super(fguVar);
        this.a = fguVar;
        this.c = new defpackage.flg();
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    private final defpackage.fmk g() {
        return this.b.get() ? this.c : this.a;
    }

    @Override // defpackage.flr, defpackage.fmk
    public final int a(defpackage.epz epzVar, int i, boolean z) {
        return g().a(epzVar, i, z);
    }

    @Override // defpackage.flr, defpackage.fmk
    public final void b(defpackage.etx etxVar, int i) {
        g().b(etxVar, i);
    }

    @Override // defpackage.flr, defpackage.fmk
    public final void c(defpackage.etx etxVar, int i, int i2) {
        g().c(etxVar, i, i2);
    }

    @Override // defpackage.flr, defpackage.fmk
    public final void d(long j, int i, int i2, int i3, defpackage.fmj fmjVar) {
        g().d(j, i, i2, i3, fmjVar);
    }

    final boolean e() {
        return !this.b.get();
    }

    @Override // defpackage.flr, defpackage.fmk
    public final int f(defpackage.epz epzVar, int i, boolean z) {
        return g().f(epzVar, i, z);
    }
}
