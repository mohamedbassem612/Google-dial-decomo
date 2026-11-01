package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xik extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final j$.time.Instant d;

    public xik(defpackage.xhz xhzVar, long j, j$.time.Instant instant) {
        aooh.f(xhzVar, "nodeRef");
        aooh.f(instant, "timestamp");
        this.a = xhzVar;
        this.b = j;
        this.d = instant;
        defpackage.xga.d(getNodeName());
    }

    @Override // defpackage.xiq
    protected final defpackage.xhz a() {
        return this.a;
    }

    @Override // defpackage.xiw
    public final defpackage.xjr b() {
        akzx akzxVarM = defpackage.xjr.a.m();
        akzx akzxVarM2 = defpackage.xjm.a.m();
        akzxVarM2.u();
        defpackage.xjm xjmVar = (defpackage.xjm) akzxVarM2.b;
        xjmVar.b |= 1;
        xjmVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjm xjmVar2 = (defpackage.xjm) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjmVar2.b |= 2;
        xjmVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjm xjmVar3 = (defpackage.xjm) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjmVar3.b |= 4;
        xjmVar3.e = nodeComponent;
        long epochMilli = this.d.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjm xjmVar4 = (defpackage.xjm) akzxVarM2.b;
        xjmVar4.b |= 8;
        xjmVar4.f = epochMilli;
        defpackage.xjm xjmVar5 = (defpackage.xjm) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjmVar5);
        xjrVar.o = xjmVar5;
        xjrVar.b |= 8192;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.xjr) aladVarP;
    }

    @Override // defpackage.xiq, defpackage.xiz
    public final j$.time.Instant c() {
        return this.d;
    }

    @Override // defpackage.xiq, defpackage.xja, defpackage.xhx
    public final long d() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xik) {
            defpackage.xik xikVar = (defpackage.xik) obj;
            if (aooh.n(this.a, xikVar.a) && this.b == xikVar.b && aooh.n(this.d, xikVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeResumed(nodeRef=" + this.a + ", nodeId=" + this.b + ", timestamp=" + this.d + ')';
    }
}
