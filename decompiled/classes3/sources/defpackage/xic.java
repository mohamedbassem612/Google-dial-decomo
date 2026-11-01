package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xic extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final java.lang.Object d;
    private final j$.time.Instant f;

    public xic(defpackage.xhz xhzVar, long j, java.lang.Object obj, j$.time.Instant instant) {
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
        akzx akzxVarM2 = defpackage.xjd.a.m();
        akzxVarM2.u();
        defpackage.xjd xjdVar = (defpackage.xjd) akzxVarM2.b;
        xjdVar.b |= 1;
        xjdVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjd xjdVar2 = (defpackage.xjd) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjdVar2.b |= 2;
        xjdVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjd xjdVar3 = (defpackage.xjd) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjdVar3.b |= 8;
        xjdVar3.f = nodeComponent;
        long epochMilli = this.f.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjd xjdVar4 = (defpackage.xjd) akzxVarM2.b;
        xjdVar4.b |= 4;
        xjdVar4.e = epochMilli;
        defpackage.xjd xjdVar5 = (defpackage.xjd) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjdVar5);
        xjrVar.g = xjdVar5;
        xjrVar.b |= 32;
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
        if (obj instanceof defpackage.xic) {
            defpackage.xic xicVar = (defpackage.xic) obj;
            if (aooh.n(this.a, xicVar.a) && this.b == xicVar.b && aooh.n(this.d, xicVar.d) && aooh.n(this.f, xicVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Object obj = this.d;
        return ((((iHashCode + anty.M(this.b)) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeArgumentExtracted(nodeRef=" + this.a + ", nodeId=" + this.b + ", argument=" + this.d + ", timestamp=" + this.f + ')';
    }
}
