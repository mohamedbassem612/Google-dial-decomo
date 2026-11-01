package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xiu extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final java.lang.Object d;
    private final j$.time.Instant f;

    public xiu(defpackage.xhz xhzVar, long j, java.lang.Object obj, j$.time.Instant instant) {
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
        akzx akzxVarM2 = defpackage.xjv.a.m();
        akzxVarM2.u();
        defpackage.xjv xjvVar = (defpackage.xjv) akzxVarM2.b;
        xjvVar.b |= 1;
        xjvVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjv xjvVar2 = (defpackage.xjv) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjvVar2.b |= 2;
        xjvVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjv xjvVar3 = (defpackage.xjv) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjvVar3.b |= 4;
        xjvVar3.e = nodeComponent;
        long epochMilli = this.f.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjv xjvVar4 = (defpackage.xjv) akzxVarM2.b;
        xjvVar4.b |= 8;
        xjvVar4.f = epochMilli;
        defpackage.xjv xjvVar5 = (defpackage.xjv) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjvVar5);
        xjrVar.p = xjvVar5;
        xjrVar.b |= 16384;
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
        if (obj instanceof defpackage.xiu) {
            defpackage.xiu xiuVar = (defpackage.xiu) obj;
            if (aooh.n(this.a, xiuVar.a) && this.b == xiuVar.b && aooh.n(this.d, xiuVar.d) && aooh.n(this.f, xiuVar.f)) {
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
        return "PendingContractPreparedForActivity(nodeRef=" + this.a + ", nodeId=" + this.b + ", argument=" + this.d + ", timestamp=" + this.f + ')';
    }
}
