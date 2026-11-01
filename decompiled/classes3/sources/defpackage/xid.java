package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xid extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final long d;
    private final java.lang.Object f;
    private final j$.time.Instant g;

    public xid(defpackage.xhz xhzVar, long j, long j2, java.lang.Object obj, j$.time.Instant instant) {
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
        akzx akzxVarM2 = defpackage.xje.a.m();
        akzxVarM2.u();
        defpackage.xje xjeVar = (defpackage.xje) akzxVarM2.b;
        xjeVar.b |= 1;
        xjeVar.c = this.b;
        akzxVarM2.u();
        defpackage.xje xjeVar2 = (defpackage.xje) akzxVarM2.b;
        xjeVar2.b |= 2;
        xjeVar2.d = this.d;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xje xjeVar3 = (defpackage.xje) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjeVar3.b |= 4;
        xjeVar3.e = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xje xjeVar4 = (defpackage.xje) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjeVar4.b |= 16;
        xjeVar4.g = nodeComponent;
        long epochMilli = this.g.toEpochMilli();
        akzxVarM2.u();
        defpackage.xje xjeVar5 = (defpackage.xje) akzxVarM2.b;
        xjeVar5.b |= 8;
        xjeVar5.f = epochMilli;
        defpackage.xje xjeVar6 = (defpackage.xje) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjeVar6);
        xjrVar.c = xjeVar6;
        xjrVar.b |= 2;
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
        if (obj instanceof defpackage.xid) {
            defpackage.xid xidVar = (defpackage.xid) obj;
            if (aooh.n(this.a, xidVar.a) && this.b == xidVar.b && this.d == xidVar.d && aooh.n(this.f, xidVar.f) && aooh.n(this.g, xidVar.g)) {
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
        return "ActivityNodeExecutedForResult(nodeRef=" + this.a + ", sourceNodeId=" + this.b + ", nodeId=" + this.d + ", argument=" + this.f + ", timestamp=" + this.g + ')';
    }
}
