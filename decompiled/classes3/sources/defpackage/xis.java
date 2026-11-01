package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xis implements defpackage.xiw {
    private final java.lang.String a;
    private final java.lang.String b;
    private final long d;
    private final defpackage.xou f;
    private final java.util.List g;
    private final j$.time.Instant h;

    public /* synthetic */ xis(java.lang.String str, java.lang.String str2, long j, defpackage.xou xouVar) {
        aokc aokcVar = aokc.a;
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(str, "nodeName");
        aooh.f(str2, "nodeComponent");
        aooh.f(xouVar, "result");
        aooh.f(instantNow, "timestamp");
        this.a = str;
        this.b = str2;
        this.d = j;
        this.f = xouVar;
        this.g = aokcVar;
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
        akzx akzxVarM2 = defpackage.xjs.a.m();
        akzxVarM2.u();
        defpackage.xjs xjsVar = (defpackage.xjs) akzxVarM2.b;
        xjsVar.b |= 1;
        xjsVar.c = this.d;
        akzxVarM2.u();
        defpackage.xjs xjsVar2 = (defpackage.xjs) akzxVarM2.b;
        java.lang.String str = this.a;
        j$.util.Objects.requireNonNull(str);
        xjsVar2.b |= 2;
        xjsVar2.d = str;
        akzxVarM2.u();
        defpackage.xjs xjsVar3 = (defpackage.xjs) akzxVarM2.b;
        java.lang.String str2 = this.b;
        j$.util.Objects.requireNonNull(str2);
        xjsVar3.b |= 4;
        xjsVar3.e = str2;
        akzxVarM2.u();
        defpackage.xjs xjsVar4 = (defpackage.xjs) akzxVarM2.b;
        xjsVar4.b |= 32;
        xjsVar4.f = this.f instanceof defpackage.xot;
        long epochMilli = this.h.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjs xjsVar5 = (defpackage.xjs) akzxVarM2.b;
        xjsVar5.b |= 64;
        xjsVar5.g = epochMilli;
        defpackage.xjs xjsVar6 = (defpackage.xjs) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjsVar6);
        xjrVar.r = xjsVar6;
        xjrVar.b |= 131072;
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
        return this.d;
    }

    @Override // defpackage.xiz
    public final /* synthetic */ int e(j$.time.Instant instant) {
        return defpackage.xfh.b(this, instant);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xis) {
            defpackage.xis xisVar = (defpackage.xis) obj;
            if (aooh.n(this.a, xisVar.a) && aooh.n(this.b, xisVar.b) && this.d == xisVar.d && aooh.n(this.f, xisVar.f) && aooh.n(this.g, xisVar.g) && aooh.n(this.h, xisVar.h)) {
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
        return this.b;
    }

    @Override // defpackage.xja, defpackage.xib
    public final java.lang.String getNodeName() {
        return this.a;
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
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.M(this.d)) * 31) + this.f.hashCode()) * 31) + 1) * 31) + this.h.hashCode();
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfh.a(this);
    }

    public final java.lang.String toString() {
        return "OnboardingTaskCompleteEvent(nodeName=" + this.a + ", nodeComponent=" + this.b + ", nodeId=" + this.d + ", result=" + this.f + ", metadata=" + this.g + ", timestamp=" + this.h + ')';
    }
}
