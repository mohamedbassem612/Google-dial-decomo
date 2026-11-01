package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkv implements defpackage.allg {
    private static final aimz c = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/LlmProcessor");
    public final defpackage.allj a;
    public j$.util.concurrent.ConcurrentHashMap b;
    private final defpackage.alpi d;
    private final defpackage.alkw e;
    private final j$.util.concurrent.ConcurrentHashMap f = new j$.util.concurrent.ConcurrentHashMap();
    private final java.util.Set g = new java.util.HashSet();
    private j$.util.concurrent.ConcurrentLinkedQueue h;
    private final defpackage.alqf i;
    private final defpackage.amac j;

    public alkv(defpackage.alli alliVar, defpackage.alkw alkwVar, defpackage.amac amacVar, defpackage.alqf alqfVar, defpackage.alpi alpiVar) {
        this.d = alpiVar;
        this.j = amacVar;
        this.a = alliVar.a(defpackage.allh.l.name());
        this.e = alkwVar;
        this.i = alqfVar;
    }

    private static int l(java.lang.String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return str.split("\\s+", -1).length;
    }

    private static defpackage.almz m(defpackage.alsa alsaVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_LLM_INFERENCE_RESULT;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alnx.b, alsaVar);
        return akzzVarM.p();
    }

    private static java.lang.String n(java.lang.String str, defpackage.alns alnsVar) {
        int i;
        int iAe = a.ae(alnsVar.b);
        if (iAe == 0) {
            iAe = 1;
        }
        if (iAe - 1 != 1 || (i = alnsVar.c) <= 0 || l(str) <= i) {
            return str;
        }
        java.lang.String[] strArrSplit = str.split("\n", -1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iL = 0;
        for (java.lang.String str2 : strArrSplit) {
            iL += l(str2);
            if (iL > i) {
                break;
            }
            sb.append(str2);
            sb.append('\n');
        }
        if (!str.endsWith("\n") && sb.length() > 0 && sb.charAt(sb.length() - 1) == '\n') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private final void o(java.lang.String str) {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((ajcq) this.f.get(str));
        if (true == optionalOfNullable.isPresent()) {
            ((ajcq) optionalOfNullable.get()).cancel(false);
        }
        if (this.h.contains(str)) {
            this.h.remove(str);
            this.b.remove(str);
        }
    }

    private final void p(defpackage.alpk alpkVar) {
        akzx akzxVarM = defpackage.altj.a.m();
        akzxVarM.u();
        defpackage.altj altjVar = (defpackage.altj) akzxVarM.b;
        altjVar.b |= 1;
        altjVar.c = alpkVar.b;
        akzxVarM.u();
        defpackage.altj altjVar2 = (defpackage.altj) akzxVarM.b;
        altjVar2.b |= 2;
        altjVar2.d = alpkVar.d;
        akzxVarM.u();
        defpackage.altj altjVar3 = (defpackage.altj) akzxVarM.b;
        java.lang.String str = alpkVar.c;
        j$.util.Objects.requireNonNull(str);
        altjVar3.b |= 4;
        altjVar3.e = str;
        defpackage.altj altjVar4 = (defpackage.altj) akzxVarM.p();
        java.util.Set set = this.g;
        if (set.contains(altjVar4)) {
            return;
        }
        set.add(altjVar4);
        defpackage.alkw alkwVar = this.e;
        akzx akzxVarM2 = defpackage.altk.a.m();
        akzxVarM2.u();
        defpackage.altk altkVar = (defpackage.altk) akzxVarM2.b;
        j$.util.Objects.requireNonNull(altjVar4);
        altkVar.c = altjVar4;
        altkVar.b |= 1;
        alkwVar.b((defpackage.altk) akzxVarM2.p());
    }

    private final void q(java.lang.String str, j$.time.Duration duration, defpackage.almy almyVar) {
        if (duration.isZero()) {
            return;
        }
        try {
            this.i.b(new defpackage.akbr(this, almyVar, 17, null), duration);
        } catch (defpackage.aljs e) {
            c.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/LlmProcessor", "maybeSetRequestTimeout", 277, "LlmProcessor.java").y("Failed scheduling timeout for request_id: %s", str);
            c(almyVar, defpackage.alnu.UNKNOWN_ERROR_TYPE);
        }
    }

    private final void r() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((java.lang.String) this.h.poll());
        defpackage.alju aljuVar = new defpackage.alju(this, 11);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj = optionalOfNullable.get();
            java.lang.Object obj2 = aljuVar.a;
            j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable((defpackage.almy) ((defpackage.alkv) obj2).b.remove((java.lang.String) obj));
            defpackage.alju aljuVar2 = new defpackage.alju(obj2, 10);
            if (true == optionalOfNullable2.isPresent()) {
                java.lang.Object obj3 = optionalOfNullable2.get();
                ((defpackage.alkv) aljuVar2.a).g((defpackage.almy) obj3);
            }
        }
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.s(defpackage.alnb.EVENT_SELECTED_LLM_FEATURES, defpackage.alnb.EVENT_LLM_INFERENCE_REQUEST, defpackage.alnb.EVENT_LLM_CANCEL_REQUEST);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 44) {
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alon.c;
            almzVar2.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            try {
                this.d.e(aihd.o(((defpackage.alon) objJ).b), new defpackage.agzo(this, almyVar, 5));
                return;
            } catch (java.lang.NullPointerException e) {
                a.by(c.c(), "Failed initializing services for selected features.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/LlmProcessor", "handleSelectedFeaturesEvent", (char) 164, "LlmProcessor.java", e);
                return;
            }
        }
        if (iOrdinal == 45) {
            g(almyVar);
            return;
        }
        if (iOrdinal == 49) {
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.alnp.d;
            almzVar3.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) almzVar3).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            java.lang.String str = ((defpackage.alnp) objJ2).c;
            o(str);
            r();
        }
    }

    public final synchronized void c(defpackage.almy almyVar, defpackage.alnu alnuVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnt.k;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        o(((defpackage.alnt) objJ).d);
        i(almyVar, alnuVar);
    }

    @Override // defpackage.allg
    public final void d() {
        try {
            this.d.c(new defpackage.alkh(this, 3));
        } catch (java.lang.NullPointerException e) {
            a.by(c.c(), "Failed getting available features.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/LlmProcessor", "start", 'a', "LlmProcessor.java", e);
            h(new defpackage.alpm(aikj.b));
        }
    }

    @Override // defpackage.allg
    public final void e() {
        this.d.d();
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.d.f(this.j);
        this.h = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }

    public final void g(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnt.k;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f;
        defpackage.alnt alntVar = (defpackage.alnt) objJ;
        if (!concurrentHashMap.isEmpty() && alntVar.h) {
            this.h.add(alntVar.d);
            this.b.put(alntVar.d, almyVar);
            return;
        }
        java.lang.Float fValueOf = null;
        if (alntVar.i.size() <= 0) {
            java.lang.String str = alntVar.e;
            defpackage.alns alnsVar = alntVar.g;
            if (alnsVar == null) {
                alnsVar = defpackage.alns.a;
            }
            java.lang.String strN = n(str, alnsVar);
            int iL = l(alntVar.e) - l(strN);
            try {
                defpackage.alpi alpiVar = this.d;
                defpackage.alnr alnrVar = alntVar.c;
                if (alnrVar == null) {
                    alnrVar = defpackage.alnr.a;
                }
                if ((alntVar.b & 64) != 0) {
                    defpackage.akzv akzvVar = alntVar.j;
                    if (akzvVar == null) {
                        akzvVar = defpackage.akzv.a;
                    }
                    fValueOf = java.lang.Float.valueOf(akzvVar.b);
                }
                defpackage.alpk alpkVarB = alpiVar.b(alnrVar, strN, fValueOf, new rwh(this, almyVar, iL, 2), new defpackage.agzo(this, almyVar, 6));
                concurrentHashMap.put(alntVar.d, alpkVarB.a);
                java.lang.String str2 = alntVar.d;
                akzm akzmVar = alntVar.f;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                q(str2, ajsz.dJ(akzmVar), almyVar);
                p(alpkVarB);
                return;
            } catch (defpackage.aljs e) {
                c.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/LlmProcessor", "handleLlmInferenceRequest", 223, "LlmProcessor.java").y("Failed running LLM inference for request_id: %s", alntVar.d);
                return;
            }
        }
        aift aiftVar = new aift(4);
        alat alatVar = alntVar.i;
        int iL2 = 0;
        for (int i = 0; i < alatVar.size(); i++) {
            java.lang.String str3 = (java.lang.String) alatVar.get(i);
            if (i == alatVar.size() - 1) {
                defpackage.alns alnsVar2 = alntVar.g;
                if (alnsVar2 == null) {
                    alnsVar2 = defpackage.alns.a;
                }
                java.lang.String strN2 = n(str3, alnsVar2);
                iL2 += l(str3) - l(strN2);
                aiftVar.i(strN2);
            } else {
                aiftVar.i(str3);
            }
        }
        aify aifyVarH = aiftVar.h();
        try {
            defpackage.alpi alpiVar2 = this.d;
            defpackage.alnr alnrVar2 = alntVar.c;
            if (alnrVar2 == null) {
                alnrVar2 = defpackage.alnr.a;
            }
            defpackage.alnr alnrVar3 = alnrVar2;
            if ((alntVar.b & 64) != 0) {
                defpackage.akzv akzvVar2 = alntVar.j;
                if (akzvVar2 == null) {
                    akzvVar2 = defpackage.akzv.a;
                }
                fValueOf = java.lang.Float.valueOf(akzvVar2.b);
            }
            defpackage.alpk alpkVarA = alpiVar2.a(alnrVar3, aifyVarH, fValueOf, new rwh(this, almyVar, iL2, 3), new defpackage.agzo(this, almyVar, 7));
            this.f.put(alntVar.d, alpkVarA.a);
            java.lang.String str4 = alntVar.d;
            akzm akzmVar2 = alntVar.f;
            if (akzmVar2 == null) {
                akzmVar2 = akzm.a;
            }
            q(str4, ajsz.dJ(akzmVar2), almyVar);
            p(alpkVarA);
        } catch (defpackage.aljs e2) {
            c.c().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/LlmProcessor", "performMultiMessageInference", 264, "LlmProcessor.java").y("Failed running LLM inference for request_id: %s", alntVar.d);
        }
    }

    public final void h(defpackage.alpm alpmVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_AVAILABLE_LLM_FEATURES;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        apdi apdiVar = defpackage.almg.d;
        akzx akzxVarM = defpackage.almg.a.m();
        aihd aihdVarA = alpmVar.a();
        akzxVarM.u();
        defpackage.almg almgVar = (defpackage.almg) akzxVarM.b;
        almgVar.b();
        akyl.i(aihdVarA, almgVar.b);
        aihd aihdVarB = alpmVar.b();
        akzxVarM.u();
        defpackage.almg almgVar2 = (defpackage.almg) akzxVarM.b;
        alat alatVar = almgVar2.c;
        if (!alatVar.c()) {
            almgVar2.c = alad.J(alatVar);
        }
        akyl.i(aihdVarB, almgVar2.c);
        akzzVarM.bV(apdiVar, (defpackage.almg) akzxVarM.p());
        this.a.b(akzzVarM.p());
    }

    public final synchronized void i(defpackage.almy almyVar, defpackage.alnu alnuVar) {
        java.lang.Throwable th;
        try {
            try {
                defpackage.almz almzVar = almyVar.h;
                if (almzVar == null) {
                    try {
                        almzVar = defpackage.almz.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                apdi apdiVar = defpackage.alnt.k;
                almzVar.c(apdiVar);
                java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                java.lang.String str = ((defpackage.alnt) objJ).d;
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((ajcq) this.f.remove(str));
                oqg oqgVar = new oqg(this, str, alnuVar, almyVar, 5);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj = optionalOfNullable.get();
                    java.lang.Object obj2 = oqgVar.a;
                    java.lang.Object obj3 = oqgVar.d;
                    java.lang.String str2 = (java.lang.String) obj3;
                    defpackage.alkv alkvVar = (defpackage.alkv) obj2;
                    alkvVar.k(str2, (defpackage.alnu) oqgVar.b, (defpackage.almy) oqgVar.c);
                }
                r();
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    public final synchronized void j(defpackage.almy almyVar, aify aifyVar, int i) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnt.k;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        java.lang.String str = ((defpackage.alnt) objJ).d;
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_LLM_INFERENCE_RESPONSE;
        akzzVarM.u();
        defpackage.almz almzVar2 = akzzVarM.b;
        almzVar2.c = alnbVar.aN;
        almzVar2.b |= 1;
        apdi apdiVar2 = defpackage.alnw.f;
        akzx akzxVarM = defpackage.alnw.a.m();
        akzxVarM.u();
        defpackage.alnw alnwVar = (defpackage.alnw) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alnwVar.b |= 1;
        alnwVar.c = str;
        akzx akzxVarM2 = defpackage.alnv.a.m();
        akzxVarM2.u();
        defpackage.alnv alnvVar = (defpackage.alnv) akzxVarM2.b;
        alnvVar.b |= 4;
        alnvVar.e = i;
        defpackage.alnv alnvVar2 = (defpackage.alnv) akzxVarM2.p();
        akzxVarM.u();
        defpackage.alnw alnwVar2 = (defpackage.alnw) akzxVarM.b;
        j$.util.Objects.requireNonNull(alnvVar2);
        alnwVar2.e = alnvVar2;
        alnwVar2.b |= 2;
        akzxVarM.u();
        defpackage.alnw alnwVar3 = (defpackage.alnw) akzxVarM.b;
        alat alatVar = alnwVar3.d;
        if (!alatVar.c()) {
            alnwVar3.d = alad.J(alatVar);
        }
        akyl.i(aifyVar, alnwVar3.d);
        akzzVarM.bV(apdiVar2, (defpackage.alnw) akzxVarM.p());
        defpackage.almz almzVarP = akzzVarM.p();
        defpackage.allj alljVar = this.a;
        alljVar.a(almzVarP, almyVar);
        almzVarP.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) almzVarP).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(((defpackage.alnw) objJ2).d).findFirst();
        if (true == optionalFindFirst.isPresent()) {
            optionalFindFirst = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((java.lang.String) optionalFindFirst.get()).length()));
        }
        int iIntValue = ((java.lang.Integer) optionalFindFirst.orElse(0)).intValue();
        akzx akzxVarM3 = defpackage.alsa.a.m();
        akzx akzxVarM4 = defpackage.alsb.a.m();
        long j = iIntValue;
        akzxVarM4.u();
        defpackage.alsb alsbVar = (defpackage.alsb) akzxVarM4.b;
        alsbVar.b |= 1;
        alsbVar.c = j;
        akzxVarM3.u();
        defpackage.alsa alsaVar = (defpackage.alsa) akzxVarM3.b;
        defpackage.alsb alsbVar2 = (defpackage.alsb) akzxVarM4.p();
        j$.util.Objects.requireNonNull(alsbVar2);
        alsaVar.c = alsbVar2;
        alsaVar.b = 2;
        alljVar.a(m((defpackage.alsa) akzxVarM3.p()), almyVar);
        r();
    }

    public final /* synthetic */ void k(java.lang.String str, defpackage.alnu alnuVar, defpackage.almy almyVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_LLM_INFERENCE_RESPONSE;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        apdi apdiVar = defpackage.alnw.f;
        akzx akzxVarM = defpackage.alnw.a.m();
        akzxVarM.u();
        defpackage.alnw alnwVar = (defpackage.alnw) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alnwVar.b |= 1;
        alnwVar.c = str;
        defpackage.alnv alnvVar = defpackage.alnv.a;
        akzx akzxVarM2 = alnvVar.m();
        akzxVarM2.u();
        defpackage.alnv alnvVar2 = (defpackage.alnv) akzxVarM2.b;
        alnvVar2.b |= 1;
        alnvVar2.c = true;
        akzxVarM2.u();
        defpackage.alnv alnvVar3 = (defpackage.alnv) akzxVarM2.b;
        alnvVar3.d = alnuVar.g;
        alnvVar3.b |= 2;
        defpackage.alnv alnvVar4 = (defpackage.alnv) akzxVarM2.p();
        akzxVarM.u();
        defpackage.alnw alnwVar2 = (defpackage.alnw) akzxVarM.b;
        j$.util.Objects.requireNonNull(alnvVar4);
        alnwVar2.e = alnvVar4;
        alnwVar2.b |= 2;
        akzzVarM.bV(apdiVar, (defpackage.alnw) akzxVarM.p());
        defpackage.almz almzVarP = akzzVarM.p();
        defpackage.allj alljVar = this.a;
        alljVar.a(almzVarP, almyVar);
        almzVarP.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVarP).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alnv alnvVar5 = ((defpackage.alnw) objJ).e;
        if (alnvVar5 != null) {
            alnvVar = alnvVar5;
        }
        defpackage.alnu alnuVarB = defpackage.alnu.b(alnvVar.d);
        if (alnuVarB == null) {
            alnuVarB = defpackage.alnu.UNKNOWN_ERROR_TYPE;
        }
        defpackage.alrx alrxVarY = ahus.y(alnuVarB);
        akzx akzxVarM3 = defpackage.alsa.a.m();
        akzx akzxVarM4 = defpackage.alry.a.m();
        akzxVarM4.u();
        defpackage.alry alryVar = (defpackage.alry) akzxVarM4.b;
        alryVar.c = alrxVarY.g;
        alryVar.b |= 1;
        akzxVarM3.u();
        defpackage.alsa alsaVar = (defpackage.alsa) akzxVarM3.b;
        defpackage.alry alryVar2 = (defpackage.alry) akzxVarM4.p();
        j$.util.Objects.requireNonNull(alryVar2);
        alsaVar.c = alryVar2;
        alsaVar.b = 1;
        alljVar.a(m((defpackage.alsa) akzxVarM3.p()), almyVar);
    }
}
