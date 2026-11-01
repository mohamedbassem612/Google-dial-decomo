package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzd implements defpackage.allg, alld {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmExtractionProcessor");
    private static final defpackage.alrm d;
    private static final defpackage.alrm e;
    private static final defpackage.alrm f;
    public java.util.Map b;
    public java.util.Set c;
    private final defpackage.aljq g;
    private final defpackage.allj h;
    private boolean i;
    private boolean j;
    private boolean k;
    private java.util.Map l;
    private java.util.Map m;
    private java.util.Map n;
    private alln o;
    private defpackage.alwq p;
    private j$.util.Optional q;
    private defpackage.alkf r;
    private vqy s;

    static {
        akzx akzxVarM = defpackage.alrm.a.m();
        defpackage.alrn alrnVar = defpackage.alrn.a;
        akzxVarM.u();
        defpackage.alrm alrmVar = (defpackage.alrm) akzxVarM.b;
        j$.util.Objects.requireNonNull(alrnVar);
        alrmVar.c = alrnVar;
        alrmVar.b = 1;
        d = (defpackage.alrm) akzxVarM.p();
        akzx akzxVarM2 = defpackage.alrm.a.m();
        akzx akzxVarM3 = defpackage.alrk.a.m();
        defpackage.alrj alrjVar = defpackage.alrj.a;
        akzxVarM3.u();
        defpackage.alrk alrkVar = (defpackage.alrk) akzxVarM3.b;
        j$.util.Objects.requireNonNull(alrjVar);
        alrkVar.c = alrjVar;
        alrkVar.b = 3;
        akzxVarM2.u();
        defpackage.alrm alrmVar2 = (defpackage.alrm) akzxVarM2.b;
        defpackage.alrk alrkVar2 = (defpackage.alrk) akzxVarM3.p();
        j$.util.Objects.requireNonNull(alrkVar2);
        alrmVar2.c = alrkVar2;
        alrmVar2.b = 2;
        e = (defpackage.alrm) akzxVarM2.p();
        akzx akzxVarM4 = defpackage.alrm.a.m();
        akzx akzxVarM5 = defpackage.alrk.a.m();
        defpackage.alrl alrlVar = defpackage.alrl.a;
        akzxVarM5.u();
        defpackage.alrk alrkVar3 = (defpackage.alrk) akzxVarM5.b;
        j$.util.Objects.requireNonNull(alrlVar);
        alrkVar3.c = alrlVar;
        alrkVar3.b = 2;
        akzxVarM4.u();
        defpackage.alrm alrmVar3 = (defpackage.alrm) akzxVarM4.b;
        defpackage.alrk alrkVar4 = (defpackage.alrk) akzxVarM5.p();
        j$.util.Objects.requireNonNull(alrkVar4);
        alrmVar3.c = alrkVar4;
        alrmVar3.b = 2;
        f = (defpackage.alrm) akzxVarM4.p();
    }

    public alzd(defpackage.alli alliVar, defpackage.aljq aljqVar) {
        this.h = alliVar.a(defpackage.allh.q.name());
        this.g = aljqVar;
    }

    public static java.lang.String g(defpackage.alxf alxfVar) {
        aifl aiflVar = defpackage.alzb.a;
        defpackage.alsy alsyVarB = defpackage.alsy.b(alxfVar.f);
        if (alsyVarB == null) {
            alsyVarB = defpackage.alsy.NO_ACTION;
        }
        java.lang.String str = (java.lang.String) aiflVar.getOrDefault(alsyVarB, "");
        return str.isEmpty() ? "auto_resolve_text_".concat(java.lang.String.valueOf(alxfVar.e.replaceAll("\\s", "_"))) : airh.n("", new java.lang.CharSequence[]{"auto_resolve_text_", alxfVar.e.replaceAll("\\s", "_"), "_", str});
    }

    static final defpackage.almz n(defpackage.alnt alntVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_LLM_INFERENCE_REQUEST;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alnt.k, alntVar);
        return akzzVarM.p();
    }

    private static j$.util.Optional p(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnw.f;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        return j$.util.Collection.-EL.stream(((defpackage.alnw) objJ).d).filter(new defpackage.alzc(0)).findFirst();
    }

    private final java.lang.String q(defpackage.aljq aljqVar, defpackage.alxf alxfVar, defpackage.alxu alxuVar) {
        java.lang.String strN = alxfVar.e;
        defpackage.alxr alxrVar = alxuVar.e;
        if (alxrVar == null) {
            alxrVar = defpackage.alxr.a;
        }
        java.lang.String str = alxrVar.f;
        aifl aiflVar = defpackage.alzb.a;
        defpackage.alsy alsyVarB = defpackage.alsy.b(alxfVar.f);
        if (alsyVarB == null) {
            alsyVarB = defpackage.alsy.NO_ACTION;
        }
        java.lang.String str2 = (java.lang.String) aiflVar.getOrDefault(alsyVarB, "");
        if (!str2.isEmpty() && !str.isEmpty()) {
            strN = airh.n(str, new java.lang.CharSequence[]{strN, str2});
        }
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
        defpackage.alxt alxtVar = alxuVar.d;
        if (alxtVar == null) {
            alxtVar = defpackage.alxt.a;
        }
        charSequenceArr[0] = alxtVar.g;
        charSequenceArr[1] = strN;
        defpackage.alxt alxtVar2 = alxuVar.d;
        if (alxtVar2 == null) {
            alxtVar2 = defpackage.alxt.a;
        }
        charSequenceArr[2] = alxtVar2.h;
        return r(aljqVar, airh.n("", charSequenceArr), alxuVar);
    }

    private final java.lang.String r(defpackage.aljq aljqVar, java.lang.String str, defpackage.alxu alxuVar) {
        defpackage.alxt alxtVar = alxuVar.d;
        if (alxtVar == null) {
            alxtVar = defpackage.alxt.a;
        }
        defpackage.alxs alxsVar = alxtVar.d;
        if (alxsVar == null) {
            alxsVar = defpackage.alxs.a;
        }
        aify aifyVarA = aljqVar.a();
        java.lang.String str2 = alxsVar.c;
        java.lang.String str3 = alxsVar.d;
        java.lang.String str4 = alxsVar.e;
        java.lang.String str5 = alxsVar.f;
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(alxuVar.j);
        aifl aiflVar = defpackage.alzb.a;
        aigf aigfVar = (aigf) j$.util.Collection.-EL.stream(alxuVar.k).collect(aido.b(new defpackage.alyz(5), new defpackage.alyz(6)));
        defpackage.alwq alwqVar = this.p;
        return airh.n("", new java.lang.CharSequence[]{alxtVar.c, (java.lang.String) j$.util.Collection.-EL.stream(aifyVarA).map(new defpackage.aite(mapUnmodifiableMap, 7)).flatMap(new defpackage.alki(3)).filter(new zun(20)).collect(new defpackage.alko(str4, str3, str2, str5)), alxtVar.e, (java.lang.CharSequence) aigfVar.getOrDefault(alwqVar, alwqVar.name()), str});
    }

    private final void s(defpackage.almy almyVar, boolean z) {
        j$.util.Optional optionalEmpty;
        defpackage.alrm alrmVar;
        if (z) {
            alrmVar = d;
        } else if (p(almyVar).isPresent()) {
            alrmVar = f;
        } else {
            defpackage.almz almzVar = almyVar.h;
            if (almzVar == null) {
                almzVar = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alnw.f;
            almzVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alnv alnvVar = ((defpackage.alnw) objJ).e;
            if (alnvVar == null) {
                alnvVar = defpackage.alnv.a;
            }
            if (alnvVar.c) {
                defpackage.alnu alnuVarB = defpackage.alnu.b(alnvVar.d);
                if (alnuVarB == null) {
                    alnuVarB = defpackage.alnu.UNKNOWN_ERROR_TYPE;
                }
                optionalEmpty = j$.util.Optional.of(ahus.y(alnuVarB));
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
            if (true == optionalEmpty.isPresent()) {
                java.lang.Object obj = optionalEmpty.get();
                akzx akzxVarM = defpackage.alrm.a.m();
                akzx akzxVarM2 = defpackage.alrk.a.m();
                akzx akzxVarM3 = defpackage.alry.a.m();
                akzxVarM3.u();
                defpackage.alry alryVar = (defpackage.alry) akzxVarM3.b;
                alryVar.c = ((defpackage.alrx) obj).g;
                alryVar.b |= 1;
                akzxVarM2.u();
                defpackage.alrk alrkVar = (defpackage.alrk) akzxVarM2.b;
                defpackage.alry alryVar2 = (defpackage.alry) akzxVarM3.p();
                j$.util.Objects.requireNonNull(alryVar2);
                alrkVar.c = alryVar2;
                alrkVar.b = 1;
                akzxVarM.u();
                defpackage.alrm alrmVar2 = (defpackage.alrm) akzxVarM.b;
                defpackage.alrk alrkVar2 = (defpackage.alrk) akzxVarM2.p();
                j$.util.Objects.requireNonNull(alrkVar2);
                alrmVar2.c = alrkVar2;
                alrmVar2.b = 2;
                optionalEmpty = j$.util.Optional.ofNullable((defpackage.alrm) akzxVarM.p());
            }
            alrmVar = (defpackage.alrm) optionalEmpty.orElse(e);
        }
        defpackage.allj alljVar = this.h;
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_EXTRACTION_RESULT;
        akzzVarM.u();
        defpackage.almz almzVar2 = akzzVarM.b;
        almzVar2.c = alnbVar.aN;
        almzVar2.b |= 1;
        akzzVarM.bV(defpackage.alne.b, alrmVar);
        alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
    }

    private static final defpackage.alnt t(defpackage.alnr alnrVar, java.lang.String str, java.lang.String str2, j$.time.Duration duration) {
        akzx akzxVarM = defpackage.alnt.a.m();
        akzxVarM.u();
        defpackage.alnt alntVar = (defpackage.alnt) akzxVarM.b;
        j$.util.Objects.requireNonNull(alnrVar);
        alntVar.c = alnrVar;
        alntVar.b |= 1;
        akzxVarM.u();
        defpackage.alnt alntVar2 = (defpackage.alnt) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        alntVar2.b |= 2;
        alntVar2.d = str2;
        akzxVarM.u();
        defpackage.alnt alntVar3 = (defpackage.alnt) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alntVar3.b |= 4;
        alntVar3.e = str;
        akzm akzmVarDH = ajsz.dH(duration);
        akzxVarM.u();
        defpackage.alnt alntVar4 = (defpackage.alnt) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarDH);
        alntVar4.f = akzmVarDH;
        alntVar4.b |= 8;
        return (defpackage.alnt) akzxVarM.p();
    }

    private static final defpackage.almz u(defpackage.alnr alnrVar, java.lang.String str, java.lang.String str2, j$.time.Duration duration) {
        return n(t(alnrVar, str, str2, duration));
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_EXTRACTION_TIMING_SIGNALS, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_LLM_INFERENCE_RESPONSE, defpackage.alnb.EVENT_RESOLVE_OPTION_FULL_TEXT, defpackage.alnb.EVENT_CALLER_TYPE, new defpackage.alnb[]{defpackage.alnb.EVENT_SMART_REPLY_LLM_ACTIVE});
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        this.g.c(almzVar);
        if (anty.aH(almyVar)) {
            try {
                this.s.j(almyVar);
            } catch (defpackage.aljs e2) {
                aimw aimwVarL = a.c().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmExtractionProcessor", "consume", 193, "SmartReplyLlmExtractionProcessor.java");
                defpackage.almz almzVar2 = almyVar.h;
                if (almzVar2 == null) {
                    almzVar2 = defpackage.almz.a;
                }
                defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
                if (alnbVarB == null) {
                    alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                }
                aimwVarL.y("Consuming event %s failed.", alnbVarB.name());
            }
        }
        defpackage.almz almzVar3 = almyVar.h;
        if (almzVar3 == null) {
            almzVar3 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar3.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB2.ordinal();
        if (iOrdinal == 28) {
            defpackage.almz almzVar4 = almyVar.h;
            if (almzVar4 == null) {
                almzVar4 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alms.d;
            almzVar4.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar4).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alwq alwqVarB = defpackage.alwq.b(((defpackage.alms) objJ).c);
            if (alwqVarB == null) {
                alwqVarB = defpackage.alwq.TYPE_UNSET;
            }
            this.p = alwqVarB;
            return;
        }
        if (iOrdinal == 46) {
            j$.util.Optional optional = this.q;
            whq whqVar = new whq(this, almyVar, 12, (byte[]) null);
            if (true == optional.isPresent()) {
                ((defpackage.alzd) whqVar.b).i((defpackage.almy) whqVar.a, (defpackage.alxu) optional.get());
                return;
            }
            return;
        }
        if (iOrdinal == 50) {
            j$.util.Optional optional2 = this.q;
            whq whqVar2 = new whq(this, almyVar, 13, (byte[]) null);
            if (true == optional2.isPresent()) {
                ((defpackage.alzd) whqVar2.b).j((defpackage.almy) whqVar2.a, (defpackage.alxu) optional2.get());
                return;
            }
            return;
        }
        if (iOrdinal == 51) {
            defpackage.almz almzVar5 = almyVar.h;
            if (almzVar5 == null) {
                almzVar5 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.aloq.d;
            almzVar5.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) almzVar5).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            defpackage.alnr alnrVar = ((defpackage.aloq) objJ2).c;
            if (alnrVar == null) {
                alnrVar = defpackage.alnr.a;
            }
            aifl aiflVar = defpackage.alzb.a;
            defpackage.alkf alkfVar = this.r;
            defpackage.allj alljVar = this.h;
            j$.util.Objects.requireNonNull(alljVar);
            defpackage.alkh alkhVar = new defpackage.alkh(alljVar, 14);
            akzx akzxVarP = defpackage.alzb.d.p();
            akzxVarP.u();
            defpackage.alxu alxuVar = (defpackage.alxu) akzxVarP.b;
            j$.util.Objects.requireNonNull(alnrVar);
            alxuVar.c = alnrVar;
            alxuVar.b |= 1;
            if (alnrVar.d >= 3) {
                akzxVarP.aW("Disclosure2", "why calling?");
                akzxVarP.aW("SRIsItUrgentDisclosure", "is it urgent?");
                j$.util.DesugarArrays.stream(defpackage.alwq.values()).forEach(new defpackage.alkh(akzxVarP, 13));
                defpackage.alxt alxtVar = ((defpackage.alxu) akzxVarP.b).d;
                if (alxtVar == null) {
                    alxtVar = defpackage.alxt.a;
                }
                akzx akzxVarP2 = alxtVar.p();
                akzxVarP2.u();
                defpackage.alxt alxtVar2 = (defpackage.alxt) akzxVarP2.b;
                j$.util.Objects.requireNonNull(" | chips");
                alxtVar2.b |= 8;
                alxtVar2.f = " | chips";
                akzxVarP2.u();
                defpackage.alxt alxtVar3 = (defpackage.alxt) akzxVarP2.b;
                j$.util.Objects.requireNonNull(" | spoken");
                alxtVar3.b |= 32;
                alxtVar3.h = " | spoken";
                akzxVarP2.u();
                defpackage.alxt alxtVar4 = (defpackage.alxt) akzxVarP2.b;
                j$.util.Objects.requireNonNull(" | ");
                alxtVar4.b |= 4;
                alxtVar4.e = " | ";
                defpackage.alxt alxtVar5 = (defpackage.alxt) akzxVarP2.p();
                akzxVarP.u();
                defpackage.alxu alxuVar2 = (defpackage.alxu) akzxVarP.b;
                j$.util.Objects.requireNonNull(alxtVar5);
                alxuVar2.d = alxtVar5;
                alxuVar2.b |= 2;
                defpackage.alxr alxrVar = ((defpackage.alxu) akzxVarP.b).e;
                if (alxrVar == null) {
                    alxrVar = defpackage.alxr.a;
                }
                akzx akzxVarP3 = alxrVar.p();
                akzx akzxVarM = defpackage.alxq.a.m();
                akzxVarM.aY("*");
                akzxVarM.aY("#");
                for (int i = 0; i <= 9; i++) {
                    akzxVarM.aY(java.lang.String.valueOf(i));
                }
                defpackage.alxq alxqVar = (defpackage.alxq) akzxVarM.p();
                akzxVarP3.u();
                defpackage.alxr alxrVar2 = (defpackage.alxr) akzxVarP3.b;
                j$.util.Objects.requireNonNull(alxqVar);
                alxrVar2.d = alxqVar;
                alxrVar2.c = 4;
                akzxVarP3.u();
                new defpackage.alas(((defpackage.alxr) akzxVarP3.b).b(), defpackage.alxr.i).clear();
                akzxVarP3.aX(defpackage.alzb.b);
                aigf aigfVar = defpackage.alzb.c;
                akzxVarP3.u();
                defpackage.alxr alxrVar3 = (defpackage.alxr) akzxVarP3.b;
                albe albeVar = alxrVar3.h;
                if (!albeVar.b) {
                    alxrVar3.h = albeVar.a();
                }
                alxrVar3.h.putAll(aigfVar);
                defpackage.alxr alxrVar4 = (defpackage.alxr) akzxVarP3.p();
                akzxVarP.u();
                defpackage.alxu alxuVar3 = (defpackage.alxu) akzxVarP.b;
                j$.util.Objects.requireNonNull(alxrVar4);
                alxuVar3.e = alxrVar4;
                alxuVar3.b |= 4;
            }
            if (alkfVar.a("ENABLE_INCREASED_CHIPS_INFERENCE_TIMEOUT", alkhVar)) {
                akzm akzmVarC = aldf.c(2500L);
                akzxVarP.u();
                defpackage.alxu alxuVar4 = (defpackage.alxu) akzxVarP.b;
                j$.util.Objects.requireNonNull(akzmVarC);
                alxuVar4.g = akzmVarC;
                alxuVar4.b |= 16;
            }
            this.q = j$.util.Optional.of((defpackage.alxu) akzxVarP.p());
        }
    }

    public final void c(aigf aigfVar) {
        j$.util.Optional optional = this.q;
        whq whqVar = new whq(this, aigfVar, 14, (byte[]) null);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            ((defpackage.alzd) whqVar.b).h((aigf) whqVar.a, (defpackage.alxu) obj);
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        apdi apdiVar = defpackage.alwn.r;
        alqkVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alqkVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alwn alwnVar = (defpackage.alwn) objJ;
        defpackage.alxj alxjVar = alwnVar.e;
        if (alxjVar == null) {
            alxjVar = defpackage.alxj.a;
        }
        this.j = alxjVar.g;
        this.s = new vqy(this, aihd.r(defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_EXTRACTION_TIMING_SIGNALS));
        this.i = almlVar.t;
        this.q = j$.util.Optional.empty();
        this.l = new java.util.HashMap();
        this.m = new java.util.HashMap();
        this.n = new java.util.HashMap();
        this.b = new java.util.HashMap();
        this.c = new java.util.HashSet();
        this.o = alln.g(alqdVar, almbVar.f, alkfVar);
        this.p = defpackage.alwq.TYPE_UNKNOWN;
        this.k = alwnVar.n;
        this.r = alkfVar;
    }

    public final void h(aigf aigfVar, defpackage.alxu alxuVar) {
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_EXTRACTION_TIMING_SIGNALS;
        defpackage.almy almyVar = defpackage.almy.a;
        defpackage.almz almzVar = ((defpackage.almy) aigfVar.getOrDefault(alnbVar, almyVar)).h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alpd.d;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alpd alpdVar = (defpackage.alpd) objJ;
        defpackage.almy almyVar2 = (defpackage.almy) aigfVar.getOrDefault(defpackage.alnb.EVENT_ASR_RESULT, almyVar);
        defpackage.almz almzVar2 = almyVar2.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        apdi apdiVar2 = defpackage.alnj.f;
        almzVar2.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) almzVar2).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        alqu alquVar = ((defpackage.alnj) objJ2).c;
        if (alquVar == null) {
            alquVar = alqu.a;
        }
        if (alquVar.c == 1) {
            boolean z = alpdVar.c;
            defpackage.almz almzVar3 = almyVar2.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            if (defpackage.alkt.e(almzVar3).isEmpty()) {
                return;
            }
            if (!z || this.i) {
                defpackage.aljq aljqVar = this.g;
                defpackage.alxt alxtVar = alxuVar.d;
                if (alxtVar == null) {
                    alxtVar = defpackage.alxt.a;
                }
                java.lang.String strR = r(aljqVar, alxtVar.f, alxuVar);
                this.l.put(almyVar2.f, java.lang.Boolean.valueOf(z));
                this.m.put(almyVar2.f, almyVar2);
                defpackage.allj alljVar = this.h;
                defpackage.alnr alnrVar = alxuVar.c;
                if (alnrVar == null) {
                    alnrVar = defpackage.alnr.a;
                }
                java.lang.String str = almyVar2.f;
                akzm akzmVar = alxuVar.g;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                alljVar.a(u(alnrVar, strR, str, ajsz.dJ(akzmVar)), almyVar2);
            }
        }
    }

    public final void i(defpackage.almy almyVar, defpackage.alxu alxuVar) {
        if (!this.m.containsKey(almyVar.f)) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmExtractionProcessor", "handleLlmInferenceResult", 291, "SmartReplyLlmExtractionProcessor.java").y("Got an inference result that was not requested by this processor: %s", almyVar.f);
            return;
        }
        defpackage.almy almyVar2 = (defpackage.almy) this.m.get(almyVar.f);
        defpackage.almz almzVar = almyVar2.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 50) {
                defpackage.almz almzVar2 = almyVar2.h;
                if (almzVar2 == null) {
                    almzVar2 = defpackage.almz.a;
                }
                apdi apdiVar = defpackage.aloi.e;
                almzVar2.c(apdiVar);
                java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                l(almyVar, (defpackage.aloi) objJ);
                return;
            }
            return;
        }
        defpackage.almz almzVar3 = almyVar.h;
        if (almzVar3 == null) {
            almzVar3 = defpackage.almz.a;
        }
        apdi apdiVar2 = defpackage.alnw.f;
        almzVar3.c(apdiVar2);
        akzs akzsVar = ((alaa) almzVar3).n;
        alac alacVar = (alac) apdiVar2.a;
        java.lang.Object objJ2 = akzsVar.j(alacVar);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        if (((defpackage.alnw) objJ2).c.startsWith("auto_resolve_text_")) {
            defpackage.almz almzVar4 = almyVar.h;
            if (almzVar4 == null) {
                almzVar4 = defpackage.almz.a;
            }
            almzVar4.c(apdiVar2);
            java.lang.Object objJ3 = ((alaa) almzVar4).n.j(alacVar);
            if (objJ3 == null) {
                objJ3 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ3);
            }
            this.n.put(((defpackage.alnw) objJ3).c, almyVar);
            defpackage.almz almzVar5 = almyVar.h;
            if (almzVar5 == null) {
                almzVar5 = defpackage.almz.a;
            }
            almzVar5.c(apdiVar2);
            java.lang.Object objJ4 = ((alaa) almzVar5).n.j(alacVar);
            if (objJ4 == null) {
                objJ4 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ4);
            }
            java.lang.String str = ((defpackage.alnw) objJ4).c;
            this.c.remove(str);
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.almy) this.b.remove(str));
            whq whqVar = new whq(this, almyVar, 15, (byte[]) null);
            if (true == optionalOfNullable.isPresent()) {
                ((defpackage.alzd) whqVar.b).k((defpackage.almy) whqVar.a, (defpackage.almy) optionalOfNullable.get());
                return;
            }
            return;
        }
        j$.util.Optional optionalP = p(almyVar);
        defpackage.allq allqVar = new defpackage.allq(this, alxuVar, 3);
        if (true == optionalP.isPresent()) {
            java.lang.Object obj = optionalP.get();
            java.lang.Object obj2 = allqVar.a;
            java.lang.Object obj3 = allqVar.b;
            java.lang.String strTrim = ((java.lang.String) obj).trim();
            defpackage.alxr alxrVar = ((defpackage.alxu) obj3).e;
            if (alxrVar == null) {
                alxrVar = defpackage.alxr.a;
            }
            java.lang.String str2 = alxrVar.e;
            optionalP = j$.util.Optional.ofNullable((aify) j$.util.Collection.-EL.stream(str2.isEmpty() ? aify.p(strTrim) : aify.n(ahzf.d(str2).j(strTrim))).map(new defpackage.allm(obj2, obj3, 3, null)).flatMap(new defpackage.alyz(7)).collect(aido.a));
        }
        aify<defpackage.alxf> aifyVar = (aify) optionalP.orElse(aike.a);
        akzx akzxVarM = defpackage.alnm.a.m();
        akzx akzxVarM2 = defpackage.alob.a.m();
        akzxVarM2.aL(aifyVar);
        defpackage.alob alobVar = (defpackage.alob) akzxVarM2.p();
        akzxVarM.u();
        defpackage.alnm alnmVar = (defpackage.alnm) akzxVarM.b;
        j$.util.Objects.requireNonNull(alobVar);
        alnmVar.d = alobVar;
        alnmVar.c = 9;
        boolean zBooleanValue = ((java.lang.Boolean) j$.util.Map.-EL.getOrDefault(this.l, almyVar.f, java.lang.Boolean.FALSE)).booleanValue();
        akzxVarM.u();
        defpackage.alnm alnmVar2 = (defpackage.alnm) akzxVarM.b;
        alnmVar2.b |= 4;
        alnmVar2.f = zBooleanValue;
        defpackage.alnm alnmVar3 = (defpackage.alnm) akzxVarM.p();
        defpackage.allj alljVar = this.h;
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_INTENT_EXTRACTION;
        akzzVarM.u();
        defpackage.almz almzVar6 = akzzVarM.b;
        almzVar6.c = alnbVar.aN;
        almzVar6.b |= 1;
        akzzVarM.bV(defpackage.alnm.i, alnmVar3);
        alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
        s(almyVar, !aifyVar.isEmpty());
        if (this.j) {
            for (defpackage.alxf alxfVar : aifyVar) {
                java.lang.String strQ = q(this.g, alxfVar, alxuVar);
                java.lang.String strG = g(alxfVar);
                this.c.add(strG);
                defpackage.alnr alnrVar = alxuVar.c;
                if (alnrVar == null) {
                    alnrVar = defpackage.alnr.a;
                }
                akzm akzmVar = alxuVar.i;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                akzx akzxVarP = t(alnrVar, strQ, strG, ajsz.dJ(akzmVar)).p();
                akzxVarP.u();
                defpackage.alnt alntVar = (defpackage.alnt) akzxVarP.b;
                alntVar.b |= 32;
                alntVar.h = true;
                alljVar.a(n((defpackage.alnt) akzxVarP.p()), almyVar);
            }
        }
    }

    public final void j(defpackage.almy almyVar, defpackage.alxu alxuVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.aloi.e;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alxf alxfVar = ((defpackage.aloi) objJ).c;
        if (alxfVar == null) {
            alxfVar = defpackage.alxf.a;
        }
        defpackage.alxf alxfVar2 = alxfVar;
        if (!this.j) {
            m(alxfVar2, almyVar, alxuVar);
            return;
        }
        ailj ailjVarK = ahvr.am(this.c, new aile(g(alxfVar2))).f().k();
        while (ailjVarK.hasNext()) {
            java.lang.String str = (java.lang.String) ailjVarK.next();
            defpackage.allj alljVar = this.h;
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_LLM_CANCEL_REQUEST;
            akzzVarM.u();
            defpackage.almz almzVar2 = akzzVarM.b;
            almzVar2.c = alnbVar.aN;
            almzVar2.b |= 1;
            apdi apdiVar2 = defpackage.alnp.d;
            akzx akzxVarM = defpackage.alnp.a.m();
            akzxVarM.u();
            defpackage.alnp alnpVar = (defpackage.alnp) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            alnpVar.b |= 1;
            alnpVar.c = str;
            akzzVarM.bV(apdiVar2, (defpackage.alnp) akzxVarM.p());
            alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
            this.c.remove(str);
        }
        j$.util.Optional.ofNullable((defpackage.almy) this.n.get(g(alxfVar2))).ifPresentOrElse(new defpackage.agzo(this, almyVar, 11, null), new abb(this, alxfVar2, almyVar, alxuVar, 14));
    }

    public final /* synthetic */ void k(defpackage.almy almyVar, defpackage.almy almyVar2) {
        defpackage.almz almzVar = almyVar2.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.aloi.e;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        l(almyVar, (defpackage.aloi) objJ);
    }

    public final void l(defpackage.almy almyVar, defpackage.aloi aloiVar) {
        j$.util.Optional optionalP = p(almyVar);
        defpackage.alxf alxfVar = aloiVar.c;
        if (alxfVar == null) {
            alxfVar = defpackage.alxf.a;
        }
        java.lang.String str = (java.lang.String) optionalP.orElse(alxfVar.e);
        akzx akzxVarM = defpackage.alnm.a.m();
        akzx akzxVarM2 = defpackage.alni.a.m();
        akzx akzxVarM3 = defpackage.alnh.a.m();
        akzxVarM3.u();
        defpackage.alnh alnhVar = (defpackage.alnh) akzxVarM3.b;
        j$.util.Objects.requireNonNull(str);
        alnhVar.b |= 1;
        alnhVar.c = str;
        defpackage.alxf alxfVar2 = aloiVar.c;
        if (alxfVar2 == null) {
            alxfVar2 = defpackage.alxf.a;
        }
        defpackage.alsy alsyVarB = defpackage.alsy.b(alxfVar2.f);
        if (alsyVarB == null) {
            alsyVarB = defpackage.alsy.NO_ACTION;
        }
        akzxVarM3.u();
        defpackage.alnh alnhVar2 = (defpackage.alnh) akzxVarM3.b;
        alnhVar2.d = alsyVarB.j;
        alnhVar2.b |= 2;
        akzxVarM2.u();
        defpackage.alni alniVar = (defpackage.alni) akzxVarM2.b;
        defpackage.alnh alnhVar3 = (defpackage.alnh) akzxVarM3.p();
        j$.util.Objects.requireNonNull(alnhVar3);
        alniVar.c = alnhVar3;
        alniVar.b |= 1;
        defpackage.alni alniVar2 = (defpackage.alni) akzxVarM2.p();
        akzxVarM.u();
        defpackage.alnm alnmVar = (defpackage.alnm) akzxVarM.b;
        j$.util.Objects.requireNonNull(alniVar2);
        alnmVar.d = alniVar2;
        alnmVar.c = 10;
        defpackage.alsz alszVarB = defpackage.alsz.b(aloiVar.d);
        if (alszVarB == null) {
            alszVarB = defpackage.alsz.UNKNOWN_ENTITY;
        }
        akzxVarM.u();
        defpackage.alnm alnmVar2 = (defpackage.alnm) akzxVarM.b;
        alnmVar2.h = alszVarB.d;
        alnmVar2.b |= 16;
        defpackage.alnm alnmVar3 = (defpackage.alnm) akzxVarM.p();
        defpackage.allj alljVar = this.h;
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_INTENT_EXTRACTION;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alnm.i, alnmVar3);
        alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
        s(almyVar, optionalP.isPresent());
    }

    public final void m(defpackage.alxf alxfVar, defpackage.almy almyVar, defpackage.alxu alxuVar) {
        java.lang.String strQ = q(this.g, alxfVar, alxuVar);
        this.m.put(almyVar.f, almyVar);
        defpackage.alnr alnrVar = alxuVar.c;
        if (alnrVar == null) {
            alnrVar = defpackage.alnr.a;
        }
        java.lang.String str = almyVar.f;
        akzm akzmVar = alxuVar.h;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        this.h.a(u(alnrVar, strQ, str, ajsz.dJ(akzmVar)), almyVar);
    }

    public final j$.util.Optional o(akzx akzxVar, java.lang.String str, defpackage.alxu alxuVar) {
        if (str.isEmpty()) {
            return j$.util.Optional.empty();
        }
        defpackage.alxr alxrVar = alxuVar.e;
        if (alxrVar == null) {
            alxrVar = defpackage.alxr.a;
        }
        java.lang.String str2 = alxrVar.c == 3 ? (java.lang.String) alxrVar.d : "";
        defpackage.alxr alxrVar2 = alxuVar.e;
        if (alxrVar2 == null) {
            alxrVar2 = defpackage.alxr.a;
        }
        defpackage.alxq alxqVar = alxrVar2.c == 4 ? (defpackage.alxq) alxrVar2.d : defpackage.alxq.a;
        if ((str2.isEmpty() || !str.startsWith(str2)) && !alxqVar.b.contains(str)) {
            if (str.matches("^\\d.*")) {
                return j$.util.Optional.empty();
            }
            akzxVar.u();
            defpackage.alxf alxfVar = (defpackage.alxf) akzxVar.b;
            defpackage.alxf alxfVar2 = defpackage.alxf.a;
            j$.util.Objects.requireNonNull(str);
            alxfVar.b |= 1;
            alxfVar.e = str;
            return j$.util.Optional.of((defpackage.alxf) akzxVar.p());
        }
        defpackage.alxr alxrVar3 = alxuVar.e;
        if (alxrVar3 == null) {
            alxrVar3 = defpackage.alxr.a;
        }
        java.lang.String strSubstring = str.substring((alxrVar3.c == 3 ? (java.lang.String) alxrVar3.d : "").length());
        if (strSubstring.isEmpty()) {
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmExtractionProcessor", "ivrTextToOption", 656, "SmartReplyLlmExtractionProcessor.java").y("IVR chipText '%s' is empty after removing prefix, skipping it.", str);
            return j$.util.Optional.empty();
        }
        java.lang.String strValueOf = java.lang.String.valueOf(strSubstring);
        akzxVar.u();
        defpackage.alxf alxfVar3 = (defpackage.alxf) akzxVar.b;
        defpackage.alxf alxfVar4 = defpackage.alxf.a;
        java.lang.String strConcat = "Press ".concat(strValueOf);
        j$.util.Objects.requireNonNull(strConcat);
        alxfVar3.b |= 1;
        alxfVar3.e = strConcat;
        if (!this.k) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(alxuVar.f);
            java.lang.String strValueOf3 = java.lang.String.valueOf(strSubstring);
            aify aifyVar = (aify) this.o.c;
            java.lang.String strConcat2 = strValueOf2.concat(strValueOf3);
            if (!aifyVar.contains(strConcat2)) {
                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmExtractionProcessor", "ivrTextToOption", 680, "SmartReplyLlmExtractionProcessor.java").y("DTMF bot intent name '%s' is missing.", strConcat2);
                return j$.util.Optional.empty();
            }
            akzxVar.u();
            defpackage.alxf alxfVar5 = (defpackage.alxf) akzxVar.b;
            j$.util.Objects.requireNonNull(strConcat2);
            alxfVar5.c = 4;
            alxfVar5.d = strConcat2;
            return j$.util.Optional.of((defpackage.alxf) akzxVar.p());
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.alrf) defpackage.alpq.a.get(strSubstring));
        if (optionalOfNullable.isEmpty()) {
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmExtractionProcessor", "ivrTextToOption", 666, "SmartReplyLlmExtractionProcessor.java").y("IVR chipText '%s' is not a DTMF option, skipping it.", strSubstring);
        }
        defpackage.xbz xbzVar = new defpackage.xbz(akzxVar, 18);
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        java.lang.Object obj = optionalOfNullable.get();
        java.lang.Object obj2 = xbzVar.a;
        defpackage.alsy alsyVar = defpackage.alsy.PLAY_DTMF_TONE;
        akzx akzxVar2 = (akzx) obj2;
        akzxVar2.u();
        defpackage.alxf alxfVar6 = (defpackage.alxf) akzxVar2.b;
        alxfVar6.f = alsyVar.j;
        alxfVar6.b |= 2;
        akzxVar2.u();
        defpackage.alxf alxfVar7 = (defpackage.alxf) akzxVar2.b;
        alxfVar7.d = java.lang.Integer.valueOf(((defpackage.alrf) obj).n);
        alxfVar7.c = 6;
        return j$.util.Optional.ofNullable((defpackage.alxf) akzxVar2.p());
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
