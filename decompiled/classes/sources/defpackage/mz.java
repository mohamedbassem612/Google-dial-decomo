package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mz extends defpackage.fya {
    public boolean a;
    private final defpackage.na b;

    public mz(defpackage.na naVar, defpackage.dzl dzlVar) {
        super(dzlVar, naVar.b);
        this.b = naVar;
        this.a = true;
    }

    @Override // defpackage.fya
    protected final void a() {
        this.b.a();
    }

    @Override // defpackage.fya
    protected final void b() {
        this.b.b();
    }

    @Override // defpackage.fya
    protected final void c(fxx fxxVar) {
        this.b.c(new mk(fxxVar));
    }

    @Override // defpackage.fya
    protected final void d(fxx fxxVar) {
        this.b.d();
    }

    public final void e(boolean z) {
        this.a = z;
        boolean z2 = false;
        if (z && this.b.b) {
            z2 = true;
        }
        g(z2);
    }
}
