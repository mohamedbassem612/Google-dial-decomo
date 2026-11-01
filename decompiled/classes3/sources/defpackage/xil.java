package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xil extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final long d;
    private final j$.time.Instant f;

    public xil(defpackage.xhz xhzVar, long j, long j2, j$.time.Instant instant) {
        aooh.f(xhzVar, "nodeRef");
        aooh.f(instant, "timestamp");
        this.a = xhzVar;
        this.b = j;
        this.d = j2;
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
        akzx akzxVarM2 = defpackage.xjl.a.m();
        akzxVarM2.u();
        defpackage.xjl xjlVar = (defpackage.xjl) akzxVarM2.b;
        xjlVar.b |= 1;
        xjlVar.c = this.b;
        akzxVarM2.u();
        defpackage.xjl xjlVar2 = (defpackage.xjl) akzxVarM2.b;
        xjlVar2.b |= 2;
        xjlVar2.d = this.d;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjl xjlVar3 = (defpackage.xjl) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjlVar3.b |= 4;
        xjlVar3.e = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjl xjlVar4 = (defpackage.xjl) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjlVar4.b |= 16;
        xjlVar4.g = nodeComponent;
        long epochMilli = this.f.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjl xjlVar5 = (defpackage.xjl) akzxVarM2.b;
        xjlVar5.b |= 8;
        xjlVar5.f = epochMilli;
        defpackage.xjl xjlVar6 = (defpackage.xjl) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjlVar6);
        xjrVar.n = xjlVar6;
        xjrVar.b |= 4096;
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
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xil) {
            defpackage.xil xilVar = (defpackage.xil) obj;
            if (aooh.n(this.a, xilVar.a) && this.b == xilVar.b && this.d == xilVar.d && aooh.n(this.f, xilVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        j$.time.Instant instant = this.f;
        return ((((iHashCode + anty.M(this.b)) * 31) + anty.M(this.d)) * 31) + instant.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeResumedAfterLaunch(nodeRef=" + this.a + ", sourceNodeId=" + this.b + ", nodeId=" + this.d + ", timestamp=" + this.f + ')';
    }
}
