package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class mex extends defpackage.urd implements defpackage.amyq {
    private volatile defpackage.amxj n;
    private final java.lang.Object o = new java.lang.Object();
    public boolean q = false;

    public mex() {
        r(new mey(this, 1));
    }

    @Override // defpackage.amyp
    public final java.lang.Object B() {
        return b().B();
    }

    @Override // defpackage.mp, defpackage.emn
    public final defpackage.eoe R() {
        return defpackage.ajsz.dD(this, super.R());
    }

    @Override // defpackage.urd, defpackage.az, defpackage.mp, defpackage.cm, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        b().e();
    }

    @Override // defpackage.da, defpackage.az, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        b().d();
    }

    protected defpackage.amxj x() {
        throw null;
    }

    @Override // defpackage.amyq
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final defpackage.amxj b() {
        if (this.n == null) {
            synchronized (this.o) {
                if (this.n == null) {
                    this.n = x();
                }
            }
        }
        return this.n;
    }
}
