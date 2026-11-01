package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkt extends defpackage.xnd {
    private final defpackage.xhf b;
    private final defpackage.xhf d;
    private final defpackage.xhy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkt(defpackage.xhu xhuVar) {
        super(xhuVar, "ContractMetadataProvider");
        aooh.f(xhuVar, "component");
        this.e = defpackage.xhy.e;
        this.b = new defpackage.xks(defpackage.xpk.a, 0);
        this.d = new defpackage.xks(new defpackage.xpi(defpackage.xib.c, defpackage.xkr.b), 1);
    }

    @Override // defpackage.xhh
    public final /* synthetic */ defpackage.xhf a() {
        return this.e;
    }

    @Override // defpackage.xhi
    public final defpackage.xhf getResultDecoder() {
        return this.d;
    }

    @Override // defpackage.xhj
    public final defpackage.xhf getResultEncoder() {
        return this.b;
    }
}
