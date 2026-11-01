package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kkq implements tev {
    public static final aimz a = aimz.i("com/android/dialer/calllog/search/CallLogSearchSection");
    public final teo b;
    public final int c;
    public final zjm d;
    public final zjm e;
    private final android.content.Context f;
    private final aonj g;
    private final aonj h;
    private final aenj i;

    public kkq(aazc aazcVar, android.content.Context context, zjm zjmVar, zjm zjmVar2) {
        aooh.f(aazcVar, "clock");
        aooh.f(context, "appContext");
        this.f = context;
        this.d = zjmVar;
        this.e = zjmVar2;
        this.g = new aiuo(new defpackage.blq(this, (aoln) null, 20));
        this.h = new aiuo(new defpackage.kqu(this, (aoln) null, 1));
        this.b = teo.c;
        this.c = 2132017718;
        this.i = new aenj("CallLogSearchSection");
    }

    public final aenj a() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final java.lang.Object b(tet tetVar, tej tejVar, aoln aolnVar) {
        defpackage.kkp kkpVar;
        dji djiVar;
        tej tejVar2;
        defpackage.kdy kdyVar;
        java.lang.String str;
        long j;
        dji djiVar2;
        java.lang.String str2;
        boolean z;
        dji djiVar3;
        dji djiVar4;
        java.lang.String str3;
        tej tejVar3;
        java.lang.String str4;
        defpackage.kdy kdyVar2;
        if (aolnVar instanceof defpackage.kkp) {
            kkpVar = (defpackage.kkp) aolnVar;
            int i = kkpVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkpVar.e = i - Integer.MIN_VALUE;
            } else {
                kkpVar = new defpackage.kkp(this, aolnVar);
            }
        } else {
            kkpVar = new defpackage.kkp(this, aolnVar);
        }
        java.lang.Object obj = kkpVar.c;
        aolu aoluVar = aolu.a;
        int i2 = kkpVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                j = kkpVar.a;
                djiVar = kkpVar.k;
                djiVar2 = kkpVar.j;
                str2 = kkpVar.i;
                str = kkpVar.h;
                kdyVar = kkpVar.g;
                tejVar2 = kkpVar.f;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = kkpVar.b;
                j = kkpVar.a;
                dji djiVar5 = kkpVar.k;
                dji djiVar6 = kkpVar.j;
                java.lang.String str5 = kkpVar.i;
                str3 = kkpVar.h;
                kdyVar2 = kkpVar.g;
                tej tejVar4 = kkpVar.f;
                aooc.af(obj);
                z = z2;
                tejVar3 = tejVar4;
                djiVar3 = djiVar5;
                djiVar4 = djiVar6;
                str4 = str5;
            }
            long j2 = j;
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            vaa vaaVarD = abxl.D(abvz.a.m());
            java.lang.String strC = defpackage.dxt.a().c(str3);
            aooh.e(strC, "unicodeWrap(...)");
            vaaVarD.U(strC);
            abvz abvzVarS = vaaVarD.S();
            defpackage.kiw kiwVarE = kdyVar2.e();
            return new defpackage.kkr(j2, str4, djiVar4, djiVar3, z, zBooleanValue, abvzVarS, kiwVarE != null ? kiwVarE.e : null, tejVar3);
        }
        aooc.af(obj);
        if (!(tetVar instanceof teq)) {
            return null;
        }
        defpackage.kdy kdyVar3 = ((defpackage.kks) ((teq) tetVar).a).a;
        java.lang.String str6 = kdyVar3.e;
        if (str6 == null || str6.length() == 0) {
            str6 = null;
        }
        if (str6 == null) {
            defpackage.hkd hkdVarB = kdyVar3.b();
            str6 = hkdVarB != null ? hkdVarB.c : null;
            if (str6 == null) {
                str6 = "";
            }
        }
        aokv aokvVar = new aokv(10);
        java.lang.String str7 = kdyVar3.i;
        if (str7 != null && str7.length() != 0) {
            aokvVar.add(str7);
        }
        long j3 = kdyVar3.b;
        android.content.Context context = this.f;
        java.lang.CharSequence charSequenceR = defpackage.hgu.r(context, j$.time.Instant.now().toEpochMilli(), j3, true);
        aooh.e(charSequenceR, "newCallLogTimestampLabel(...)");
        aokvVar.add(aoov.x(charSequenceR));
        djiVar = new dji(ajsz.cr(ajsz.aX(aokvVar), " • ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62));
        long j4 = kdyVar3.a;
        java.lang.CharSequence charSequenceAq = pez.aq(context, tiq.c(tejVar.a, str6, context));
        aooh.e(charSequenceAq, "format(...)");
        dji djiVarCa = mni.ca(charSequenceAq);
        aonj aonjVar = this.g;
        kkpVar.f = tejVar;
        kkpVar.g = kdyVar3;
        kkpVar.h = str6;
        kkpVar.i = str6;
        kkpVar.j = djiVarCa;
        kkpVar.k = djiVar;
        kkpVar.a = j4;
        kkpVar.e = 1;
        java.lang.Object objA = aonjVar.a(kkpVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        tejVar2 = tejVar;
        kdyVar = kdyVar3;
        str = str6;
        j = j4;
        obj = objA;
        djiVar2 = djiVarCa;
        str2 = str;
        boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
        aonj aonjVar2 = this.h;
        kkpVar.f = tejVar2;
        kkpVar.g = kdyVar;
        kkpVar.h = str;
        kkpVar.i = str2;
        kkpVar.j = djiVar2;
        kkpVar.k = djiVar;
        kkpVar.a = j;
        kkpVar.b = zBooleanValue2;
        kkpVar.e = 2;
        java.lang.Object objA2 = aonjVar2.a(kkpVar);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        z = zBooleanValue2;
        djiVar3 = djiVar;
        djiVar4 = djiVar2;
        str3 = str;
        tejVar3 = tejVar2;
        obj = objA2;
        str4 = str2;
        kdyVar2 = kdyVar;
        long j5 = j;
        boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
        vaa vaaVarD2 = abxl.D(abvz.a.m());
        java.lang.String strC2 = defpackage.dxt.a().c(str3);
        aooh.e(strC2, "unicodeWrap(...)");
        vaaVarD2.U(strC2);
        abvz abvzVarS2 = vaaVarD2.S();
        defpackage.kiw kiwVarE2 = kdyVar2.e();
        return new defpackage.kkr(j5, str4, djiVar4, djiVar3, z, zBooleanValue3, abvzVarS2, kiwVarE2 != null ? kiwVarE2.e : null, tejVar3);
    }

    public final void c(defpackage.kkr kkrVar, ten tenVar, cav cavVar, int i) {
        int i2;
        defpackage.kkr kkrVar2 = kkrVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-677152103);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? cavVarB.B(kkrVar2) : cavVarB.D(kkrVar2)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(tenVar) : cavVarB.D(tenVar)) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            dji djiVar = kkrVar2.b;
            dji djiVar2 = kkrVar2.c;
            boolean z = kkrVar2.d;
            abvz abvzVar = kkrVar2.f;
            java.lang.String str = kkrVar2.g;
            java.lang.String str2 = kkrVar2.a;
            int i4 = tenVar.c;
            tej tejVar = kkrVar2.h;
            tfk tfkVar = new tfk(djiVar, djiVar2, "", z, abvzVar, new tfj(str2, i4, tejVar.a, 2, tejVar.c, tejVar.b), str, (android.net.Uri) null, -1, defpackage.nwx.UNKNOWN_REACHABILITY, false);
            aokv aokvVar = new aokv(10);
            kkrVar2 = kkrVar;
            if (kkrVar2.e) {
                aokvVar.add(tff.a);
            }
            aokvVar.add(new tfa());
            aokvVar.add(tfg.a);
            aokvVar.add(new tfd(true));
            snl.aD((cmw) null, tenVar, new tfn(tfkVar, ajsz.aX(aokvVar)), (aonn) null, cavVarB, i2 & 112);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko(this, kkrVar2, tenVar, i, 0);
        }
    }
}
