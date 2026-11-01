package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoxd extends defpackage.aozv {
    private final defpackage.aowu d;
    private final boolean e;
    private final defpackage.aorn f;

    public aoxd(defpackage.aowu aowuVar, boolean z, defpackage.aolr aolrVar, int i, int i2) {
        super(aolrVar, i, i2);
        this.d = aowuVar;
        this.e = z;
        this.f = new defpackage.aorn(false, defpackage.aorr.a);
    }

    private final void g() {
        if (this.e) {
            if (defpackage.aorn.a.getAndSet(this.f, 1) == 1) {
                throw new java.lang.IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
        }
    }

    @Override // defpackage.aozv
    public final java.lang.Object b(defpackage.aows aowsVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        java.lang.Object objC = defpackage.aooh.C(new defpackage.apar(aowsVar), this.d, this.e, aolnVar);
        return objC != defpackage.aolu.a ? defpackage.aojh.a : objC;
    }

    @Override // defpackage.aozv
    protected final defpackage.aozv c(defpackage.aolr aolrVar, int i, int i2) {
        return new defpackage.aoxd(this.d, this.e, aolrVar, i, i2);
    }

    @Override // defpackage.aozv
    protected final java.lang.String d() {
        defpackage.aowu aowuVar = this.d;
        java.util.Objects.toString(aowuVar);
        return "channel=".concat(java.lang.String.valueOf(aowuVar));
    }

    @Override // defpackage.aozv
    public final defpackage.aowu e(defpackage.aoss aossVar) {
        g();
        return this.b == -3 ? this.d : super.e(aossVar);
    }

    @Override // defpackage.aozv
    public final defpackage.aoxh f() {
        return new defpackage.aoxd(this.d, this.e);
    }

    @Override // defpackage.aozv, defpackage.aoxh
    public final java.lang.Object fM(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        if (this.b == -3) {
            g();
            java.lang.Object objC = defpackage.aooh.C(aoxiVar, this.d, this.e, aolnVar);
            if (objC == defpackage.aolu.a) {
                return objC;
            }
        } else {
            java.lang.Object objH = defpackage.aozv.h(this, aoxiVar, aolnVar);
            if (objH == defpackage.aolu.a) {
                return objH;
            }
        }
        return defpackage.aojh.a;
    }

    public /* synthetic */ aoxd(defpackage.aowu aowuVar, boolean z) {
        this(aowuVar, z, defpackage.aols.a, -3, 1);
    }
}
