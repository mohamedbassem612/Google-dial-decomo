package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tyd implements defpackage.twv {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcModelAvailability");
    public final android.content.Context b;
    public final defpackage.aoss c;
    public final defpackage.afcg d;
    public final defpackage.aoin e;
    public defpackage.aosy f;
    private final defpackage.aoss g;
    private final defpackage.ahda h;

    public tyd(android.content.Context context, defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.afcg afcgVar, defpackage.aoin aoinVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableAttributionSource");
        }
        this.b = context;
        this.c = aossVar;
        this.g = aossVar2;
        this.d = afcgVar;
        this.e = aoinVar;
        this.h = new defpackage.ahda((byte[]) null);
        defpackage.aokd aokdVar = defpackage.aokd.a;
        defpackage.aosi aosiVar = new defpackage.aosi(null);
        aosiVar.Q(aokdVar);
        this.f = aosiVar;
    }

    private static final java.util.Map d(java.util.List list, tvy tvyVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(list, 10)), 16));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            afcn afcnVar = (afcn) it.next();
            java.lang.String str = afcnVar.d;
            defpackage.aooh.e(str, "getLocale(...)");
            vqu vquVarCr = defpackage.wsc.cr(tvz.a.m());
            vquVarCr.W(tvyVar);
            java.lang.String str2 = afcnVar.d;
            defpackage.aooh.e(str2, "getLocale(...)");
            vquVarCr.X(str2);
            vquVarCr.Y(afcnVar.e);
            linkedHashMap.put(str, vquVarCr.V());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.twv
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        tyc tycVar;
        if (aolnVar instanceof tyc) {
            tycVar = (tyc) aolnVar;
            int i = tycVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tycVar.c = i - Integer.MIN_VALUE;
            } else {
                tycVar = new tyc(this, aolnVar);
            }
        } else {
            tycVar = new tyc(this, aolnVar);
        }
        java.lang.Object objA = tycVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tycVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.aosy aosyVarAg = defpackage.ahvr.ag(this.g, this.h, new tlv(this, (defpackage.aoln) null, 17));
            tycVar.c = 1;
            objA = aosyVarAg.a(tycVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
            return objA;
        }
        defpackage.aooc.af(objA);
        tycVar.c = 2;
        java.lang.Object objA2 = ((defpackage.aosy) objA).a(tycVar);
        if (objA2 != aoluVar) {
            return objA2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(int i, defpackage.aoln aolnVar) {
        txz txzVar;
        if (aolnVar instanceof txz) {
            txzVar = (txz) aolnVar;
            int i2 = txzVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                txzVar.d = i2 - Integer.MIN_VALUE;
            } else {
                txzVar = new txz(this, aolnVar);
            }
        } else {
            txzVar = new txz(this, aolnVar);
        }
        java.lang.Object objB = txzVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = txzVar.d;
        try {
            if (i3 == 0) {
                defpackage.aooc.af(objB);
                defpackage.afcg afcgVarCa = defpackage.wsc.ca(this.d, this.b, this.e);
                zoe zoeVarM = afcd.m((defpackage.akzz) afcm.a.m());
                defpackage.akzx akzxVarM = afbt.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                afbt afbtVar = akzxVarM.b;
                afbtVar.b |= 1;
                afbtVar.c = i;
                afbt afbtVarR = akzxVarM.r();
                defpackage.aooh.e(afbtVarR, "build(...)");
                afbt afbtVar2 = afbtVarR;
                defpackage.aooh.f(afbtVar2, "value");
                java.lang.Object obj = zoeVarM.a;
                ((defpackage.akzx) obj).u();
                afcm afcmVar = ((defpackage.akzz) obj).b;
                j$.util.Objects.requireNonNull(afbtVar2);
                afcmVar.d = afbtVar2;
                afcmVar.c = 7;
                afcm afcmVarH = zoeVarM.H();
                txzVar.a = i;
                txzVar.d = 1;
                objB = afcgVarCa.b(afcmVarH, new defpackage.anph(), txzVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = txzVar.a;
                defpackage.aooc.af(objB);
            }
            afco afcoVar = (afco) objB;
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcModelAvailability", "checkAicoreFeatureStatus", 103, "SodaOnDeviceGrpcModelAvailability.kt")).B("model %d status: %s", i, afcoVar);
            defpackage.alat alatVar = afcoVar.c;
            defpackage.aooh.e(alatVar, "getDownloadableModelList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : alatVar) {
                afcn afcnVar = (afcn) obj2;
                int i4 = afcnVar.b;
                if (i4 == 6) {
                    if ((i4 == 6 ? (afbs) afcnVar.c : afbs.a).b == i) {
                        arrayList.add(obj2);
                    }
                }
            }
            if (defpackage.ajsz.ci(arrayList)) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcModelAvailability", "checkAicoreFeatureStatus", 109, "SodaOnDeviceGrpcModelAvailability.kt")).w("model %d start downloading", i);
                defpackage.aoov.an(this.c, null, 0, new hxo(this, i, (defpackage.aoln) null, 9), 3);
            }
            defpackage.alat alatVar2 = afcoVar.c;
            defpackage.aooh.e(alatVar2, "getDownloadableModelList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : alatVar2) {
                afcn afcnVar2 = (afcn) obj3;
                int i5 = afcnVar2.b;
                if (i5 == 6) {
                    if ((i5 == 6 ? (afbs) afcnVar2.c : afbs.a).b == i) {
                        arrayList2.add(obj3);
                    }
                }
            }
            if (defpackage.ajsz.ci(arrayList2)) {
                return tvw.b;
            }
            defpackage.alat alatVar3 = afcoVar.d;
            defpackage.aooh.e(alatVar3, "getDownloadingModelList(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : alatVar3) {
                afcn afcnVar3 = (afcn) obj4;
                int i6 = afcnVar3.b;
                if (i6 == 6) {
                    if ((i6 == 6 ? (afbs) afcnVar3.c : afbs.a).b == i) {
                        arrayList3.add(obj4);
                    }
                }
            }
            if (defpackage.ajsz.ci(arrayList3)) {
                return tvw.c;
            }
            defpackage.alat alatVar4 = afcoVar.b;
            defpackage.aooh.e(alatVar4, "getDownloadedModelList(...)");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj5 : alatVar4) {
                afcn afcnVar4 = (afcn) obj5;
                int i7 = afcnVar4.b;
                if (i7 == 6) {
                    if ((i7 == 6 ? (afbs) afcnVar4.c : afbs.a).b == i) {
                        arrayList4.add(obj5);
                    }
                }
            }
            return defpackage.ajsz.ci(arrayList4) ? tvw.d : tvw.a;
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcModelAvailability", "checkAicoreFeatureStatus", 100, "SodaOnDeviceGrpcModelAvailability.kt")).v("Failed to check AiCore model availability");
            return tvw.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        tya tyaVar;
        if (aolnVar instanceof tya) {
            tyaVar = (tya) aolnVar;
            int i = tyaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tyaVar.c = i - Integer.MIN_VALUE;
            } else {
                tyaVar = new tya(this, aolnVar);
            }
        } else {
            tyaVar = new tya(this, aolnVar);
        }
        java.lang.Object objB = tyaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tyaVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                defpackage.afcg afcgVar = this.d;
                android.content.Context context = this.b;
                defpackage.afcg afcgVarCa = defpackage.wsc.ca(afcgVar, context, this.e);
                zoe zoeVarM = afcd.m((defpackage.akzz) afcm.a.m());
                defpackage.xtq xtqVarL = afcd.l(afby.a.m());
                java.lang.String packageName = context.getPackageName();
                defpackage.aooh.e(packageName, "getPackageName(...)");
                xtqVarL.N(packageName);
                zoeVarM.I(xtqVarL.M());
                java.lang.Object obj = zoeVarM.a;
                ((defpackage.akzx) obj).u();
                afcm afcmVar = ((defpackage.akzz) obj).b;
                afcmVar.f = 4;
                afcmVar.b |= 2;
                afcm afcmVarH = zoeVarM.H();
                tyaVar.c = 1;
                objB = afcgVarCa.b(afcmVarH, new defpackage.anph(), tyaVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objB);
            }
            afco afcoVar = (afco) objB;
            defpackage.alat alatVar = afcoVar.c;
            defpackage.aooh.e(alatVar, "getDownloadableModelList(...)");
            java.util.Map mapD = d(alatVar, tvy.c);
            defpackage.alat alatVar2 = afcoVar.d;
            defpackage.aooh.e(alatVar2, "getDownloadingModelList(...)");
            java.util.Map mapAQ = defpackage.ajsz.aQ(mapD, d(alatVar2, tvy.e));
            defpackage.alat alatVar3 = afcoVar.b;
            defpackage.aooh.e(alatVar3, "getDownloadedModelList(...)");
            return defpackage.ajsz.aQ(mapAQ, d(alatVar3, tvy.b));
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e2).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcModelAvailability", "checkModelAvailability", 149, "SodaOnDeviceGrpcModelAvailability.kt")).v("Failed to check SODA model availability");
            return defpackage.aokd.a;
        }
    }
}
