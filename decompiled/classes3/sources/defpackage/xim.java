package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xim extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final java.lang.Object d;
    private final j$.time.Instant f;

    public xim(defpackage.xhz xhzVar, long j, java.lang.Object obj, j$.time.Instant instant) {
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
        akzx akzxVarM2 = defpackage.xjn.a.m();
        akzxVarM2.u();
        defpackage.xjn xjnVar = (defpackage.xjn) akzxVarM2.b;
        xjnVar.b |= 1;
        xjnVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjn xjnVar2 = (defpackage.xjn) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjnVar2.b |= 2;
        xjnVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjn xjnVar3 = (defpackage.xjn) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjnVar3.b |= 8;
        xjnVar3.f = nodeComponent;
        long epochMilli = this.f.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjn xjnVar4 = (defpackage.xjn) akzxVarM2.b;
        xjnVar4.b |= 4;
        xjnVar4.e = epochMilli;
        defpackage.xjn xjnVar5 = (defpackage.xjn) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjnVar5);
        xjrVar.h = xjnVar5;
        xjrVar.b |= 64;
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
        if (obj instanceof defpackage.xim) {
            defpackage.xim ximVar = (defpackage.xim) obj;
            if (aooh.n(this.a, ximVar.a) && this.b == ximVar.b && aooh.n(this.d, ximVar.d) && aooh.n(this.f, ximVar.f)) {
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
        return "ActivityNodeSetResult(nodeRef=" + this.a + ", nodeId=" + this.b + ", result=" + this.d + ", timestamp=" + this.f + ')';
    }
}
