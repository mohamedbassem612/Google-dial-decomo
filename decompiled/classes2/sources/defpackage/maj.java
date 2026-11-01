package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class maj {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public maj(android.content.Context context, com.android.dialer.conversationhistorycalldetails.integrations.internal.CallDetailsFeatureIntegrationView callDetailsFeatureIntegrationView, ahpz ahpzVar, zzx zzxVar) {
        aooh.f(ahpzVar, "traceCreation");
        this.a = context;
        aigf aigfVarK = zzxVar.k();
        aooh.e(aigfVarK, "get(...)");
        java.util.List listBX = ajsz.bX(ajsz.aW(aigfVarK), new defpackage.hte(17));
        java.util.ArrayList<defpackage.mab> arrayList = new java.util.ArrayList(ajsz.bl(listBX, 10));
        java.util.Iterator it = listBX.iterator();
        while (it.hasNext()) {
            arrayList.add((defpackage.mab) ((aoin) ((aoiu) it.next()).b).a());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
        for (defpackage.mab mabVar : arrayList) {
            aooh.c(mabVar);
            arrayList2.add(abxl.G(new defpackage.mai(mabVar, ahpzVar)));
        }
        this.b = arrayList2;
        this.c = new vwb(arrayList2, new abye(callDetailsFeatureIntegrationView, new afpl((android.content.Context) this.a, (byte[]) null), 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nia niaVar;
        java.lang.String string;
        defpackage.nst nstVar;
        defpackage.nsj nsjVarF;
        if (aolnVar instanceof defpackage.nia) {
            niaVar = (defpackage.nia) aolnVar;
            int i = niaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                niaVar.b = i - Integer.MIN_VALUE;
            } else {
                niaVar = new defpackage.nia(this, aolnVar);
            }
        } else {
            niaVar = new defpackage.nia(this, aolnVar);
        }
        java.lang.Object objA = niaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = niaVar.b;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nstVar = niaVar.c;
                aooc.af(objA);
            }
            return new defpackage.nsg(nstVar, (defpackage.nmz) objA);
        }
        aooc.af(objA);
        java.lang.Object obj = this.c;
        niaVar.b = 1;
        objA = ((defpackage.ogj) obj).a(niaVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.nmu nmuVar = (defpackage.nmu) objA;
        alwy alwyVar = nmuVar.d;
        if (alwyVar == null) {
            alwyVar = alwy.a;
        }
        alat alatVar = alwyVar.c;
        aooh.e(alatVar, "getConversationItemsList(...)");
        aoot aootVar = new aoot();
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
        int i4 = 0;
        for (java.lang.Object obj2 : alatVar) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                ajsz.bh();
            }
            alww alwwVar = (alww) obj2;
            aooh.c(alwwVar);
            int iAQ = a.aQ((alwwVar.c == 3 ? (alyp) alwwVar.d : alyp.a).c);
            if (iAQ == 0) {
                iAQ = i3;
            }
            int i6 = iAQ - 1;
            if (i6 == i3) {
                defpackage.npw npwVarAq = mni.aq(defpackage.nsj.a.m());
                npwVarAq.g(alwwVar.f);
                npwVarAq.h(i4);
                akzx akzxVarM = defpackage.nsh.a.m();
                aooh.f(akzxVarM, "builder");
                alwf alwfVar = (alwwVar.c == 3 ? (alyp) alwwVar.d : alyp.a).d;
                if (alwfVar == null) {
                    alwfVar = alwf.a;
                }
                java.lang.String str = alwfVar.c;
                aooh.e(str, "getText(...)");
                aooh.f(str, "value");
                akzxVarM.u();
                defpackage.nsh nshVar = (defpackage.nsh) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                nshVar.b |= 1;
                nshVar.c = str;
                akzxVarM.u();
                defpackage.nsh nshVar2 = (defpackage.nsh) akzxVarM.b;
                nshVar2.d = a.Q(4);
                nshVar2.b |= 2;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.nsh nshVar3 = (defpackage.nsh) aladVarP;
                aooh.f(nshVar3, "value");
                akzx akzxVar = (akzx) npwVarAq.a;
                akzxVar.u();
                defpackage.nsj nsjVar = (defpackage.nsj) akzxVar.b;
                j$.util.Objects.requireNonNull(nshVar3);
                nsjVar.d = nshVar3;
                nsjVar.c = 4;
                nsjVarF = npwVarAq.f();
            } else {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("invalid utterance type");
                }
                defpackage.npw npwVarAq2 = mni.aq(defpackage.nsj.a.m());
                npwVarAq2.g(alwwVar.f);
                npwVarAq2.h(i4);
                akzx akzxVarM2 = defpackage.nsi.a.m();
                aooh.f(akzxVarM2, "builder");
                alwf alwfVar2 = (alwwVar.c == 3 ? (alyp) alwwVar.d : alyp.a).d;
                if (alwfVar2 == null) {
                    alwfVar2 = alwf.a;
                }
                java.lang.String str2 = alwfVar2.c;
                aooh.e(str2, "getText(...)");
                aooh.f(str2, "value");
                akzxVarM2.u();
                defpackage.nsi nsiVar = (defpackage.nsi) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                nsiVar.b |= 1;
                nsiVar.c = str2;
                akzxVarM2.u();
                defpackage.nsi nsiVar2 = (defpackage.nsi) akzxVarM2.b;
                nsiVar2.d = a.Q(4);
                nsiVar2.b |= 2;
                boolean z = (alwwVar.c == 3 ? (alyp) alwwVar.d : alyp.a).g;
                akzxVarM2.u();
                defpackage.nsi nsiVar3 = (defpackage.nsi) akzxVarM2.b;
                nsiVar3.b |= 4;
                nsiVar3.e = z;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.nsi nsiVar4 = (defpackage.nsi) aladVarP2;
                aooh.f(nsiVar4, "value");
                akzx akzxVar2 = (akzx) npwVarAq2.a;
                akzxVar2.u();
                defpackage.nsj nsjVar2 = (defpackage.nsj) akzxVar2.b;
                j$.util.Objects.requireNonNull(nsiVar4);
                nsjVar2.d = nsiVar4;
                nsjVar2.c = 3;
                nsjVarF = npwVarAq2.f();
            }
            arrayList.add(nsjVarF);
            aoluVar = aoluVar;
            i4 = i5;
            i3 = i3;
            alatVar = alatVar;
        }
        alat alatVar2 = alatVar;
        int i7 = i3;
        aolu aoluVar2 = aoluVar;
        aootVar.a = arrayList;
        java.util.Collection collection = (java.util.Collection) aootVar.a;
        defpackage.npw npwVarAq3 = mni.aq(defpackage.nsj.a.m());
        npwVarAq3.g(j$.time.Instant.now().toEpochMilli());
        npwVarAq3.h(alatVar2.size());
        akzx akzxVarM3 = defpackage.nsu.a.m();
        aooh.f(akzxVarM3, "builder");
        if ((nmuVar.b & 16) == 0 || !nmuVar.h) {
            defpackage.nmr nmrVarB = defpackage.nmr.b(nmuVar.g);
            if (nmrVarB == null) {
                nmrVarB = defpackage.nmr.UNRECOGNIZED;
            }
            int iOrdinal = nmrVarB.ordinal();
            if (iOrdinal == i7) {
                string = ((android.content.Context) this.a).getString(2132018421);
                aooh.e(string, "getString(...)");
            } else if (iOrdinal == 2) {
                string = ((android.content.Context) this.a).getString(2132018492);
                aooh.e(string, "getString(...)");
            } else if (iOrdinal == 3) {
                string = ((android.content.Context) this.a).getString(2132018393);
                aooh.e(string, "getString(...)");
            } else if (iOrdinal != 4) {
                string = "";
            } else {
                string = ((android.content.Context) this.a).getString(2132018380);
                aooh.e(string, "getString(...)");
            }
        } else {
            string = ((android.content.Context) this.a).getString(2132018444);
            aooh.e(string, "getString(...)");
        }
        aooh.f(string, "value");
        akzxVarM3.u();
        defpackage.nsu nsuVar = (defpackage.nsu) akzxVarM3.b;
        j$.util.Objects.requireNonNull(string);
        nsuVar.b |= 1;
        nsuVar.c = string;
        alad aladVarP3 = akzxVarM3.p();
        aooh.e(aladVarP3, "build(...)");
        defpackage.nsu nsuVar2 = (defpackage.nsu) aladVarP3;
        aooh.f(nsuVar2, "value");
        akzx akzxVar3 = (akzx) npwVarAq3.a;
        akzxVar3.u();
        defpackage.nsj nsjVar3 = (defpackage.nsj) akzxVar3.b;
        j$.util.Objects.requireNonNull(nsuVar2);
        nsjVar3.d = nsuVar2;
        nsjVar3.c = 5;
        aootVar.a = ajsz.bU(collection, npwVarAq3.f());
        defpackage.nwj nwjVarAo = mni.ao(defpackage.nst.a.m());
        nwjVarAo.k();
        java.lang.Iterable iterable = (java.lang.Iterable) aootVar.a;
        aooh.f(iterable, "values");
        akzx akzxVar4 = (akzx) nwjVarAo.a;
        akzxVar4.u();
        defpackage.nst nstVar2 = (defpackage.nst) akzxVar4.b;
        nstVar2.b();
        akyl.i(iterable, nstVar2.b);
        defpackage.nst nstVarJ = nwjVarAo.j();
        niaVar.c = nstVarJ;
        niaVar.b = 2;
        java.lang.Object objB = b(niaVar);
        if (objB == aoluVar2) {
            return aoluVar2;
        }
        objA = objB;
        nstVar = nstVarJ;
        return new defpackage.nsg(nstVar, (defpackage.nmz) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.nib nibVar;
        if (aolnVar instanceof defpackage.nib) {
            nibVar = (defpackage.nib) aolnVar;
            int i = nibVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nibVar.b = i - Integer.MIN_VALUE;
            } else {
                nibVar = new defpackage.nib(this, aolnVar);
            }
        } else {
            nibVar = new defpackage.nib(this, aolnVar);
        }
        java.lang.Object objD = nibVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nibVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = ((afpl) this.b).X();
            nibVar.b = 1;
            objD = aosv.D(ajcqVarX, nibVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarAc = ((defpackage.nhz) aooc.ar(objD, defpackage.nhz.class)).ac();
        nibVar.b = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAc, nibVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public maj(gpd gpdVar, java.lang.String str, rlv rlvVar) {
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(str, "callIdString");
        aooh.f(rlvVar, "loggingBindings");
        this.a = gpdVar;
        this.b = str;
        this.c = rlvVar;
    }

    public maj(pgi pgiVar, aoss aossVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.a = pgiVar;
        this.b = aossVar;
        this.c = aoinVar;
    }

    public maj(android.content.Context context, aazc aazcVar, defpackage.ogj ogjVar, afpl afplVar) {
        aooh.f(context, "appContext");
        aooh.f(aazcVar, "clock");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        this.a = context;
        this.c = ogjVar;
        this.b = afplVar;
    }
}
