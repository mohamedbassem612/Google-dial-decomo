package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amfd implements defpackage.alud {
    private static final defpackage.alqk m;
    public boolean c;
    public defpackage.amcg d;
    public defpackage.amgv e;
    public boolean f;
    public boolean i;
    private final java.util.Map n;
    private final aizr o;
    private final defpackage.alud p;
    private final defpackage.alud q;
    private final defpackage.amci r;
    private defpackage.aluc s;
    private final alqd y;
    private static final j$.time.Duration k = j$.time.Duration.ofMillis(500);
    private static final j$.time.Duration l = j$.time.Duration.ofMillis(500);
    public static final akzm a = aldf.f(2, 0);
    public static final aimz b = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler");
    public int g = 0;
    private int t = 0;
    private j$.util.OptionalInt u = j$.util.OptionalInt.empty();
    private j$.time.Instant v = j$.time.Instant.MIN;
    private j$.time.Instant w = j$.time.Instant.MIN;
    public int j = 1;
    public boolean h = false;
    private boolean x = false;

    static {
        akzz akzzVarM = defpackage.alqk.a.m();
        apdi apdiVar = defpackage.amaf.d;
        akzx akzxVarM = defpackage.amaf.a.m();
        akzxVarM.u();
        defpackage.amaf amafVar = (defpackage.amaf) akzxVarM.b;
        amafVar.c = 1;
        amafVar.b |= 1;
        akzzVarM.bV(apdiVar, (defpackage.amaf) akzxVarM.p());
        m = akzzVarM.p();
    }

    public amfd(java.util.Map map, aizr aizrVar, defpackage.alud aludVar, defpackage.alud aludVar2, alqd alqdVar, defpackage.amci amciVar) {
        this.n = map;
        this.o = aizrVar;
        this.p = aludVar;
        this.q = aludVar2;
        this.y = alqdVar;
        this.r = amciVar;
    }

    public static defpackage.alsi l(defpackage.amfv amfvVar, int i, akzm akzmVar) {
        akzz akzzVarM = defpackage.alsi.a.m();
        apdi apdiVar = defpackage.amgq.g;
        akzx akzxVarM = defpackage.amgq.a.m();
        akzxVarM.u();
        defpackage.amgq amgqVar = (defpackage.amgq) akzxVarM.b;
        j$.util.Objects.requireNonNull(amfvVar);
        amgqVar.e = amfvVar;
        amgqVar.b |= 1;
        akzx akzxVarM2 = defpackage.amgk.a.m();
        akzxVarM2.u();
        defpackage.amgk amgkVar = (defpackage.amgk) akzxVarM2.b;
        amgkVar.c = i - 1;
        amgkVar.b |= 1;
        akzxVarM2.u();
        defpackage.amgk amgkVar2 = (defpackage.amgk) akzxVarM2.b;
        j$.util.Objects.requireNonNull(akzmVar);
        amgkVar2.d = akzmVar;
        amgkVar2.b |= 2;
        akzxVarM.u();
        defpackage.amgq amgqVar2 = (defpackage.amgq) akzxVarM.b;
        defpackage.amgk amgkVar3 = (defpackage.amgk) akzxVarM2.p();
        j$.util.Objects.requireNonNull(amgkVar3);
        amgqVar2.d = amgkVar3;
        amgqVar2.c = 2;
        akzzVarM.bV(apdiVar, (defpackage.amgq) akzxVarM.p());
        return akzzVarM.p();
    }

    public static defpackage.alsi m(defpackage.amfv amfvVar, int i) {
        akzx akzxVarM = defpackage.amgq.a.m();
        akzxVarM.u();
        defpackage.amgq amgqVar = (defpackage.amgq) akzxVarM.b;
        j$.util.Objects.requireNonNull(amfvVar);
        amgqVar.e = amfvVar;
        amgqVar.b |= 1;
        if (i != 1) {
            akzx akzxVarM2 = defpackage.amgj.a.m();
            akzxVarM2.u();
            defpackage.amgj amgjVar = (defpackage.amgj) akzxVarM2.b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            amgjVar.c = i2;
            amgjVar.b |= 1;
            defpackage.amgj amgjVar2 = (defpackage.amgj) akzxVarM2.p();
            akzxVarM.u();
            defpackage.amgq amgqVar2 = (defpackage.amgq) akzxVarM.b;
            j$.util.Objects.requireNonNull(amgjVar2);
            amgqVar2.d = amgjVar2;
            amgqVar2.c = 3;
        }
        akzz akzzVarM = defpackage.alsi.a.m();
        akzzVarM.bV(defpackage.amgq.g, (defpackage.amgq) akzxVarM.p());
        return akzzVarM.p();
    }

    private static final j$.util.OptionalInt n(defpackage.amfu amfuVar) {
        return j$.util.stream.IntStream.-CC.range(0, amfuVar.b.size()).filter(new defpackage.altq(amfuVar, 6)).max();
    }

    public final void a(boolean z) {
        this.d.g(z);
        this.d.h(!z);
        k(m(this.d.a(), this.j), true);
    }

    @Override // defpackage.alud
    public final defpackage.alub b(defpackage.amaz amazVar) {
        return this.x ? this.q.b(amazVar) : this.p.b(amazVar);
    }

    @Override // defpackage.alud
    public final void c(defpackage.alub alubVar) {
        if (this.x) {
            this.q.c(alubVar);
        } else {
            this.p.c(alubVar);
        }
    }

    @Override // defpackage.alud
    public final void d(java.lang.String str, defpackage.alqh alqhVar, defpackage.alqk alqkVar, ajcu ajcuVar, defpackage.amgv amgvVar) throws defpackage.alio {
        defpackage.almb almbVar;
        apdi apdiVar = amgg.y;
        alqkVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alqkVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        amgg amggVar = (amgg) objJ;
        boolean z = amggVar.u;
        this.x = z;
        aimp aimpVar = b;
        if (z) {
            aimpVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "init", 238, "VisualCallingResultHandler.java").v("Using Convi based result handler.");
            this.q.d(str, alqhVar, alqkVar, ajcuVar, amgvVar);
            return;
        }
        aimpVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "init", 243, "VisualCallingResultHandler.java").v("Using OG result handler.");
        aimpVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "init", 244, "VisualCallingResultHandler.java").v("Creating cache-supported DMC AM state manager.");
        defpackage.amcg amcgVar = (defpackage.amcg) this.n.get(defpackage.amch.b);
        this.d = amcgVar;
        this.j = 1;
        amcgVar.f();
        alqd alqdVar = this.y;
        alqdVar.b = j$.util.Optional.of(str);
        this.r.e(new defpackage.amfb(this));
        boolean z2 = amggVar.k;
        defpackage.almb almbVar2 = defpackage.almb.a;
        try {
            almbVar = (defpackage.almb) alqdVar.a(alad.M(defpackage.almb.class), "visual_calling_asset_config.pb");
        } catch (java.io.IOException e) {
            aimpVar = b;
            a.by(aimpVar.d(), "Failed loading asset_config.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "init", (char) 255, "VisualCallingResultHandler.java", e);
            almbVar = almbVar2;
        }
        aimp aimpVar2 = aimpVar;
        try {
            defpackage.amcg amcgVar2 = this.d;
            j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.amgu(this, 1));
            j$.util.Optional optionalOf2 = j$.util.Optional.of(this.y);
            defpackage.amed amedVarG = defpackage.amjk.g();
            float f = amggVar.l;
            amedVarG.b();
            int i = amggVar.m;
            amedVarG.c();
            int i2 = amggVar.n;
            amedVarG.d();
            amedVarG.e();
            amcgVar2.l(alqhVar, alqkVar, optionalOf, optionalOf2, almbVar);
            boolean zStartsWith = defpackage.aknx.F(str).b.startsWith("hd");
            aimpVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "modelSupportsHoldDetection", 291, "VisualCallingResultHandler.java").y("Xatu audio model version supports hold detection: %b", java.lang.Boolean.valueOf(zStartsWith));
            this.f = zStartsWith;
            this.c = !amggVar.f;
            this.h = amggVar.k;
            this.i = amggVar.o;
            defpackage.alqk alqkVar2 = m;
            this.e = amgvVar;
            defpackage.alud aludVar = this.p;
            aludVar.d(str, alqhVar, alqkVar2, ajcuVar, amgvVar);
            ((defpackage.alzw) aludVar).a = new defpackage.amfc(this, 0);
        } catch (java.lang.Exception e2) {
            throw new defpackage.alio("Failed to initialize State Manager.", defpackage.alti.CORE_INFRA_FATAL_FAILURE, e2);
        }
    }

    @Override // defpackage.alud
    public final void e(defpackage.alro alroVar) {
        if (this.x) {
            this.q.e(alroVar);
            return;
        }
        apdi apdiVar = defpackage.alqv.f;
        alroVar.c(apdiVar);
        akzs akzsVar = ((alaa) alroVar).n;
        alac alacVar = (alac) apdiVar.a;
        if (akzsVar.l(alacVar)) {
            alroVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) alroVar).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            alqu alquVar = ((defpackage.alqv) objJ).c;
            if (alquVar == null) {
                alquVar = alqu.a;
            }
            if ((alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.size() > 0 || this.o.a().isAfter(this.v.plus(k))) {
                this.v = this.o.a();
                defpackage.amgv amgvVar = this.e;
                int i = this.g;
                alroVar.c(apdiVar);
                if (((alaa) alroVar).n.l(alacVar)) {
                    akzx akzxVarM = defpackage.altn.a.m();
                    akzxVarM.u();
                    defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
                    j$.util.Objects.requireNonNull(alroVar);
                    altnVar.c = alroVar;
                    altnVar.b = 7;
                    amgvVar.h(akzxVarM, j$.time.Duration.ofMillis(i));
                }
            }
            this.d.k(alquVar);
        } else {
            apdi apdiVar2 = alrq.d;
            alroVar.c(apdiVar2);
            akzs akzsVar2 = ((alaa) alroVar).n;
            alac alacVar2 = (alac) apdiVar2.a;
            if (akzsVar2.l(alacVar2)) {
                alroVar.c(apdiVar2);
                java.lang.Object objJ2 = ((alaa) alroVar).n.j(alacVar2);
                if (objJ2 == null) {
                    objJ2 = apdiVar2.b;
                } else {
                    apdiVar2.c(objJ2);
                }
                try {
                    this.d.e(((alrq) objJ2).c);
                    k(m(this.d.a(), this.j), true);
                } catch (defpackage.alio e) {
                    a.by(b.c(), "Option selection error.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "handleOptionSelection", (char) 353, "VisualCallingResultHandler.java", e);
                }
            } else {
                apdi apdiVar3 = alre.e;
                alroVar.c(apdiVar3);
                akzs akzsVar3 = ((alaa) alroVar).n;
                alac alacVar3 = (alac) apdiVar3.a;
                if (akzsVar3.l(alacVar3)) {
                    alroVar.c(apdiVar3);
                    java.lang.Object objJ3 = ((alaa) alroVar).n.j(alacVar3);
                    if (objJ3 == null) {
                        objJ3 = apdiVar3.b;
                    } else {
                        apdiVar3.c(objJ3);
                    }
                    this.d.d(((alre) objJ3).d);
                } else {
                    apdi apdiVar4 = alqz.d;
                    alroVar.c(apdiVar4);
                    akzs akzsVar4 = ((alaa) alroVar).n;
                    alac alacVar4 = (alac) apdiVar4.a;
                    if (akzsVar4.l(alacVar4)) {
                        alroVar.c(apdiVar4);
                        java.lang.Object objJ4 = ((alaa) alroVar).n.j(alacVar4);
                        if (objJ4 == null) {
                            objJ4 = apdiVar4.b;
                        } else {
                            apdiVar4.c(objJ4);
                        }
                        ahwi ahwiVar = ((alqz) objJ4).c;
                        if (ahwiVar == null) {
                            ahwiVar = ahwi.a;
                        }
                        b.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "handleBusinessPhoneData", 362, "VisualCallingResultHandler.java").y("Got businessPhoneData for %s", ahwiVar.b);
                        apdi apdiVar5 = defpackage.ahwk.a;
                        ahwiVar.c(apdiVar5);
                        akzs akzsVar5 = ((alaa) ahwiVar).n;
                        alac alacVar5 = (alac) apdiVar5.a;
                        if (akzsVar5.l(alacVar5)) {
                            defpackage.amcg amcgVar = this.d;
                            ahwiVar.c(apdiVar5);
                            java.lang.Object objJ5 = ((alaa) ahwiVar).n.j(alacVar5);
                            if (objJ5 == null) {
                                objJ5 = apdiVar5.b;
                            } else {
                                apdiVar5.c(objJ5);
                            }
                            defpackage.amfl amflVar = ((defpackage.ahwj) objJ5).b;
                            if (amflVar == null) {
                                amflVar = defpackage.amfl.a;
                            }
                            amcgVar.c(amflVar);
                        }
                    }
                }
            }
        }
        this.p.e(alroVar);
    }

    @Override // defpackage.alud
    public final void f(defpackage.aljk aljkVar) {
        if (this.x) {
            this.q.f(aljkVar);
        } else {
            this.g = aljkVar.b;
            this.p.f(aljkVar);
        }
    }

    @Override // defpackage.alud
    public final void g(defpackage.aluc alucVar) {
        if (this.x) {
            ((defpackage.amez) this.q).a = alucVar;
        } else {
            this.s = alucVar;
        }
    }

    @Override // defpackage.alud
    public final void h(j$.util.Optional optional) {
        if (this.x) {
            this.q.h(optional);
        } else {
            this.d.i();
        }
    }

    @Override // defpackage.alud
    public final void i() {
        if (this.x) {
            this.q.i();
        } else {
            this.d.j();
        }
    }

    public final void j(defpackage.almz almzVar) {
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 77) {
            defpackage.amgv amgvVar = this.e;
            apdi apdiVar = defpackage.aloc.b;
            almzVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.amas amasVar = (defpackage.amas) objJ;
            aimw aimwVarL = defpackage.amgv.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/utils/DuplexLogger", "logModelInput", 84, "DuplexLogger.java");
            defpackage.amaq amaqVar = (amasVar.b == 1 ? (defpackage.amar) amasVar.c : defpackage.amar.a).d;
            if (amaqVar == null) {
                amaqVar = defpackage.amaq.a;
            }
            aimwVarL.I("Model input - span: (%s), text: '%s'", amaqVar, (amasVar.b == 1 ? (defpackage.amar) amasVar.c : defpackage.amar.a).c);
            akzx akzxVarM = defpackage.altn.a.m();
            akzxVarM.u();
            defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
            j$.util.Objects.requireNonNull(amasVar);
            altnVar.c = amasVar;
            altnVar.b = 15;
            amgvVar.h(akzxVarM, j$.time.Duration.ZERO);
            return;
        }
        if (iOrdinal == 78) {
            defpackage.amgv amgvVar2 = this.e;
            apdi apdiVar2 = defpackage.alod.b;
            almzVar.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) almzVar).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            defpackage.amaw amawVar = (defpackage.amaw) objJ2;
            defpackage.amgv.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/utils/DuplexLogger", "logModelOutput", 94, "DuplexLogger.java").y("Model output - options: %s", (amawVar.b == 1 ? (defpackage.amav) amawVar.c : defpackage.amav.a).b);
            akzx akzxVarM2 = defpackage.altn.a.m();
            akzxVarM2.u();
            defpackage.altn altnVar2 = (defpackage.altn) akzxVarM2.b;
            j$.util.Objects.requireNonNull(amawVar);
            altnVar2.c = amawVar;
            altnVar2.b = 16;
            amgvVar2.h(akzxVarM2, j$.time.Duration.ZERO);
            return;
        }
        if (iOrdinal != 84) {
            if (iOrdinal != 88) {
                b.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "publishConviodEvent", 220, "VisualCallingResultHandler.java").y("Published an unsupported ConviOD event of type %s.", alnbVarB.name());
                return;
            } else {
                this.r.g(almzVar);
                return;
            }
        }
        defpackage.amgv amgvVar3 = this.e;
        apdi apdiVar3 = defpackage.almq.b;
        almzVar.c(apdiVar3);
        java.lang.Object objJ3 = ((alaa) almzVar).n.j((alac) apdiVar3.a);
        if (objJ3 == null) {
            objJ3 = apdiVar3.b;
        } else {
            apdiVar3.c(objJ3);
        }
        defpackage.aman amanVar = (defpackage.aman) objJ3;
        akzx akzxVarM3 = defpackage.altn.a.m();
        akzxVarM3.u();
        defpackage.altn altnVar3 = (defpackage.altn) akzxVarM3.b;
        j$.util.Objects.requireNonNull(amanVar);
        altnVar3.c = amanVar;
        altnVar3.b = 18;
        amgvVar3.h(akzxVarM3, j$.time.Duration.ZERO);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    public final void k(defpackage.alsi alsiVar, boolean z) {
        apdi apdiVar;
        akzs akzsVar;
        alac alacVar;
        defpackage.amgv amgvVar;
        int i;
        java.lang.Object objJ;
        defpackage.amfv amfvVar;
        defpackage.amfu amfuVar;
        if (z) {
            apdiVar = defpackage.amgq.g;
            alsiVar.c(apdiVar);
            akzsVar = ((alaa) alsiVar).n;
            alacVar = (alac) apdiVar.a;
            if (akzsVar.l(alacVar)) {
                alsiVar.c(apdiVar);
                objJ = ((alaa) alsiVar).n.j(alacVar);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                amfvVar = ((defpackage.amgq) objJ).e;
                if (amfvVar == null) {
                    amfvVar = defpackage.amfv.a;
                }
                amfuVar = amfvVar.c;
                if (amfuVar == null) {
                    amfuVar = defpackage.amfu.a;
                }
                this.t = amfuVar.b.size();
                this.u = n(amfuVar);
                this.w = this.o.a();
            }
            amgvVar = this.e;
            i = this.g;
            alsiVar.c(apdiVar);
            if (((alaa) alsiVar).n.l(alacVar)) {
                akzx akzxVarM = defpackage.altn.a.m();
                akzxVarM.u();
                defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
                j$.util.Objects.requireNonNull(alsiVar);
                altnVar.c = alsiVar;
                altnVar.b = 8;
                amgvVar.h(akzxVarM, j$.time.Duration.ofMillis(i));
            }
        } else {
            apdi apdiVar2 = defpackage.amgq.g;
            alsiVar.c(apdiVar2);
            akzs akzsVar2 = ((alaa) alsiVar).n;
            alac alacVar2 = (alac) apdiVar2.a;
            if (akzsVar2.l(alacVar2)) {
                alsiVar.c(apdiVar2);
                java.lang.Object objJ2 = ((alaa) alsiVar).n.j(alacVar2);
                if (objJ2 == null) {
                    objJ2 = apdiVar2.b;
                } else {
                    apdiVar2.c(objJ2);
                }
                defpackage.amfv amfvVar2 = ((defpackage.amgq) objJ2).e;
                if (amfvVar2 == null) {
                    amfvVar2 = defpackage.amfv.a;
                }
                defpackage.amfu amfuVar2 = amfvVar2.c;
                if (amfuVar2 == null) {
                    amfuVar2 = defpackage.amfu.a;
                }
                j$.util.OptionalInt optionalIntN = n(amfuVar2);
                if (amfuVar2.b.size() != this.t || !optionalIntN.equals(this.u) || this.o.a().isAfter(this.w.plus(l))) {
                    apdiVar = defpackage.amgq.g;
                    alsiVar.c(apdiVar);
                    akzsVar = ((alaa) alsiVar).n;
                    alacVar = (alac) apdiVar.a;
                    if (akzsVar.l(alacVar)) {
                        alsiVar.c(apdiVar);
                        objJ = ((alaa) alsiVar).n.j(alacVar);
                        if (objJ == null) {
                            objJ = apdiVar.b;
                        } else {
                            apdiVar.c(objJ);
                        }
                        amfvVar = ((defpackage.amgq) objJ).e;
                        if (amfvVar == null) {
                            amfvVar = defpackage.amfv.a;
                        }
                        amfuVar = amfvVar.c;
                        if (amfuVar == null) {
                            amfuVar = defpackage.amfu.a;
                        }
                        this.t = amfuVar.b.size();
                        this.u = n(amfuVar);
                        this.w = this.o.a();
                    }
                    amgvVar = this.e;
                    i = this.g;
                    alsiVar.c(apdiVar);
                    if (((alaa) alsiVar).n.l(alacVar)) {
                        akzx akzxVarM2 = defpackage.altn.a.m();
                        akzxVarM2.u();
                        defpackage.altn altnVar2 = (defpackage.altn) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(alsiVar);
                        altnVar2.c = alsiVar;
                        altnVar2.b = 8;
                        amgvVar.h(akzxVarM2, j$.time.Duration.ofMillis(i));
                    }
                }
            } else {
                apdiVar = defpackage.amgq.g;
                alsiVar.c(apdiVar);
                akzsVar = ((alaa) alsiVar).n;
                alacVar = (alac) apdiVar.a;
                if (akzsVar.l(alacVar)) {
                    alsiVar.c(apdiVar);
                    objJ = ((alaa) alsiVar).n.j(alacVar);
                    if (objJ == null) {
                        objJ = apdiVar.b;
                    } else {
                        apdiVar.c(objJ);
                    }
                    amfvVar = ((defpackage.amgq) objJ).e;
                    if (amfvVar == null) {
                        amfvVar = defpackage.amfv.a;
                    }
                    amfuVar = amfvVar.c;
                    if (amfuVar == null) {
                        amfuVar = defpackage.amfu.a;
                    }
                    this.t = amfuVar.b.size();
                    this.u = n(amfuVar);
                    this.w = this.o.a();
                }
                amgvVar = this.e;
                i = this.g;
                alsiVar.c(apdiVar);
                if (((alaa) alsiVar).n.l(alacVar)) {
                    akzx akzxVarM3 = defpackage.altn.a.m();
                    akzxVarM3.u();
                    defpackage.altn altnVar3 = (defpackage.altn) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(alsiVar);
                    altnVar3.c = alsiVar;
                    altnVar3.b = 8;
                    amgvVar.h(akzxVarM3, j$.time.Duration.ofMillis(i));
                }
            }
        }
        this.s.a(alsiVar);
    }
}
