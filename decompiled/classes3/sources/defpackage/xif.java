package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xif extends defpackage.xiq {
    private final defpackage.xhz a;
    private final long b;
    private final defpackage.xip d;
    private final j$.time.Instant f;

    public xif(defpackage.xhz xhzVar, long j, defpackage.xip xipVar, j$.time.Instant instant) {
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
        akzx akzxVarM2 = defpackage.xjg.a.m();
        akzxVarM2.u();
        defpackage.xjg xjgVar = (defpackage.xjg) akzxVarM2.b;
        xjgVar.b |= 1;
        xjgVar.c = this.b;
        java.lang.String nodeName = getNodeName();
        akzxVarM2.u();
        defpackage.xjg xjgVar2 = (defpackage.xjg) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeName);
        xjgVar2.b |= 2;
        xjgVar2.d = nodeName;
        java.lang.String nodeComponent = getNodeComponent();
        akzxVarM2.u();
        defpackage.xjg xjgVar3 = (defpackage.xjg) akzxVarM2.b;
        j$.util.Objects.requireNonNull(nodeComponent);
        xjgVar3.b |= 16;
        xjgVar3.g = nodeComponent;
        akzx akzxVarM3 = defpackage.xjq.a.m();
        akzxVarM3.u();
        defpackage.xjq xjqVar = (defpackage.xjq) akzxVarM3.b;
        java.lang.String str = this.d.a;
        if (str == null) {
            str = "";
        }
        j$.util.Objects.requireNonNull(str);
        xjqVar.b |= 1;
        xjqVar.c = str;
        defpackage.xjq xjqVar2 = (defpackage.xjq) akzxVarM3.p();
        akzxVarM2.u();
        defpackage.xjg xjgVar4 = (defpackage.xjg) akzxVarM2.b;
        j$.util.Objects.requireNonNull(xjqVar2);
        xjgVar4.e = xjqVar2;
        xjgVar4.b |= 4;
        long epochMilli = this.f.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjg xjgVar5 = (defpackage.xjg) akzxVarM2.b;
        xjgVar5.b |= 8;
        xjgVar5.f = epochMilli;
        defpackage.xjg xjgVar6 = (defpackage.xjg) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjgVar6);
        xjrVar.f = xjgVar6;
        xjrVar.b |= 16;
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
        if (obj instanceof defpackage.xif) {
            defpackage.xif xifVar = (defpackage.xif) obj;
            if (aooh.n(this.a, xifVar.a) && this.b == xifVar.b && aooh.n(this.d, xifVar.d) && aooh.n(this.f, xifVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeExtractArgument(nodeRef=" + this.a + ", nodeId=" + this.b + ", intent=" + this.d + ", timestamp=" + this.f + ')';
    }
}
