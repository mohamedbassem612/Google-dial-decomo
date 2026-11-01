package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ljs implements ados, defpackage.adrs {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager");
    private static final defpackage.aihg q;
    private static final java.util.concurrent.atomic.AtomicInteger r;
    public final ador b;
    public final java.lang.Object c = new java.lang.Object();
    public final java.lang.Object d = new java.lang.Object();
    public final java.lang.Object e = new java.lang.Object();
    public final ajcu f;
    public final adqu g;
    public final int h;
    public final defpackage.adpe i;
    public final int j;
    public final java.util.concurrent.atomic.AtomicBoolean k;
    public final ajct l;
    public final aoin m;
    public boolean n;
    public ajcq o;
    public final adsp p;
    private final adox s;
    private final ljb t;
    private final j$.util.Optional u;
    private defpackage.ljr v;
    private final adqu w;
    private final ajwz x;

    static {
        defpackage.aihe aiheVar = new defpackage.aihe();
        aiheVar.c(defpackage.ljr.b, aify.r(defpackage.ljr.g, defpackage.ljr.e, defpackage.ljr.a));
        aiheVar.b(defpackage.ljr.c, defpackage.ljr.b);
        aiheVar.c(defpackage.ljr.d, aify.q(defpackage.ljr.c, defpackage.ljr.b));
        aiheVar.b(defpackage.ljr.e, defpackage.ljr.d);
        aiheVar.c(defpackage.ljr.f, aify.s(defpackage.ljr.b, defpackage.ljr.d, defpackage.ljr.c, defpackage.ljr.e));
        aiheVar.c(defpackage.ljr.g, java.util.EnumSet.allOf(defpackage.ljr.class));
        q = aiheVar.a();
        r = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public ljs(adox adoxVar, ljb ljbVar, ajwz ajwzVar, adsp adspVar, defpackage.adpe adpeVar, ajcu ajcuVar, ajct ajctVar, ador adorVar, int i, j$.util.Optional optional, aoin aoinVar) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        this.k = atomicBoolean;
        this.v = defpackage.ljr.a;
        this.s = adoxVar;
        this.t = ljbVar;
        this.x = ajwzVar;
        this.b = adorVar;
        this.p = adspVar;
        this.i = adpeVar;
        this.f = ajcuVar;
        this.l = ajctVar;
        this.g = new adqu(ajcuVar);
        this.h = i;
        this.j = r.incrementAndGet();
        atomicBoolean.set(false);
        this.w = new adqu(ajcuVar);
        this.u = optional;
        this.m = aoinVar;
    }

    public static java.lang.String k(defpackage.adnw adnwVar) {
        j$.util.Optional optional = adnwVar.a;
        optional.isPresent();
        java.lang.String str = (java.lang.String) adnwVar.b.orElse("<FILE> ".concat(java.lang.String.valueOf(((java.io.File) optional.orElseThrow()).getName())));
        return str.length() > 20 ? java.lang.String.valueOf(str.substring(0, 20)).concat("...") : str;
    }

    private final void u(adrr adrrVar, boolean z) {
        java.lang.Boolean.valueOf(z).getClass();
        aify aifyVarCe = agab.ce(adrrVar, z);
        if (aifyVarCe.isEmpty()) {
            ljo.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallFlowManagerFactoryImpl", "create", 91, "ForkedCallFlowManagerFactoryImpl.java").v("Empty caller intents");
        } else {
            this.s.a.f(aifyVarCe);
        }
    }

    public final defpackage.ljr a() {
        defpackage.ljr ljrVar;
        synchronized (this.c) {
            ljrVar = this.v;
        }
        return ljrVar;
    }

    public final ajcq b() {
        return (ajcq) this.w.b().orElse(aiql.z((java.lang.Object) null));
    }

    public final ajcq c() {
        a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "performStopSequence", 596, "ForkedIncomingCallFlowManager.java").w("%d:performStopSequence()", this.j);
        return d(i());
    }

    public final ajcq d(ajcq ajcqVar) {
        a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "performStopSequence", 611, "ForkedIncomingCallFlowManager.java").w("%d:performStopSequence(future)", this.j);
        return ahvr.H(new adqr(aiql.w(new ajcq[]{ajcqVar, this.p.b(), b()})), ahqx.a(new defpackage.lgd(this, 13)), ajbm.a);
    }

    public final ajcq e(defpackage.adnw adnwVar) {
        ajcq ajcqVarY;
        if (ahvr.cp((java.lang.String) adnwVar.b.orElse((java.lang.Object) null))) {
            adnwVar.a.isPresent();
        }
        synchronized (this.d) {
            boolean zE = this.p.e();
            aimz aimzVar = a;
            if (zE) {
                aimzVar.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "playAudioMessage", 806, "ForkedIncomingCallFlowManager.java").B("%d:playAudioMessage(): playing: \"%s\"", this.j, k(adnwVar));
                j$.util.Optional optional = adnwVar.a;
                optional.isPresent();
                ajck ajckVarW = ajck.w(aiql.z((java.io.File) optional.orElseThrow()));
                defpackage.ljp ljpVar = new defpackage.ljp(this, adnwVar, 5);
                ajcu ajcuVar = this.f;
                ajcqVarY = ajckVarW.y(ljpVar, ajcuVar).v(adso.class, new defpackage.kwa(this, adnwVar, 20), ajcuVar).y(new defpackage.lhy(this, 8), ajcuVar);
            } else {
                aimzVar.d().i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "playAudioMessage", 800, "ForkedIncomingCallFlowManager.java").B("%d:playAudioMessage with text %s - playback manager isn't currently running", this.j, k(adnwVar));
                ajcqVarY = aiql.z(java.lang.Boolean.FALSE);
            }
        }
        return ajcqVarY;
    }

    public final ajcq f(boolean z) {
        ajcq ajcqVarA;
        synchronized (this.c) {
            ajcqVarA = this.w.a(new qpu(this, z, 1), (java.lang.Object) null);
        }
        return ajcqVarA;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final ajcq g(defpackage.adnw adnwVar, defpackage.adnw adnwVar2, j$.util.Optional optional) {
        boolean z;
        boolean z2;
        ajcq ajcqVarJ;
        int i = 0;
        if (adnwVar != null) {
            j$.util.Optional optional2 = adnwVar.b;
            optional2.isPresent();
            if (ahvr.cp((java.lang.String) optional2.orElseThrow())) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        ahvr.bN(z, "invalid empty welcome text");
        if (adnwVar2 != null) {
            j$.util.Optional optional3 = adnwVar2.b;
            optional3.isPresent();
            z2 = ahvr.cp((java.lang.String) optional3.orElseThrow()) ? false : true;
        }
        ahvr.bN(z2, "invalid empty resume from hold text");
        synchronized (this.d) {
            defpackage.ve veVar = new defpackage.ve();
            boolean zT = t(defpackage.ljr.b, veVar, false);
            aimz aimzVar = a;
            if (zT) {
                aimzVar.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "startInternal", 294, "ForkedIncomingCallFlowManager.java").B("%d:start():Starting IncomingCallFlowManager from state %s", this.j, ((defpackage.ljr) veVar.a).name());
                ahrv ahrvVarG = ahrv.g(b());
                defpackage.ljp ljpVar = new defpackage.ljp(this, optional, i);
                ajcu ajcuVar = this.f;
                ahrv ahrvVarI = ahrvVarG.i(ljpVar, ajcuVar).i(new defpackage.jsc(this, optional, veVar, adnwVar2, 4), ajcuVar).i(new defpackage.ljp(this, adnwVar, 2), ajcuVar);
                defpackage.lhy lhyVar = new defpackage.lhy(this, 10);
                ajct ajctVar = this.l;
                ahrv ahrvVarH = ahrvVarI.i(lhyVar, ajctVar).h(new defpackage.lgd(this, 14), ajctVar);
                this.o = ahrvVarH;
                ajcqVarJ = j(ahrvVarH);
            } else {
                aimzVar.d().i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "startInternal", 288, "ForkedIncomingCallFlowManager.java").B("%d:start():Can't start call flow at state: %s", this.j, a().name());
                ajcqVarJ = aiql.z((java.lang.Object) null);
            }
        }
        return ajcqVarJ;
    }

    public final synchronized ajcq h() {
        ljb ljbVar;
        ajcq ajcqVarH;
        adrm adrmVar = new adrm(this.x.c());
        defpackage.adpe adpeVar = this.i;
        adrmVar.c(adpeVar.a());
        adrmVar.b(adpeVar.d());
        adrmVar.i = this.u;
        adrn adrnVarA = adrmVar.a();
        ljbVar = this.t;
        ljbVar.r = adrnVarA;
        ljb.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "registerEventHandler", 216, "SodaSpeechRecognizer.java").v("Registering Event Handler");
        ljbVar.h.a.put(this, new adqu(this.f));
        try {
            ljbVar.p = android.os.ParcelFileDescriptor.createPipe();
            ljbVar.q = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(ljbVar.p[1]).getChannel();
            ljbVar.o = ljbVar.p[0].getFd();
            ljbVar.n = android.content.ContentUris.withAppendedId(android.net.Uri.parse(java.lang.String.format("content://com.android.dialer.callscreen.impl.speechrecognition.provider", new java.lang.Object[0])), ljbVar.o);
        } catch (java.io.IOException e) {
            ljbVar.o = 0;
            a.bq(ljb.a.c(), "Unable to create Parcel File Descriptor Pipe", "com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "createParcelFileDescriptors", (char) 313, "SodaSpeechRecognizer.java", e, zct.b);
        }
        ljb.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "getSpeechRecognizerIntent", 318, "SodaSpeechRecognizer.java").v("Creating Speech Recognizer Intent");
        android.content.Intent intent = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        android.content.Context context = ljbVar.e;
        intent.putExtra("calling_package", context.getPackageName());
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        intent.putExtra("com.google.recognition.extra.AUDIO_SOURCE", ljbVar.n);
        intent.putExtra("com.google.recognition.extra.AUDIO_SOURCE_SAMPLING_RATE", ljbVar.r.b);
        intent.putExtra("android.speech.extra.PREFER_OFFLINE", true);
        intent.putExtra("android.speech.extra.DICTATION_MODE", true);
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        if (afbq.b(context) != null) {
            context.grantUriPermission(afbq.b(context).getPackageName(), ljbVar.n, 3);
        }
        if (ljbVar.j.a()) {
            ajcq ajcqVarB = ljbVar.m.b();
            lix lixVar = new lix(0);
            ajct ajctVar = ljbVar.k;
            ajcqVarH = ahvr.H(ahvr.H(ajcqVarB, lixVar, ajctVar), new defpackage.lgd(intent, 9), ajctVar);
        } else {
            intent.putExtra("android.speech.extra.LANGUAGE", ljbVar.a());
            ajcqVarH = aiql.z(intent);
        }
        return ahvr.H(ajcqVarH, new defpackage.lgd(ljbVar, 10), ljbVar.l);
    }

    public final synchronized ajcq i() {
        ljb ljbVar;
        ljb.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "unregisterEventHandler", 222, "SodaSpeechRecognizer.java").v("Unregistering Event Handler");
        ljbVar = this.t;
        ljbVar.h.a.remove(this);
        j$.util.Objects.requireNonNull(ljbVar);
        return ahvr.G(new defpackage.ibg(ljbVar, 13), this.l);
    }

    public final ajcq j(ajcq ajcqVar) {
        return ahvr.C(ajcqVar, defpackage.adof.class, ahqx.c(new defpackage.lhy(this, 14)), this.f);
    }

    public final void l(j$.util.Optional optional) {
        if (optional.isPresent() && ((java.lang.Integer) optional.get()).intValue() == 4) {
            a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "muteControllers", 389, "ForkedIncomingCallFlowManager.java").w("%d:Not muting controllers in AudioManager.MODE_CALL_SCREENING", this.j);
            return;
        }
        a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "muteControllers", 394, "ForkedIncomingCallFlowManager.java").w("%d:Muting controllers", this.j);
        synchronized (this.e) {
            this.i.b().d();
        }
        this.i.c().d();
    }

    @Override // defpackage.adrs
    public final void m(adro adroVar) {
        defpackage.adof adofVar = new defpackage.adof((java.lang.Throwable) adroVar, adoe.a);
        ador adorVar = this.b;
        agsm.i(302, ahvr.E(new defpackage.lge(adorVar, adofVar, 8), ((defpackage.ljk) adorVar).a), "Failed handling onError", new java.lang.Object[0]);
    }

    @Override // defpackage.adrs
    public final void n(adrr adrrVar) {
        u(adrrVar, true);
    }

    @Override // defpackage.adrs
    public final void o(adrr adrrVar) {
        u(adrrVar, false);
    }

    public final void p(defpackage.ljr ljrVar) {
        synchronized (this.c) {
            this.v = ljrVar;
        }
    }

    public final void q() {
        defpackage.adpe adpeVar = this.i;
        if (adpeVar.h()) {
            a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "unmuteControllers", 632, "ForkedIncomingCallFlowManager.java").w("%d:Unmuting controllers", this.j);
            adpeVar.c().e();
            synchronized (this.e) {
                adpeVar.b().e();
            }
        }
    }

    public final boolean r() {
        return a().equals(defpackage.ljr.c);
    }

    @Override // defpackage.adrs
    public final void s() {
        agsm.i(303, ahvr.E(new defpackage.fvl(3), ((defpackage.ljk) this.b).a), "failed handling onIncomingAudioLevelUpdate", new java.lang.Object[0]);
    }

    public final boolean t(defpackage.ljr ljrVar, defpackage.ve veVar, boolean z) {
        synchronized (this.c) {
            defpackage.ljr ljrVar2 = this.v;
            defpackage.aihg aihgVar = q;
            if (!aihgVar.s(ljrVar)) {
                throw new java.lang.IllegalArgumentException("Invalid new state: ".concat(ljrVar.toString()));
            }
            if (!aihgVar.u(ljrVar, ljrVar2)) {
                if (z) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Unable to switch state. Previous state=%s, new state=%s", this.v.name(), ljrVar.name()));
                }
                return false;
            }
            if (veVar != null) {
                veVar.a = this.v;
            }
            this.v = ljrVar;
            return true;
        }
    }
}
