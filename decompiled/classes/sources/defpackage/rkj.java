package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class rkj extends defpackage.az implements defpackage.amyq {
    private volatile defpackage.amxj o;
    private final java.lang.Object p = new java.lang.Object();
    public boolean n = false;

    public rkj() {
        r(new rkk(this, 1));
    }

    @Override // defpackage.amyp
    public final java.lang.Object B() {
        return b().B();
    }

    @Override // defpackage.mp, defpackage.emn
    public final defpackage.eoe R() {
        return defpackage.ajsz.dD(this, super.R());
    }

    @Override // defpackage.amyq
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final defpackage.amxj b() {
        if (this.o == null) {
            synchronized (this.p) {
                if (this.o == null) {
                    this.o = j();
                }
            }
        }
        return this.o;
    }

    protected defpackage.amxj j() {
        throw null;
    }

    @Override // defpackage.az, defpackage.mp, defpackage.cm, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        b().e();
    }

    @Override // defpackage.az, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b().d();
    }
}
