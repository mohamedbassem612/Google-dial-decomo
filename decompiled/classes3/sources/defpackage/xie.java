package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xie extends defpackage.xir {
    private final defpackage.xhz a;
    private final long b;
    private final java.lang.Object d;
    private final j$.time.Instant f;

    public xie(defpackage.xhz xhzVar, long j, java.lang.Object obj, j$.time.Instant instant) {
        aooh.f(xhzVar, "nodeRef");
        aooh.f(instant, "timestamp");
        this.a = xhzVar;
        this.b = j;
        this.d = obj;
        this.f = instant;
        defpackage.xga.d(getNodeName());
    }

    @Override // defpackage.xiq
    protected final defpackage.xhz a() {
        return this.a;
    }

    @Override // defpackage.xiw
    public final defpackage.xjr b() {
        akzx akzxVarM = defpackage.xjr.a.m();
        akzx akzxVarM2 = defpackage.xjf.a.m();
        akzxVarM2.u();
        defpackage.xjf xjfVar = (defpackage.xjf) akzxVarM2.b;
        xjfVar.b |= 2;
        xjfVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjf xjfVar2 = (defpackage.xjf) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjfVar2.b |= 4;
        xjfVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjf xjfVar3 = (defpackage.xjf) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjfVar3.b |= 16;
        xjfVar3.f = nodeComponent;
        long epochMilli = this.f.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjf xjfVar4 = (defpackage.xjf) akzxVarM2.b;
        xjfVar4.b |= 8;
        xjfVar4.e = epochMilli;
        defpackage.xjf xjfVar5 = (defpackage.xjf) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjfVar5);
        xjrVar.l = xjfVar5;
        xjrVar.b |= 1024;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.xjr) aladVarP;
    }

    @Override // defpackage.xiq, defpackage.xiz
    public final j$.time.Instant c() {
        return this.f;
    }

    @Override // defpackage.xiq, defpackage.xja, defpackage.xhx
    public final long d() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xie) {
            defpackage.xie xieVar = (defpackage.xie) obj;
            if (aooh.n(this.a, xieVar.a) && this.b == xieVar.b && aooh.n(this.d, xieVar.d) && aooh.n(this.f, xieVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeExecutedSynchronously(nodeRef=" + this.a + ", nodeId=" + this.b + ", result=" + this.d + ", timestamp=" + this.f + ')';
    }
}
