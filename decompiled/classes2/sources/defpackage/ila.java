package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ila extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ defpackage.igr d;
    final /* synthetic */ defpackage.ili e;
    final /* synthetic */ ifv f;
    final /* synthetic */ ifz g;
    final /* synthetic */ defpackage.igg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ila(java.lang.String str, defpackage.igr igrVar, defpackage.ili iliVar, ifv ifvVar, ifz ifzVar, defpackage.igg iggVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = str;
        this.d = igrVar;
        this.e = iliVar;
        this.f = ifvVar;
        this.g = ifzVar;
        this.h = iggVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object ikrVar;
        java.lang.Object next;
        java.util.List listM;
        java.lang.Object objI;
        java.lang.Object obj2;
        java.lang.Object objH;
        alje aljeVar;
        aolu aoluVar = aolu.a;
        int i = this.b;
        try {
            if (i == 0) {
                aooc.af(obj);
                aimz aimzVar = defpackage.ili.b;
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 150, "AudioPrismDuplexModelRunner.kt");
                java.lang.String str = this.c;
                aimwVarL.y("starting Duplex in locale %s", str);
                defpackage.igr igrVar = this.d;
                int i2 = igrVar.b;
                if (i2 != 3) {
                    throw new java.lang.IllegalArgumentException("provided model config is not a Duplex config");
                }
                defpackage.ili iliVar = this.e;
                if (iliVar.l != null) {
                    throw new java.lang.IllegalStateException("already running");
                }
                ifv ifvVar = this.f;
                this.b = 1;
                if (((i2 == 3 ? (defpackage.ihf) igrVar.c : defpackage.ihf.b).c & 1) != 0) {
                    amba ambaVarB = amba.b((igrVar.b == 3 ? (defpackage.ihf) igrVar.c : defpackage.ihf.b).f);
                    if (ambaVarB == null) {
                        ambaVarB = amba.f;
                    }
                    if (ambaVarB == amba.a) {
                        ikrVar = new defpackage.ikr(8);
                    } else if (iliVar.m.k().get(ifvVar) == null) {
                        ikrVar = new defpackage.ikr(4);
                    } else {
                        aimzVar.b().l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "getUnzippedModel", 251, "AudioPrismDuplexModelRunner.kt").v("using extended locale support");
                        alat alatVar = (igrVar.b == 3 ? (defpackage.ihf) igrVar.c : defpackage.ihf.b).e;
                        aooh.e(alatVar, "getDataFileGroupList(...)");
                        java.util.Iterator it = alatVar.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            alat alatVar2 = ((acux) next).k;
                            aooh.e(alatVar2, "getLocaleList(...)");
                            listM = da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(ajsz.cr(alatVar2, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62)), ajsz.aY(str), da$.ExternalSyntheticApiModelOutline1.m());
                            aooh.e(listM, "filterTags(...)");
                        } while (listM.isEmpty());
                        acux acuxVar = (acux) next;
                        ikrVar = acuxVar == null ? new defpackage.ikr(5) : iliVar.k(acuxVar, this);
                    }
                } else {
                    ikrVar = new defpackage.ikr(3);
                }
                if (ikrVar == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i != 1) {
                    obj2 = this.a;
                    if (i != 2) {
                        aooc.af(obj);
                        objH = obj;
                        aljeVar = (alje) objH;
                        alqg alqgVar = defpackage.ili.a;
                        ((defpackage.ili) obj2).l = aljeVar;
                        defpackage.ili.b.b().l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 229, "AudioPrismDuplexModelRunner.kt").v("Duplex conversation started");
                        defpackage.hgw hgwVarL = defpackage.hht.l(defpackage.igv.a.m());
                        hgwVarL.v(true);
                        return hgwVarL.t();
                    }
                    aooc.af(obj);
                    objI = obj;
                    aljeVar = (alje) objI;
                    alqg alqgVar2 = defpackage.ili.a;
                    ((defpackage.ili) obj2).l = aljeVar;
                    defpackage.ili.b.b().l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 229, "AudioPrismDuplexModelRunner.kt").v("Duplex conversation started");
                    defpackage.hgw hgwVarL2 = defpackage.hht.l(defpackage.igv.a.m());
                    hgwVarL2.v(true);
                    return hgwVarL2.t();
                }
                aooc.af(obj);
                ikrVar = obj;
            }
            defpackage.ikt iktVar = (defpackage.ikt) ikrVar;
            j$.util.Objects.checkIndex(0, 3);
            if (iktVar != null) {
                if (iktVar instanceof defpackage.ikr) {
                    return defpackage.ili.p(((defpackage.ikr) iktVar).a);
                }
                if (iktVar instanceof defpackage.iks) {
                    java.lang.String str2 = ((defpackage.iks) iktVar).a;
                    defpackage.ili iliVar2 = this.e;
                    iliVar2.i = this.f;
                    iliVar2.g = false;
                    ify ifyVar = this.g.c;
                    if (ifyVar == null) {
                        ifyVar = ify.a;
                    }
                    ifx ifxVarB = ifx.b(ifyVar.b);
                    if (ifxVarB == null) {
                        ifxVarB = ifx.d;
                    }
                    int iOrdinal = ifxVarB.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            defpackage.igd igdVar = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                            defpackage.igr igrVar2 = this.d;
                            alqk alqkVar = (igrVar2.b == 3 ? (defpackage.ihf) igrVar2.c : defpackage.ihf.b).d;
                            if (alqkVar == null) {
                                alqkVar = alqk.a;
                            }
                            aooh.e(alqkVar, "getConversationContext(...)");
                            amba ambaVarB2 = amba.b((igrVar2.b == 3 ? (defpackage.ihf) igrVar2.c : defpackage.ihf.b).f);
                            if (ambaVarB2 == null) {
                                ambaVarB2 = amba.f;
                            }
                            this.a = iliVar2;
                            this.b = 2;
                            objI = iliVar2.i(alqkVar, str2, ambaVarB2, igdVar, this);
                            if (objI == aoluVar) {
                                return aoluVar;
                            }
                            obj2 = iliVar2;
                            aljeVar = (alje) objI;
                            alqg alqgVar3 = defpackage.ili.a;
                            ((defpackage.ili) obj2).l = aljeVar;
                            defpackage.ili.b.b().l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 229, "AudioPrismDuplexModelRunner.kt").v("Duplex conversation started");
                            defpackage.hgw hgwVarL3 = defpackage.hht.l(defpackage.igv.a.m());
                            hgwVarL3.v(true);
                            return hgwVarL3.t();
                        }
                        if (iOrdinal == 2) {
                            if (this.h != defpackage.igg.DUOLINKS_STATUS_AVAILABLE) {
                                return defpackage.ili.p(10);
                            }
                            defpackage.igr igrVar3 = this.d;
                            alqk alqkVar2 = (igrVar3.b == 3 ? (defpackage.ihf) igrVar3.c : defpackage.ihf.b).d;
                            if (alqkVar2 == null) {
                                alqkVar2 = alqk.a;
                            }
                            aooh.e(alqkVar2, "getConversationContext(...)");
                            amba ambaVarB3 = amba.b((igrVar3.b == 3 ? (defpackage.ihf) igrVar3.c : defpackage.ihf.b).f);
                            if (ambaVarB3 == null) {
                                ambaVarB3 = amba.f;
                            }
                            this.a = iliVar2;
                            this.b = 3;
                            objH = iliVar2.h(alqkVar2, str2, ambaVarB3, this);
                            if (objH == aoluVar) {
                                return aoluVar;
                            }
                            obj2 = iliVar2;
                            aljeVar = (alje) objH;
                            alqg alqgVar4 = defpackage.ili.a;
                            ((defpackage.ili) obj2).l = aljeVar;
                            defpackage.ili.b.b().l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 229, "AudioPrismDuplexModelRunner.kt").v("Duplex conversation started");
                            defpackage.hgw hgwVarL4 = defpackage.hht.l(defpackage.igv.a.m());
                            hgwVarL4.v(true);
                            return hgwVarL4.t();
                        }
                        if (iOrdinal != 3) {
                            throw new aois();
                        }
                    }
                    throw new java.lang.IllegalStateException("Streaming type unrecognized, should never happen");
                }
            }
            throw new aois();
        } catch (java.lang.Exception e) {
            defpackage.ili iliVar3 = this.e;
            if (iliVar3.g) {
                iliVar3.f.b(ruc.bM);
                defpackage.ili.b.c().k(e).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 219, "AudioPrismDuplexModelRunner.kt").v("exception thrown while starting new duplex conversation(initialized)");
            } else {
                iliVar3.f.b(ruc.bL);
                defpackage.ili.b.c().k(e).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 225, "AudioPrismDuplexModelRunner.kt").v("exception thrown while starting new duplex conversation");
            }
            return defpackage.ili.p(9);
        } catch (alio e2) {
            defpackage.ili iliVar4 = this.e;
            if (iliVar4.g) {
                defpackage.ili.b.c().k(e2).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 203, "AudioPrismDuplexModelRunner.kt").v("DuplexException thrown while starting new duplex conversation(initialized)");
                iliVar4.f.b(ruc.bM);
            } else {
                defpackage.ili.b.c().k(e2).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "startInternal$<anonymous>$<anonymous>", 209, "AudioPrismDuplexModelRunner.kt").v("DuplexException thrown while starting new duplex conversation");
                iliVar4.f.b(ruc.bL);
            }
            return defpackage.ili.p(9);
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ila(this.c, this.d, this.e, this.f, this.g, this.h, aolnVar);
    }
}
