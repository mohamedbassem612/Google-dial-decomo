package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xii extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final j$.time.Instant d;

    public xii(defpackage.xhz xhzVar, long j, j$.time.Instant instant) {
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
        akzx akzxVarM2 = defpackage.xjj.a.m();
        akzxVarM2.u();
        defpackage.xjj xjjVar = (defpackage.xjj) akzxVarM2.b;
        xjjVar.b |= 1;
        xjjVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjj xjjVar2 = (defpackage.xjj) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjjVar2.b |= 2;
        xjjVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjj xjjVar3 = (defpackage.xjj) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjjVar3.b |= 8;
        xjjVar3.f = nodeComponent;
        long epochMilli = this.d.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjj xjjVar4 = (defpackage.xjj) akzxVarM2.b;
        xjjVar4.b |= 4;
        xjjVar4.e = epochMilli;
        defpackage.xjj xjjVar5 = (defpackage.xjj) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjjVar5);
        xjrVar.m = xjjVar5;
        xjrVar.b |= 2048;
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
        if (obj instanceof defpackage.xii) {
            defpackage.xii xiiVar = (defpackage.xii) obj;
            if (aooh.n(this.a, xiiVar.a) && this.b == xiiVar.b && aooh.n(this.d, xiiVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeFinished(nodeRef=" + this.a + ", nodeId=" + this.b + ", timestamp=" + this.d + ')';
    }
}
