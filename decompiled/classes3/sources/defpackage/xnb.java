package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xnb extends defpackage.xnd {
    private final defpackage.xhf b;
    private final defpackage.xer d;
    private final defpackage.xer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnb(defpackage.xhu xhuVar) {
        super(xhuVar, "PendingContractProvider");
        aooh.f(xhuVar, "component");
        this.d = defpackage.xmz.d;
        this.b = defpackage.xna.a;
        this.e = com.android.onboarding.pending.PendingContract$Erased.BA;
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
