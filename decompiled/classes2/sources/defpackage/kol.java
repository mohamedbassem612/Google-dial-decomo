package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kol {
    private static final aimz a = aimz.i("com/android/dialer/calllogutils/CallLogRowActions");
    private final nwu b;
    private final agsm c;
    private final rlv d;
    private final gpd e;
    private final aeqx f;
    private final zjm g;
    private final acxg h;

    public kol(aeqx aeqxVar, nwu nwuVar, gpd gpdVar, acxg acxgVar, agsm agsmVar, zjm zjmVar, rlv rlvVar) {
        this.f = aeqxVar;
        this.b = nwuVar;
        this.e = gpdVar;
        this.h = acxgVar;
        this.c = agsmVar;
        this.g = zjmVar;
        this.d = rlvVar;
    }

    public final void a(kiu kiuVar, boolean z, boolean z2, defpackage.nwt nwtVar) {
        kgu kguVarB;
        kgz kgzVar = (kgz) this.g.g().orElse((java.lang.Object) null);
        if (kgzVar != null && (kguVarB = kgzVar.b(kiuVar)) != null) {
            rlv rlvVar = this.d;
            java.lang.String str = kguVarB.c;
            rlvVar.o(rmx.zl);
            kgzVar.g(str, 1);
            return;
        }
        int i = kiuVar.o & 1;
        boolean z3 = 1 == i;
        a.b().l("com/android/dialer/calllogutils/CallLogRowActions", "startCallForRow", 117, "CallLogRowActions.java").y("Phone account component name: %s", kiuVar.m);
        nwu nwuVar = this.b;
        boolean zM = nwuVar.m(kiuVar.m, kiuVar.n);
        com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA = defpackage.jwz.a();
        callIntent$BuilderA.y(kiuVar.g);
        callIntent$BuilderA.z(8);
        callIntent$BuilderA.t(z3);
        defpackage.kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        callIntent$BuilderA.q(true != kiwVar.j ? 3 : 2);
        defpackage.kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = defpackage.kiw.a;
        }
        callIntent$BuilderA.p(!kiwVar2.g.isEmpty());
        defpackage.jxb jxbVar = defpackage.jxb.b;
        akzx akzxVarM = jxbVar.m();
        akzxVarM.u();
        defpackage.jxb jxbVar2 = (defpackage.jxb) akzxVarM.b;
        jxbVar2.d = 7;
        jxbVar2.c |= 1;
        int i2 = kiuVar.y;
        akzxVarM.u();
        defpackage.jxb jxbVar3 = (defpackage.jxb) akzxVarM.b;
        jxbVar3.c |= 65536;
        jxbVar3.r = i2;
        akzxVarM.u();
        defpackage.jxb jxbVar4 = (defpackage.jxb) akzxVarM.b;
        jxbVar4.c |= 131072;
        jxbVar4.s = z2;
        callIntent$BuilderA.r((defpackage.jxb) akzxVarM.p());
        abvz abvzVar = abvz.a;
        akzx akzxVarM2 = abvzVar.m();
        aeqx aeqxVar = this.f;
        java.lang.String string = aeqxVar.d(kiuVar, false).toString();
        akzxVarM2.u();
        abvz abvzVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(string);
        abvzVar2.b |= 1;
        abvzVar2.c = string;
        defpackage.kiw kiwVar3 = kiuVar.r;
        if (kiwVar3 == null) {
            kiwVar3 = defpackage.kiw.a;
        }
        java.lang.String str2 = kiwVar3.e;
        akzxVarM2.u();
        abvz abvzVar3 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str2);
        abvzVar3.b |= 4;
        abvzVar3.e = str2;
        gpd gpdVar = this.e;
        akzx akzxVarA = gpdVar.a(kiuVar, 2);
        akzxVarM2.u();
        abvz abvzVar4 = akzxVarM2.b;
        abwd abwdVarP = akzxVarA.p();
        j$.util.Objects.requireNonNull(abwdVarP);
        abvzVar4.f = abwdVarP;
        abvzVar4.b |= 8;
        defpackage.kiw kiwVar4 = kiuVar.r;
        if (kiwVar4 == null) {
            kiwVar4 = defpackage.kiw.a;
        }
        java.lang.String str3 = kiwVar4.h;
        akzxVarM2.u();
        abvz abvzVar5 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str3);
        abvzVar5.b |= 2;
        abvzVar5.d = str3;
        defpackage.kiw kiwVar5 = kiuVar.r;
        if (kiwVar5 == null) {
            kiwVar5 = defpackage.kiw.a;
        }
        rmt rmtVarB = rmt.b(kiwVar5.o);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        rmt rmtVar = rmt.a;
        boolean z4 = rmtVarB != rmtVar;
        akzxVarM2.u();
        abvz abvzVar6 = akzxVarM2.b;
        abvzVar6.b |= 16;
        abvzVar6.g = z4;
        callIntent$BuilderA.s(j$.util.Optional.of(akzxVarM2.p()));
        if (i != 0 && zM) {
            nwuVar.k(callIntent$BuilderA.a().getSchemeSpecificPart(), nwtVar);
            return;
        }
        agsm agsmVar = this.c;
        acxg acxgVar = this.h;
        akzx akzxVarM3 = zsf.a.m();
        akzx akzxVarM4 = jxbVar.m();
        akzxVarM4.u();
        defpackage.jxb jxbVar5 = (defpackage.jxb) akzxVarM4.b;
        jxbVar5.d = 7;
        jxbVar5.c |= 1;
        int i3 = kiuVar.y;
        akzxVarM4.u();
        defpackage.jxb jxbVar6 = (defpackage.jxb) akzxVarM4.b;
        jxbVar6.c |= 65536;
        jxbVar6.r = i3;
        akzxVarM4.u();
        defpackage.jxb jxbVar7 = (defpackage.jxb) akzxVarM4.b;
        jxbVar7.c |= 131072;
        jxbVar7.s = z2;
        akzxVarM3.u();
        zsf zsfVar = akzxVarM3.b;
        defpackage.jxb jxbVar8 = (defpackage.jxb) akzxVarM4.p();
        j$.util.Objects.requireNonNull(jxbVar8);
        zsfVar.d = jxbVar8;
        zsfVar.b |= 2;
        akzxVarM3.u();
        zsf zsfVar2 = akzxVarM3.b;
        zsfVar2.b |= 8;
        zsfVar2.f = z3;
        defpackage.kiw kiwVar6 = kiuVar.r;
        if (kiwVar6 == null) {
            kiwVar6 = defpackage.kiw.a;
        }
        int i4 = true != kiwVar6.j ? 5 : 4;
        akzxVarM3.u();
        zsf zsfVar3 = akzxVarM3.b;
        zsfVar3.g = a.aT(i4);
        zsfVar3.b |= 32;
        defpackage.kiw kiwVar7 = kiuVar.r;
        if (kiwVar7 == null) {
            kiwVar7 = defpackage.kiw.a;
        }
        boolean z5 = !kiwVar7.g.isEmpty();
        akzxVarM3.u();
        zsf zsfVar4 = akzxVarM3.b;
        zsfVar4.b |= 128;
        zsfVar4.i = z5;
        akzx akzxVarM5 = abvzVar.m();
        java.lang.String string2 = aeqxVar.d(kiuVar, false).toString();
        akzxVarM5.u();
        abvz abvzVar7 = akzxVarM5.b;
        j$.util.Objects.requireNonNull(string2);
        abvzVar7.b |= 1;
        abvzVar7.c = string2;
        defpackage.kiw kiwVar8 = kiuVar.r;
        if (kiwVar8 == null) {
            kiwVar8 = defpackage.kiw.a;
        }
        java.lang.String str4 = kiwVar8.e;
        akzxVarM5.u();
        abvz abvzVar8 = akzxVarM5.b;
        j$.util.Objects.requireNonNull(str4);
        abvzVar8.b |= 4;
        abvzVar8.e = str4;
        akzx akzxVarA2 = gpdVar.a(kiuVar, 2);
        akzxVarM5.u();
        abvz abvzVar9 = akzxVarM5.b;
        abwd abwdVarP2 = akzxVarA2.p();
        j$.util.Objects.requireNonNull(abwdVarP2);
        abvzVar9.f = abwdVarP2;
        abvzVar9.b |= 8;
        defpackage.kiw kiwVar9 = kiuVar.r;
        if (kiwVar9 == null) {
            kiwVar9 = defpackage.kiw.a;
        }
        java.lang.String str5 = kiwVar9.h;
        akzxVarM5.u();
        abvz abvzVar10 = akzxVarM5.b;
        j$.util.Objects.requireNonNull(str5);
        abvzVar10.b |= 2;
        abvzVar10.d = str5;
        defpackage.kiw kiwVar10 = kiuVar.r;
        if (kiwVar10 == null) {
            kiwVar10 = defpackage.kiw.a;
        }
        rmt rmtVarB2 = rmt.b(kiwVar10.o);
        if (rmtVarB2 == null) {
            rmtVarB2 = rmtVar;
        }
        boolean z6 = rmtVarB2 != rmtVar;
        akzxVarM5.u();
        abvz abvzVar11 = akzxVarM5.b;
        abvzVar11.b |= 16;
        abvzVar11.g = z6;
        abvz abvzVarP = akzxVarM5.p();
        akzxVarM3.u();
        zsf zsfVar5 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(abvzVarP);
        zsfVar5.o = abvzVarP;
        zsfVar5.b |= 1024;
        if (z && (kiuVar.o & 32) == 32) {
            akzxVarM3.af("android.telecom.extra.START_CALL_WITH_RTT", true);
        }
        akzx akzxVarM6 = zrx.a.m();
        java.lang.String string3 = uyb.b(kiuVar.g).toString();
        akzxVarM6.u();
        zrx zrxVar = akzxVarM6.b;
        j$.util.Objects.requireNonNull(string3);
        zrxVar.b |= 1;
        zrxVar.e = string3;
        akzxVarM6.u();
        zrx zrxVar2 = akzxVarM6.b;
        zsf zsfVarP = akzxVarM3.p();
        j$.util.Objects.requireNonNull(zsfVarP);
        zrxVar2.d = zsfVarP;
        zrxVar2.c = 2;
        agsmVar.g(acxgVar.v(akzxVarM6.p()), 10L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
