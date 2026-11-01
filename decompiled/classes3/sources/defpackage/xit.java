package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xit implements defpackage.xiw {
    private final long a;
    private final java.lang.String b;
    private final java.lang.String d;
    private final long f;
    private final java.lang.Object g;
    private final j$.time.Instant h;

    public /* synthetic */ xit(java.lang.String str, java.lang.String str2, long j, java.lang.Object obj) {
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(str, "nodeName");
        aooh.f(str2, "nodeComponent");
        aooh.f(instantNow, "timestamp");
        this.a = -1L;
        this.b = str;
        this.d = str2;
        this.f = j;
        this.g = obj;
        this.h = instantNow;
        defpackage.xga.d(str);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // defpackage.xiw
    public final defpackage.xjr b() {
        akzx akzxVarM = defpackage.xjr.a.m();
        akzx akzxVarM2 = defpackage.xjt.a.m();
        akzxVarM2.u();
        defpackage.xjt xjtVar = (defpackage.xjt) akzxVarM2.b;
        xjtVar.b |= 1;
        xjtVar.c = this.f;
        akzxVarM2.u();
        defpackage.xjt xjtVar2 = (defpackage.xjt) akzxVarM2.b;
        java.lang.String str = this.b;
        j$.util.Objects.requireNonNull(str);
        xjtVar2.b |= 2;
        xjtVar2.d = str;
        akzxVarM2.u();
        defpackage.xjt xjtVar3 = (defpackage.xjt) akzxVarM2.b;
        java.lang.String str2 = this.d;
        j$.util.Objects.requireNonNull(str2);
        xjtVar3.b |= 4;
        xjtVar3.e = str2;
        long epochMilli = this.h.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjt xjtVar4 = (defpackage.xjt) akzxVarM2.b;
        xjtVar4.b |= 64;
        xjtVar4.f = epochMilli;
        defpackage.xjt xjtVar5 = (defpackage.xjt) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjtVar5);
        xjrVar.q = xjtVar5;
        xjrVar.b |= 65536;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.xjr) aladVarP;
    }

    @Override // defpackage.xiz
    public final j$.time.Instant c() {
        return this.h;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return e((j$.time.Instant) obj);
    }

    @Override // defpackage.xja, defpackage.xhx
    public final long d() {
        return this.f;
    }

    @Override // defpackage.xiz
    public final /* synthetic */ int e(j$.time.Instant instant) {
        return defpackage.xfh.b(this, instant);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xit) {
            defpackage.xit xitVar = (defpackage.xit) obj;
            long j = xitVar.a;
            if (aooh.n(this.b, xitVar.b) && aooh.n(this.d, xitVar.d) && this.f == xitVar.f && aooh.n(this.g, xitVar.g) && aooh.n(this.h, xitVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xjz
    public final /* synthetic */ defpackage.xjx f() {
        return new defpackage.xjy(this);
    }

    @Override // defpackage.xiw
    public final /* synthetic */ java.lang.String g() {
        return defpackage.xff.b(this);
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.d;
    }

    @Override // defpackage.xja, defpackage.xib
    public final java.lang.String getNodeName() {
        return this.b;
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        int iM = (((anty.M(-1L) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
        java.lang.Object obj = this.g;
        return (((((iM * 31) + anty.M(this.f)) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.h.hashCode();
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfh.a(this);
    }

    public final java.lang.String toString() {
        return "OnboardingTaskStartedEvent(sourceNodeId=-1, nodeName=" + this.b + ", nodeComponent=" + this.d + ", nodeId=" + this.f + ", argument=" + this.g + ", timestamp=" + this.h + ')';
    }
}
