package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class otw extends urd implements amyq {
    private volatile amxj o;
    private final java.lang.Object p = new java.lang.Object();
    public boolean n = false;

    public otw() {
        r(new mey(this, 9));
    }

    public final java.lang.Object B() {
        return b().B();
    }

    public final eoe R() {
        return ajsz.dD(this, super.R());
    }

    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        b().e();
    }

    protected void onDestroy() {
        super.onDestroy();
        b().d();
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final amxj b() {
        if (this.o == null) {
            synchronized (this.p) {
                if (this.o == null) {
                    this.o = z();
                }
            }
        }
        return this.o;
    }

    protected amxj z() {
        throw null;
    }
}
