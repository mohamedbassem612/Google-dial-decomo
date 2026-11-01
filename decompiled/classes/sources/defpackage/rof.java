package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class rof extends defpackage.uxz implements defpackage.amyq {
    private volatile defpackage.amxj p;
    private final java.lang.Object q = new java.lang.Object();
    public boolean n = false;

    public rof() {
        r(new defpackage.cz(this, 3));
    }

    @Override // defpackage.amyp
    public final java.lang.Object B() {
        return b().B();
    }

    @Override // defpackage.mp, defpackage.emn
    public final defpackage.eoe R() {
        return defpackage.ajsz.dD(this, super.R());
    }

    @Override // defpackage.uxz, defpackage.urd, defpackage.az, defpackage.mp, defpackage.cm, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        b().e();
    }

    @Override // defpackage.uxz, defpackage.da, defpackage.az, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        b().d();
    }

    @Override // defpackage.amyq
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final defpackage.amxj b() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = z();
                }
            }
        }
        return this.p;
    }

    protected defpackage.amxj z() {
        throw null;
    }
}
