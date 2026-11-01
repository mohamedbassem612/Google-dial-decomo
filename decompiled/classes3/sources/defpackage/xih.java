package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xih extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final java.lang.Throwable d;
    private final defpackage.xip f;
    private final j$.time.Instant g;

    public xih(defpackage.xhz xhzVar, long j, java.lang.Throwable th, defpackage.xip xipVar, j$.time.Instant instant) {
        aooh.f(xhzVar, "nodeRef");
        aooh.f(instant, "timestamp");
        this.a = xhzVar;
        this.b = j;
        this.d = th;
        this.f = xipVar;
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
        akzx akzxVarM2 = defpackage.xji.a.m();
        akzxVarM2.u();
        defpackage.xji xjiVar = (defpackage.xji) akzxVarM2.b;
        xjiVar.b |= 1;
        xjiVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xji xjiVar2 = (defpackage.xji) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjiVar2.b |= 2;
        xjiVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xji xjiVar3 = (defpackage.xji) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjiVar3.b |= 16;
        xjiVar3.f = nodeComponent;
        long epochMilli = this.g.toEpochMilli();
        akzxVarM2.u();
        defpackage.xji xjiVar4 = (defpackage.xji) akzxVarM2.b;
        xjiVar4.b |= 8;
        xjiVar4.e = epochMilli;
        defpackage.xji xjiVar5 = (defpackage.xji) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjiVar5);
        xjrVar.e = xjiVar5;
        xjrVar.b |= 8;
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
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xih) {
            defpackage.xih xihVar = (defpackage.xih) obj;
            if (aooh.n(this.a, xihVar.a) && this.b == xihVar.b && aooh.n(this.d, xihVar.d) && aooh.n(this.f, xihVar.f) && aooh.n(this.g, xihVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeFailedValidation(nodeRef=" + this.a + ", nodeId=" + this.b + ", exception=" + this.d + ", intent=" + this.f + ", timestamp=" + this.g + ')';
    }
}
