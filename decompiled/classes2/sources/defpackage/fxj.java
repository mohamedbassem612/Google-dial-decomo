package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fxj extends fya {
    public final ceg a;
    public final cei b;
    private final defpackage.fwz g;
    private defpackage.fvs h;
    private final ccp i;

    public fxj(defpackage.fwz fwzVar) {
        super(new defpackage.fxh((defpackage.fvs) ajsz.bJ((java.util.List) fwzVar.d().c())), true);
        this.g = fwzVar;
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(2);
    }

    private final void i() {
        defpackage.fwz fwzVar = this.g;
        java.util.List list = (java.util.List) fwzVar.d().c();
        if (list.size() >= 2) {
            defpackage.fvs fvsVar = (defpackage.fvs) ajsz.bI(list);
            defpackage.fvs fvsVar2 = (defpackage.fvs) list.get(ajsz.aZ(list) - 1);
            fwzVar.i(fvsVar);
            fwzVar.i(fvsVar2);
            this.h = fvsVar;
        }
    }

    private final void j() {
        k(false);
        l(0.0f);
        m(2);
        this.h = null;
    }

    private final void k(boolean z) {
        this.i.b(java.lang.Boolean.valueOf(z));
    }

    private final void l(float f) {
        this.a.h(f);
    }

    private final void m(int i) {
        this.b.h(i);
    }

    protected final void a() {
        j();
    }

    protected final void b() {
        if (!e()) {
            i();
        }
        defpackage.fvs fvsVar = this.h;
        if (fvsVar != null) {
            this.g.g(fvsVar, false);
        }
        j();
    }

    protected final void c(defpackage.fxx fxxVar) {
        k(true);
        l(fxxVar.b);
        m(fxxVar.a);
    }

    protected final void d(defpackage.fxx fxxVar) {
        i();
        k(true);
        l(fxxVar.b);
        m(fxxVar.a);
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.i.a()).booleanValue();
    }
}
