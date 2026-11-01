package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xmp extends defpackage.xmk {
    public final defpackage.xhf a;
    public final android.os.PersistableBundle b;
    public final defpackage.xhn d;
    private final defpackage.xib f;
    private final long g;
    private final aoir h;
    private final java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public xmp(defpackage.xhf xhfVar, defpackage.xib xibVar, long j, android.os.PersistableBundle persistableBundle, defpackage.xhn xhnVar) {
        super(persistableBundle);
        aooh.f(xhfVar, "parser");
        aooh.f(xibVar, "nodeRef");
        aooh.f(persistableBundle, "resultBundle");
        this.a = xhfVar;
        this.f = xibVar;
        this.g = j;
        this.b = persistableBundle;
        this.d = xhnVar;
        this.h = aooc.ag(new defpackage.xmr(this, 1));
        this.i = "Success";
    }

    @Override // defpackage.xmq
    protected final defpackage.xib a() {
        return this.f;
    }

    @Override // defpackage.xmk, defpackage.xnh
    public final defpackage.xhn b() {
        return this.d;
    }

    @Override // defpackage.xhx
    public final long d() {
        return this.g;
    }

    @Override // defpackage.xmk, defpackage.xnh
    public final /* bridge */ /* synthetic */ defpackage.xmq e(defpackage.xhi xhiVar) {
        aooh.f(xhiVar, "parser");
        defpackage.xhf resultDecoder = xhiVar.getResultDecoder();
        aooh.f(resultDecoder, "parser");
        return new defpackage.xmp(resultDecoder, this.f, this.g, this.b, this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.xmp) && defpackage.xhp.j((defpackage.xjz) obj, this) && defpackage.xff.l(((defpackage.xmp) obj).b, this.b);
    }

    public final java.lang.Object g() {
        return this.h.a();
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{getNodeComponent(), getNodeName(), java.lang.Long.valueOf(this.g), java.lang.Integer.valueOf(defpackage.xff.m(this.b))});
    }

    @Override // defpackage.xmq
    protected final java.lang.String i() {
        return this.i;
    }

    public final java.lang.String toString() {
        return "OnboardingTaskState.Success(" + defpackage.xfh.a(this) + ", result=" + defpackage.xff.o(this.b) + ", lastMetadata=" + this.d + ')';
    }
}
