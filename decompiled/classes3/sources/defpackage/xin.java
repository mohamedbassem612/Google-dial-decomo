package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xin extends defpackage.xir {
    private final defpackage.xhz a;
    private final long b;
    private final long d;
    private final java.lang.Object f;
    private final j$.time.Instant g;

    public xin(defpackage.xhz xhzVar, long j, long j2, java.lang.Object obj, j$.time.Instant instant) {
        aooh.f(xhzVar, "nodeRef");
        aooh.f(instant, "timestamp");
        this.a = xhzVar;
        this.b = j;
        this.d = j2;
        this.f = obj;
        this.g = instant;
        defpackage.xga.d(getNodeName());
    }

    @Override // defpackage.xiq
    protected final defpackage.xhz a() {
        return this.a;
    }

    @Override // defpackage.xiw
    public final defpackage.xjr b() {
        akzx akzxVarM = defpackage.xjr.a.m();
        akzx akzxVarM2 = defpackage.xjo.a.m();
        akzxVarM2.u();
        defpackage.xjo xjoVar = (defpackage.xjo) akzxVarM2.b;
        xjoVar.b |= 1;
        xjoVar.c = this.b;
        akzxVarM2.u();
        defpackage.xjo xjoVar2 = (defpackage.xjo) akzxVarM2.b;
        xjoVar2.b |= 2;
        xjoVar2.d = this.d;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjo xjoVar3 = (defpackage.xjo) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjoVar3.b |= 4;
        xjoVar3.e = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjo xjoVar4 = (defpackage.xjo) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjoVar4.b |= 16;
        xjoVar4.g = nodeComponent;
        long epochMilli = this.g.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjo xjoVar5 = (defpackage.xjo) akzxVarM2.b;
        xjoVar5.b |= 8;
        xjoVar5.f = epochMilli;
        defpackage.xjo xjoVar6 = (defpackage.xjo) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjoVar6);
        xjrVar.k = xjoVar6;
        xjrVar.b |= 512;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.xjr) aladVarP;
    }

    @Override // defpackage.xiq, defpackage.xiz
    public final j$.time.Instant c() {
        return this.g;
    }

    @Override // defpackage.xiq, defpackage.xja, defpackage.xhx
    public final long d() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xin) {
            defpackage.xin xinVar = (defpackage.xin) obj;
            if (aooh.n(this.a, xinVar.a) && this.b == xinVar.b && this.d == xinVar.d && aooh.n(this.f, xinVar.f) && aooh.n(this.g, xinVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Object obj = this.f;
        return ((((((iHashCode + anty.M(this.b)) * 31) + anty.M(this.d)) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeStartExecuteSynchronously(nodeRef=" + this.a + ", sourceNodeId=" + this.b + ", nodeId=" + this.d + ", argument=" + this.f + ", timestamp=" + this.g + ')';
    }
}
