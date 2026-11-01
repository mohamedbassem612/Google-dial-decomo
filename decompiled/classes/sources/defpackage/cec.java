package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cec extends defpackage.cee {
    public java.lang.Object a;
    public java.lang.Object b;
    public defpackage.aowv c;
    public defpackage.ady d;
    public defpackage.ady e;
    private final defpackage.aonj g = new defpackage.bjp(this, 9);
    private final defpackage.apnt h = defpackage.cfd.V(new defpackage.bae(this, 5));

    private final void f() {
        this.b = null;
        this.e = null;
    }

    @Override // defpackage.cee
    public final defpackage.aonj a(defpackage.aowv aowvVar) {
        defpackage.aowv aowvVar2 = this.c;
        if (aowvVar2 != null && !defpackage.aooh.n(aowvVar2, aowvVar)) {
            defpackage.cdh.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.c = aowvVar;
        return this.g;
    }

    @Override // defpackage.cee
    public final void b(defpackage.aowv aowvVar) {
        f();
    }

    @Override // defpackage.cee
    public final void c() {
        synchronized (this.f) {
            this.a = this.b;
            if (this.e == null) {
                this.d = null;
            } else {
                defpackage.ady adyVar = this.d;
                if (adyVar == null) {
                    defpackage.ady adyVar2 = defpackage.adz.a;
                    adyVar = new defpackage.ady(6);
                    this.d = adyVar;
                }
                this.d = this.e;
                this.e = adyVar;
            }
        }
    }

    @Override // defpackage.cee
    public final void d() {
        this.h.u();
        f();
        synchronized (this.f) {
            this.c = null;
            this.a = null;
            this.d = null;
        }
    }

    @Override // defpackage.cee
    public final void e(defpackage.aowv aowvVar) {
        this.c = null;
        f();
        c();
    }
}
