package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lhb implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lhb(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r11v47, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v14, types: [acyv, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarO;
        final int i = 17;
        int i2 = 4;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optional = (j$.util.Optional) obj;
                j$.util.Optional optionalEmpty = (this.a == 2 || !optional.isPresent()) ? j$.util.Optional.empty() : ((defpackage.lhd) optional.orElseThrow()).e;
                defpackage.lgg lggVar = (defpackage.lgg) ((defpackage.ifb) this.b).e;
                lggVar.j.a(qbc.l);
                lggVar.f(4);
                return ahvr.I(lggVar.b(), new defpackage.ldp(optionalEmpty, i), lggVar.d);
            case 1:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (defpackage.lkq lkqVar : (java.util.List) obj) {
                    arrayList.add(lkqVar.a);
                    java.lang.String str = lkqVar.c;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        arrayList2.add(str);
                    }
                }
                int i4 = this.a;
                ldb ldbVar = (ldb) this.b;
                ajcq ajcqVarEU = ldbVar.c.eU(ahqx.i(new defpackage.jyr(arrayList2, 18)));
                if (i4 == 1) {
                    lkk lkkVar = ldbVar.d;
                    ajcqVarO = lkkVar.c.e(new defpackage.ibi(lkkVar, arrayList, 16), lkkVar.a);
                } else {
                    lkk lkkVar2 = ldbVar.d;
                    boolean z = i4 == 3;
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(lkkVar2.e((java.lang.String) it.next(), new defpackage.lkh(z, 0), epochMilli));
                    }
                    ajcqVarO = ahvr.aj(arrayList3).o(ahqx.i(new defpackage.jse(15)), lkkVar2.a);
                }
                return ahvr.ak(new ajcq[]{ajcqVarEU, ajcqVarO}).o(ahqx.i(new defpackage.jse(10)), ajbm.a);
            case 2:
                if (((defpackage.lgj) obj) == defpackage.lgj.a) {
                    return ajcm.a;
                }
                int i5 = this.a;
                java.lang.Object obj2 = this.b;
                if (i5 == 2) {
                    ((qbe) ((defpackage.ifb) obj2).b).a(qbc.o);
                }
                defpackage.ifb ifbVar = (defpackage.ifb) obj2;
                ahrv ahrvVarG = ahrv.g(((defpackage.lgi) ifbVar.c).c());
                defpackage.lhb lhbVar = new defpackage.lhb(obj2, i5, i3);
                ?? r12 = ifbVar.d;
                return ahrvVarG.i(lhbVar, (java.util.concurrent.Executor) r12).i(new defpackage.lgr(obj2, 20), (java.util.concurrent.Executor) r12);
            case 3:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (optional2.isPresent()) {
                    return ((tbj) this.b).b((java.io.File) optional2.orElseThrow(), 0, this.a);
                }
                return aiql.y(new java.lang.IllegalStateException("Ringing sound file not available; cannot play ringing sound"));
            case 4:
                aify aifyVar = (aify) obj;
                if (aifyVar == null || aifyVar.isEmpty()) {
                    return ajcm.a;
                }
                int i6 = this.a;
                java.lang.Object obj3 = this.b;
                usf.a.b().l("com/android/dialer/timekeeper/impl/TimeKeeperDetailsImporter", "loadDataFromFileToDb", 66, "TimeKeeperDetailsImporter.java").v("loadDataFromFileToDb");
                usj usjVar = ((usf) obj3).d;
                usl uslVar = usjVar.b;
                j$.util.Objects.requireNonNull(uslVar);
                ajas ajasVarB = ahqx.b(new plx(uslVar, 18));
                ajwr ajwrVar = usjVar.d;
                ajct ajctVar = usjVar.c;
                return ahvr.B(ahrv.g(ajwrVar.e(ajasVarB, ajctVar)).i(new uhj(usjVar, aifyVar, 5), ajctVar).i(new defpackage.lhb(usjVar, i6, 5), ajctVar).h(new uqm(9), ajctVar), java.lang.Throwable.class, new uqm(10), ajctVar);
            case 5:
                int i7 = this.a;
                java.lang.Object obj4 = this.b;
                ajas ajasVarB2 = ahqx.b(new pth(obj4, i7, 2));
                usj usjVar2 = (usj) obj4;
                return usjVar2.d.e(ajasVarB2, usjVar2.c);
            case 6:
                utf utfVar = (utf) this.b;
                tvg tvgVar = new tvg(new java.io.File(utfVar.c().concat("/tk_dataset.pb")), 14);
                usf usfVar = utfVar.d;
                ajcq ajcqVarF = ahvr.F(tvgVar, usfVar.b);
                uqm uqmVar = new uqm(3);
                ajct ajctVar2 = usfVar.c;
                return ahvr.B(ahrv.g(ahvr.B(ajcqVarF, java.lang.Throwable.class, uqmVar, ajctVar2)).i(new defpackage.lhb(usfVar, this.a, i2), ajctVar2), java.lang.Throwable.class, new uqm(2), ajctVar2);
            case 7:
                java.lang.Object obj5 = this.b;
                vku vkuVar = (vku) obj5;
                vew vewVar = vkuVar.e;
                return ahvr.H(ahvr.E(new vet(vewVar, 0), vewVar.c), new rwg(obj5, (java.lang.Exception) obj, this.a, 3), vkuVar.d);
            case 8:
                zsq zsqVar = (zsq) this.b;
                j$.util.Optional optional3 = zsqVar.d;
                optional3.isPresent();
                ((gou) optional3.get()).m();
                return zsqVar.b((zrx) obj, this.a + 1);
            case 9:
                java.lang.Object obj6 = this.b;
                agqj agqjVar = (agqj) obj6;
                return ahvr.I(agqjVar.b.e(), new defpackage.lgl(obj6, (java.util.List) obj, this.a, i2), (java.util.concurrent.Executor) agqjVar.d);
            case 10:
                adfl adflVar = (adfl) obj;
                if (!adff.j(adflVar)) {
                    return aiql.y(new adfc());
                }
                java.lang.Object obj7 = this.b;
                adfk adfkVar = adflVar.c;
                if (adfkVar == null) {
                    adfkVar = adfk.a;
                }
                return ahrv.g(((adff) obj7).d.c(adfkVar, this.a)).f(java.io.FileNotFoundException.class, new adfd(obj7, 1), ajbm.a);
            default:
                adfl adflVar2 = (adfl) obj;
                boolean zI = adff.i(adflVar2);
                java.lang.Object obj8 = this.b;
                if (!zI || !adff.h(adflVar2)) {
                    return aiql.z(((adff) obj8).a());
                }
                adag adagVar = ((adff) obj8).d;
                adfk adfkVar2 = adflVar2.c;
                if (adfkVar2 == null) {
                    adfkVar2 = adfk.a;
                }
                ahrv ahrvVarG2 = ahrv.g(adagVar.c(adfkVar2, this.a));
                adfe adfeVar = new adfe(1);
                ajbm ajbmVar = ajbm.a;
                return ahrvVarG2.h(adfeVar, ajbmVar).e(java.lang.Exception.class, new ahyc() { // from class: aczn
                    public final java.lang.Object apply(java.lang.Object obj9) {
                        switch (i) {
                            case 0:
                                return java.lang.Boolean.TRUE;
                            case 1:
                                return java.lang.Boolean.FALSE;
                            case 2:
                                return java.lang.Boolean.FALSE;
                            case 3:
                                return java.lang.Boolean.TRUE;
                            case 4:
                                return java.lang.Boolean.FALSE;
                            case 5:
                                return java.lang.Boolean.TRUE;
                            case 6:
                                akzx akzxVarP = ((acwh) obj9).p();
                                akzxVarP.x();
                                return akzxVarP.p();
                            case 7:
                                return java.lang.Boolean.TRUE;
                            case 8:
                                defpackage.aixc aixcVar = (defpackage.aixc) obj9;
                                akzx akzxVarM = defpackage.aiwo.a.m();
                                akzxVarM.u();
                                defpackage.aiwo aiwoVar = (defpackage.aiwo) akzxVarM.b;
                                j$.util.Objects.requireNonNull(aixcVar);
                                aiwoVar.j = aixcVar;
                                aiwoVar.c |= 8192;
                                return java.util.Arrays.asList((defpackage.aiwo) akzxVarM.p());
                            case 9:
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                for (adaz adazVar : (java.util.List) obj9) {
                                    akzx akzxVarM2 = defpackage.aiwo.a.m();
                                    defpackage.aiwu aiwuVar = adazVar.a;
                                    akzxVarM2.u();
                                    defpackage.aiwo aiwoVar2 = (defpackage.aiwo) akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(aiwuVar);
                                    aiwoVar2.h = aiwuVar;
                                    aiwoVar2.b |= Integer.MIN_VALUE;
                                    defpackage.aiwm aiwmVar = adazVar.b;
                                    akzxVarM2.u();
                                    defpackage.aiwo aiwoVar3 = (defpackage.aiwo) akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(aiwmVar);
                                    aiwoVar3.e = aiwmVar;
                                    aiwoVar3.b |= 256;
                                    arrayList4.add((defpackage.aiwo) akzxVarM2.p());
                                }
                                return arrayList4;
                            case 10:
                                defpackage.aiwz aiwzVar = (defpackage.aiwz) obj9;
                                akzx akzxVarM3 = defpackage.aiwo.a.m();
                                akzxVarM3.u();
                                defpackage.aiwo aiwoVar4 = (defpackage.aiwo) akzxVarM3.b;
                                j$.util.Objects.requireNonNull(aiwzVar);
                                aiwoVar4.l = aiwzVar;
                                aiwoVar4.c |= 65536;
                                return java.util.Arrays.asList((defpackage.aiwo) akzxVarM3.p());
                            case 11:
                                akzx akzxVarM4 = defpackage.aiwz.a.m();
                                long j = 0;
                                long j2 = 0;
                                for (acvy acvyVar : (java.util.List) obj9) {
                                    akzx akzxVarM5 = defpackage.aiwy.a.m();
                                    akzx akzxVarM6 = defpackage.aiwm.a.m();
                                    acwb acwbVar = acvyVar.c;
                                    if (acwbVar == null) {
                                        acwbVar = acwb.a;
                                    }
                                    java.lang.String str2 = acwbVar.d;
                                    akzxVarM6.u();
                                    defpackage.aiwm aiwmVar2 = (defpackage.aiwm) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(str2);
                                    aiwmVar2.b |= 4;
                                    aiwmVar2.e = str2;
                                    acwb acwbVar2 = acvyVar.c;
                                    if (acwbVar2 == null) {
                                        acwbVar2 = acwb.a;
                                    }
                                    java.lang.String str3 = acwbVar2.c;
                                    akzxVarM6.u();
                                    defpackage.aiwm aiwmVar3 = (defpackage.aiwm) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(str3);
                                    aiwmVar3.b |= 1;
                                    aiwmVar3.c = str3;
                                    int i8 = acvyVar.f;
                                    akzxVarM6.u();
                                    defpackage.aiwm aiwmVar4 = (defpackage.aiwm) akzxVarM6.b;
                                    aiwmVar4.b |= 2;
                                    aiwmVar4.d = i8;
                                    long j3 = acvyVar.d;
                                    akzxVarM6.u();
                                    defpackage.aiwm aiwmVar5 = (defpackage.aiwm) akzxVarM6.b;
                                    aiwmVar5.b |= 64;
                                    aiwmVar5.i = j3;
                                    java.lang.String str4 = acvyVar.e;
                                    akzxVarM6.u();
                                    defpackage.aiwm aiwmVar6 = (defpackage.aiwm) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(str4);
                                    aiwmVar6.b |= 128;
                                    aiwmVar6.j = str4;
                                    defpackage.aiwm aiwmVar7 = (defpackage.aiwm) akzxVarM6.p();
                                    akzxVarM5.u();
                                    defpackage.aiwy aiwyVar = (defpackage.aiwy) akzxVarM5.b;
                                    j$.util.Objects.requireNonNull(aiwmVar7);
                                    aiwyVar.c = aiwmVar7;
                                    aiwyVar.b |= 1;
                                    long j4 = acvyVar.h;
                                    akzxVarM5.u();
                                    defpackage.aiwy aiwyVar2 = (defpackage.aiwy) akzxVarM5.b;
                                    aiwyVar2.b |= 2;
                                    aiwyVar2.d = j4;
                                    long j5 = acvyVar.g;
                                    akzxVarM5.u();
                                    defpackage.aiwy aiwyVar3 = (defpackage.aiwy) akzxVarM5.b;
                                    aiwyVar3.b |= 4;
                                    aiwyVar3.e = j5;
                                    akzxVarM4.u();
                                    defpackage.aiwz aiwzVar2 = (defpackage.aiwz) akzxVarM4.b;
                                    defpackage.aiwy aiwyVar4 = (defpackage.aiwy) akzxVarM5.p();
                                    j$.util.Objects.requireNonNull(aiwyVar4);
                                    alat alatVar = aiwzVar2.c;
                                    if (!alatVar.c()) {
                                        aiwzVar2.c = alad.J(alatVar);
                                    }
                                    aiwzVar2.c.add(aiwyVar4);
                                    j += acvyVar.h;
                                    j2 += acvyVar.g;
                                }
                                akzxVarM4.u();
                                defpackage.aiwz aiwzVar3 = (defpackage.aiwz) akzxVarM4.b;
                                aiwzVar3.b |= 1;
                                aiwzVar3.d = j;
                                akzxVarM4.u();
                                defpackage.aiwz aiwzVar4 = (defpackage.aiwz) akzxVarM4.b;
                                aiwzVar4.b |= 2;
                                aiwzVar4.e = j2;
                                return (defpackage.aiwz) akzxVarM4.p();
                            case 12:
                                acwf acwfVar = ((acwd) obj9).f;
                                return acwfVar == null ? acwf.a : acwfVar;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                return ahwt.a;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                return ahyn.h((java.lang.Throwable) obj9);
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                return new defpackage.gsd();
                            case 16:
                                return new gsf();
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                return ahwt.a;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                ahyn ahynVar = (ahyn) obj9;
                                ahynVar.f();
                                return ahynVar;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                ahyn ahynVar2 = (ahyn) obj9;
                                ahynVar2.f();
                                return ahynVar2;
                            default:
                                return (java.io.InputStream) obj9;
                        }
                    }
                }, ajbmVar).i(new acze(obj8, adflVar2, 17), ajbmVar);
        }
    }
}
