package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzz implements defpackage.alud {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/offhold/OffHoldResultHandler");
    private static final aigf b = aigf.m(alrb.b, "music", alrb.c, "speech", alrb.e, "silence");
    private final defpackage.amac c;
    private final defpackage.amad d;
    private defpackage.aluc e;
    private defpackage.amgv f;
    private java.util.Map g;
    private defpackage.alzy h;
    private defpackage.amaj i;

    public alzz(defpackage.amad amadVar) {
        this.c = new defpackage.amac(amadVar);
        this.d = amadVar;
    }

    private final java.lang.String a(java.lang.String str) {
        defpackage.amgz amgzVar = (defpackage.amgz) this.g.get(str);
        if (amgzVar != null) {
            return ((defpackage.amgw) ((defpackage.amgx) amgzVar.f.get(0)).d.get(0)).f;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("robot intent spec does not contain intent with name %s.", str));
    }

    private final void j() {
        defpackage.alzy alzyVar = this.h;
        alzyVar.b = j$.time.Duration.ofMillis(alzyVar.h);
        this.e.a(defpackage.alzv.b(defpackage.amag.NOTIFY_USER));
    }

    private final boolean k() {
        defpackage.alzy alzyVar = this.h;
        return alzyVar.j > alzyVar.m;
    }

    private final boolean l(alra alraVar, alrb alrbVar) {
        defpackage.amak amakVar = this.i.e;
        if (amakVar == null) {
            amakVar = defpackage.amak.a;
        }
        java.lang.String str = (java.lang.String) b.getOrDefault(alrbVar, "unknown");
        j$.util.Objects.requireNonNull(str);
        java.lang.Float f = (java.lang.Float) amakVar.d.get(str);
        float fFloatValue = f != null ? f.floatValue() : Float.POSITIVE_INFINITY;
        alrb alrbVarB = alrb.b(alraVar.c);
        if (alrbVarB == null) {
            alrbVarB = alrb.a;
        }
        return alrbVarB == alrbVar && alraVar.d >= ((double) fFloatValue);
    }

    private final boolean m() {
        defpackage.alzy alzyVar = this.h;
        return alzyVar.l > alzyVar.m;
    }

    @Override // defpackage.alud
    public final defpackage.alub b(defpackage.amaz amazVar) {
        return amazVar.c.size() == 0 ? defpackage.alzx.f : this.c.a(amazVar);
    }

    @Override // defpackage.alud
    public final void c(defpackage.alub alubVar) {
        if (alubVar != defpackage.alzx.a && alubVar != defpackage.alzx.b) {
            this.h.e = false;
        } else if (this.h.a()) {
            akzm akzmVar = this.i.g;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            long jA = aldf.a(akzmVar);
            if (jA > 0) {
                defpackage.alzy alzyVar = this.h;
                if (((long) alzyVar.h) - alzyVar.b.toMillis() > jA) {
                    defpackage.alzy alzyVar2 = this.h;
                    if (!alzyVar2.c) {
                        alzyVar2.c = true;
                        this.e.b(a("PleaseWaitForUser"));
                    }
                }
            }
        } else if (alubVar != defpackage.alzx.b || (k() && !m())) {
            defpackage.alzy alzyVar3 = this.h;
            if (!alzyVar3.e) {
                this.e.b(a("ActiveOffHoldVerification"));
                this.h.e = true;
            } else if (alzyVar3.k <= alzyVar3.m) {
                j();
            }
        } else {
            j();
        }
        if (alubVar == defpackage.alzx.d && this.h.a() && !this.h.f) {
            this.e.a(defpackage.alzv.b(defpackage.amag.DO_NOT_RECORD_THE_CALL));
            this.e.b(a("WillNotRecordTheCall"));
            this.h.f = true;
        }
        if (alubVar == defpackage.alzx.e && (!k() || m())) {
            defpackage.alzy alzyVar4 = this.h;
            if (!alzyVar4.d) {
                alzyVar4.d = true;
                this.e.a(defpackage.alzv.b(defpackage.amag.USER_ATTENTION_REQUIRED));
            }
        }
        defpackage.alzy alzyVar5 = this.h;
        alzyVar5.m = alzyVar5.h;
    }

    @Override // defpackage.alud
    public final void d(java.lang.String str, defpackage.alqh alqhVar, defpackage.alqk alqkVar, ajcu ajcuVar, defpackage.amgv amgvVar) {
        this.c.b(str);
        defpackage.amad amadVar = this.d;
        defpackage.amha amhaVarC = amadVar.c(str);
        this.g = new java.util.HashMap();
        for (defpackage.amgz amgzVar : amhaVarC.e) {
            this.g.put(amgzVar.c, amgzVar);
        }
        this.i = amadVar.b(str);
        apdi apdiVar = defpackage.amaf.d;
        alqkVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alqkVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        int iL = defpackage.amjk.l(((defpackage.amaf) objJ).c);
        if (iL == 0) {
            iL = 2;
        }
        this.h = new defpackage.alzy(iL);
        this.f = amgvVar;
    }

    @Override // defpackage.alud
    public final void e(defpackage.alro alroVar) {
        alrb alrbVar;
        alra alraVar;
        apdi apdiVar = defpackage.amai.c;
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
            if (((defpackage.amai) objJ).b) {
                this.h = new defpackage.alzy(2);
            }
        }
        apdi apdiVar2 = defpackage.also.c;
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
            if (((defpackage.also) objJ2).b) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/offhold/OffHoldResultHandler", "onInboundEvent", 157, "OffHoldResultHandler.java").w("state was reset at time: %s", this.h.h);
                this.h = new defpackage.alzy(this.h.q);
            }
        }
        int i = this.h.h;
        if ((this.i.b & 1) != 0) {
            apdi apdiVar3 = alrc.f;
            alroVar.c(apdiVar3);
            akzs akzsVar3 = ((alaa) alroVar).n;
            alac alacVar3 = (alac) apdiVar3.a;
            if (akzsVar3.l(alacVar3)) {
                defpackage.alzy alzyVar = this.h;
                alzyVar.j = i;
                if (alzyVar.i == 0) {
                    alzyVar.i = i;
                }
                alroVar.c(apdiVar3);
                java.lang.Object objJ3 = ((alaa) alroVar).n.j(alacVar3);
                if (objJ3 == null) {
                    objJ3 = apdiVar3.b;
                } else {
                    apdiVar3.c(objJ3);
                }
                java.util.Iterator it = ((alrc) objJ3).e.iterator();
                do {
                    if (!it.hasNext()) {
                        alrbVar = alrb.a;
                        break;
                    }
                    alraVar = (alra) it.next();
                    alrbVar = alrb.b;
                    if (!l(alraVar, alrbVar)) {
                        alrbVar = alrb.c;
                        if (l(alraVar, alrbVar)) {
                            break;
                        } else {
                            alrbVar = alrb.e;
                        }
                    } else {
                        break;
                    }
                } while (!l(alraVar, alrbVar));
                defpackage.alzy alzyVar2 = this.h;
                if (alrbVar != alzyVar2.a) {
                    alzyVar2.a = alrbVar;
                    defpackage.amgv amgvVar = this.f;
                    int i2 = alzyVar2.h;
                    akzx akzxVarM = defpackage.altn.a.m();
                    akzx akzxVarM2 = defpackage.alrd.a.m();
                    akzxVarM2.u();
                    defpackage.alrd alrdVar = (defpackage.alrd) akzxVarM2.b;
                    alrdVar.c = alrbVar.f;
                    alrdVar.b |= 1;
                    akzxVarM.u();
                    defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
                    defpackage.alrd alrdVar2 = (defpackage.alrd) akzxVarM2.p();
                    j$.util.Objects.requireNonNull(alrdVar2);
                    altnVar.c = alrdVar2;
                    altnVar.b = 14;
                    amgvVar.h(akzxVarM, j$.time.Duration.ofMillis(i2));
                }
                int iOrdinal = this.h.a.ordinal();
                if (iOrdinal == 1) {
                    this.h.k = i;
                } else if (iOrdinal == 2) {
                    this.h.l = i;
                } else if (iOrdinal == 4) {
                    defpackage.alzy alzyVar3 = this.h;
                    alzyVar3.o = i;
                    if (alzyVar3.n == 0) {
                        alzyVar3.n = i;
                    }
                    alzyVar3.p = 0;
                    return;
                }
            }
        }
        defpackage.alzy alzyVar4 = this.h;
        int i3 = alzyVar4.p + 1;
        alzyVar4.p = i3;
        if (i3 >= 3) {
            alzyVar4.n = 0;
        }
    }

    @Override // defpackage.alud
    public final void f(defpackage.aljk aljkVar) {
        this.h.h = aljkVar.b;
        defpackage.amaj amajVar = this.i;
        if ((amajVar.b & 1) != 0) {
            defpackage.amak amakVar = amajVar.e;
            if (amakVar == null) {
                amakVar = defpackage.amak.a;
            }
            long j = amakVar.c;
            defpackage.alzy alzyVar = this.h;
            int i = alzyVar.o;
            int i2 = i - alzyVar.i;
            int i3 = alzyVar.n;
            boolean z = false;
            if (i3 > 0 && i - i3 >= j) {
                z = true;
            }
            if (i2 > j && z && !alzyVar.g) {
                alzyVar.g = true;
                this.e.a(defpackage.alzv.b(defpackage.amag.AUDIO_ERROR));
            }
        }
        akzm akzmVar = this.i.f;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        long jA = aldf.a(akzmVar);
        if (jA > 0) {
            defpackage.alzy alzyVar2 = this.h;
            if (alzyVar2.c || !alzyVar2.a()) {
                return;
            }
            defpackage.alzy alzyVar3 = this.h;
            if (((long) alzyVar3.h) - alzyVar3.b.toMillis() > jA) {
                this.h.c = true;
                this.e.b(a("PleaseWaitForUser"));
            }
        }
    }

    @Override // defpackage.alud
    public final void g(defpackage.aluc alucVar) {
        this.e = alucVar;
    }

    @Override // defpackage.alud
    public final void i() {
    }

    @Override // defpackage.alud
    public final void h(j$.util.Optional optional) {
    }
}
