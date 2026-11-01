package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xmm extends defpackage.xmk {
    public final defpackage.xhf a;
    public final android.os.PersistableBundle b;
    public final defpackage.xhl d;
    private final defpackage.xib f;
    private final long g;
    private final defpackage.xhn h;
    private final defpackage.xmn i;
    private final aoir j;
    private final java.lang.String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public xmm(defpackage.xhf xhfVar, defpackage.xib xibVar, long j, android.os.PersistableBundle persistableBundle, defpackage.xhn xhnVar, defpackage.xhl xhlVar, defpackage.xmn xmnVar) {
        super(persistableBundle);
        aooh.f(xhfVar, "parser");
        aooh.f(xibVar, "nodeRef");
        aooh.f(xmnVar, "failureReason");
        this.a = xhfVar;
        this.f = xibVar;
        this.g = j;
        this.b = persistableBundle;
        this.h = xhnVar;
        this.d = xhlVar;
        this.i = xmnVar;
        this.j = aooc.ag(new defpackage.wsn(this, 20));
        this.k = "Failed";
    }

    @Override // defpackage.xmq
    protected final defpackage.xib a() {
        return this.f;
    }

    @Override // defpackage.xmk, defpackage.xnh
    public final defpackage.xhn b() {
        return this.h;
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
        return new defpackage.xmm(resultDecoder, this.f, this.g, this.b, this.h, this.d, this.i);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.xmm) && defpackage.xhp.j((defpackage.xjz) obj, this)) {
            defpackage.xmm xmmVar = (defpackage.xmm) obj;
            if (defpackage.xff.l(xmmVar.b, this.b) && aooh.n(xmmVar.d, this.d) && xmmVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.Object g() {
        return this.j.a();
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{getNodeComponent(), getNodeName(), java.lang.Long.valueOf(this.g), java.lang.Integer.valueOf(defpackage.xff.m(this.b)), this.d, this.i});
    }

    @Override // defpackage.xmq
    protected final java.lang.String i() {
        return this.k;
    }

    @Override // defpackage.xmk, defpackage.xmq, defpackage.xnh, defpackage.xpa
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = super.toPersistableBundle();
        persistableBundle.putString("com.android.onboarding.task.ERROR", this.d.a());
        persistableBundle.putInt("com.android.onboarding.task.FAILURE_REASON", this.i.h);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        java.lang.String strA = defpackage.xfh.a(this);
        android.os.PersistableBundle persistableBundle = this.b;
        java.lang.String strO = persistableBundle != null ? defpackage.xff.o(persistableBundle) : null;
        defpackage.xmn xmnVar = this.i;
        return "OnboardingTaskState.Failure(" + strA + ", errorMessage=" + this.d + ", failureReason=" + xmnVar + ", result=" + strO + ')';
    }
}
