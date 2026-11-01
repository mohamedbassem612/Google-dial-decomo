package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xln extends defpackage.xnd {
    private final defpackage.xhf b;
    private final defpackage.xer d;
    private final defpackage.xer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xln(defpackage.xhu xhuVar) {
        super(xhuVar, "DiagnosisProviderContract");
        aooh.f(xhuVar, "component");
        this.d = defpackage.xll.b;
        this.b = defpackage.xna.b;
        this.e = defpackage.xlm.a;
    }

    @Override // defpackage.xhh
    public final /* synthetic */ defpackage.xhf a() {
        return this.d;
    }

    @Override // defpackage.xhi
    public final /* synthetic */ defpackage.xhf getResultDecoder() {
        return this.e;
    }

    @Override // defpackage.xhj
    public final defpackage.xhf getResultEncoder() {
        return this.b;
    }
}
