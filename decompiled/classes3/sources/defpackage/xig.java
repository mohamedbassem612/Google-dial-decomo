package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xig extends defpackage.xiq {
    private final long a;
    private final java.lang.String b;
    private final j$.time.Instant d;
    private final defpackage.xhz f;

    public /* synthetic */ xig(long j, java.lang.String str) {
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(instantNow, "timestamp");
        this.a = j;
        this.b = str;
        this.d = instantNow;
        this.f = defpackage.xhy.g(defpackage.xhy.j("UnknownComponent(nodeId=" + j + ')'), "Unknown(id=" + j + ')');
        defpackage.xga.d(getNodeName());
    }

    @Override // defpackage.xiq
    protected final defpackage.xhz a() {
        return this.f;
    }

    @Override // defpackage.xiw
    public final defpackage.xjr b() {
        akzx akzxVarM = defpackage.xjr.a.m();
        akzx akzxVarM2 = defpackage.xjh.a.m();
        akzxVarM2.u();
        defpackage.xjh xjhVar = (defpackage.xjh) akzxVarM2.b;
        xjhVar.b |= 1;
        xjhVar.c = this.a;
        akzxVarM2.u();
        defpackage.xjh xjhVar2 = (defpackage.xjh) akzxVarM2.b;
        java.lang.String str = this.b;
        if (str == null) {
            str = "";
        }
        j$.util.Objects.requireNonNull(str);
        xjhVar2.b |= 2;
        xjhVar2.d = str;
        long epochMilli = this.d.toEpochMilli();
        akzxVarM2.u();
        defpackage.xjh xjhVar3 = (defpackage.xjh) akzxVarM2.b;
        xjhVar3.b |= 4;
        xjhVar3.e = epochMilli;
        defpackage.xjh xjhVar4 = (defpackage.xjh) akzxVarM2.p();
        akzxVarM.u();
        defpackage.xjr xjrVar = (defpackage.xjr) akzxVarM.b;
        j$.util.Objects.requireNonNull(xjhVar4);
        xjrVar.i = xjhVar4;
        xjrVar.b |= 128;
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
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xig) {
            defpackage.xig xigVar = (defpackage.xig) obj;
            if (this.a == xigVar.a && aooh.n(this.b, xigVar.b) && aooh.n(this.d, xigVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        return (((anty.M(this.a) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityNodeFail(nodeId=" + this.a + ", reason=" + this.b + ", timestamp=" + this.d + ')';
    }
}
