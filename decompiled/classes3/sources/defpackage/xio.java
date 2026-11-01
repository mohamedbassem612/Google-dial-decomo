package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xio extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final defpackage.xip d;
    private final j$.time.Instant f;

    public xio(defpackage.xhz xhzVar, long j, defpackage.xip xipVar, j$.time.Instant instant) {
        aooh.f(xhzVar, "nodeRef");
        aooh.f(instant, "timestamp");
        this.a = xhzVar;
        this.b = j;
        this.d = xipVar;
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
        akzx akzxVarM2 = defpackage.xjp.a.m();
        akzxVarM2.u();
        defpackage.xjp xjpVar = (defpackage.xjp) akzxVarM2.b;
        xjpVar.b |= 1;
        xjpVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjp xjpVar2 = (defpackage.xjp) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjpVar2.b |= 2;
        xjpVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjp xjpVar3 = (defpackage.xjp) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjpVar3.b |= 8;
        xjpVar3.f = nodeComponent;
        long epochMilli = this.f.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjp xjpVar4 = (defpackage.xjp) akzxVarM2.b;
        xjpVar4.b |= 4;
        xjpVar4.e = epochMilli;
        defpackage.xjp xjpVar5 = (defpackage.xjp) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjpVar5);
        xjrVar.d = xjpVar5;
        xjrVar.b |= 4;
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
        if (obj instanceof defpackage.xio) {
            defpackage.xio xioVar = (defpackage.xio) obj;
            if (aooh.n(this.a, xioVar.a) && this.b == xioVar.b && aooh.n(this.d, xioVar.d) && aooh.n(this.f, xioVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeValidating(nodeRef=" + this.a + ", nodeId=" + this.b + ", intent=" + this.d + ", timestamp=" + this.f + ')';
    }
}
