package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jiv {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public jiv(defpackage.jiu jiuVar, ucm ucmVar, rlv rlvVar, defpackage.jit jitVar, aoin aoinVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableBlockedNumberPrecallDialogFix");
        this.a = ucmVar;
        this.b = rlvVar;
        this.c = jitVar;
        this.d = aoinVar;
        this.e = jiuVar;
    }

    public static boolean c(defpackage.jtx jtxVar, alcf alcfVar) {
        alcf alcfVar2 = jtxVar.c;
        if (alcfVar2 == null) {
            alcfVar2 = alcf.a;
        }
        alcf alcfVar3 = aldi.a;
        return aldh.a(alcfVar2, alcfVar) > 0;
    }

    public final ajcq a(final defpackage.jrz jrzVar, final int i) {
        return ((defpackage.jtt) this.b).a(2, jrzVar, new java.lang.Runnable() { // from class: jtq
            @Override // java.lang.Runnable
            public final void run() {
                akzx akzxVarM = defpackage.aixs.a.m();
                defpackage.jrz jrzVar2 = jrzVar;
                defpackage.kiw kiwVar = jrzVar2.d;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                defpackage.jiv jivVar = this.c;
                java.lang.String str = kiwVar.c;
                defpackage.aixy aixyVarC = ((defpackage.krv) jivVar.e).c(jrzVar2, str);
                akzx akzxVarM2 = defpackage.aixt.a.m();
                defpackage.hkd hkdVar = jrzVar2.c;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                int i2 = i;
                java.lang.String str2 = hkdVar.c;
                akzxVarM2.u();
                defpackage.aixt aixtVar = (defpackage.aixt) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                aixtVar.b |= 1;
                aixtVar.c = str2;
                akzxVarM2.u();
                defpackage.aixt aixtVar2 = (defpackage.aixt) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                aixtVar2.b |= 2;
                aixtVar2.d = str;
                akzxVarM2.u();
                defpackage.aixt aixtVar3 = (defpackage.aixt) akzxVarM2.b;
                if (i2 == 0) {
                    throw null;
                }
                aixtVar3.e = i2 - 1;
                aixtVar3.b |= 4;
                alcf alcfVar = aixyVarC.c;
                if (alcfVar == null) {
                    alcfVar = alcf.a;
                }
                akzxVarM2.u();
                defpackage.aixt aixtVar4 = (defpackage.aixt) akzxVarM2.b;
                j$.util.Objects.requireNonNull(alcfVar);
                aixtVar4.f = alcfVar;
                aixtVar4.b |= 8;
                java.lang.String str3 = aixyVarC.d;
                akzxVarM2.u();
                defpackage.aixt aixtVar5 = (defpackage.aixt) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str3);
                aixtVar5.b |= 16;
                aixtVar5.g = str3;
                int iAP = a.aP(aixyVarC.e);
                if (iAP == 0) {
                    iAP = 1;
                }
                akzxVarM2.u();
                defpackage.aixt aixtVar6 = (defpackage.aixt) akzxVarM2.b;
                aixtVar6.h = iAP - 1;
                aixtVar6.b |= 32;
                java.lang.String str4 = aixyVarC.f;
                akzxVarM2.u();
                defpackage.aixt aixtVar7 = (defpackage.aixt) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                aixtVar7.b |= 64;
                aixtVar7.i = str4;
                java.lang.String str5 = aixyVarC.g;
                akzxVarM2.u();
                defpackage.aixt aixtVar8 = (defpackage.aixt) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str5);
                aixtVar8.b |= 128;
                aixtVar8.j = str5;
                int iAP2 = a.aP(aixyVarC.h);
                if (iAP2 == 0) {
                    iAP2 = 1;
                }
                akzxVarM2.u();
                defpackage.aixt aixtVar9 = (defpackage.aixt) akzxVarM2.b;
                aixtVar9.k = iAP2 - 1;
                aixtVar9.b |= 256;
                rmt rmtVarB = rmt.b(aixyVarC.i);
                if (rmtVarB == null) {
                    rmtVarB = rmt.a;
                }
                akzxVarM2.u();
                defpackage.aixt aixtVar10 = (defpackage.aixt) akzxVarM2.b;
                aixtVar10.l = rmtVarB.q;
                aixtVar10.b |= 512;
                defpackage.aixm aixmVarB = defpackage.aixm.b(aixyVarC.j);
                if (aixmVarB == null) {
                    aixmVarB = defpackage.aixm.UNKNOWN_CALL_DURATION_TYPE;
                }
                java.lang.Object obj = jivVar.d;
                akzxVarM2.u();
                defpackage.aixt aixtVar11 = (defpackage.aixt) akzxVarM2.b;
                aixtVar11.m = aixmVarB.f;
                aixtVar11.b |= 1024;
                java.lang.String str6 = aixyVarC.k;
                akzxVarM2.u();
                defpackage.aixt aixtVar12 = (defpackage.aixt) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str6);
                aixtVar12.b |= 2048;
                aixtVar12.n = str6;
                java.lang.String str7 = aixyVarC.l;
                akzxVarM2.u();
                defpackage.aixt aixtVar13 = (defpackage.aixt) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str7);
                aixtVar13.b |= 4096;
                aixtVar13.o = str7;
                defpackage.aixt aixtVar14 = (defpackage.aixt) akzxVarM2.p();
                akzxVarM.u();
                defpackage.aixs aixsVar = (defpackage.aixs) akzxVarM.b;
                j$.util.Objects.requireNonNull(aixtVar14);
                aixsVar.c = aixtVar14;
                aixsVar.b |= 1;
                ((zdi) jivVar.a).d(((zzd) obj).h(akzxVarM.p(), abtl.b((android.content.Context) jivVar.c, new defpackage.aiyk())));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aoin, java.lang.Object] */
    public final alcf b() {
        return aldi.e(j$.time.Instant.now().toEpochMilli() - java.util.concurrent.TimeUnit.DAYS.toMillis(((java.lang.Long) this.a.a()).longValue()));
    }

    public final ajcq d(final defpackage.jrz jrzVar, final int i) {
        return ((defpackage.jtt) this.e).a(4, jrzVar, new java.lang.Runnable() { // from class: jts
            @Override // java.lang.Runnable
            public final void run() {
                akzx akzxVarM = defpackage.aixs.a.m();
                defpackage.jrz jrzVar2 = jrzVar;
                defpackage.kiw kiwVar = jrzVar2.d;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                zag zagVar = kiwVar.u;
                if (zagVar == null) {
                    zagVar = zag.a;
                }
                zai zaiVar = zagVar.c;
                if (zaiVar == null) {
                    zaiVar = zai.a;
                }
                defpackage.jiv jivVar = this.c;
                java.lang.String str = zaiVar.b;
                defpackage.aixy aixyVarC = ((defpackage.krv) jivVar.c).c(jrzVar2, str);
                akzx akzxVarM2 = defpackage.aixw.a.m();
                defpackage.hkd hkdVar = jrzVar2.c;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                int i2 = i;
                java.lang.String str2 = hkdVar.c;
                akzxVarM2.u();
                defpackage.aixw aixwVar = (defpackage.aixw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                aixwVar.b |= 1;
                aixwVar.c = str2;
                akzxVarM2.u();
                defpackage.aixw aixwVar2 = (defpackage.aixw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                aixwVar2.b |= 2;
                aixwVar2.d = str;
                akzxVarM2.u();
                defpackage.aixw aixwVar3 = (defpackage.aixw) akzxVarM2.b;
                aixwVar3.e = i2 - 1;
                aixwVar3.b |= 4;
                alcf alcfVar = aixyVarC.c;
                if (alcfVar == null) {
                    alcfVar = alcf.a;
                }
                akzxVarM2.u();
                defpackage.aixw aixwVar4 = (defpackage.aixw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(alcfVar);
                aixwVar4.f = alcfVar;
                aixwVar4.b |= 8;
                java.lang.String str3 = aixyVarC.d;
                akzxVarM2.u();
                defpackage.aixw aixwVar5 = (defpackage.aixw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str3);
                aixwVar5.b |= 16;
                aixwVar5.g = str3;
                int iAP = a.aP(aixyVarC.e);
                if (iAP == 0) {
                    iAP = 1;
                }
                akzxVarM2.u();
                defpackage.aixw aixwVar6 = (defpackage.aixw) akzxVarM2.b;
                aixwVar6.h = iAP - 1;
                aixwVar6.b |= 32;
                java.lang.String str4 = aixyVarC.f;
                akzxVarM2.u();
                defpackage.aixw aixwVar7 = (defpackage.aixw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                aixwVar7.b |= 64;
                aixwVar7.i = str4;
                java.lang.String str5 = aixyVarC.g;
                akzxVarM2.u();
                defpackage.aixw aixwVar8 = (defpackage.aixw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str5);
                aixwVar8.b |= 128;
                aixwVar8.j = str5;
                int iAP2 = a.aP(aixyVarC.h);
                int i3 = iAP2 != 0 ? iAP2 : 1;
                akzxVarM2.u();
                defpackage.aixw aixwVar9 = (defpackage.aixw) akzxVarM2.b;
                aixwVar9.k = i3 - 1;
                aixwVar9.b |= 256;
                defpackage.aixm aixmVarB = defpackage.aixm.b(aixyVarC.j);
                if (aixmVarB == null) {
                    aixmVarB = defpackage.aixm.UNKNOWN_CALL_DURATION_TYPE;
                }
                java.lang.Object obj = jivVar.a;
                akzxVarM2.u();
                defpackage.aixw aixwVar10 = (defpackage.aixw) akzxVarM2.b;
                aixwVar10.l = aixmVarB.f;
                aixwVar10.b |= 512;
                java.lang.String str6 = aixyVarC.k;
                akzxVarM2.u();
                defpackage.aixw aixwVar11 = (defpackage.aixw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str6);
                aixwVar11.b |= 1024;
                aixwVar11.m = str6;
                java.lang.String str7 = aixyVarC.l;
                akzxVarM2.u();
                defpackage.aixw aixwVar12 = (defpackage.aixw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str7);
                aixwVar12.b |= 2048;
                aixwVar12.n = str7;
                defpackage.aixw aixwVar13 = (defpackage.aixw) akzxVarM2.p();
                akzxVarM.u();
                defpackage.aixs aixsVar = (defpackage.aixs) akzxVarM.b;
                j$.util.Objects.requireNonNull(aixwVar13);
                aixsVar.d = aixwVar13;
                aixsVar.b |= 2;
                ((zdi) jivVar.b).d(((zzd) obj).h(akzxVarM.p(), abtl.b((android.content.Context) jivVar.d, new defpackage.aiyk())));
            }
        });
    }

    public jiv(aogc aogcVar, aoin aoinVar, aoin aoinVar2, kaw kawVar, ajct ajctVar) {
        this.d = aogcVar;
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = kawVar;
        this.e = ajctVar;
    }

    public jiv(defpackage.oii oiiVar, ajct ajctVar, defpackage.ony onyVar, zzx zzxVar, aoin aoinVar) {
        this.e = oiiVar;
        this.b = ajctVar;
        this.d = onyVar;
        this.c = zzxVar;
        this.a = aoinVar;
    }

    public jiv(rlv rlvVar, defpackage.oiw oiwVar, pgi pgiVar, aogc aogcVar, aoss aossVar) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aogcVar, "resultPropagator");
        aooh.f(aossVar, "lightweightScope");
        this.c = rlvVar;
        this.e = oiwVar;
        this.d = pgiVar;
        this.b = aogcVar;
        this.a = aossVar;
    }

    public jiv(zzd zzdVar, defpackage.jtt jttVar, defpackage.krv krvVar, android.content.Context context, zdi zdiVar) {
        this.d = zzdVar;
        this.b = jttVar;
        this.e = krvVar;
        this.c = context;
        this.a = zdiVar;
    }

    public jiv(zzd zzdVar, defpackage.jtt jttVar, defpackage.krv krvVar, android.content.Context context, zdi zdiVar, byte[] bArr) {
        this.a = zzdVar;
        this.e = jttVar;
        this.c = krvVar;
        this.d = context;
        this.b = zdiVar;
    }
}
