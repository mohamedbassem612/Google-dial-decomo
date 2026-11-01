package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ram implements pya {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ram(defpackage.rap rapVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(rapVar);
        this.a = rapVar;
    }

    public final void a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((obd) obj).c.b(mce.bs);
        } else {
            ((defpackage.rap) obj).g.b(mce.bo);
        }
    }

    public final void c() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((obd) obj).c.b(mce.bq);
        } else {
            ((defpackage.rap) obj).g.b(mce.bm);
        }
    }

    public ram(obd obdVar, int i) {
        this.$cid = i;
        this.a = obdVar;
    }

    public final /* synthetic */ void b() {
    }

    public final /* synthetic */ void d() {
    }
}
