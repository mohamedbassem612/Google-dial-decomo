package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wka implements ihn {
    private static final aimz a = aimz.i("com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismSodaEventListener");
    private final ihi b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final defpackage.wle f;
    private final twp g;

    public wka(defpackage.wle wleVar, ihi ihiVar, twp twpVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, java.util.concurrent.Executor executor, aoss aossVar) {
        aooh.f(wleVar, "xatuAudioPrismPipelineResultListener");
        aooh.f(ihiVar, "audioPrismDuplexRelay");
        aooh.f(aoinVar, "enableConfidenceMappingConfiguration");
        aooh.f(aoinVar2, "lpConfidenceMappings");
        aooh.f(aoinVar3, "xatuSodaLocaleDirectBoot");
        aooh.f(executor, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        this.f = wleVar;
        this.b = ihiVar;
        this.g = twpVar;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
    }

    private static final defpackage.alqt i(defpackage.tvz tvzVar) {
        akzx akzxVarM = defpackage.alqt.a.m();
        aooh.f(akzxVarM, "builder");
        int i = tvzVar.d;
        akzxVarM.u();
        defpackage.alqt alqtVar = (defpackage.alqt) akzxVarM.b;
        alqtVar.b |= 2;
        alqtVar.d = i;
        java.lang.String str = tvzVar.e;
        aooh.e(str, "getLanguageCode(...)");
        aooh.f(str, "value");
        akzxVarM.u();
        defpackage.alqt alqtVar2 = (defpackage.alqt) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alqtVar2.b |= 1;
        alqtVar2.c = str;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.alqt) aladVarP;
    }

    private static final int j(int i) {
        int i2 = i - 1;
        if (i2 == 1 || i2 == 2) {
            return 2;
        }
        if (i2 != 3) {
            return (i2 == 4 || i2 == 5) ? 4 : 1;
        }
        return 3;
    }

    public final java.lang.Object a(igd igdVar, defpackage.tvx tvxVar, aoln aolnVar) {
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(igd igdVar, defpackage.twj twjVar, aoln aolnVar) {
        defpackage.wjy wjyVar;
        if (aolnVar instanceof defpackage.wjy) {
            wjyVar = (defpackage.wjy) aolnVar;
            int i = wjyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjyVar.c = i - Integer.MIN_VALUE;
            } else {
                wjyVar = new defpackage.wjy(this, aolnVar);
            }
        } else {
            wjyVar = new defpackage.wjy(this, aolnVar);
        }
        java.lang.Object objG = wjyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjyVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                twjVar = wjyVar.d;
                aooc.af(objG);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objG);
            }
            ((java.lang.Boolean) objG).booleanValue();
            return aojh.a;
        }
        aooc.af(objG);
        defpackage.amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
        if (amldVar == null) {
            amldVar = defpackage.amld.a;
        }
        if (amldVar.b != 2) {
            a.c().m(aioa.b).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismSodaEventListener", "onPartialResults", 113, "XatuAudioPrismSodaEventListener.kt").v("no partial result found");
            return aojh.a;
        }
        wjyVar.d = twjVar;
        wjyVar.c = 1;
        objG = g(wjyVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        defpackage.tvz tvzVar = (defpackage.tvz) objG;
        if (tvzVar != null) {
            defpackage.amld amldVar2 = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
            if (amldVar2 == null) {
                amldVar2 = defpackage.amld.a;
            }
            defpackage.amla amlaVar = amldVar2.b == 2 ? (defpackage.amla) amldVar2.c : defpackage.amla.a;
            aooh.e(amlaVar, "getPartialResult(...)");
            defpackage.zoe zoeVarN = defpackage.ahus.N(defpackage.alqu.a.m());
            zoeVarN.az(i(tvzVar));
            amlg amlgVar = amlaVar.d;
            if (amlgVar == null) {
                amlgVar = amlg.a;
            }
            zoeVarN.aA(amlgVar.c);
            amlg amlgVar2 = amlaVar.d;
            if (amlgVar2 == null) {
                amlgVar2 = amlg.a;
            }
            zoeVarN.aw(amlgVar2.d);
            defpackage.vqu vquVarS = alpv.s(alqr.a.m());
            vquVarS.aU();
            defpackage.zoe zoeVarK = defpackage.ahus.K(alqq.a.m());
            java.lang.String str = (java.lang.String) amlaVar.b.get(0);
            aooh.e(str, "getPartialText(...)");
            zoeVarK.ao(str);
            vquVarS.aT(zoeVarK.an());
            zoeVarN.ay(vquVarS.aS());
            defpackage.alqu alquVarAv = zoeVarN.av();
            if (alquVarAv != null) {
                ihi ihiVar = this.b;
                ifv ifvVar = ifv.f;
                ajyi ajyiVarI = defpackage.ahus.I(alro.a.m());
                apdi apdiVar = alqv.f;
                aooh.e(apdiVar, "asrResultEvent");
                defpackage.zoe zoeVarQ = alpv.q(alqv.a.m());
                zoeVarQ.aC(alquVarAv);
                ajyiVarI.be(apdiVar, zoeVarQ.aB());
                alro alroVarBa = ajyiVarI.ba();
                wjyVar.d = null;
                wjyVar.c = 2;
                objG = ihiVar.c(ifvVar, alroVarBa, wjyVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                ((java.lang.Boolean) objG).booleanValue();
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x036a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[PHI: r18 r19 r21 r22
      0x0148: PHI (r18v2 tvz) = (r18v1 tvz), (r18v1 tvz), (r18v1 tvz), (r18v1 tvz), (r18v1 tvz), (r18v1 tvz), (r18v5 tvz) binds: [B:134:0x02c1, B:131:0x02b8, B:128:0x02af, B:125:0x02a6, B:120:0x0295, B:122:0x029d, B:67:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r19v1 java.util.Iterator) = 
      (r19v0 java.util.Iterator)
      (r19v0 java.util.Iterator)
      (r19v0 java.util.Iterator)
      (r19v0 java.util.Iterator)
      (r19v0 java.util.Iterator)
      (r19v0 java.util.Iterator)
      (r19v4 java.util.Iterator)
     binds: [B:134:0x02c1, B:131:0x02b8, B:128:0x02af, B:125:0x02a6, B:120:0x0295, B:122:0x029d, B:67:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r21v5 java.lang.String) = 
      (r21v3 java.lang.String)
      (r21v3 java.lang.String)
      (r21v3 java.lang.String)
      (r21v3 java.lang.String)
      (r21v3 java.lang.String)
      (r21v3 java.lang.String)
      (r21v8 java.lang.String)
     binds: [B:134:0x02c1, B:131:0x02b8, B:128:0x02af, B:125:0x02a6, B:120:0x0295, B:122:0x029d, B:67:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r22v5 java.lang.String) = 
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v8 java.lang.String)
     binds: [B:134:0x02c1, B:131:0x02b8, B:128:0x02af, B:125:0x02a6, B:120:0x0295, B:122:0x029d, B:67:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object c(igd igdVar, defpackage.twj twjVar, aoln aolnVar) {
        defpackage.wjz wjzVar;
        java.lang.String str;
        java.lang.String str2;
        defpackage.alqu alquVarAv;
        defpackage.tvz tvzVar;
        java.util.Iterator it;
        java.lang.String str3;
        java.lang.String str4;
        defpackage.amlh amlhVar;
        defpackage.yps ypsVar;
        aoiu aoiuVar;
        int iAN;
        defpackage.twj twjVar2 = twjVar;
        if (aolnVar instanceof defpackage.wjz) {
            wjzVar = (defpackage.wjz) aolnVar;
            int i = wjzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjzVar.c = i - Integer.MIN_VALUE;
            } else {
                wjzVar = new defpackage.wjz(this, aolnVar);
            }
        } else {
            wjzVar = new defpackage.wjz(this, aolnVar);
        }
        java.lang.Object objG = wjzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjzVar.c;
        java.lang.String str5 = "onSegmentResults";
        java.lang.String str6 = "com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismSodaEventListener";
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                twjVar2 = wjzVar.d;
                aooc.af(objG);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objG);
            }
            ((java.lang.Boolean) objG).booleanValue();
            return aojh.a;
        }
        aooc.af(objG);
        defpackage.amld amldVar = (twjVar2.b == 2 ? (amle) twjVar2.c : amle.a).c;
        if (amldVar == null) {
            amldVar = defpackage.amld.a;
        }
        if (amldVar.b != 1) {
            a.c().m(aioa.b).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismSodaEventListener", "onSegmentResults", 77, "XatuAudioPrismSodaEventListener.kt").v("no final result found");
            return aojh.a;
        }
        wjzVar.d = twjVar2;
        wjzVar.c = 1;
        objG = g(wjzVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        defpackage.tvz tvzVar2 = (defpackage.tvz) objG;
        if (tvzVar2 != null) {
            defpackage.amld amldVar2 = (twjVar2.b == 2 ? (amle) twjVar2.c : amle.a).c;
            if (amldVar2 == null) {
                amldVar2 = defpackage.amld.a;
            }
            defpackage.amkw amkwVar = amldVar2.b == 1 ? (defpackage.amkw) amldVar2.c : defpackage.amkw.a;
            aooh.e(amkwVar, "getFinalResult(...)");
            if (amkwVar.c.size() != 0) {
                int i4 = 0;
                java.lang.String str7 = (java.lang.String) amkwVar.c.get(0);
                aooh.e(str7, "getHypothesis(...)");
                if (str7.length() != 0) {
                    alat alatVar = amkwVar.d;
                    aooh.e(alatVar, "getHypothesisPartsList(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
                    java.util.Iterator it2 = alatVar.iterator();
                    while (it2.hasNext()) {
                        defpackage.amkz amkzVar = (defpackage.amkz) it2.next();
                        defpackage.vaa vaaVarT = alpv.t(alqo.a.m());
                        java.lang.String str8 = (java.lang.String) amkzVar.b.get(i4);
                        aooh.e(str8, "getText(...)");
                        vaaVarT.aF(str8);
                        aooh.c(amkzVar);
                        if (amkzVar.e.isEmpty()) {
                            int iAM = a.aM(amkzVar.d);
                            if (iAM == 0) {
                                iAM = i3;
                            }
                            iAN = j(iAM);
                            tvzVar = tvzVar2;
                            it = it2;
                            str3 = str5;
                            str4 = str6;
                        } else if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                            int i5 = i(tvzVar2).d;
                            alat alatVar2 = amkzVar.e;
                            aooh.e(alatVar2, "getVersionedWordConfidenceList(...)");
                            alat alatVar3 = ((ypz) this.d.a()).b;
                            tvzVar = tvzVar2;
                            aooh.e(alatVar3, "getMappingsList(...)");
                            aooh.f(alatVar2, "versionedConfidenceList");
                            aooh.f(alatVar3, "confidenceMappingsList");
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            it = it2;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.util.Iterator it3 = alatVar3.iterator();
                            while (it3.hasNext()) {
                                java.util.Iterator it4 = it3;
                                java.lang.Object next = it4.next();
                                java.lang.String str9 = str5;
                                defpackage.yps ypsVar2 = (defpackage.yps) next;
                                java.lang.String str10 = str6;
                                if (ypsVar2.b > i5 || ypsVar2.c < i5) {
                                    arrayList3.add(next);
                                } else {
                                    arrayList2.add(next);
                                }
                                it3 = it4;
                                str5 = str9;
                                str6 = str10;
                            }
                            str3 = str5;
                            str4 = str6;
                            java.util.List list = (java.util.List) new aoiu(arrayList2, arrayList3).a;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList(ajsz.bl(list, 10));
                            java.util.Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(java.lang.Integer.valueOf(((defpackage.yps) it5.next()).d));
                            }
                            java.util.ArrayList arrayList5 = new java.util.ArrayList(ajsz.bl(alatVar2, 10));
                            java.util.Iterator it6 = alatVar2.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(java.lang.Integer.valueOf(((defpackage.amlh) it6.next()).b));
                            }
                            java.lang.Integer num = (java.lang.Integer) ajsz.bA(ajsz.cd(arrayList5, arrayList4));
                            if (num == null) {
                                aoiuVar = null;
                            } else {
                                java.util.ListIterator listIterator = alatVar2.listIterator(alatVar2.size());
                                do {
                                    if (!listIterator.hasPrevious()) {
                                        throw new java.util.NoSuchElementException("List contains no element matching the predicate.");
                                    }
                                    amlhVar = (defpackage.amlh) listIterator.previous();
                                } while (amlhVar.b != num.intValue());
                                java.util.ListIterator listIterator2 = list.listIterator(list.size());
                                do {
                                    if (!listIterator2.hasPrevious()) {
                                        throw new java.util.NoSuchElementException("List contains no element matching the predicate.");
                                    }
                                    ypsVar = (defpackage.yps) listIterator2.previous();
                                } while (ypsVar.d != num.intValue());
                                aoiuVar = new aoiu(amlhVar, ypsVar);
                            }
                            if (aoiuVar == null) {
                                int iAM2 = a.aM(amkzVar.d);
                                if (iAM2 == 0) {
                                    iAM2 = 1;
                                }
                                iAN = j(iAM2);
                            } else {
                                java.lang.Object obj = aoiuVar.a;
                                defpackage.yps ypsVar3 = (defpackage.yps) aoiuVar.b;
                                int iAM3 = a.aM(((defpackage.amlh) obj).c);
                                if (iAM3 == 0) {
                                    iAM3 = 1;
                                }
                                int i6 = iAM3 - 1;
                                if (i6 == 1) {
                                    iAN = a.aN(ypsVar3.e);
                                    if (iAN == 0) {
                                        iAN = 1;
                                    }
                                } else if (i6 == 2) {
                                    iAN = a.aN(ypsVar3.f);
                                    if (iAN == 0) {
                                        iAN = 1;
                                    }
                                } else if (i6 == 3) {
                                    iAN = a.aN(ypsVar3.g);
                                    if (iAN == 0) {
                                        iAN = 1;
                                    }
                                } else if (i6 == 4) {
                                    iAN = a.aN(ypsVar3.h);
                                    if (iAN == 0) {
                                        iAN = 1;
                                    }
                                } else if (i6 != 5 || (iAN = a.aN(ypsVar3.i)) == 0) {
                                    iAN = 1;
                                }
                            }
                        } else {
                            alat alatVar4 = amkzVar.e;
                            aooh.e(alatVar4, "getVersionedWordConfidenceList(...)");
                            java.lang.Object objBI = ajsz.bI(alatVar4);
                            aooh.e(objBI, "last(...)");
                            int iAM4 = a.aM(((defpackage.amlh) objBI).c);
                            if (iAM4 == 0) {
                                iAM4 = 1;
                            }
                            int i7 = iAM4 - 1;
                            if (i7 == 1) {
                                tvzVar = tvzVar2;
                                it = it2;
                                str3 = str5;
                                str4 = str6;
                                iAN = 2;
                            } else if (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) {
                                tvzVar = tvzVar2;
                                it = it2;
                                str3 = str5;
                                str4 = str6;
                                iAN = 4;
                            } else {
                                tvzVar = tvzVar2;
                                it = it2;
                                str3 = str5;
                                str4 = str6;
                                iAN = 1;
                            }
                        }
                        vaaVarT.aG(iAN);
                        arrayList.add(vaaVarT.aE());
                        tvzVar2 = tvzVar;
                        it2 = it;
                        str5 = str3;
                        str6 = str4;
                        i3 = 1;
                        i4 = 0;
                    }
                    defpackage.tvz tvzVar3 = tvzVar2;
                    str = str5;
                    str2 = str6;
                    defpackage.zoe zoeVarN = defpackage.ahus.N(defpackage.alqu.a.m());
                    zoeVarN.az(i(tvzVar3));
                    amlg amlgVar = amkwVar.e;
                    if (amlgVar == null) {
                        amlgVar = amlg.a;
                    }
                    zoeVarN.aA(amlgVar.c);
                    amlg amlgVar2 = amkwVar.e;
                    if (amlgVar2 == null) {
                        amlgVar2 = amlg.a;
                    }
                    zoeVarN.aw(amlgVar2.d);
                    defpackage.zoe zoeVarL = defpackage.ahus.L(alqm.a.m());
                    zoeVarL.au();
                    defpackage.zoe zoeVarK = defpackage.ahus.K(alqq.a.m());
                    java.lang.String str11 = (java.lang.String) amkwVar.c.get(0);
                    aooh.e(str11, "getHypothesis(...)");
                    zoeVarK.ao(str11);
                    if (!arrayList.isEmpty()) {
                        akzx akzxVarM = alqp.a.m();
                        akzxVarM.aN(arrayList);
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        zoeVarK.ap((alqp) aladVarP);
                    }
                    zoeVarL.at(zoeVarK.an());
                    zoeVarN.ax(zoeVarL.as());
                    alquVarAv = zoeVarN.av();
                } else {
                    str = "onSegmentResults";
                    str2 = "com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismSodaEventListener";
                    alquVarAv = null;
                }
            } else {
                str = "onSegmentResults";
                str2 = "com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismSodaEventListener";
                alquVarAv = null;
            }
            if (alquVarAv != null) {
                ihi ihiVar = this.b;
                ifv ifvVar = ifv.f;
                ajyi ajyiVarI = defpackage.ahus.I(alro.a.m());
                apdi apdiVar = alqv.f;
                aooh.e(apdiVar, "asrResultEvent");
                defpackage.zoe zoeVarQ = alpv.q(alqv.a.m());
                zoeVarQ.aC(alquVarAv);
                ajyiVarI.be(apdiVar, zoeVarQ.aB());
                alro alroVarBa = ajyiVarI.ba();
                wjzVar.d = null;
                wjzVar.c = 2;
                objG = ihiVar.c(ifvVar, alroVarBa, wjzVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                ((java.lang.Boolean) objG).booleanValue();
            } else {
                a.c().m(aioa.b).g(1, java.util.concurrent.TimeUnit.MINUTES).l(str2, str, 94, "XatuAudioPrismSodaEventListener.kt").v("failed parsing final result");
            }
        }
        return aojh.a;
    }

    public final java.lang.Object d(defpackage.twg twgVar, aoln aolnVar) {
        defpackage.wle wleVar = this.f;
        if (wleVar.d()) {
            defpackage.abtr abtrVar = wleVar.l;
            akzx akzxVarM = defpackage.wor.a.m();
            defpackage.woa woaVar = defpackage.woa.a;
            akzxVarM.u();
            defpackage.wor worVar = (defpackage.wor) akzxVarM.b;
            j$.util.Objects.requireNonNull(woaVar);
            worVar.c = woaVar;
            worVar.b = 25;
            agsm.i(1100, abtrVar.o((defpackage.wor) akzxVarM.p()), "failed to show pipeline error prompt", new java.lang.Object[0]);
        }
        a.c().m(aioa.b).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismSodaEventListener", "onError", 137, "XatuAudioPrismSodaEventListener.kt").y("SODA error: %s", twgVar);
        return aojh.a;
    }

    public final /* synthetic */ java.lang.Object e() {
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.wjw wjwVar;
        if (aolnVar instanceof defpackage.wjw) {
            wjwVar = (defpackage.wjw) aolnVar;
            int i = wjwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjwVar.c = i - Integer.MIN_VALUE;
            } else {
                wjwVar = new defpackage.wjw(this, aolnVar);
            }
        } else {
            wjwVar = new defpackage.wjw(this, aolnVar);
        }
        java.lang.Object objH = wjwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjwVar.c;
        if (i2 == 0) {
            aooc.af(objH);
            twp twpVar = this.g;
            akff akffVarA = akff.a((java.lang.String) this.e.a());
            wjwVar.c = 1;
            objH = twpVar.h(akffVarA, wjwVar);
            if (objH == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objH);
        }
        defpackage.tvz tvzVar = (defpackage.tvz) objH;
        defpackage.tvy tvyVarB = defpackage.tvy.b(tvzVar.c);
        if (tvyVarB == null) {
            tvyVarB = defpackage.tvy.UNKNOWN;
        }
        if (tvyVarB == defpackage.tvy.ON_DEVICE) {
            return tvzVar;
        }
        a.d().l("com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismSodaEventListener", "getLanguagePackInfo", 160, "XatuAudioPrismSodaEventListener.kt").v("language pack not available");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.wjx wjxVar;
        if (aolnVar instanceof defpackage.wjx) {
            wjxVar = (defpackage.wjx) aolnVar;
            int i = wjxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjxVar.c = i - Integer.MIN_VALUE;
            } else {
                wjxVar = new defpackage.wjx(this, aolnVar);
            }
        } else {
            wjxVar = new defpackage.wjx(this, aolnVar);
        }
        java.lang.Object objG = wjxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjxVar.c;
        if (i2 == 0) {
            aooc.af(objG);
            wjxVar.c = 1;
            objG = g(wjxVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objG);
        }
        defpackage.tvz tvzVar = (defpackage.tvz) objG;
        akzx akzxVarM = defpackage.amti.a.m();
        aooh.f(akzxVarM, "builder");
        if (tvzVar != null) {
            int i3 = tvzVar.d;
            akzxVarM.u();
            defpackage.amti amtiVar = (defpackage.amti) akzxVarM.b;
            amtiVar.b |= 2;
            amtiVar.c = i3;
            java.lang.String str = tvzVar.e;
            aooh.e(str, "getLanguageCode(...)");
            aooh.f(str, "value");
            akzxVarM.u();
            defpackage.amti amtiVar2 = (defpackage.amti) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            amtiVar2.b |= 4;
            amtiVar2.d = str;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amti) aladVarP;
    }

    public final java.lang.Object y(amle amleVar, aoln aolnVar) {
        return aojh.a;
    }
}
