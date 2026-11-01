package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aael extends defpackage.aaee {
    public final acc e;
    private final aaet g;

    public aael(defpackage.aaez aaezVar, aaet aaetVar) {
        super(aaezVar, aabx.a);
        this.e = new acc(0);
        this.g = aaetVar;
        this.f.b(this);
    }

    @Override // defpackage.aaee
    protected final void e(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.g.d(connectionResult, i);
    }

    @Override // defpackage.aaee
    protected final void f() {
        this.g.e();
    }

    @Override // defpackage.aaey
    public final void h() {
        k();
    }

    @Override // defpackage.aaey
    public final void i() {
        this.a = true;
        k();
    }

    @Override // defpackage.aaey
    public final void j() {
        this.a = false;
        java.lang.Object obj = aaet.c;
        aaet aaetVar = this.g;
        synchronized (obj) {
            if (aaetVar.m == this) {
                aaetVar.m = null;
                aaetVar.n.clear();
            }
        }
    }

    public final void k() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.f(this);
    }
}
