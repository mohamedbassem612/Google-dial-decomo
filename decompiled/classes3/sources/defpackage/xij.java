package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xij extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final java.lang.Object d;
    private final j$.time.Instant f;

    public xij(defpackage.xhz xhzVar, long j, java.lang.Object obj, j$.time.Instant instant) {
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
        akzx akzxVarM2 = defpackage.xjk.a.m();
        akzxVarM2.u();
        defpackage.xjk xjkVar = (defpackage.xjk) akzxVarM2.b;
        xjkVar.b |= 1;
        xjkVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjk xjkVar2 = (defpackage.xjk) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjkVar2.b |= 2;
        xjkVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjk xjkVar3 = (defpackage.xjk) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjkVar3.b |= 8;
        xjkVar3.f = nodeComponent;
        long epochMilli = this.f.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjk xjkVar4 = (defpackage.xjk) akzxVarM2.b;
        xjkVar4.b |= 4;
        xjkVar4.e = epochMilli;
        defpackage.xjk xjkVar5 = (defpackage.xjk) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjkVar5);
        xjrVar.j = xjkVar5;
        xjrVar.b |= 256;
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
        if (obj instanceof defpackage.xij) {
            defpackage.xij xijVar = (defpackage.xij) obj;
            if (aooh.n(this.a, xijVar.a) && this.b == xijVar.b && aooh.n(this.d, xijVar.d) && aooh.n(this.f, xijVar.f)) {
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
        return "ActivityNodeResultReceived(nodeRef=" + this.a + ", nodeId=" + this.b + ", result=" + this.d + ", timestamp=" + this.f + ')';
    }
}
