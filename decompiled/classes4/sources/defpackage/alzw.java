package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzw implements defpackage.alud {
    private static final aimz b = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/offhold/HoldDetectionResultHandler");
    private static final j$.time.Duration c = j$.time.Duration.ofSeconds(10);
    private static final j$.time.Duration d = j$.time.Duration.ofSeconds(25);
    private static final aigf e = aigf.n(alrb.b, "music", alrb.c, "speech", alrb.e, "silence", alrb.d, "telephony");
    public defpackage.aluc a;
    private final defpackage.amac f;
    private final defpackage.amad g;
    private java.util.Map h;
    private defpackage.alzv i;
    private defpackage.amaj j;

    public alzw(defpackage.amad amadVar) {
        this.f = new defpackage.amac(amadVar);
        this.g = amadVar;
    }

    private final java.lang.String l(java.lang.String str) {
        defpackage.amgz amgzVar = (defpackage.amgz) this.h.get(str);
        if (amgzVar != null) {
            return ((defpackage.amgw) ((defpackage.amgx) amgzVar.f.get(0)).d.get(0)).f;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("robot intent spec does not contain intent with name %s.", str));
    }

    private final void m() {
        defpackage.alzv alzvVar = this.i;
        alzvVar.b = j$.time.Duration.ofMillis(alzvVar.i);
        j$.time.Duration durationOfMillis = j$.time.Duration.ZERO;
        if (this.i.u.isPresent()) {
            defpackage.alzv alzvVar2 = this.i;
            if (alzvVar2.i > ((j$.time.Duration) alzvVar2.u.get()).toMillis()) {
                durationOfMillis = j$.time.Duration.ofMillis(this.i.i - ((int) ((j$.time.Duration) this.i.u.get()).toMillis()));
            }
        }
        defpackage.aluc alucVar = this.a;
        akzz akzzVarM = defpackage.alsi.a.m();
        apdi apdiVar = defpackage.amah.e;
        akzx akzxVarM = defpackage.amah.a.m();
        defpackage.amag amagVar = defpackage.amag.NOTIFY_USER;
        akzxVarM.u();
        defpackage.amah amahVar = (defpackage.amah) akzxVarM.b;
        amahVar.c = amagVar.k;
        amahVar.b |= 1;
        akzm akzmVarC = aldf.c(durationOfMillis.toMillis());
        akzxVarM.u();
        defpackage.amah amahVar2 = (defpackage.amah) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarC);
        amahVar2.d = akzmVarC;
        amahVar2.b |= 2;
        akzzVarM.bV(apdiVar, (defpackage.amah) akzxVarM.p());
        alucVar.a((defpackage.alsi) akzzVarM.p());
    }

    private final boolean n() {
        defpackage.alzv alzvVar = this.i;
        return alzvVar.k > alzvVar.n;
    }

    private final boolean o(alra alraVar, alrb alrbVar) {
        defpackage.amak amakVar = this.j.e;
        if (amakVar == null) {
            amakVar = defpackage.amak.a;
        }
        java.lang.String str = (java.lang.String) e.getOrDefault(alrbVar, "unknown");
        j$.util.Objects.requireNonNull(str);
        java.lang.Float f = (java.lang.Float) amakVar.d.get(str);
        float fFloatValue = f != null ? f.floatValue() : Float.POSITIVE_INFINITY;
        alrb alrbVarB = alrb.b(alraVar.c);
        if (alrbVarB == null) {
            alrbVarB = alrb.a;
        }
        return alrbVarB == alrbVar && alraVar.d >= ((double) fFloatValue);
    }

    private final boolean p() {
        defpackage.alzv alzvVar = this.i;
        return alzvVar.m > alzvVar.n;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0141  */
    public final void a(alrc alrcVar) {
        alrb alrbVar;
        boolean z;
        defpackage.alzv alzvVar;
        defpackage.alzv alzvVar2;
        alrb alrbVar2;
        alra alraVar;
        defpackage.alzv alzvVar3 = this.i;
        int i = alzvVar3.i;
        if ((this.j.b & 1) != 0) {
            alzvVar3.k = i;
            if (alzvVar3.j == 0) {
                alzvVar3.j = i;
            }
            java.util.Iterator it = alrcVar.e.iterator();
            do {
                if (!it.hasNext()) {
                    alrbVar = alrb.a;
                    break;
                }
                alraVar = (alra) it.next();
                alrbVar = alrb.b;
                if (!o(alraVar, alrbVar)) {
                    alrbVar = alrb.c;
                    if (!o(alraVar, alrbVar)) {
                        alrbVar = alrb.e;
                        if (o(alraVar, alrbVar)) {
                            break;
                        } else {
                            alrbVar = alrb.d;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } while (!o(alraVar, alrbVar));
            defpackage.alzv alzvVar4 = this.i;
            if (alrbVar != alzvVar4.a) {
                alzvVar4.a = alrbVar;
                if (alzvVar4.x == 1 && !alzvVar4.h) {
                    alrb alrbVar3 = alzvVar4.a;
                    if (alrbVar3 == alrb.b && !alzvVar4.w) {
                        alzvVar4.w = true;
                        this.a.a(defpackage.alzv.b(defpackage.amag.MUSIC_STARTED));
                    } else if (alrbVar3 == alrb.c && alzvVar4.w) {
                        alzvVar4.w = false;
                        this.a.a(defpackage.alzv.b(defpackage.amag.MUSIC_STOPPED));
                    }
                    if (!this.i.s.isEmpty()) {
                        defpackage.alzv alzvVar5 = this.i;
                        int iIntValue = alzvVar5.i - ((java.lang.Integer) alzvVar5.s.get()).intValue();
                        defpackage.amaj amajVar = this.j;
                        if (iIntValue >= amajVar.h) {
                            defpackage.amak amakVar = amajVar.e;
                            if (amakVar == null) {
                                amakVar = defpackage.amak.a;
                            }
                            java.lang.String str = (java.lang.String) e.getOrDefault(alrbVar, "unknown");
                            j$.util.Objects.requireNonNull(str);
                            java.lang.Float f = (java.lang.Float) amakVar.e.get(str);
                            float fFloatValue = f != null ? f.floatValue() : 0.0f;
                            defpackage.alzv alzvVar6 = this.i;
                            float f2 = alzvVar6.t + fFloatValue;
                            alzvVar6.t = f2;
                            if (f2 >= 1.0f && !alzvVar6.h) {
                                alrb alrbVar4 = alrb.d;
                                defpackage.aluc alucVar = this.a;
                                if (alrbVar == alrbVar4) {
                                    alucVar.a(defpackage.alzv.b(defpackage.amag.CONNECTING_TO_AGENT));
                                } else {
                                    alucVar.a(defpackage.alzv.b(defpackage.amag.HOLD_DETECTED));
                                }
                                this.i.h = true;
                            }
                        }
                    }
                }
            }
            int iOrdinal = this.i.a.ordinal();
            if (iOrdinal == 1) {
                this.i.l = i;
            } else if (iOrdinal != 2) {
                if (iOrdinal == 4) {
                    this.i.p = i;
                    z = true;
                }
                if (this.i.s.isEmpty() && ((alrbVar2 = (alzvVar2 = this.i).a) == alrb.b || alrbVar2 == alrb.c)) {
                    alzvVar2.s = j$.util.Optional.of(java.lang.Integer.valueOf(i));
                }
                if (z) {
                    alzvVar = this.i;
                    if (alzvVar.o == 0) {
                        alzvVar.o = i;
                    }
                    alzvVar.q = 0;
                    return;
                }
            } else {
                this.i.m = i;
            }
            z = false;
            if (this.i.s.isEmpty()) {
                alzvVar2.s = j$.util.Optional.of(java.lang.Integer.valueOf(i));
            }
            if (z) {
                alzvVar = this.i;
                if (alzvVar.o == 0) {
                    alzvVar.o = i;
                }
                alzvVar.q = 0;
                return;
            }
        }
        defpackage.alzv alzvVar7 = this.i;
        int i2 = alzvVar7.q + 1;
        alzvVar7.q = i2;
        if (i2 >= 3) {
            alzvVar7.o = 0;
        }
    }

    @Override // defpackage.alud
    public final defpackage.alub b(defpackage.amaz amazVar) {
        this.i.v = aizo.c(amazVar.d);
        return amazVar.c.size() == 0 ? defpackage.alzx.f : this.f.a(amazVar);
    }

    @Override // defpackage.alud
    public final void c(defpackage.alub alubVar) {
        if (alubVar == defpackage.alzx.a || alubVar == defpackage.alzx.b) {
            if (this.i.u.isEmpty()) {
                defpackage.alzv alzvVar = this.i;
                alzvVar.u = j$.util.Optional.of(alzvVar.v);
            }
            if (this.i.a()) {
                akzm akzmVar = this.j.g;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                long jA = aldf.a(akzmVar);
                if (jA > 0) {
                    defpackage.alzv alzvVar2 = this.i;
                    if (((long) alzvVar2.i) - alzvVar2.b.toMillis() > jA) {
                        defpackage.alzv alzvVar3 = this.i;
                        if (!alzvVar3.c) {
                            alzvVar3.c = true;
                            this.a.b(l("PleaseWaitForUser"));
                        }
                    }
                }
            } else if (alubVar != defpackage.alzx.b || (n() && !p())) {
                defpackage.alzv alzvVar4 = this.i;
                if (!alzvVar4.e) {
                    this.a.b(l("ActiveOffHoldVerification"));
                    this.i.e = true;
                } else if (alzvVar4.l <= alzvVar4.n) {
                    m();
                }
            } else {
                m();
            }
        } else {
            defpackage.alzv alzvVar5 = this.i;
            alzvVar5.e = false;
            alzvVar5.u = j$.util.Optional.empty();
        }
        defpackage.alzv alzvVar6 = this.i;
        if (alzvVar6.x == 1) {
            defpackage.alzx alzxVar = defpackage.alzx.e;
            if (alubVar == alzxVar) {
                alzvVar6.t = 0.0f;
            } else if (alubVar == defpackage.alzx.h) {
                alubVar = alzxVar;
            } else if (alubVar == defpackage.alzx.i) {
                alubVar = defpackage.alzx.g;
            }
            if (alubVar == defpackage.alzx.g) {
                if (alzvVar6.r.isEmpty()) {
                    defpackage.alzv alzvVar7 = this.i;
                    alzvVar7.r = j$.util.Optional.of(java.lang.Integer.valueOf(alzvVar7.i));
                }
            } else if (alubVar == alzxVar) {
                alzvVar6.r = j$.util.Optional.empty();
            }
        } else {
            if (alubVar == defpackage.alzx.h || alubVar == defpackage.alzx.i) {
                alubVar = defpackage.alzx.g;
            }
            if (alubVar == defpackage.alzx.d && alzvVar6.a() && !this.i.f) {
                this.a.a(defpackage.alzv.b(defpackage.amag.DO_NOT_RECORD_THE_CALL));
                this.a.b(l("WillNotRecordTheCall"));
                this.i.f = true;
            }
            if (alubVar == defpackage.alzx.e && (!n() || p())) {
                defpackage.alzv alzvVar8 = this.i;
                if (!alzvVar8.d) {
                    alzvVar8.d = true;
                    this.a.a(defpackage.alzv.b(defpackage.amag.USER_ATTENTION_REQUIRED));
                }
            }
        }
        defpackage.alzv alzvVar9 = this.i;
        alzvVar9.n = alzvVar9.i;
    }

    @Override // defpackage.alud
    public final void d(java.lang.String str, defpackage.alqh alqhVar, defpackage.alqk alqkVar, ajcu ajcuVar, defpackage.amgv amgvVar) {
        this.f.b(str);
        defpackage.amad amadVar = this.g;
        defpackage.amha amhaVarC = amadVar.c(str);
        this.h = new java.util.HashMap();
        for (defpackage.amgz amgzVar : amhaVarC.e) {
            this.h.put(amgzVar.c, amgzVar);
        }
        this.j = amadVar.b(str);
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
        this.i = new defpackage.alzv(iL);
    }

    @Override // defpackage.alud
    public final void e(defpackage.alro alroVar) {
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
            j((defpackage.amai) objJ);
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
            k((defpackage.also) objJ2);
        }
        apdi apdiVar3 = alrc.f;
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
            a((alrc) objJ3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.alud
    public final void f(defpackage.aljk aljkVar) {
        defpackage.amaj amajVar;
        defpackage.amak amakVar;
        long millis;
        defpackage.alzv alzvVar = this.i;
        alzvVar.i = aljkVar.b;
        boolean z = false;
        if (alzvVar.x != 1) {
            defpackage.amaj amajVar2 = this.j;
            if ((amajVar2.b & 1) != 0) {
                defpackage.amak amakVar2 = amajVar2.e;
                if (amakVar2 == null) {
                    amakVar2 = defpackage.amak.a;
                }
                long j = amakVar2.c;
                defpackage.alzv alzvVar2 = this.i;
                int i = alzvVar2.p;
                int i2 = i - alzvVar2.j;
                int i3 = alzvVar2.o;
                if (i3 > 0 && i - i3 >= j) {
                    z = true;
                }
                if (i2 > j && z && !alzvVar2.g) {
                    alzvVar2.g = true;
                    this.a.a(defpackage.alzv.b(defpackage.amag.AUDIO_ERROR));
                }
            }
            akzm akzmVar = this.j.f;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            long jA = aldf.a(akzmVar);
            if (jA > 0) {
                defpackage.alzv alzvVar3 = this.i;
                if (alzvVar3.c || !alzvVar3.a()) {
                    return;
                }
                defpackage.alzv alzvVar4 = this.i;
                if (((long) alzvVar4.i) - alzvVar4.b.toMillis() > jA) {
                    this.i.c = true;
                    this.a.b(l("PleaseWaitForUser"));
                    return;
                }
                return;
            }
            return;
        }
        if (alzvVar.h) {
            return;
        }
        if (!alzvVar.r.isPresent()) {
            amajVar = this.j;
            if ((amajVar.b & 1) == 0) {
                int i4 = this.i.i;
                amakVar = amajVar.e;
                if (amakVar == null) {
                    amakVar = defpackage.amak.a;
                }
                millis = amakVar.b;
                if (millis == 0) {
                    millis = c.toMillis();
                }
                if (this.i.s.isPresent()) {
                    z = true;
                }
                defpackage.alzv alzvVar5 = this.i;
                int i5 = i4 - alzvVar5.l;
                int i6 = i4 - alzvVar5.m;
                if (z) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        defpackage.alzv alzvVar6 = this.i;
        int iIntValue = alzvVar6.i - ((java.lang.Integer) alzvVar6.r.get()).intValue();
        long millis2 = this.j.d;
        if (millis2 == 0) {
            millis2 = d.toMillis();
        }
        if (iIntValue < millis2) {
            amajVar = this.j;
            if ((amajVar.b & 1) == 0) {
                return;
            }
            int i7 = this.i.i;
            amakVar = amajVar.e;
            if (amakVar == null) {
                amakVar = defpackage.amak.a;
            }
            millis = amakVar.b;
            if (millis == 0) {
                millis = c.toMillis();
            }
            if (this.i.s.isPresent() && i7 - ((java.lang.Integer) this.i.s.get()).intValue() > millis) {
                z = true;
            }
            defpackage.alzv alzvVar7 = this.i;
            int i8 = i7 - alzvVar7.l;
            int i9 = i7 - alzvVar7.m;
            if (z || i8 > millis || i9 <= millis) {
                return;
            }
        }
        this.a.a(defpackage.alzv.b(defpackage.amag.HOLD_DETECTED));
        this.i.h = true;
    }

    @Override // defpackage.alud
    public final void g(defpackage.aluc alucVar) {
        this.a = alucVar;
    }

    public final void j(defpackage.amai amaiVar) {
        if (amaiVar.b) {
            this.i = new defpackage.alzv(2);
        }
    }

    public final void k(defpackage.also alsoVar) {
        if (alsoVar.b) {
            b.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/offhold/HoldDetectionResultHandler", "handleResetStateRequested", 172, "HoldDetectionResultHandler.java").w("state was reset at time: %s", this.i.i);
            this.i = new defpackage.alzv(this.i.x);
        }
    }

    @Override // defpackage.alud
    public final void i() {
    }

    @Override // defpackage.alud
    public final void h(j$.util.Optional optional) {
    }
}
