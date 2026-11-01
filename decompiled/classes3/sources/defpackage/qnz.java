package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qnz implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ qnz(mgu mguVar, defpackage.zpo zpoVar, defpackage.ovb ovbVar, boolean z, boolean z2, int i) {
        this.$cid = i;
        this.c = mguVar;
        this.d = zpoVar;
        this.e = ovbVar;
        this.a = z;
        this.b = z2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Object obj;
        int i = this.$cid;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                final boolean z2 = this.b;
                final boolean z3 = this.a;
                java.lang.Object obj2 = this.e;
                final defpackage.zpo zpoVar = (defpackage.zpo) this.d;
                final defpackage.ovb ovbVar = (defpackage.ovb) obj2;
                return (j$.util.Optional) ((mgu) this.c).c(new java.util.function.Supplier() { // from class: qqw
                    @Override // java.util.function.Supplier
                    public final java.lang.Object get() {
                        if (zpoVar == defpackage.zpo.d && !ovbVar.b()) {
                            return j$.util.Optional.empty();
                        }
                        if (z3) {
                            return j$.util.Optional.empty();
                        }
                        return z2 ? j$.util.Optional.of(defpackage.pzp.VIDEO_SCREEN) : j$.util.Optional.empty();
                    }
                }).a(mfy.cM).i();
            }
            if (this.a && !this.b && ((defpackage.ptx) this.e).l()) {
                if (!((java.lang.Boolean) aooh.p((j$.util.Optional) this.d, java.lang.Boolean.FALSE)).booleanValue() && !((obd) this.c).g.get()) {
                    return j$.util.Optional.of(obi.b);
                }
            }
            return j$.util.Optional.empty();
        }
        if (!((zpm) this.e).i().isPresent() || this.a) {
            return j$.util.Optional.empty();
        }
        boolean z4 = this.b;
        java.lang.Object obj3 = this.c;
        defpackage.qmu qmuVarA = defpackage.qmy.a();
        qmuVarA.a = defpackage.qmz.BUTTON_SWAP;
        android.content.Context context = (android.content.Context) obj3;
        qmuVarA.d(context.getString(2132020779));
        qmuVarA.c(2131232000);
        qmuVarA.b(context.getString(2132019056));
        defpackage.qmv qmvVarA = defpackage.qmw.a();
        if (z4 || ((obj = this.d) != defpackage.zpo.f && obj != defpackage.zpo.e)) {
            z = false;
        }
        qmvVarA.c(z);
        qmuVarA.b = qmvVarA.a();
        return j$.util.Optional.of(qmuVarA.a());
    }

    public /* synthetic */ qnz(zpm zpmVar, boolean z, android.content.Context context, boolean z2, defpackage.zpo zpoVar, int i) {
        this.$cid = i;
        this.e = zpmVar;
        this.a = z;
        this.c = context;
        this.b = z2;
        this.d = zpoVar;
    }

    public /* synthetic */ qnz(boolean z, boolean z2, defpackage.ptx ptxVar, j$.util.Optional optional, obd obdVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = z2;
        this.e = ptxVar;
        this.d = optional;
        this.c = obdVar;
    }
}
