package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amfe implements defpackage.allg {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/processors/AmStateProcessor");
    private static final akzm b = aldf.f(2, 0);
    private final defpackage.amci c;
    private final aigf d;
    private defpackage.amcg e;
    private boolean f;
    private boolean g;
    private j$.util.Optional h = j$.util.Optional.empty();
    private defpackage.almb i;
    private defpackage.alqh j;
    private defpackage.alqk k;

    public amfe(defpackage.alli alliVar, java.util.Map map, defpackage.amci amciVar) {
        this.c = amciVar;
        amciVar.e(alliVar.a(defpackage.allh.G.name()));
        this.d = aigf.i(map);
    }

    private final void c(boolean z) {
        this.e.g(z);
        this.e.h(!z);
        this.c.b(this.e.a(), j$.util.Optional.empty(), true);
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.u(defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_AUDIO_DETECTION, defpackage.alnb.EVENT_USER_ACTION, defpackage.alnb.EVENT_BUSINESS_PHONE_DATA, defpackage.alnb.EVENT_CALL_MENU_STATE_PARSING_RESULT);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        j$.util.Optional optional;
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.equals(defpackage.alnb.EVENT_ASR_RESULT)) {
            defpackage.amcg amcgVar = this.e;
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alnj.f;
            almzVar2.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            alqu alquVar = ((defpackage.alnj) objJ).c;
            if (alquVar == null) {
                alquVar = alqu.a;
            }
            amcgVar.k(alquVar);
            defpackage.amci amciVar = this.c;
            synchronized (amciVar.a) {
                amciVar.c = j$.util.Optional.of(almyVar);
            }
            return;
        }
        defpackage.almz almzVar3 = almyVar.h;
        if (almzVar3 == null) {
            almzVar3 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar3.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB2.equals(defpackage.alnb.EVENT_AUDIO_DETECTION)) {
            defpackage.amci amciVar2 = this.c;
            synchronized (amciVar2.a) {
                amciVar2.e = j$.util.Optional.of(almyVar);
            }
            defpackage.almz almzVar4 = almyVar.h;
            if (almzVar4 == null) {
                almzVar4 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.almc.b;
            almzVar4.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) almzVar4).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            defpackage.amah amahVar = (defpackage.amah) objJ2;
            defpackage.amag amagVarB = defpackage.amag.b(amahVar.c);
            if (amagVarB == null) {
                amagVarB = defpackage.amag.NOTIFY_USER;
            }
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/processors/AmStateProcessor", "handleAudioDetection", 177, "AmStateProcessor.java").y("Got event from HoldDetectionHandler: %s", amagVarB);
            try {
                if (amagVarB == defpackage.amag.NOTIFY_USER && this.f) {
                    akzm akzmVar = amahVar.d;
                    if (akzmVar == null) {
                        akzmVar = akzm.a;
                    }
                    akzm akzmVarDH = ajsz.dH(ajsz.dJ(akzmVar).plus(ajsz.dJ(b)));
                    defpackage.amci amciVar3 = this.c;
                    defpackage.amfv amfvVarA = this.e.a();
                    akzx akzxVarM = defpackage.amgk.a.m();
                    akzxVarM.u();
                    defpackage.amgk amgkVar = (defpackage.amgk) akzxVarM.b;
                    amgkVar.c = 1;
                    amgkVar.b |= 1;
                    akzxVarM.u();
                    defpackage.amgk amgkVar2 = (defpackage.amgk) akzxVarM.b;
                    j$.util.Objects.requireNonNull(akzmVarDH);
                    amgkVar2.d = akzmVarDH;
                    amgkVar2.b |= 2;
                    amciVar3.b(amfvVarA, j$.util.Optional.of((defpackage.amgk) akzxVarM.p()), true);
                    return;
                }
                if (amagVarB == defpackage.amag.HOLD_DETECTED) {
                    defpackage.amci amciVar4 = this.c;
                    synchronized (amciVar4.a) {
                        try {
                            amciVar4.g = 2;
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    this.c.b(this.e.a(), j$.util.Optional.empty(), true);
                    return;
                }
                if (amagVarB != defpackage.amag.CONNECTING_TO_AGENT) {
                    if (amagVarB == defpackage.amag.MUSIC_STARTED && this.g) {
                        c(true);
                        return;
                    } else {
                        if (amagVarB == defpackage.amag.MUSIC_STOPPED && this.g) {
                            c(false);
                            return;
                        }
                        return;
                    }
                }
                defpackage.amci amciVar5 = this.c;
                defpackage.amfv amfvVarA2 = this.e.a();
                akzx akzxVarM2 = defpackage.amgk.a.m();
                akzxVarM2.u();
                defpackage.amgk amgkVar3 = (defpackage.amgk) akzxVarM2.b;
                amgkVar3.c = 2;
                amgkVar3.b |= 1;
                akzm akzmVar2 = aldf.a;
                akzxVarM2.u();
                defpackage.amgk amgkVar4 = (defpackage.amgk) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akzmVar2);
                amgkVar4.d = akzmVar2;
                amgkVar4.b |= 2;
                amciVar5.b(amfvVarA2, j$.util.Optional.of((defpackage.amgk) akzxVarM2.p()), true);
                return;
            } catch (defpackage.aljs e) {
                a.by(a.c(), "Failed to handle AudioDetection event.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/processors/AmStateProcessor", "handleAudioDetection", (char) 191, "AmStateProcessor.java", e);
                return;
            }
        }
        defpackage.almz almzVar5 = almyVar.h;
        if (almzVar5 == null) {
            almzVar5 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB3 = defpackage.alnb.b(almzVar5.c);
        if (alnbVarB3 == null) {
            alnbVarB3 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB3.equals(defpackage.alnb.EVENT_USER_ACTION)) {
            defpackage.amci amciVar6 = this.c;
            synchronized (amciVar6.a) {
                amciVar6.f = j$.util.Optional.of(almyVar);
            }
            defpackage.almz almzVar6 = almyVar.h;
            if (almzVar6 == null) {
                almzVar6 = defpackage.almz.a;
            }
            apdi apdiVar3 = defpackage.alpe.d;
            almzVar6.c(apdiVar3);
            java.lang.Object objJ3 = ((alaa) almzVar6).n.j((alac) apdiVar3.a);
            if (objJ3 == null) {
                objJ3 = apdiVar3.b;
            } else {
                apdiVar3.c(objJ3);
            }
            defpackage.alpe alpeVar = (defpackage.alpe) objJ3;
            int i = alpeVar.b;
            if (i != 2) {
                if (i == 1) {
                    this.e.d(((alre) alpeVar.c).d);
                    return;
                }
                return;
            }
            try {
                this.e.e(((alrq) alpeVar.c).c);
            } catch (defpackage.alio e2) {
                a.by(a.c(), "Option selection error.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/processors/AmStateProcessor", "handleIvrOptionSelected", (char) 240, "AmStateProcessor.java", e2);
            }
            try {
                defpackage.amci amciVar7 = this.c;
                defpackage.amfv amfvVarA3 = this.e.a();
                j$.util.Optional.empty();
                synchronized (amciVar7.a) {
                    optional = amciVar7.f;
                }
                amciVar7.c(defpackage.alnb.EVENT_CALL_MENU_STATE, amciVar7.a(amfvVarA3, true), optional);
                return;
            } catch (defpackage.aljs e3) {
                a.by(a.c(), "Failed to publish AmState for UserAction event.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/processors/AmStateProcessor", "handleUserAction", (char) 256, "AmStateProcessor.java", e3);
                return;
            }
        }
        defpackage.almz almzVar7 = almyVar.h;
        if (almzVar7 == null) {
            almzVar7 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB4 = defpackage.alnb.b(almzVar7.c);
        if (alnbVarB4 == null) {
            alnbVarB4 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (!alnbVarB4.equals(defpackage.alnb.EVENT_BUSINESS_PHONE_DATA)) {
            defpackage.almz almzVar8 = almyVar.h;
            if (almzVar8 == null) {
                almzVar8 = defpackage.almz.a;
            }
            defpackage.alnb alnbVarB5 = defpackage.alnb.b(almzVar8.c);
            if (alnbVarB5 == null) {
                alnbVarB5 = defpackage.alnb.EVENT_UNKNOWN;
            }
            if (alnbVarB5.equals(defpackage.alnb.EVENT_CALL_MENU_STATE_PARSING_RESULT)) {
                defpackage.amci amciVar8 = this.c;
                defpackage.almz almzVar9 = almyVar.h;
                if (almzVar9 == null) {
                    almzVar9 = defpackage.almz.a;
                }
                amciVar8.g(almzVar9);
                return;
            }
            return;
        }
        defpackage.almz almzVar10 = almyVar.h;
        if (almzVar10 == null) {
            almzVar10 = defpackage.almz.a;
        }
        apdi apdiVar4 = defpackage.almp.b;
        almzVar10.c(apdiVar4);
        java.lang.Object objJ4 = ((alaa) almzVar10).n.j((alac) apdiVar4.a);
        if (objJ4 == null) {
            objJ4 = apdiVar4.b;
        } else {
            apdiVar4.c(objJ4);
        }
        ahwi ahwiVar = ((alqz) objJ4).c;
        if (ahwiVar == null) {
            ahwiVar = ahwi.a;
        }
        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/processors/AmStateProcessor", "handleBusinessPhoneData", 269, "AmStateProcessor.java").y("Got businessPhoneData for %s", ahwiVar.b);
        apdi apdiVar5 = defpackage.ahwk.a;
        ahwiVar.c(apdiVar5);
        akzs akzsVar = ((alaa) ahwiVar).n;
        alac alacVar = (alac) apdiVar5.a;
        if (akzsVar.l(alacVar)) {
            defpackage.amcg amcgVar2 = this.e;
            ahwiVar.c(apdiVar5);
            java.lang.Object objJ5 = ((alaa) ahwiVar).n.j(alacVar);
            if (objJ5 == null) {
                objJ5 = apdiVar5.b;
            } else {
                apdiVar5.c(objJ5);
            }
            defpackage.amfl amflVar = ((defpackage.ahwj) objJ5).b;
            if (amflVar == null) {
                amflVar = defpackage.amfl.a;
            }
            amcgVar2.c(amflVar);
        }
    }

    @Override // defpackage.allg
    public final void d() {
        this.e.i();
    }

    @Override // defpackage.allg
    public final void e() {
        this.e.j();
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        apdi apdiVar = amgg.y;
        alqkVar.c(apdiVar);
        akzs akzsVar = ((alaa) alqkVar).n;
        alac alacVar = (alac) apdiVar.a;
        java.lang.Object objJ = akzsVar.j(alacVar);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        amgg amggVar = (amgg) objJ;
        boolean z = amggVar.k;
        this.f = !amggVar.f;
        this.g = amggVar.o;
        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/processors/AmStateProcessor", "init", 93, "AmStateProcessor.java").v("Creating cache-supported DMC AM state manager.");
        this.e = (defpackage.amcg) this.d.get(defpackage.amch.b);
        this.h = j$.util.Optional.of(alqdVar);
        this.i = almbVar;
        this.j = alqhVar;
        this.k = alqkVar;
        alqkVar.c(apdiVar);
        java.lang.Object objJ2 = ((alaa) alqkVar).n.j(alacVar);
        if (objJ2 == null) {
            objJ2 = apdiVar.b;
        } else {
            apdiVar.c(objJ2);
        }
        amgg amggVar2 = (amgg) objJ2;
        this.e.f();
        defpackage.amcg amcgVar = this.e;
        defpackage.alqh alqhVar2 = this.j;
        defpackage.alqk alqkVar2 = this.k;
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        j$.util.Optional optional = this.h;
        defpackage.almb almbVar2 = this.i;
        defpackage.amed amedVarG = defpackage.amjk.g();
        float f = amggVar2.l;
        amedVarG.b();
        int i = amggVar2.m;
        amedVarG.c();
        int i2 = amggVar2.n;
        amedVarG.d();
        amedVarG.e();
        amcgVar.l(alqhVar2, alqkVar2, optionalEmpty, optional, almbVar2);
    }
}
