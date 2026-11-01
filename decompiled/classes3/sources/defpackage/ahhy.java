package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhy implements defpackage.xzq {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public ahhy(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        return this.$cid != 0 ? new defpackage.agpx(this.a, this.b, 1) : new defpackage.ahhz(((defpackage.ahhw) this.a).b(xzuVar));
    }
}
