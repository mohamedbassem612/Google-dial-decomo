package com.google.android.libraries.performance.primes.transmitter.clearcut;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ClearcutMetricSnapshotTransmitter {
    public volatile zzd a;
    public volatile zzd b;
    private volatile defpackage.aevx c;
    private volatile defpackage.aewc d;
    private final ahzi e = ahvr.bI(new fed(12));

    public final ajcq a(android.content.Context context, defpackage.aevu aevuVar) {
        java.lang.String str;
        java.lang.Integer numValueOf;
        apdi apdiVar = defpackage.aevy.j;
        aevuVar.c(apdiVar);
        ahvr.bN(((alaa) aevuVar).n.l((alac) apdiVar.a), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        apgu apguVar = aevuVar.c;
        if (apguVar == null) {
            apguVar = apgu.a;
        }
        java.lang.String str2 = apguVar.e.isEmpty() ? apguVar.d : apguVar.e;
        if (str2.isEmpty()) {
            numValueOf = null;
        } else {
            int i = airu.a;
            airr airrVar = aisb.b;
            int i2 = apguVar.b;
            if ((16777216 & i2) != 0) {
                str = "PRIMES_STATS";
            } else if ((i2 & 32) != 0) {
                str = "NETWORK_USAGE";
            } else if ((i2 & 16) != 0) {
                str = "TIMER";
            } else if ((i2 & 8) != 0) {
                str = "MEMORY_USAGE";
            } else if ((i2 & 256) != 0) {
                str = "BATTERY_USAGE";
            } else if ((i2 & 64) != 0) {
                str = "CRASH";
            } else if ((524288 & i2) != 0) {
                str = "CUI";
            } else if ((i2 & 512) != 0) {
                str = "JANK";
            } else if ((i2 & 128) != 0) {
                str = "PACKAGE";
            } else {
                str = (i2 & 1024) != 0 ? "TRACE" : "UNKNOWN";
            }
            numValueOf = java.lang.Integer.valueOf(airrVar.b(a.bE(str2, (byte) 95, str), java.nio.charset.StandardCharsets.UTF_8).a());
        }
        java.lang.Integer num = numValueOf;
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = new defpackage.aewc();
                }
            }
        }
        apgu apguVar2 = aevuVar.c;
        if (apguVar2 == null) {
            apguVar2 = apgu.a;
        }
        akzx akzxVarP = apguVar2.p();
        defpackage.aewc.b(defpackage.aewc.a, akzxVarP);
        apej apejVar = akzxVarP.b.k;
        if (apejVar == null) {
            apejVar = apej.a;
        }
        if ((apejVar.b & 1) != 0) {
            apej apejVar2 = akzxVarP.b.k;
            if (apejVar2 == null) {
                apejVar2 = apej.a;
            }
            defpackage.apei apeiVar = apejVar2.c;
            if (apeiVar == null) {
                apeiVar = defpackage.apei.a;
            }
            akzx akzxVarP2 = apeiVar.p();
            defpackage.aewc.b(defpackage.aewc.b, akzxVarP2);
            apej apejVar3 = akzxVarP.b.k;
            if (apejVar3 == null) {
                apejVar3 = apej.a;
            }
            akzx akzxVarP3 = apejVar3.p();
            akzxVarP3.u();
            apej apejVar4 = akzxVarP3.b;
            defpackage.apei apeiVar2 = (defpackage.apei) akzxVarP2.p();
            j$.util.Objects.requireNonNull(apeiVar2);
            apejVar4.c = apeiVar2;
            apejVar4.b |= 1;
            akzxVarP.u();
            apgu apguVar3 = akzxVarP.b;
            apej apejVarP = akzxVarP3.p();
            j$.util.Objects.requireNonNull(apejVarP);
            apguVar3.k = apejVarP;
            apguVar3.b |= 256;
        }
        apgi apgiVar = akzxVarP.b.i;
        if (apgiVar == null) {
            apgiVar = apgi.a;
        }
        if ((apgiVar.b & 256) != 0) {
            apgi apgiVar2 = akzxVarP.b.i;
            if (apgiVar2 == null) {
                apgiVar2 = apgi.a;
            }
            aiwk aiwkVar = apgiVar2.i;
            if (aiwkVar == null) {
                aiwkVar = aiwk.a;
            }
            akzx akzxVarP4 = aiwkVar.p();
            aiwh aiwhVar = akzxVarP4.b.e;
            if (aiwhVar == null) {
                aiwhVar = aiwh.a;
            }
            aiwh aiwhVarC = defpackage.aewc.c(aiwhVar);
            akzxVarP4.u();
            aiwk aiwkVar2 = akzxVarP4.b;
            j$.util.Objects.requireNonNull(aiwhVarC);
            aiwkVar2.e = aiwhVarC;
            aiwkVar2.b |= 1;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVarP4.b.f);
            akzxVarP4.u();
            akzxVarP4.b.f = albq.a;
            java.util.Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                aiwh aiwhVarC2 = defpackage.aewc.c((aiwh) it.next());
                akzxVarP4.u();
                aiwk aiwkVar3 = akzxVarP4.b;
                j$.util.Objects.requireNonNull(aiwhVarC2);
                aiwkVar3.b();
                aiwkVar3.f.add(aiwhVarC2);
            }
            aiwk aiwkVar4 = akzxVarP4.b;
            alat<aiwj> alatVar = (aiwkVar4.c == 4 ? (aiwi) aiwkVar4.d : aiwi.a).b;
            akzx akzxVarM = aiwi.a.m();
            for (aiwj aiwjVar : alatVar) {
                aiwh aiwhVar2 = aiwjVar.c;
                if (aiwhVar2 == null) {
                    aiwhVar2 = aiwh.a;
                }
                if ((aiwhVar2.b & 2) != 0) {
                    akzx akzxVarP5 = aiwjVar.p();
                    aiwh aiwhVarC3 = defpackage.aewc.c(aiwhVar2);
                    akzxVarP5.u();
                    aiwj aiwjVar2 = akzxVarP5.b;
                    j$.util.Objects.requireNonNull(aiwhVarC3);
                    aiwjVar2.c = aiwhVarC3;
                    aiwjVar2.b |= 1;
                    aiwjVar = (aiwj) akzxVarP5.p();
                }
                akzxVarM.u();
                aiwi aiwiVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(aiwjVar);
                aiwiVar.b();
                aiwiVar.b.add(aiwjVar);
            }
            aiwi aiwiVarP = akzxVarM.p();
            akzxVarP4.u();
            aiwk aiwkVar5 = akzxVarP4.b;
            j$.util.Objects.requireNonNull(aiwiVarP);
            aiwkVar5.d = aiwiVarP;
            aiwkVar5.c = 4;
            apgi apgiVar3 = akzxVarP.b.i;
            if (apgiVar3 == null) {
                apgiVar3 = apgi.a;
            }
            akzx akzxVarP6 = apgiVar3.p();
            aiwk aiwkVarP = akzxVarP4.p();
            akzxVarP6.u();
            apgi apgiVar4 = akzxVarP6.b;
            j$.util.Objects.requireNonNull(aiwkVarP);
            apgiVar4.i = aiwkVarP;
            apgiVar4.b |= 256;
            apgi apgiVarP = akzxVarP6.p();
            akzxVarP.u();
            apgu apguVar4 = akzxVarP.b;
            j$.util.Objects.requireNonNull(apgiVarP);
            apguVar4.i = apgiVarP;
            apguVar4.b |= 64;
        }
        apgp apgpVar = akzxVarP.b.j;
        if (apgpVar == null) {
            apgpVar = apgp.a;
        }
        if (apgpVar.k.size() != 0) {
            apgp apgpVar2 = akzxVarP.b.j;
            if (apgpVar2 == null) {
                apgpVar2 = apgp.a;
            }
            akzx akzxVarP7 = apgpVar2.p();
            for (int i3 = 0; i3 < akzxVarP7.b.k.size(); i3++) {
                akzx akzxVarP8 = ((defpackage.apgo) akzxVarP7.b.k.get(i3)).p();
                if (!((defpackage.apgo) akzxVarP8.b).c.isEmpty()) {
                    akzxVarP8.u();
                    ((defpackage.apgo) akzxVarP8.b).d = albd.a;
                    java.util.List listA = defpackage.aewc.a(((defpackage.apgo) akzxVarP8.b).c);
                    akzxVarP8.u();
                    defpackage.apgo apgoVar = (defpackage.apgo) akzxVarP8.b;
                    alan alanVar = apgoVar.d;
                    if (!alanVar.c()) {
                        apgoVar.d = alad.I(alanVar);
                    }
                    akyl.i(listA, apgoVar.d);
                }
                akzxVarP8.u();
                defpackage.apgo apgoVar2 = (defpackage.apgo) akzxVarP8.b;
                apgoVar2.b &= -2;
                apgoVar2.c = defpackage.apgo.a.c;
                akzxVarP7.u();
                apgp apgpVar3 = akzxVarP7.b;
                defpackage.apgo apgoVar3 = (defpackage.apgo) akzxVarP8.p();
                j$.util.Objects.requireNonNull(apgoVar3);
                alat alatVar2 = apgpVar3.k;
                if (!alatVar2.c()) {
                    apgpVar3.k = alad.J(alatVar2);
                }
                apgpVar3.k.set(i3, apgoVar3);
            }
            akzxVarP.u();
            apgu apguVar5 = akzxVarP.b;
            apgp apgpVarP = akzxVarP7.p();
            j$.util.Objects.requireNonNull(apgpVarP);
            apguVar5.j = apgpVarP;
            apguVar5.b |= 128;
        }
        apfd apfdVar = akzxVarP.b.h;
        if (apfdVar == null) {
            apfdVar = apfd.a;
        }
        if (apfdVar.b.size() != 0) {
            apfd apfdVar2 = akzxVarP.b.h;
            if (apfdVar2 == null) {
                apfdVar2 = apfd.a;
            }
            akzx akzxVarP9 = apfdVar2.p();
            for (int i4 = 0; i4 < akzxVarP9.b.b.size(); i4++) {
                akzx akzxVarP10 = ((defpackage.apfc) akzxVarP9.b.b.get(i4)).p();
                if (!((defpackage.apfc) akzxVarP10.b).w.isEmpty()) {
                    akzxVarP10.u();
                    ((defpackage.apfc) akzxVarP10.b).x = albd.a;
                    java.util.List listA2 = defpackage.aewc.a(((defpackage.apfc) akzxVarP10.b).w);
                    akzxVarP10.u();
                    defpackage.apfc apfcVar = (defpackage.apfc) akzxVarP10.b;
                    alan alanVar2 = apfcVar.x;
                    if (!alanVar2.c()) {
                        apfcVar.x = alad.I(alanVar2);
                    }
                    akyl.i(listA2, apfcVar.x);
                }
                akzxVarP10.u();
                defpackage.apfc apfcVar2 = (defpackage.apfc) akzxVarP10.b;
                apfcVar2.b &= -524289;
                apfcVar2.w = defpackage.apfc.a.w;
                akzxVarP9.u();
                apfd apfdVar3 = akzxVarP9.b;
                defpackage.apfc apfcVar3 = (defpackage.apfc) akzxVarP10.p();
                j$.util.Objects.requireNonNull(apfcVar3);
                apfdVar3.b();
                apfdVar3.b.set(i4, apfcVar3);
            }
            for (int i5 = 0; i5 < akzxVarP9.b.c.size(); i5++) {
                akzx akzxVarP11 = ((defpackage.apff) akzxVarP9.b.c.get(i5)).p();
                if (!((defpackage.apff) akzxVarP11.b).c.isEmpty()) {
                    akzxVarP11.u();
                    ((defpackage.apff) akzxVarP11.b).d = albd.a;
                    java.util.List listA3 = defpackage.aewc.a(((defpackage.apff) akzxVarP11.b).c);
                    akzxVarP11.u();
                    defpackage.apff apffVar = (defpackage.apff) akzxVarP11.b;
                    alan alanVar3 = apffVar.d;
                    if (!alanVar3.c()) {
                        apffVar.d = alad.I(alanVar3);
                    }
                    akyl.i(listA3, apffVar.d);
                }
                akzxVarP11.u();
                defpackage.apff apffVar2 = (defpackage.apff) akzxVarP11.b;
                apffVar2.b &= -2;
                apffVar2.c = defpackage.apff.a.c;
                akzxVarP9.u();
                apfd apfdVar4 = akzxVarP9.b;
                defpackage.apff apffVar3 = (defpackage.apff) akzxVarP11.p();
                j$.util.Objects.requireNonNull(apffVar3);
                alat alatVar3 = apfdVar4.c;
                if (!alatVar3.c()) {
                    apfdVar4.c = alad.J(alatVar3);
                }
                apfdVar4.c.set(i5, apffVar3);
            }
            akzxVarP.u();
            apgu apguVar6 = akzxVarP.b;
            apfd apfdVarP = akzxVarP9.p();
            j$.util.Objects.requireNonNull(apfdVarP);
            apguVar6.h = apfdVarP;
            apguVar6.b |= 32;
        }
        apfg apfgVar = akzxVarP.b.m;
        if (apfgVar == null) {
            apfgVar = apfg.a;
        }
        if (apfgVar.e.size() != 0) {
            apfg apfgVar2 = akzxVarP.b.m;
            if (apfgVar2 == null) {
                apfgVar2 = apfg.a;
            }
            akzx akzxVarP12 = apfgVar2.p();
            for (int i6 = 0; i6 < akzxVarP12.b.e.size(); i6++) {
                akzz akzzVarP = ((defpackage.apfh) akzxVarP12.b.e.get(i6)).p();
                defpackage.aewc.b(defpackage.aewc.c, akzzVarP);
                akzxVarP12.u();
                apfg apfgVar3 = akzxVarP12.b;
                defpackage.apfh apfhVarP = akzzVarP.p();
                j$.util.Objects.requireNonNull(apfhVarP);
                alat alatVar4 = apfgVar3.e;
                if (!alatVar4.c()) {
                    apfgVar3.e = alad.J(alatVar4);
                }
                apfgVar3.e.set(i6, apfhVarP);
            }
            akzxVarP.u();
            apgu apguVar7 = akzxVarP.b;
            apfg apfgVarP = akzxVarP12.p();
            j$.util.Objects.requireNonNull(apfgVarP);
            apguVar7.m = apfgVarP;
            apguVar7.b |= 1024;
        }
        apgu apguVarP = akzxVarP.p();
        if (((java.lang.Boolean) this.e.eZ()).booleanValue()) {
            return ajcm.a;
        }
        apdi apdiVar2 = defpackage.aevy.j;
        aevuVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) aevuVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        defpackage.aevy aevyVar = (defpackage.aevy) objJ;
        boolean z = aevyVar.h;
        boolean z2 = (apguVarP.b & 64) != 0;
        defpackage.aevx aevxVar = this.c;
        if (aevxVar == null) {
            synchronized (this) {
                aevxVar = this.c;
                if (aevxVar == null) {
                    aevxVar = new defpackage.aevx();
                    this.c = aevxVar;
                }
            }
        }
        return ajan.g(aevxVar.a(context, z, !z2), new defpackage.acyf(this, context, apguVarP, num, aevyVar, 10), ajbm.a);
    }
}
