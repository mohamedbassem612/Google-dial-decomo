package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class np extends defpackage.of {
    public aonn a;
    public aowi b;
    private final aoss e;
    private aoub f;
    private boolean g;

    public np(aoss aossVar, defpackage.nx nxVar) {
        super(nxVar);
        this.e = aossVar;
        this.a = new defpackage.bbf((aoln) null, 1, (byte[]) null);
    }

    private final void g() {
        this.b = aooh.H(-2, 1, (aonj) null, 4);
        this.f = aoov.an(this.e, (aolr) null, 0, new defpackage.hqi(this, (aoln) null, 1), 3);
    }

    @Override // defpackage.of
    public final void a() {
        if (this.b != null && !this.g) {
            b();
        }
        if (this.b == null) {
            this.g = false;
            g();
        }
        aowi aowiVar = this.b;
        if (aowiVar != null) {
            aowiVar.e((java.lang.Throwable) null);
        }
        this.g = false;
    }

    @Override // defpackage.of
    public final void b() {
        aowi aowiVar = this.b;
        if (aowiVar != null) {
            aowiVar.s(new java.util.concurrent.CancellationException("onBack cancelled"));
        }
        aoub aoubVar = this.f;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.b = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.of
    public final void c(defpackage.mk mkVar) {
        aowi aowiVar = this.b;
        if (aowiVar != null) {
            aowiVar.b(mkVar);
        }
    }

    @Override // defpackage.of
    public final void d(boolean z) {
        aoub aoubVar;
        if (!z && super.f() && (aoubVar = this.f) != null && !aoubVar.t()) {
            b();
        }
        super.d(z);
    }

    @Override // defpackage.of
    public final void e() {
        b();
        if (f()) {
            this.g = true;
            g();
        }
    }
}
