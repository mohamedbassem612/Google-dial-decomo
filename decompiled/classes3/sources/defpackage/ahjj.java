package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ahjj extends az implements amyq {
    private volatile amxj o;
    private final java.lang.Object p = new java.lang.Object();
    public boolean n = false;

    public ahjj() {
        r(new defpackage.vwa(this, 10));
    }

    public final java.lang.Object B() {
        return b().B();
    }

    public final eoe R() {
        return ajsz.dD(this, super.R());
    }

    protected amxj i() {
        throw null;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final amxj b() {
        if (this.o == null) {
            synchronized (this.p) {
                if (this.o == null) {
                    this.o = i();
                }
            }
        }
        return this.o;
    }

    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        b().e();
    }

    protected void onDestroy() {
        super.onDestroy();
        b().d();
    }
}
