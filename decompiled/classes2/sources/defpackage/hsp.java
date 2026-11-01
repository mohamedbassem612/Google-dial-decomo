package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class hsp extends urd implements amyq {
    private volatile amxj o;
    private final java.lang.Object p = new java.lang.Object();
    public boolean n = false;

    public hsp() {
        r(new defpackage.hso(this, 0));
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final amxj b() {
        if (this.o == null) {
            synchronized (this.p) {
                if (this.o == null) {
                    this.o = x();
                }
            }
        }
        return this.o;
    }

    public final java.lang.Object B() {
        return b().B();
    }

    public final eoe R() {
        return ajsz.dD(this, super.R());
    }

    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        b().e();
    }

    public void onDestroy() {
        super.onDestroy();
        b().d();
    }

    protected amxj x() {
        throw null;
    }
}
