package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqm {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/call/CallControllerImpl");
    public final android.telecom.Call b;
    public final java.util.concurrent.Executor c;
    public final ajcu d;
    public final j$.util.Optional e;
    public final defpackage.zjt f;
    public final aoin q;
    public final aoin r;
    public final j$.util.Optional s;
    public final zpm u;
    public final zzx v;
    public final zzx w;
    public final hwv x;
    private final defpackage.ptx y;
    private final zzx z;
    public final java.util.ArrayList g = new java.util.ArrayList();
    public final java.util.ArrayList h = new java.util.ArrayList();
    public final java.util.ArrayList i = new java.util.ArrayList();
    public final java.util.concurrent.atomic.AtomicBoolean j = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final defpackage.zni k = new leq(this, 4);
    public final defpackage.znj l = new nbx(this, 2);
    public final defpackage.znq m = new defpackage.rez(this, 1);
    public final defpackage.znp n = new ler(this, 5);
    public final zog o = new les(this, 6);
    public final defpackage.zoi p = new jwb(this, 5);
    public j$.util.Optional t = j$.util.Optional.empty();

    public pqm(android.telecom.Call call, hwv hwvVar, ajcu ajcuVar, zpm zpmVar, zzx zzxVar, zzx zzxVar2, zzx zzxVar3, defpackage.ptx ptxVar, j$.util.Optional optional, aoin aoinVar, aoin aoinVar2, defpackage.zjt zjtVar, j$.util.Optional optional2) {
        this.b = call;
        this.x = hwvVar;
        this.d = ajcuVar;
        this.u = zpmVar;
        this.z = zzxVar;
        this.c = new ajdc(ajcuVar);
        this.v = zzxVar2;
        this.w = zzxVar3;
        this.y = ptxVar;
        this.e = optional;
        this.f = zjtVar;
        this.s = optional2;
        this.q = aoinVar;
        this.r = aoinVar2;
    }

    private final ajcq w(int i) {
        ahoq ahoqVarW = ahvr.W(496, "CallControllerImpl_answerInternal");
        try {
            j$.lang.Iterable.-EL.forEach(this.w.e(), new lct(6));
            ajcq ajcqVarP = ahvr.aj((java.lang.Iterable) j$.util.Collection.-EL.stream(this.z.e()).map(new defpackage.pir(7)).collect(aido.a)).p(new defpackage.pth(this, i, 1), this.d);
            ahoqVarW.a(ajcqVarP);
            ahoqVarW.close();
            return ajcqVarP;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final defpackage.zpo a() {
        return defpackage.zpo.a(this.b.getState());
    }

    public final ajcq b() {
        ahoq ahoqVarW = ahvr.W(495, "CallControllerImpl_answer");
        try {
            a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "answer", 159, "CallControllerImpl.java").v("answer");
            ajcq ajcqVarW = w(0);
            ahoqVarW.close();
            return ajcqVarW;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq c() {
        ahrv ahrvVarH = ahrv.g(b()).h(new defpackage.phr(this, 2), this.d);
        agsm.d("com/android/dialer/incall/core/call/CallControllerImpl", "answerAsRtt", 267, ahrvVarH, zct.b, "Failed to answer call.", new java.lang.Object[0]);
        return ahrvVarH;
    }

    public final ajcq d() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "answerVideo", 166, "CallControllerImpl.java").v("answer");
        return w(3);
    }

    public final ajcq e() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "answerVideoWithLocalCameraOff", 172, "CallControllerImpl.java").v("answer");
        return w(2);
    }

    public final ajcq f() {
        ajcq ajcqVarM;
        ahoq ahoqVarW = ahvr.W(497, "CallControllerImpl_disconnect");
        try {
            if (defpackage.zpo.a(this.b.getState()) == defpackage.zpo.g) {
                v(15);
                ajcqVarM = ajcm.a;
            } else {
                ajcqVarM = dff.m(new hyd(this, 4));
            }
            ahoqVarW.a(ajcqVarM);
            ahoqVarW.close();
            return ajcqVarM;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq g(boolean z) {
        if (!this.y.o()) {
            a.bI(a.d().m(aioa.b), "call is not audio processing", "com/android/dialer/incall/core/call/CallControllerImpl", "exitBackgroundAudioProcessing", (char) 336, "CallControllerImpl.java", zct.b);
            return ajcm.a;
        }
        android.telecom.Call call = this.b;
        if (call.getState() == 12) {
            a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "exitBackgroundAudioProcessing", 341, "CallControllerImpl.java").y("Leaving AUDIO_PROCESSING. Starts Ringing: %b", java.lang.Boolean.valueOf(z));
            this.f.b(mfy.ea, aify.p(gus.ax(z)));
            call.exitBackgroundAudioProcessing(z);
            return ajcm.a;
        }
        hwv hwvVar = this.x;
        if (!hwvVar.i().equals(defpackage.zmx.b)) {
            a.bI(a.d(), "Did not exit background processing, call was not audio processing or intercepted", "com/android/dialer/incall/core/call/CallControllerImpl", "exitBackgroundAudioProcessing", (char) 354, "CallControllerImpl.java", zct.b);
            return ajcm.a;
        }
        aimz aimzVar = a;
        if (z) {
            aimzVar.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "exitBackgroundAudioProcessing", 363, "CallControllerImpl.java").v("Requesting dialer ringing");
            return ahvr.H(hwvVar.j(defpackage.zmx.c), new defpackage.phr(this, 3), this.d);
        }
        aimzVar.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "exitBackgroundAudioProcessing", 359, "CallControllerImpl.java").v("Leaving interception mode");
        return hwvVar.j(defpackage.zmx.a);
    }

    public final ajcq h() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "reject", 381, "CallControllerImpl.java").v("reject");
        return i(false, null);
    }

    public final ajcq i(final boolean z, final java.lang.String str) {
        return dff.m(new dsf() { // from class: pqk
            public final java.lang.Object a(dsd dsdVar) {
                boolean z2 = z;
                java.lang.String str2 = str;
                defpackage.pqm pqmVar = this.a;
                agsm.i(499, ahvr.E(new defpackage.pqh(pqmVar, dsdVar, z2, str2, 0), pqmVar.c), "Failed to process reject completer.", new java.lang.Object[0]);
                return "Reject";
            }
        });
    }

    public final ajcq j(java.util.List list) {
        return ahvr.E(new defpackage.pmx(list, 2), this.c);
    }

    public final ajcq k() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "startDisconnectingAudioProcessing", 375, "CallControllerImpl.java").v("enter");
        return this.x.j(defpackage.zmx.d);
    }

    public final ajcq l() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "unhold", 519, "CallControllerImpl.java").v("unhold");
        return dff.m(new hyd(this, 5));
    }

    public final void m() {
        boolean zO = this.y.o();
        aimz aimzVar = a;
        if (zO) {
            a.bI(aimzVar.c().m(aioa.b), "call is already audio processing", "com/android/dialer/incall/core/call/CallControllerImpl", "enterBackgroundAudioProcessing", (char) 304, "CallControllerImpl.java", zct.b);
            return;
        }
        aimzVar.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "enterBackgroundAudioProcessing", 308, "CallControllerImpl.java").v("entering audio processing");
        this.f.a(mfy.dZ);
        this.b.enterBackgroundAudioProcessing();
    }

    public final void n() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "hold", 511, "CallControllerImpl.java").v("hold");
        v(12);
        this.f.a(mfy.dX);
        this.b.hold();
    }

    public final void o() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "merge", 572, "CallControllerImpl.java").v("merge");
        android.telecom.Call call = this.b;
        java.util.List<android.telecom.Call> conferenceableCalls = call.getConferenceableCalls();
        if (!conferenceableCalls.isEmpty()) {
            this.f.a(mfy.ef);
            call.conference(conferenceableCalls.get(0));
        } else if (call.getDetails().can(4)) {
            this.f.a(mfy.eh);
            call.mergeConference();
        }
    }

    public final void p(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "phoneAccountSelected", 636, "CallControllerImpl.java").y("select phone account: %s", phoneAccountHandle.getId());
        this.f.b(mfy.ee, aify.q(aais.aE(phoneAccountHandle), gus.ax(false)));
        this.b.phoneAccountSelected(phoneAccountHandle, false);
    }

    public final void q(char c) {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "playDtmfTone", 491, "CallControllerImpl.java").v("playDtmfTone");
        this.f.b(mfy.eb, aify.p(gus.au(c)));
        this.b.playDtmfTone(c);
        akzx akzxVarM = defpackage.znx.a.m();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        akzxVarM.u();
        defpackage.znx znxVar = (defpackage.znx) akzxVarM.b;
        znxVar.b |= 1;
        znxVar.c = jElapsedRealtime;
        java.lang.String string = java.lang.Character.toString(c);
        akzxVarM.u();
        defpackage.znx znxVar2 = (defpackage.znx) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        znxVar2.b |= 2;
        znxVar2.d = string;
        agsm.i(500, ahvr.E(new defpackage.pmx(this, 3), this.d), "failed notifying dtmfToneListener", new java.lang.Object[0]);
    }

    public final void r() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "requestRttUpgrade", 604, "CallControllerImpl.java").v("RTT upgrade requested");
        this.f.a(mfy.em);
        da$.ExternalSyntheticApiModelOutline1.m(this.b);
    }

    public final void s() {
        a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "stopDtmfTone", 504, "CallControllerImpl.java").v("stopDtmfTone called");
        this.f.a(mfy.ec);
        this.b.stopDtmfTone();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ruc] */
    public final void t(int i) {
        defpackage.pmv pmvVar = new defpackage.pmv(this, 14);
        j$.util.Optional optional = this.s;
        optional.isPresent();
        optional.get();
        da$.ExternalSyntheticApiModelOutline0.m$1(defpackage.zqm.a.a, ((defpackage.pqm) pmvVar.a).b.hashCode());
        optional.isPresent();
        j$.util.Optional optionalA = ((ipc) optional.get()).a.a();
        aooh.e(optionalA, "startLocalTimer(...)");
        optionalA.getClass();
        this.t = optionalA;
        v(17);
        this.b.answer(i);
    }

    public final void u(int i) {
        defpackage.pqj pqjVar = new defpackage.pqj(this, i, 1);
        j$.util.Optional optional = this.e;
        optional.isPresent();
        java.lang.Object obj = pqjVar.b;
        int i2 = pqjVar.a;
        ((defpackage.pzo) optional.get()).a(((defpackage.pqm) obj).b, i2);
    }

    public final void v(int i) {
        defpackage.pqj pqjVar = new defpackage.pqj(this, i, 0);
        j$.util.Optional optional = this.e;
        optional.isPresent();
        java.lang.Object obj = pqjVar.b;
        int i2 = pqjVar.a;
        ((defpackage.pzo) optional.get()).c(((defpackage.pqm) obj).b, i2);
    }
}
