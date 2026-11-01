package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class imy extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.inc f;
    final /* synthetic */ ifv g;
    final /* synthetic */ ifz h;
    final /* synthetic */ twd i;
    final /* synthetic */ defpackage.igw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imy(defpackage.inc incVar, ifv ifvVar, ifz ifzVar, twd twdVar, defpackage.igw igwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = incVar;
        this.g = ifvVar;
        this.h = ifzVar;
        this.i = twdVar;
        this.j = igwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x015e  */
    /* JADX WARN: Code duplicated, block: B:58:0x018c  */
    /* JADX WARN: Code duplicated, block: B:60:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x020a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0226 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x026d  */
    /* JADX WARN: Code duplicated, block: B:88:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        ifz ifzVar;
        java.lang.Object objG;
        java.lang.Object objG2;
        defpackage.imb imbVar;
        java.lang.Object objI;
        defpackage.igv igvVar;
        defpackage.inc incVar;
        java.lang.String str;
        defpackage.imb imbVar2;
        java.lang.Object objI2;
        java.lang.Object objI3;
        defpackage.igv igvVar2;
        boolean z;
        defpackage.inc incVar2;
        java.lang.String str2;
        java.lang.Object obj2;
        java.lang.Object objG3;
        defpackage.igv igvVar3;
        java.lang.Object obj3;
        java.lang.Object obj4;
        defpackage.imb imbVarA;
        defpackage.igd igdVar;
        defpackage.igw igwVar;
        defpackage.hgw hgwVarL;
        aolu aoluVar = aolu.a;
        switch (this.e) {
            case 0:
                aooc.af(obj);
                defpackage.inc incVar3 = this.f;
                ifv ifvVar = this.g;
                ifzVar = this.h;
                ify ifyVar = ifzVar.c;
                if (ifyVar == null) {
                    ifyVar = ify.a;
                }
                ifx ifxVarB = ifx.b(ifyVar.b);
                if (ifxVarB == null) {
                    ifxVarB = ifx.d;
                }
                aooh.f(ifvVar, "featureKey");
                int iOrdinal = ifxVarB.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        aoin aoinVar = (aoin) incVar3.b.b.k().get(ifvVar);
                        if ((aoinVar != null ? aoinVar.a() : null) == null) {
                            defpackage.inc.a.c().m(aioa.b).l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 304, "AudioPrismSodaModelRunner.kt").v("feature does not provide a SODA event listener.");
                            return defpackage.inc.l(8, null);
                        }
                        defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 308, "AudioPrismSodaModelRunner.kt").v("starting with multi session support");
                        ify ifyVar2 = ifzVar.c;
                        if (ifyVar2 == null) {
                            ifyVar2 = ify.a;
                        }
                        ifx ifxVarB2 = ifx.b(ifyVar2.b);
                        if (ifxVarB2 == null) {
                            ifxVarB2 = ifx.d;
                        }
                        int iOrdinal2 = ifxVarB2.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                defpackage.ima imaVar = incVar3.e;
                                this.a = ifzVar;
                                this.e = 1;
                                objG = imaVar.g(this);
                                if (objG == aoluVar) {
                                    return aoluVar;
                                }
                                defpackage.imb imbVar3 = new defpackage.imb(ifzVar, new defpackage.ine((java.lang.Long) objG));
                                defpackage.inc incVar4 = this.f;
                                ifv ifvVar2 = this.g;
                                twd twdVar = this.i;
                                defpackage.igd igdVar2 = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                                uzx uzxVarCq = wsc.cq(twdVar.p());
                                uzxVarCq.H(true);
                                twd twdVarG = uzxVarCq.G();
                                defpackage.igw igwVar2 = this.j;
                                this.a = imbVar3;
                                this.e = 2;
                                imbVar = imbVar3;
                                objI = incVar4.i(ifvVar2, igdVar2, imbVar, twdVarG, igwVar2, this);
                                if (objI == aoluVar) {
                                    return aoluVar;
                                }
                                igvVar = (defpackage.igv) objI;
                                if (igvVar.e) {
                                    incVar = this.f;
                                    incVar.h.put(this.g, imbVar);
                                    str = this.i.g;
                                    aooh.e(str, "getLocaleLanguageTag(...)");
                                    this.a = igvVar;
                                    this.e = 3;
                                    if (incVar.d.c(str, this) == aoluVar) {
                                        return aoluVar;
                                    }
                                }
                                return igvVar;
                            }
                            if (iOrdinal2 == 2) {
                                defpackage.ima imaVar2 = incVar3.e;
                                this.a = ifzVar;
                                this.e = 4;
                                objG2 = imaVar2.g(this);
                                if (objG2 == aoluVar) {
                                    return aoluVar;
                                }
                                defpackage.imb imbVar4 = new defpackage.imb(ifzVar, new defpackage.ine((java.lang.Long) objG2));
                                defpackage.inc incVar5 = this.f;
                                ifv ifvVar3 = this.g;
                                twd twdVar2 = this.i;
                                defpackage.igd igdVar3 = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                                uzx uzxVarCq2 = wsc.cq(twdVar2.p());
                                uzxVarCq2.H(true);
                                twd twdVarG2 = uzxVarCq2.G();
                                defpackage.igw igwVar3 = this.j;
                                this.a = imbVar4;
                                this.e = 5;
                                imbVar2 = imbVar4;
                                objI2 = incVar5.i(ifvVar3, igdVar3, imbVar2, twdVarG2, igwVar3, this);
                                if (objI2 == aoluVar) {
                                    return aoluVar;
                                }
                                igvVar = (defpackage.igv) objI2;
                                if (!igvVar.e) {
                                    defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 351, "AudioPrismSodaModelRunner.kt").I("failed to start downlink audio source for feature: %s, startResult: %s", this.g.name(), igvVar);
                                    return igvVar;
                                }
                                defpackage.inc incVar6 = this.f;
                                ifv ifvVar4 = this.g;
                                twd twdVar3 = this.i;
                                defpackage.igd igdVar4 = defpackage.igd.AUDIO_SOURCE_UPLINK;
                                uzx uzxVarCq3 = wsc.cq(twdVar3.p());
                                uzxVarCq3.H(false);
                                twd twdVarG3 = uzxVarCq3.G();
                                defpackage.igw igwVar4 = this.j;
                                this.a = imbVar2;
                                this.e = 6;
                                objI3 = incVar6.i(ifvVar4, igdVar4, imbVar2, twdVarG3, igwVar4, this);
                                if (objI3 == aoluVar) {
                                    return aoluVar;
                                }
                                igvVar2 = (defpackage.igv) objI3;
                                z = igvVar2.e;
                                incVar2 = this.f;
                                if (!z) {
                                    incVar2.h.put(this.g, imbVar2);
                                    str2 = this.i.g;
                                    aooh.e(str2, "getLocaleLanguageTag(...)");
                                    this.a = null;
                                    this.e = 9;
                                    if (incVar2.d.c(str2, this) == aoluVar) {
                                        return aoluVar;
                                    }
                                    igwVar = this.j;
                                    hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                                    hgwVarL.v(true);
                                    if (igwVar != null) {
                                        hgwVarL.u(igwVar);
                                    }
                                    return hgwVarL.t();
                                }
                                if (((java.lang.Boolean) incVar2.f.a()).booleanValue()) {
                                    defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 372, "AudioPrismSodaModelRunner.kt").v("Uplink Audio Transcriber Initialization Failed. Cleaning up the active Downlink Transcriber.");
                                    obj2 = this.g;
                                    defpackage.ima imaVar3 = incVar2.e;
                                    this.a = igvVar2;
                                    this.b = incVar2;
                                    this.c = obj2;
                                    this.d = imbVar2;
                                    this.e = 7;
                                    objG3 = imaVar3.g(this);
                                    if (objG3 != aoluVar) {
                                        return aoluVar;
                                    }
                                    defpackage.imb imbVar5 = imbVar2;
                                    igvVar3 = igvVar2;
                                    obj3 = imbVar5;
                                    obj4 = incVar2;
                                    imbVarA = ((defpackage.imb) obj3).a((java.lang.Long) objG3);
                                    igdVar = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                                    this.a = igvVar3;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = 8;
                                    if (((defpackage.inc) obj4).k((ifv) obj2, imbVarA, igdVar, this) == aoluVar) {
                                        return aoluVar;
                                    }
                                    igvVar2 = igvVar3;
                                    this.f.i.c(qbc.mH);
                                }
                                defpackage.igv igvVar4 = igvVar2;
                                defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 388, "AudioPrismSodaModelRunner.kt").I("failed to start uplink audio source for feature: %s, startResult: %s", this.g.name(), igvVar4);
                                return igvVar4;
                            }
                            if (iOrdinal2 != 3) {
                                throw new aois();
                            }
                        }
                        throw new java.lang.IllegalArgumentException("invalid streaming type, should never be called");
                    }
                    if (iOrdinal != 3) {
                        throw new aois();
                    }
                }
                throw new java.lang.IllegalArgumentException("Unrecognized streaming type");
            case 1:
                ifz ifzVar2 = (ifz) this.a;
                aooc.af(obj);
                ifzVar = ifzVar2;
                objG = obj;
                defpackage.imb imbVar6 = new defpackage.imb(ifzVar, new defpackage.ine((java.lang.Long) objG));
                defpackage.inc incVar7 = this.f;
                ifv ifvVar5 = this.g;
                twd twdVar4 = this.i;
                defpackage.igd igdVar5 = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                uzx uzxVarCq4 = wsc.cq(twdVar4.p());
                uzxVarCq4.H(true);
                twd twdVarG4 = uzxVarCq4.G();
                defpackage.igw igwVar5 = this.j;
                this.a = imbVar6;
                this.e = 2;
                imbVar = imbVar6;
                objI = incVar7.i(ifvVar5, igdVar5, imbVar, twdVarG4, igwVar5, this);
                if (objI == aoluVar) {
                    return aoluVar;
                }
                igvVar = (defpackage.igv) objI;
                if (igvVar.e) {
                    incVar = this.f;
                    incVar.h.put(this.g, imbVar);
                    str = this.i.g;
                    aooh.e(str, "getLocaleLanguageTag(...)");
                    this.a = igvVar;
                    this.e = 3;
                    if (incVar.d.c(str, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return igvVar;
            case 2:
                defpackage.imb imbVar7 = (defpackage.imb) this.a;
                aooc.af(obj);
                imbVar = imbVar7;
                objI = obj;
                igvVar = (defpackage.igv) objI;
                if (igvVar.e) {
                    incVar = this.f;
                    incVar.h.put(this.g, imbVar);
                    str = this.i.g;
                    aooh.e(str, "getLocaleLanguageTag(...)");
                    this.a = igvVar;
                    this.e = 3;
                    if (incVar.d.c(str, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return igvVar;
            case 3:
                defpackage.igv igvVar5 = (defpackage.igv) this.a;
                aooc.af(obj);
                return igvVar5;
            case 4:
                ifz ifzVar3 = (ifz) this.a;
                aooc.af(obj);
                ifzVar = ifzVar3;
                objG2 = obj;
                defpackage.imb imbVar8 = new defpackage.imb(ifzVar, new defpackage.ine((java.lang.Long) objG2));
                defpackage.inc incVar8 = this.f;
                ifv ifvVar6 = this.g;
                twd twdVar5 = this.i;
                defpackage.igd igdVar6 = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                uzx uzxVarCq5 = wsc.cq(twdVar5.p());
                uzxVarCq5.H(true);
                twd twdVarG5 = uzxVarCq5.G();
                defpackage.igw igwVar6 = this.j;
                this.a = imbVar8;
                this.e = 5;
                imbVar2 = imbVar8;
                objI2 = incVar8.i(ifvVar6, igdVar6, imbVar2, twdVarG5, igwVar6, this);
                if (objI2 == aoluVar) {
                    return aoluVar;
                }
                igvVar = (defpackage.igv) objI2;
                if (!igvVar.e) {
                    defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 351, "AudioPrismSodaModelRunner.kt").I("failed to start downlink audio source for feature: %s, startResult: %s", this.g.name(), igvVar);
                    return igvVar;
                }
                defpackage.inc incVar9 = this.f;
                ifv ifvVar7 = this.g;
                twd twdVar6 = this.i;
                defpackage.igd igdVar7 = defpackage.igd.AUDIO_SOURCE_UPLINK;
                uzx uzxVarCq6 = wsc.cq(twdVar6.p());
                uzxVarCq6.H(false);
                twd twdVarG6 = uzxVarCq6.G();
                defpackage.igw igwVar7 = this.j;
                this.a = imbVar2;
                this.e = 6;
                objI3 = incVar9.i(ifvVar7, igdVar7, imbVar2, twdVarG6, igwVar7, this);
                if (objI3 == aoluVar) {
                    return aoluVar;
                }
                igvVar2 = (defpackage.igv) objI3;
                z = igvVar2.e;
                incVar2 = this.f;
                if (!z) {
                    incVar2.h.put(this.g, imbVar2);
                    str2 = this.i.g;
                    aooh.e(str2, "getLocaleLanguageTag(...)");
                    this.a = null;
                    this.e = 9;
                    if (incVar2.d.c(str2, this) == aoluVar) {
                        return aoluVar;
                    }
                    igwVar = this.j;
                    hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                    hgwVarL.v(true);
                    if (igwVar != null) {
                        hgwVarL.u(igwVar);
                    }
                    return hgwVarL.t();
                }
                if (((java.lang.Boolean) incVar2.f.a()).booleanValue()) {
                    defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 372, "AudioPrismSodaModelRunner.kt").v("Uplink Audio Transcriber Initialization Failed. Cleaning up the active Downlink Transcriber.");
                    obj2 = this.g;
                    defpackage.ima imaVar4 = incVar2.e;
                    this.a = igvVar2;
                    this.b = incVar2;
                    this.c = obj2;
                    this.d = imbVar2;
                    this.e = 7;
                    objG3 = imaVar4.g(this);
                    if (objG3 != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.imb imbVar9 = imbVar2;
                    igvVar3 = igvVar2;
                    obj3 = imbVar9;
                    obj4 = incVar2;
                    imbVarA = ((defpackage.imb) obj3).a((java.lang.Long) objG3);
                    igdVar = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                    this.a = igvVar3;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = 8;
                    if (((defpackage.inc) obj4).k((ifv) obj2, imbVarA, igdVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    igvVar2 = igvVar3;
                    this.f.i.c(qbc.mH);
                }
                defpackage.igv igvVar6 = igvVar2;
                defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 388, "AudioPrismSodaModelRunner.kt").I("failed to start uplink audio source for feature: %s, startResult: %s", this.g.name(), igvVar6);
                return igvVar6;
            case 5:
                defpackage.imb imbVar10 = (defpackage.imb) this.a;
                aooc.af(obj);
                imbVar2 = imbVar10;
                objI2 = obj;
                igvVar = (defpackage.igv) objI2;
                if (!igvVar.e) {
                    defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 351, "AudioPrismSodaModelRunner.kt").I("failed to start downlink audio source for feature: %s, startResult: %s", this.g.name(), igvVar);
                    return igvVar;
                }
                defpackage.inc incVar10 = this.f;
                ifv ifvVar8 = this.g;
                twd twdVar7 = this.i;
                defpackage.igd igdVar8 = defpackage.igd.AUDIO_SOURCE_UPLINK;
                uzx uzxVarCq7 = wsc.cq(twdVar7.p());
                uzxVarCq7.H(false);
                twd twdVarG7 = uzxVarCq7.G();
                defpackage.igw igwVar8 = this.j;
                this.a = imbVar2;
                this.e = 6;
                objI3 = incVar10.i(ifvVar8, igdVar8, imbVar2, twdVarG7, igwVar8, this);
                if (objI3 == aoluVar) {
                    return aoluVar;
                }
                igvVar2 = (defpackage.igv) objI3;
                z = igvVar2.e;
                incVar2 = this.f;
                if (!z) {
                    incVar2.h.put(this.g, imbVar2);
                    str2 = this.i.g;
                    aooh.e(str2, "getLocaleLanguageTag(...)");
                    this.a = null;
                    this.e = 9;
                    if (incVar2.d.c(str2, this) == aoluVar) {
                        return aoluVar;
                    }
                    igwVar = this.j;
                    hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                    hgwVarL.v(true);
                    if (igwVar != null) {
                        hgwVarL.u(igwVar);
                    }
                    return hgwVarL.t();
                }
                if (((java.lang.Boolean) incVar2.f.a()).booleanValue()) {
                    defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 372, "AudioPrismSodaModelRunner.kt").v("Uplink Audio Transcriber Initialization Failed. Cleaning up the active Downlink Transcriber.");
                    obj2 = this.g;
                    defpackage.ima imaVar5 = incVar2.e;
                    this.a = igvVar2;
                    this.b = incVar2;
                    this.c = obj2;
                    this.d = imbVar2;
                    this.e = 7;
                    objG3 = imaVar5.g(this);
                    if (objG3 != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.imb imbVar11 = imbVar2;
                    igvVar3 = igvVar2;
                    obj3 = imbVar11;
                    obj4 = incVar2;
                    imbVarA = ((defpackage.imb) obj3).a((java.lang.Long) objG3);
                    igdVar = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                    this.a = igvVar3;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = 8;
                    if (((defpackage.inc) obj4).k((ifv) obj2, imbVarA, igdVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    igvVar2 = igvVar3;
                    this.f.i.c(qbc.mH);
                }
                defpackage.igv igvVar7 = igvVar2;
                defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 388, "AudioPrismSodaModelRunner.kt").I("failed to start uplink audio source for feature: %s, startResult: %s", this.g.name(), igvVar7);
                return igvVar7;
            case 6:
                defpackage.imb imbVar12 = (defpackage.imb) this.a;
                aooc.af(obj);
                imbVar2 = imbVar12;
                objI3 = obj;
                igvVar2 = (defpackage.igv) objI3;
                z = igvVar2.e;
                incVar2 = this.f;
                if (!z) {
                    incVar2.h.put(this.g, imbVar2);
                    str2 = this.i.g;
                    aooh.e(str2, "getLocaleLanguageTag(...)");
                    this.a = null;
                    this.e = 9;
                    if (incVar2.d.c(str2, this) == aoluVar) {
                        return aoluVar;
                    }
                    igwVar = this.j;
                    hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                    hgwVarL.v(true);
                    if (igwVar != null) {
                        hgwVarL.u(igwVar);
                    }
                    return hgwVarL.t();
                }
                if (((java.lang.Boolean) incVar2.f.a()).booleanValue()) {
                    defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 372, "AudioPrismSodaModelRunner.kt").v("Uplink Audio Transcriber Initialization Failed. Cleaning up the active Downlink Transcriber.");
                    obj2 = this.g;
                    defpackage.ima imaVar6 = incVar2.e;
                    this.a = igvVar2;
                    this.b = incVar2;
                    this.c = obj2;
                    this.d = imbVar2;
                    this.e = 7;
                    objG3 = imaVar6.g(this);
                    if (objG3 != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.imb imbVar13 = imbVar2;
                    igvVar3 = igvVar2;
                    obj3 = imbVar13;
                    obj4 = incVar2;
                    imbVarA = ((defpackage.imb) obj3).a((java.lang.Long) objG3);
                    igdVar = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                    this.a = igvVar3;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = 8;
                    if (((defpackage.inc) obj4).k((ifv) obj2, imbVarA, igdVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    igvVar2 = igvVar3;
                    this.f.i.c(qbc.mH);
                }
                defpackage.igv igvVar8 = igvVar2;
                defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 388, "AudioPrismSodaModelRunner.kt").I("failed to start uplink audio source for feature: %s, startResult: %s", this.g.name(), igvVar8);
                return igvVar8;
            case 7:
                obj3 = this.d;
                obj2 = this.c;
                java.lang.Object obj5 = this.b;
                igvVar3 = (defpackage.igv) this.a;
                aooc.af(obj);
                objG3 = obj;
                obj4 = obj5;
                imbVarA = ((defpackage.imb) obj3).a((java.lang.Long) objG3);
                igdVar = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                this.a = igvVar3;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 8;
                if (((defpackage.inc) obj4).k((ifv) obj2, imbVarA, igdVar, this) == aoluVar) {
                    return aoluVar;
                }
                igvVar2 = igvVar3;
                this.f.i.c(qbc.mH);
                defpackage.igv igvVar9 = igvVar2;
                defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 388, "AudioPrismSodaModelRunner.kt").I("failed to start uplink audio source for feature: %s, startResult: %s", this.g.name(), igvVar9);
                return igvVar9;
            case 8:
                igvVar2 = (defpackage.igv) this.a;
                aooc.af(obj);
                this.f.i.c(qbc.mH);
                defpackage.igv igvVar10 = igvVar2;
                defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "startWithMultiSessionSupport$<anonymous>", 388, "AudioPrismSodaModelRunner.kt").I("failed to start uplink audio source for feature: %s, startResult: %s", this.g.name(), igvVar10);
                return igvVar10;
            default:
                aooc.af(obj);
                igwVar = this.j;
                hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                hgwVarL.v(true);
                if (igwVar != null) {
                    hgwVarL.u(igwVar);
                }
                return hgwVarL.t();
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.imy(this.f, this.g, this.h, this.i, this.j, aolnVar);
    }
}
