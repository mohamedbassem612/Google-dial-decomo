package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rds implements defpackage.pzs {
    private final android.content.Context a;
    private final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    private final defpackage.qzn c;
    private final aoin d;
    private final her e;

    public rds(aoin aoinVar, her herVar, android.content.Context context, defpackage.qzn qznVar) {
        this.e = herVar;
        this.a = context;
        this.c = qznVar;
        this.d = aoinVar;
    }

    @Override // defpackage.pzs
    public final aw a() {
        return defpackage.rdk.a("");
    }

    @Override // defpackage.pzs
    public final /* synthetic */ defpackage.pzp b() {
        return defpackage.pzp.VOICE_SCREEN;
    }

    @Override // defpackage.pzs
    public final j$.util.Optional c(defpackage.abvz abvzVar, long j) {
        defpackage.abwd abwdVarAd;
        defpackage.rcb rcbVar = new defpackage.rcb();
        defpackage.qtw qtwVar = defpackage.qtw.a;
        akzx akzxVarM = qtwVar.m();
        defpackage.qug qugVar = defpackage.qug.BUTTON_MORE;
        akzxVarM.u();
        defpackage.qtw qtwVar2 = (defpackage.qtw) akzxVarM.b;
        qtwVar2.c = qugVar.H;
        qtwVar2.b |= 1;
        android.content.Context context = this.a;
        java.lang.String string = context.getString(2132019070);
        akzxVarM.u();
        defpackage.qtw qtwVar3 = (defpackage.qtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        qtwVar3.b |= 4;
        qtwVar3.e = string;
        akzxVarM.u();
        defpackage.qtw qtwVar4 = (defpackage.qtw) akzxVarM.b;
        qtwVar4.b |= 2;
        qtwVar4.d = 2131231976;
        java.lang.String string2 = context.getString(2132019054);
        akzxVarM.u();
        defpackage.qtw qtwVar5 = (defpackage.qtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        qtwVar5.b |= 8;
        qtwVar5.f = string2;
        akzxVarM.u();
        defpackage.qtw qtwVar6 = (defpackage.qtw) akzxVarM.b;
        qtwVar6.b |= 32;
        qtwVar6.h = false;
        akzxVarM.u();
        defpackage.qtw qtwVar7 = (defpackage.qtw) akzxVarM.b;
        qtwVar7.b |= 16;
        qtwVar7.g = false;
        defpackage.qtw qtwVar8 = (defpackage.qtw) akzxVarM.p();
        akzx akzxVarM2 = qtwVar.m();
        defpackage.qug qugVar2 = defpackage.qug.BUTTON_AUDIO_ROUTE;
        akzxVarM2.u();
        defpackage.qtw qtwVar9 = (defpackage.qtw) akzxVarM2.b;
        qtwVar9.c = qugVar2.H;
        qtwVar9.b |= 1;
        java.lang.String string3 = context.getString(2132019076);
        akzxVarM2.u();
        defpackage.qtw qtwVar10 = (defpackage.qtw) akzxVarM2.b;
        j$.util.Objects.requireNonNull(string3);
        qtwVar10.b |= 4;
        qtwVar10.e = string3;
        java.lang.String string4 = context.getString(2132019076);
        akzxVarM2.u();
        defpackage.qtw qtwVar11 = (defpackage.qtw) akzxVarM2.b;
        j$.util.Objects.requireNonNull(string4);
        qtwVar11.b |= 8;
        qtwVar11.f = string4;
        akzxVarM2.u();
        defpackage.qtw qtwVar12 = (defpackage.qtw) akzxVarM2.b;
        qtwVar12.b |= 2;
        qtwVar12.d = 2131232007;
        akzxVarM2.u();
        defpackage.qtw qtwVar13 = (defpackage.qtw) akzxVarM2.b;
        qtwVar13.b |= 32;
        qtwVar13.h = false;
        boolean zBooleanValue = ((java.lang.Boolean) this.d.a()).booleanValue();
        akzxVarM2.u();
        defpackage.qtw qtwVar14 = (defpackage.qtw) akzxVarM2.b;
        qtwVar14.b |= 16;
        qtwVar14.g = zBooleanValue;
        akzxVarM2.u();
        defpackage.qtw qtwVar15 = (defpackage.qtw) akzxVarM2.b;
        qtwVar15.b |= 64;
        qtwVar15.i = false;
        defpackage.qtw qtwVar16 = (defpackage.qtw) akzxVarM2.p();
        akzx akzxVarM3 = qtwVar.m();
        defpackage.qug qugVar3 = defpackage.qug.BUTTON_MUTE;
        akzxVarM3.u();
        defpackage.qtw qtwVar17 = (defpackage.qtw) akzxVarM3.b;
        qtwVar17.c = qugVar3.H;
        qtwVar17.b |= 1;
        java.lang.String string5 = context.getString(2132019071);
        akzxVarM3.u();
        defpackage.qtw qtwVar18 = (defpackage.qtw) akzxVarM3.b;
        j$.util.Objects.requireNonNull(string5);
        qtwVar18.b |= 4;
        qtwVar18.e = string5;
        akzxVarM3.u();
        defpackage.qtw qtwVar19 = (defpackage.qtw) akzxVarM3.b;
        qtwVar19.b |= 2;
        qtwVar19.d = 2131231974;
        java.lang.String string6 = context.getString(2132019059);
        akzxVarM3.u();
        defpackage.qtw qtwVar20 = (defpackage.qtw) akzxVarM3.b;
        j$.util.Objects.requireNonNull(string6);
        qtwVar20.b |= 8;
        qtwVar20.f = string6;
        akzxVarM3.u();
        defpackage.qtw qtwVar21 = (defpackage.qtw) akzxVarM3.b;
        qtwVar21.b |= 32;
        qtwVar21.h = false;
        akzxVarM3.u();
        defpackage.qtw qtwVar22 = (defpackage.qtw) akzxVarM3.b;
        qtwVar22.b |= 16;
        qtwVar22.g = false;
        defpackage.qtw qtwVar23 = (defpackage.qtw) akzxVarM3.p();
        akzx akzxVarM4 = qtwVar.m();
        defpackage.qug qugVar4 = defpackage.qug.BUTTON_DIALPAD;
        akzxVarM4.u();
        defpackage.qtw qtwVar24 = (defpackage.qtw) akzxVarM4.b;
        qtwVar24.c = qugVar4.H;
        qtwVar24.b |= 1;
        java.lang.String string7 = context.getString(2132019065);
        akzxVarM4.u();
        defpackage.qtw qtwVar25 = (defpackage.qtw) akzxVarM4.b;
        j$.util.Objects.requireNonNull(string7);
        qtwVar25.b |= 4;
        qtwVar25.e = string7;
        akzxVarM4.u();
        defpackage.qtw qtwVar26 = (defpackage.qtw) akzxVarM4.b;
        qtwVar26.b |= 2;
        qtwVar26.d = 2131231950;
        java.lang.String string8 = context.getString(2132019065);
        akzxVarM4.u();
        defpackage.qtw qtwVar27 = (defpackage.qtw) akzxVarM4.b;
        j$.util.Objects.requireNonNull(string8);
        qtwVar27.b |= 8;
        qtwVar27.f = string8;
        akzxVarM4.u();
        defpackage.qtw qtwVar28 = (defpackage.qtw) akzxVarM4.b;
        qtwVar28.b |= 16;
        qtwVar28.g = false;
        akzxVarM4.u();
        defpackage.qtw qtwVar29 = (defpackage.qtw) akzxVarM4.b;
        qtwVar29.b |= 32;
        qtwVar29.h = false;
        rcbVar.i(aify.s(qtwVar8, qtwVar16, qtwVar23, (defpackage.qtw) akzxVarM4.p()));
        rcbVar.n(true);
        rcbVar.o(false);
        defpackage.rce rceVar = defpackage.rcf.a;
        rcbVar.p(defpackage.rcf.a);
        rcbVar.e(false);
        rcbVar.d(true);
        rcbVar.m(false);
        aify aifyVar = aike.a;
        rcbVar.b(aifyVar);
        defpackage.rca rcaVar = defpackage.rca.MODE_FULL_SIZE;
        rcbVar.g(rcaVar);
        rcbVar.h(rcaVar);
        aooh.f(context, "appContext");
        aooh.f(abvzVar, "calleeId");
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        if ((abvzVar.b & 8) != 0) {
            abwdVarAd = abvzVar.f;
            if (abwdVarAd == null) {
                abwdVarAd = defpackage.abwd.a;
            }
        } else {
            abwdVarAd = defpackage.abxl.F(defpackage.abwd.a.m()).ad();
        }
        aooh.c(abwdVarAd);
        rcbVar.f(new defpackage.pom(null, lValueOf, new defpackage.pof(abwdVarAd), new defpackage.pol(pez.Z(context), false, null, false, 0L), new defpackage.poj(pez.aq(context, abvzVar.c), null, null), null, pez.Z(context), null, null, null, false, null, null, false, null, null, null, null, null, 524193));
        rcbVar.c("seamless");
        rcbVar.g = 1;
        rcbVar.l(false);
        rcbVar.k(j$.util.Optional.of(lValueOf));
        rcbVar.j(false);
        rcbVar.q(aifyVar);
        defpackage.rcc rccVarA = rcbVar.a();
        java.lang.String strValueOf = java.lang.String.valueOf(this.b.getAndIncrement());
        ((j$.util.concurrent.ConcurrentHashMap) this.e.a).put(strValueOf, rccVarA);
        return j$.util.Optional.of(defpackage.rdk.a(strValueOf));
    }

    @Override // defpackage.pzs
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // defpackage.pzs
    public final boolean e() {
        return this.c.a();
    }

    @Override // defpackage.pzs
    public final /* synthetic */ boolean f() {
        return false;
    }
}
