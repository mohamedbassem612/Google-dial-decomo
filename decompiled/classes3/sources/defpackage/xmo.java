package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xmo extends defpackage.xmq {
    private final defpackage.xib a;
    private final long b;
    private final java.lang.String d;

    public xmo(defpackage.xhf xhfVar, defpackage.xib xibVar, long j) {
        aooh.f(xhfVar, "parser");
        this.a = xibVar;
        this.b = j;
        this.d = "InProgress";
    }

    @Override // defpackage.xmq
    protected final defpackage.xib a() {
        return this.a;
    }

    @Override // defpackage.xnh
    public final /* bridge */ /* synthetic */ defpackage.xhn b() {
        return null;
    }

    @Override // defpackage.xhx
    public final long d() {
        return this.b;
    }

    @Override // defpackage.xnh
    public final /* bridge */ /* synthetic */ defpackage.xmq e(defpackage.xhi xhiVar) {
        aooh.f(xhiVar, "parser");
        defpackage.xhf resultDecoder = xhiVar.getResultDecoder();
        aooh.f(resultDecoder, "parser");
        return new defpackage.xmo(resultDecoder, this.a, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.xmo) && defpackage.xhp.j((defpackage.xjz) obj, this);
    }

    @Override // defpackage.xnh
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{getNodeComponent(), getNodeName(), java.lang.Long.valueOf(this.b)});
    }

    @Override // defpackage.xmq
    protected final java.lang.String i() {
        return this.d;
    }

    public final java.lang.String toString() {
        return "OnboardingTaskState.InProgress(".concat(defpackage.xfh.a(this));
    }

    public xmo(defpackage.xmx xmxVar) {
        this(xmxVar.getResultDecoder(), xmxVar, xmxVar.a);
    }
}
