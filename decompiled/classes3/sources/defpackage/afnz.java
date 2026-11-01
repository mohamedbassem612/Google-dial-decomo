package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class afnz extends da implements amyq {
    private volatile amxj n;
    private final java.lang.Object o = new java.lang.Object();
    public boolean s = false;

    public afnz() {
        r(new defpackage.vwa(this, 5));
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

    protected final void onDestroy() {
        super.onDestroy();
        b().d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final amxj b() {
        if (this.n == null) {
            synchronized (this.o) {
                if (this.n == null) {
                    this.n = new amxj(this, new amxo(this), new amyc(this, this), new amxy(this, new amwv(this, (ahgd) null, (aw) null)));
                }
            }
        }
        return this.n;
    }
}
