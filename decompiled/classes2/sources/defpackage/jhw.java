package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jhw {
    public final java.lang.Object a;

    public jhw(aoin aoinVar) {
        aooh.f(aoinVar, "enableBeeslyOnWearFollowUp");
        this.a = aoinVar;
    }

    public final void A(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        kgu kguVar = akzxVar.b;
        kgu kguVar2 = kgu.a;
        j$.util.Objects.requireNonNull(str);
        kguVar.b |= 64;
        kguVar.j = str;
    }

    public final /* synthetic */ defpackage.jxb B() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.jxb) aladVarP;
    }

    public final void C(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jxb jxbVar = (defpackage.jxb) akzxVar.b;
        alal alalVar = defpackage.jxb.a;
        jxbVar.d = i - 1;
        jxbVar.c |= 1;
    }

    public final void D(ajcq ajcqVar) {
        ((agsm) this.a).g(ajcqVar, 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final /* synthetic */ defpackage.jrz E() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.jrz) aladVarP;
    }

    public final void F(defpackage.hkd hkdVar) {
        aooh.f(hkdVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jrz jrzVar = (defpackage.jrz) akzxVar.b;
        defpackage.jrz jrzVar2 = defpackage.jrz.a;
        j$.util.Objects.requireNonNull(hkdVar);
        jrzVar.c = hkdVar;
        jrzVar.b |= 1;
    }

    public final void G(defpackage.kiw kiwVar) {
        aooh.f(kiwVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jrz jrzVar = (defpackage.jrz) akzxVar.b;
        defpackage.jrz jrzVar2 = defpackage.jrz.a;
        j$.util.Objects.requireNonNull(kiwVar);
        jrzVar.d = kiwVar;
        jrzVar.b |= 2;
    }

    public final void H(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jrz jrzVar = (defpackage.jrz) akzxVar.b;
        defpackage.jrz jrzVar2 = defpackage.jrz.a;
        j$.util.Objects.requireNonNull(str);
        jrzVar.b |= 64;
        jrzVar.i = str;
    }

    public final void I(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jrz jrzVar = (defpackage.jrz) akzxVar.b;
        defpackage.jrz jrzVar2 = defpackage.jrz.a;
        j$.util.Objects.requireNonNull(str);
        jrzVar.b |= 128;
        jrzVar.j = str;
    }

    public final void J(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jrz jrzVar = (defpackage.jrz) akzxVar.b;
        defpackage.jrz jrzVar2 = defpackage.jrz.a;
        jrzVar.f = i - 1;
        jrzVar.b |= 8;
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [aoin, java.lang.Object] */
    public final zki a(defpackage.jhv jhvVar) {
        aooh.f(jhvVar, "beeslyPhoneEvent");
        int i = 7;
        int i2 = 2;
        if (jhvVar.b == 1) {
            int iIntValue = ((java.lang.Integer) jhvVar.c).intValue();
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    i2 = 3;
                } else if (iIntValue == 3) {
                    i2 = 5;
                } else if (iIntValue == 4) {
                    i2 = 6;
                } else if (iIntValue != 5) {
                    i2 = iIntValue != 6 ? 0 : 8;
                } else {
                    i2 = 7;
                }
            }
            if (i2 == 0) {
                i2 = 1;
            }
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            i = 3;
        } else if (i3 == 3) {
            i = 4;
        } else if (i3 == 4) {
            i = 5;
        } else if (i3 == 5) {
            i = 6;
        } else if (i3 != 6 || !((java.lang.Boolean) this.a.a()).booleanValue()) {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        zoe zoeVarCo = aehj.co(zki.a.m());
        zoeVarCo.k();
        zoe zoeVarCn = aehj.cn(zkh.a.m());
        akzx akzxVarM = zkt.a.m();
        aooh.f(akzxVarM, "builder");
        akzx akzxVarM2 = zks.a.m();
        aooh.f(akzxVarM2, "builder");
        akzxVarM2.u();
        zks zksVar = akzxVarM2.b;
        zksVar.c = a.S(i);
        zksVar.b |= 1;
        zks zksVarP = akzxVarM2.p();
        aooh.e(zksVarP, "build(...)");
        zks zksVar2 = zksVarP;
        aooh.f(zksVar2, "value");
        akzxVarM.u();
        zkt zktVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(zksVar2);
        zktVar.c = zksVar2;
        zktVar.b |= 1;
        zkt zktVarP = akzxVarM.p();
        aooh.e(zktVarP, "build(...)");
        zkt zktVar2 = zktVarP;
        aooh.f(zktVar2, "value");
        akzx akzxVar = (akzx) zoeVarCn.a;
        akzxVar.u();
        zkh zkhVar = akzxVar.b;
        j$.util.Objects.requireNonNull(zktVar2);
        zkhVar.c = zktVar2;
        zkhVar.b = 6;
        zoeVarCo.j(zoeVarCn.h());
        return zoeVarCo.i();
    }

    public final /* synthetic */ defpackage.jjx b() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.jjx) aladVarP;
    }

    public final void c(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jjx jjxVar = (defpackage.jjx) akzxVar.b;
        defpackage.jjx jjxVar2 = defpackage.jjx.a;
        jjxVar.b |= 128;
        jjxVar.j = z;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final aoyq d(long j) {
        java.lang.Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent((java.util.concurrent.ConcurrentMap) this.a, java.lang.Long.valueOf(j), new defpackage.jil(new defpackage.jak(6), 0));
        aooh.e(objComputeIfAbsent, "computeIfAbsent(...)");
        return (aoyq) objComputeIfAbsent;
    }

    public final void e(long j) {
        ((j$.util.concurrent.ConcurrentHashMap) this.a).remove(java.lang.Long.valueOf(j));
    }

    public final /* synthetic */ defpackage.iqa f() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.iqa) aladVarP;
    }

    public final /* synthetic */ defpackage.ihq g() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ihq) aladVarP;
    }

    public final void h(defpackage.ihp ihpVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ihq ihqVar = (defpackage.ihq) akzxVar.b;
        defpackage.ihq ihqVar2 = defpackage.ihq.a;
        ihqVar.d = ihpVar.a();
        ihqVar.b |= 1;
    }

    public final void i(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ihq ihqVar = (defpackage.ihq) akzxVar.b;
        defpackage.ihq ihqVar2 = defpackage.ihq.a;
        ihqVar.c = z;
    }

    public final /* synthetic */ defpackage.ihm j() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ihm) aladVarP;
    }

    public final void k(defpackage.ihj ihjVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ihm ihmVar = (defpackage.ihm) akzxVar.b;
        defpackage.ihm ihmVar2 = defpackage.ihm.a;
        ihmVar.g = ihjVar.a();
        ihmVar.b |= 16;
    }

    public final /* synthetic */ defpackage.kis l() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kis) aladVarP;
    }

    public final void m() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.kis) ((akzx) this.a).b).c);
        aooh.e(listUnmodifiableList, "getCoalescedCallMappingIdList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ void n() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.kis) ((akzx) this.a).b).b);
        aooh.e(listUnmodifiableList, "getCoalescedIdList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ void o() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.kis) ((akzx) this.a).b).d);
        aooh.e(listUnmodifiableList, "getCoalescedTimestampMillisList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.kiq p() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kiq) aladVarP;
    }

    public final /* synthetic */ void q(java.lang.Iterable iterable) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kiq kiqVar = (defpackage.kiq) akzxVar.b;
        defpackage.kiq kiqVar2 = defpackage.kiq.a;
        kiqVar.b();
        akyl.i(iterable, kiqVar.b);
    }

    public final /* synthetic */ void r() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.kiq) ((akzx) this.a).b).b);
        aooh.e(listUnmodifiableList, "getCallDetailsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.kie s() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kie) aladVarP;
    }

    public final void t(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kie kieVar = (defpackage.kie) akzxVar.b;
        defpackage.kie kieVar2 = defpackage.kie.a;
        kieVar.b |= 4;
        kieVar.e = i;
    }

    public final void u(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kie kieVar = (defpackage.kie) akzxVar.b;
        defpackage.kie kieVar2 = defpackage.kie.a;
        kieVar.b |= 1;
        kieVar.c = i;
    }

    public final void v(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kie kieVar = (defpackage.kie) akzxVar.b;
        defpackage.kie kieVar2 = defpackage.kie.a;
        kieVar.d = i - 1;
        kieVar.b |= 2;
    }

    public final /* synthetic */ kgu w() {
        kgu kguVarP = ((akzx) this.a).p();
        aooh.e(kguVarP, "build(...)");
        return kguVarP;
    }

    public final void x(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        kgu kguVar = akzxVar.b;
        kgu kguVar2 = kgu.a;
        kguVar.b |= 256;
        kguVar.l = i;
    }

    public final void y(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        kgu kguVar = akzxVar.b;
        kgu kguVar2 = kgu.a;
        j$.util.Objects.requireNonNull(str);
        kguVar.b |= 16;
        kguVar.h = str;
    }

    public final void z(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        kgu kguVar = akzxVar.b;
        kgu kguVar2 = kgu.a;
        j$.util.Objects.requireNonNull(str);
        kguVar.b |= 128;
        kguVar.k = str;
    }

    public jhw(java.lang.Object obj) {
        this.a = obj;
    }

    public jhw(zij zijVar) {
        this.a = zijVar;
    }

    public jhw() {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }
}
