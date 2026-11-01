package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class allx implements defpackage.allg {
    public final defpackage.allj b;
    public boolean d;
    private j$.util.Optional i;
    private final defpackage.alqf k;
    private static final aimz f = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/TimeoutProcessor");
    public static final j$.time.Duration a = j$.time.Duration.ofSeconds(1);
    private final java.util.List g = new java.util.ArrayList();
    public boolean c = false;
    private j$.time.Duration h = j$.time.Duration.ofSeconds(15);
    public j$.time.Duration e = j$.time.Duration.ofSeconds(1);
    private j$.util.Optional j = j$.util.Optional.empty();

    public allx(defpackage.alli alliVar, defpackage.alqf alqfVar) {
        this.b = alliVar.a(defpackage.allh.g.name());
        this.k = alqfVar;
    }

    private final void g() {
        defpackage.alqf alqfVar = this.k;
        j$.util.Objects.requireNonNull(alqfVar);
        defpackage.alkh alkhVar = new defpackage.alkh(alqfVar, 5);
        java.util.List list = this.g;
        j$.lang.Iterable.-EL.forEach(list, alkhVar);
        list.clear();
        this.d = false;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_SAY_INITIATED_TIMING, defpackage.alnb.EVENT_END_SAY_TIMING, defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_ENDPOINT_SPEECH_START, defpackage.alnb.EVENT_RINGING_STARTED, defpackage.alnb.EVENT_SELECTED_OPTION, new defpackage.alnb[0]);
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
        if (iOrdinal != 1) {
            if (iOrdinal != 19) {
                if (iOrdinal == 26) {
                    this.d = true;
                    return;
                } else if (iOrdinal != 48 && iOrdinal != 11) {
                    if (iOrdinal == 12) {
                        g();
                        c(new defpackage.allw(this.h, true, 1), this.h);
                        return;
                    }
                    return;
                }
            }
            g();
            return;
        }
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
        if (alquVar.c == 1) {
            this.j = j$.util.Optional.of(aizp.a(alquVar.f));
        }
        boolean z = false;
        if (defpackage.alph.c(alquVar)) {
            this.c = false;
            return;
        }
        if (alquVar.c == 2) {
            j$.util.Optional optionalOfNullable = this.j;
            defpackage.xbz xbzVar = new defpackage.xbz(aizp.a(alquVar.e), 13);
            if (true == optionalOfNullable.isPresent()) {
                java.lang.Object obj = optionalOfNullable.get();
                j$.time.Instant instant = (j$.time.Instant) xbzVar.a;
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(instant.isAfter((j$.time.Instant) obj) || instant.equals(obj)));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.TRUE)).booleanValue()) {
                z = true;
            }
        }
        this.c = z;
        int i = alquVar.c;
        if (i == 1 || i == 12) {
            g();
            j$.util.Optional optional = this.i;
            defpackage.alju aljuVar = new defpackage.alju(this, 15);
            if (true == optional.isPresent()) {
                j$.time.Duration duration = (j$.time.Duration) optional.get();
                ((defpackage.allx) aljuVar.a).c(new defpackage.allw(duration, true, 2), duration);
            }
        }
    }

    public final void c(defpackage.allw allwVar, j$.time.Duration duration) {
        try {
            this.g.add(this.k.c(new defpackage.alkh(this, 6), allwVar, duration));
        } catch (defpackage.aljs e) {
            a.by(f.c(), "Scheduling PublishTimeoutEvent failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/TimeoutProcessor", "schedulePublishTimeoutEvent", (char) 194, "TimeoutProcessor.java", e);
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.c = false;
        g();
        akzm akzmVar = almlVar.e;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        this.h = ajsz.dJ(akzmVar);
        this.i = j$.util.Optional.empty();
        if ((almlVar.b & 2) != 0) {
            akzm akzmVar2 = almlVar.f;
            if (akzmVar2 == null) {
                akzmVar2 = akzm.a;
            }
            this.i = j$.util.Optional.of(ajsz.dJ(akzmVar2));
        }
        if ((almlVar.b & 4) != 0) {
            akzm akzmVar3 = almlVar.g;
            if (akzmVar3 == null) {
                akzmVar3 = akzm.a;
            }
            this.e = ajsz.dJ(akzmVar3);
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
