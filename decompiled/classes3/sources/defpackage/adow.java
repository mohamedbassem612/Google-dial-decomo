package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adow implements defpackage.ados, adrs {
    public static final aimz a = aimz.i("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager");
    private static final aihg p;
    private static final java.util.concurrent.atomic.AtomicInteger q;
    public final defpackage.ador b;
    public final java.lang.Object c = new java.lang.Object();
    public final java.lang.Object d = new java.lang.Object();
    public final java.lang.Object e = new java.lang.Object();
    public final ajcu f;
    public final adqu g;
    public final int h;
    public final adpe i;
    public final int j;
    public final java.util.concurrent.atomic.AtomicBoolean k;
    public defpackage.adov l;
    public boolean m;
    public ajcq n;
    public final defpackage.adsp o;
    private final defpackage.adox r;
    private final j$.util.Optional s;
    private defpackage.adrt t;
    private final adqu u;
    private final int v;
    private final ajwz w;

    static {
        aihe aiheVar = new aihe();
        aiheVar.c(defpackage.adov.b, aify.r(defpackage.adov.g, defpackage.adov.e, defpackage.adov.a));
        aiheVar.b(defpackage.adov.c, defpackage.adov.b);
        aiheVar.c(defpackage.adov.d, aify.q(defpackage.adov.c, defpackage.adov.b));
        aiheVar.b(defpackage.adov.e, defpackage.adov.d);
        aiheVar.c(defpackage.adov.f, aify.s(defpackage.adov.b, defpackage.adov.d, defpackage.adov.c, defpackage.adov.e));
        aiheVar.c(defpackage.adov.g, java.util.EnumSet.allOf(defpackage.adov.class));
        p = aiheVar.a();
        q = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public adow(defpackage.adox adoxVar, ajwz ajwzVar, int i, defpackage.adsp adspVar, adpe adpeVar, ajcu ajcuVar, defpackage.ador adorVar, int i2, j$.util.Optional optional) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        this.k = atomicBoolean;
        this.l = defpackage.adov.a;
        this.r = adoxVar;
        this.w = ajwzVar;
        this.v = i;
        this.b = adorVar;
        this.o = adspVar;
        this.i = adpeVar;
        this.f = ajcuVar;
        this.g = new adqu(ajcuVar);
        this.h = i2;
        this.j = q.incrementAndGet();
        atomicBoolean.set(false);
        this.u = new adqu(ajcuVar);
        this.s = optional;
    }

    public static java.lang.String i(adnw adnwVar) {
        j$.util.Optional optional = adnwVar.a;
        optional.isPresent();
        java.lang.String str = (java.lang.String) adnwVar.b.orElse("<FILE> ".concat(java.lang.String.valueOf(((java.io.File) optional.get()).getName())));
        return str.length() > 20 ? java.lang.String.valueOf(str.substring(0, 20)).concat("...") : str;
    }

    private final void q(defpackage.adrr adrrVar, boolean z) {
        java.lang.Boolean.valueOf(z).getClass();
        java.util.List listCe = agab.ce(adrrVar, z);
        if (listCe.isEmpty()) {
            return;
        }
        ((defpackage.adoq) this.r).a.f(listCe);
    }

    public final defpackage.adov a() {
        defpackage.adov adovVar;
        synchronized (this.c) {
            adovVar = this.l;
        }
        return adovVar;
    }

    public final ajcq b() {
        return (ajcq) this.u.b().orElse(aiql.z((java.lang.Object) null));
    }

    public final ajcq c() {
        a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "performStopSequence", 511, "IncomingCallFlowManager.java").w("%d:performStopSequence()", this.j);
        return d(g());
    }

    public final ajcq d(ajcq ajcqVar) {
        a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "performStopSequence", 525, "IncomingCallFlowManager.java").w("%d:performStopSequence(future)", this.j);
        return ajan.f(new adqr(aiql.w(new ajcq[]{ajcqVar, this.o.b(), b()})), new defpackage.adek(this, 5), ajbm.a);
    }

    public final ajcq e(adnw adnwVar) {
        ajcq ajcqVarY;
        byte[] bArr = null;
        if (ahvr.cp((java.lang.String) adnwVar.b.orElse((java.lang.Object) null)) && adnwVar.a.isEmpty()) {
            throw new java.lang.UnsupportedOperationException("playAudioMessage() requires an audio file or a given message text");
        }
        synchronized (this.d) {
            boolean zE = this.o.e();
            aimz aimzVar = a;
            if (zE) {
                aimzVar.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "playAudioMessage", 725, "IncomingCallFlowManager.java").B("%d:playAudioMessage(): playing: \"%s\"", this.j, i(adnwVar));
                j$.util.Optional optional = adnwVar.a;
                optional.isPresent();
                ajck ajckVarW = ajck.w(aiql.z(optional.get()));
                defpackage.acze aczeVar = new defpackage.acze(this, adnwVar, 19, bArr);
                ajcu ajcuVar = this.f;
                ajcqVarY = ajckVarW.y(aczeVar, ajcuVar).v(defpackage.adso.class, new defpackage.acze(this, adnwVar, 20, bArr), ajcuVar).y(new adfd(this, 9), ajcuVar);
            } else {
                aimzVar.d().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "playAudioMessage", 719, "IncomingCallFlowManager.java").B("%d:playAudioMessage with text %s - playback manager isn't currently running", this.j, i(adnwVar));
                ajcqVarY = aiql.z(java.lang.Boolean.FALSE);
            }
        }
        return ajcqVarY;
    }

    public final ajcq f(boolean z) {
        ajcq ajcqVarA;
        synchronized (this.c) {
            ajcqVarA = this.u.a(new defpackage.qpu(this, z, 6), (java.lang.Object) null);
        }
        return ajcqVarA;
    }

    public final synchronized ajcq g() {
        ajcq ajcqVarZ;
        defpackage.adrt adrtVar = this.t;
        if (adrtVar != null) {
            ((defpackage.adrj) adrtVar).c.remove(this);
            defpackage.adrt adrtVar2 = this.t;
            if (((defpackage.adsa) adrtVar2).f.getAndSet(false)) {
                defpackage.adsa.d.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "endSpeechRecognition", 167, "TerseSpeechRecognizer.java").v("endSpeechRecognition() - starting close sequence");
                ajcqVarZ = ((defpackage.adsa) adrtVar2).b.eU(new defpackage.zpk(adrtVar2, 12));
            } else {
                defpackage.adsa.d.d().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "endSpeechRecognition", 163, "TerseSpeechRecognizer.java").v("not currently running");
                ajcqVarZ = aiql.z((java.lang.Object) null);
            }
            this.t = null;
        } else {
            ajcqVarZ = aiql.z((java.lang.Object) null);
        }
        return ajcqVarZ;
    }

    public final ajcq h(ajcq ajcqVar) {
        return aizu.g(ajcqVar, adof.class, new adfd(this, 10), this.f);
    }

    public final void j() {
        a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "muteControllers", 325, "IncomingCallFlowManager.java").w("%d:Muting controllers", this.j);
        synchronized (this.e) {
            this.i.b().d();
        }
        this.i.c().d();
    }

    public final synchronized void k() {
        defpackage.adrt adrtVarB = this.t;
        if (adrtVarB == null) {
            ajwz ajwzVar = this.w;
            int i = this.v;
            defpackage.adrm adrmVar = new defpackage.adrm(ajwzVar.c());
            adpe adpeVar = this.i;
            adrmVar.c(adpeVar.a());
            adrmVar.b(adpeVar.d());
            adrmVar.i = this.s;
            adrtVarB = ajwzVar.b(i, adrmVar.a());
            this.t = adrtVarB;
        }
        ((defpackage.adrj) adrtVarB).c.put(this, new adqu(this.f));
        defpackage.adrt adrtVar = this.t;
        if (((defpackage.adsa) adrtVar).f.getAndSet(true)) {
            defpackage.adsa.d.d().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer", "startSpeechRecognition", 119, "TerseSpeechRecognizer.java").v("already running");
            return;
        }
        synchronized (((defpackage.adsa) adrtVar).g) {
            try {
                if (((defpackage.adsa) adrtVar).h.isPresent()) {
                    throw new java.lang.IllegalStateException("recognizer input stream is already opened");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        ajcu ajcuVar = ((defpackage.adsa) adrtVar).b;
        aiql.I(ajcuVar.eU(new defpackage.zpk(adrtVar, 13)), new defpackage.adrx((defpackage.adsa) adrtVar), ajcuVar);
    }

    public final void l() {
        adpe adpeVar = this.i;
        if (adpeVar.h()) {
            a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "unmuteControllers", 546, "IncomingCallFlowManager.java").w("%d:Unmuting controllers", this.j);
            adpeVar.c().e();
            synchronized (this.e) {
                adpeVar.b().e();
            }
        }
    }

    public final void m(defpackage.adro adroVar) {
        adof adofVar = new adof(adroVar, defpackage.adoe.a);
        defpackage.ador adorVar = this.b;
        ((defpackage.adnk) adorVar).a.execute(new defpackage.aawj(adorVar, adofVar, 9));
    }

    public final void n(defpackage.adrr adrrVar) {
        q(adrrVar, true);
    }

    public final void o(defpackage.adrr adrrVar) {
        q(adrrVar, false);
    }

    public final boolean p(defpackage.adov adovVar, defpackage.amdx amdxVar, boolean z) {
        synchronized (this.c) {
            defpackage.adov adovVar2 = this.l;
            aihg aihgVar = p;
            if (!aihgVar.s(adovVar)) {
                throw new java.lang.IllegalArgumentException("Invalid new state: ".concat(adovVar.toString()));
            }
            if (!aihgVar.u(adovVar, adovVar2)) {
                if (z) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Unable to switch state. Previous state=%s, new state=%s", this.l.name(), adovVar.name()));
                }
                return false;
            }
            if (amdxVar != null) {
                amdxVar.a = this.l;
            }
            this.l = adovVar;
            return true;
        }
    }

    @Override // defpackage.ados
    public final boolean r() {
        return a().equals(defpackage.adov.c);
    }

    public final void s() {
        ((defpackage.adnk) this.b).a.execute(new fvl(16));
    }
}
