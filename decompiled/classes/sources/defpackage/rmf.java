package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rmf implements defpackage.zbp {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/logging/events/DialerEventObserver");
    private final defpackage.rlv b;
    private final defpackage.ruc c;
    private final defpackage.zjv d;
    private final defpackage.gpd e;
    private final defpackage.aogc f;

    public rmf(defpackage.rlv rlvVar, defpackage.gpd gpdVar, defpackage.ruc rucVar, defpackage.zjv zjvVar, defpackage.aogc aogcVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("externalsLogging");
        }
        this.b = rlvVar;
        this.e = gpdVar;
        this.c = rucVar;
        this.d = zjvVar;
        this.f = aogcVar;
    }

    private final defpackage.zas b() {
        return this.e.i(null);
    }

    private static final defpackage.mhc c(defpackage.wsc wscVar) {
        if (wscVar == null) {
            defpackage.mhc mhcVar = defpackage.mhc.a;
            defpackage.aooh.e(mhcVar, "getDefaultInstance(...)");
            return mhcVar;
        }
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        defpackage.aooh.e(akzxVarM, "newBuilder(...)");
        j$.util.Objects.checkIndex(0, 10);
        if (wscVar instanceof zch) {
            boolean z = ((zch) wscVar).a;
            akzxVarM.u();
            defpackage.mhc mhcVar2 = (defpackage.mhc) akzxVarM.b;
            mhcVar2.b = 1;
            mhcVar2.c = java.lang.Boolean.valueOf(z);
        } else if (wscVar instanceof zco) {
            java.lang.String str = ((zco) wscVar).a;
            akzxVarM.u();
            defpackage.mhc mhcVar3 = (defpackage.mhc) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            mhcVar3.b = 2;
            mhcVar3.c = str;
        } else if (wscVar instanceof zck) {
            int i = ((zck) wscVar).a;
            akzxVarM.u();
            defpackage.mhc mhcVar4 = (defpackage.mhc) akzxVarM.b;
            mhcVar4.b = 3;
            mhcVar4.c = java.lang.Long.valueOf(i);
        } else if (wscVar instanceof zcl) {
            long j = ((zcl) wscVar).a;
            akzxVarM.u();
            defpackage.mhc mhcVar5 = (defpackage.mhc) akzxVarM.b;
            mhcVar5.b = 3;
            mhcVar5.c = java.lang.Long.valueOf(j);
        } else if (wscVar instanceof zcj) {
            float f = ((zcj) wscVar).a;
            akzxVarM.u();
            defpackage.mhc mhcVar6 = (defpackage.mhc) akzxVarM.b;
            mhcVar6.b = 4;
            mhcVar6.c = java.lang.Float.valueOf(f);
        } else if (wscVar instanceof zci) {
            defpackage.akzc akzcVarU = defpackage.akzc.u(((zci) wscVar).a);
            akzxVarM.u();
            defpackage.mhc mhcVar7 = (defpackage.mhc) akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVarU);
            mhcVar7.b = 5;
            mhcVar7.c = akzcVarU;
        } else {
            if (wscVar instanceof zcg) {
                defpackage.mha.a.m();
                throw null;
            }
            if (wscVar instanceof zcm) {
                defpackage.mhb.a.m();
                throw null;
            }
            if (!(wscVar instanceof zcn)) {
                throw new defpackage.aois();
            }
            defpackage.akyp akypVar = ((zcn) wscVar).a;
            akzxVarM.u();
            defpackage.mhc mhcVar8 = (defpackage.mhc) akzxVarM.b;
            j$.util.Objects.requireNonNull(akypVar);
            mhcVar8.c = akypVar;
            mhcVar8.b = 9;
        }
        defpackage.alad aladVarR = akzxVarM.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.mhc) aladVarR;
    }

    @Override // defpackage.zbp
    public final void a(defpackage.zbo zboVar) {
        java.util.List arrayList;
        defpackage.zas zasVarB;
        defpackage.zas zasVarB2;
        j$.util.Objects.checkIndex(0, 5);
        if (zboVar instanceof defpackage.zbq) {
            java.util.Map map = rmh.a;
            zbr zbrVar = ((defpackage.zbq) zboVar).a;
            defpackage.rmw rmwVar = (defpackage.rmw) rmh.a.get(zbrVar);
            if (rmwVar != null) {
                this.b.n(rmwVar);
            }
            java.util.Map map2 = rmi.a;
            defpackage.rmx rmxVar = (defpackage.rmx) rmi.a.get(zbrVar);
            if (rmxVar != null) {
                this.b.o(rmxVar);
            }
            java.util.Map map3 = rmd.a;
            defpackage.mce mceVar = (defpackage.mce) rmd.a.get(zbrVar);
            if (mceVar != null && (zasVarB2 = b()) != null) {
                zasVarB2.b(mceVar);
            }
            java.util.Map map4 = rmc.a;
            defpackage.mcd mcdVar = (defpackage.mcd) rmc.a.get(zbrVar);
            if (mcdVar != null && (zasVarB = b()) != null) {
                zasVarB.a(mcdVar);
            }
            java.util.Map map5 = rmk.a;
            defpackage.aenj aenjVar = (defpackage.aenj) rmk.a.get(zbrVar);
            if (aenjVar != null) {
                this.c.j(aenjVar);
            }
            defpackage.aenj aenjVar2 = (defpackage.aenj) rmk.b.get(zbrVar);
            if (aenjVar2 != null) {
                this.c.m(aenjVar2);
            }
            defpackage.aenj aenjVar3 = (defpackage.aenj) rmk.c.get(zbrVar);
            if (aenjVar3 != null) {
                this.c.b(aenjVar3);
                return;
            }
            return;
        }
        int i = 2;
        if (!(zboVar instanceof defpackage.zcd)) {
            if (zboVar instanceof defpackage.ysw) {
                this.b.a(((defpackage.ysw) zboVar).a);
                return;
            }
            if (zboVar instanceof defpackage.zbs) {
                java.util.Map map6 = rme.a;
                zbt zbtVar = ((defpackage.zbs) zboVar).a;
                amtq amtqVar = (amtq) rme.a.get(zbtVar);
                if (amtqVar == null) {
                    ((defpackage.aimw) a.b().l("com/android/dialer/logging/events/DialerEventObserver", "onDeidentifiedCallingEvent", 63, "DialerEventObserver.kt")).y("Received unmapped deidentified event type: %s", zbtVar);
                    return;
                }
                defpackage.aogc aogcVar = this.f;
                ajyi ajyiVarT = defpackage.anar.T(amtr.a.m());
                defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarT.a;
                akzxVar.u();
                amtr amtrVar = akzxVar.b;
                amtrVar.c = java.lang.Integer.valueOf(amtqVar.c);
                amtrVar.b = 2;
                ((defpackage.zdi) aogcVar.a).d(((defpackage.zzd) aogcVar.b).h(ajyiVarT.au(), new defpackage.abtl((android.content.Context) aogcVar.c, new defpackage.absv(new apea()))));
                return;
            }
            return;
        }
        defpackage.zcd zcdVar = (defpackage.zcd) zboVar;
        java.util.Map map7 = rmj.a;
        defpackage.mgv mgvVar = (defpackage.mgv) rmj.a.get(zcdVar.a);
        if (mgvVar != null) {
            defpackage.zjv zjvVar = this.d;
            java.util.List list = zcdVar.b;
            if (list != null) {
                arrayList = new java.util.ArrayList(list.size());
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c((defpackage.wsc) it.next()));
                }
            } else {
                arrayList = defpackage.aokc.a;
            }
            defpackage.wsc wscVar = zcdVar.e;
            zcf zcfVar = zcdVar.d;
            defpackage.mhc mhcVarC = c(wscVar);
            int iOrdinal = zcfVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    i = 3;
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.aois();
                    }
                    i = 4;
                }
            }
            zjvVar.h(mgvVar, arrayList, mhcVarC, i);
        }
    }
}
