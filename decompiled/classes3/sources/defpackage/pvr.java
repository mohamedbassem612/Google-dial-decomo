package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pvr {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/video/impl/VideoControllerImpl");
    public final android.telecom.Call d;
    public final defpackage.pvf e;
    public final ajcu f;
    public final rlv g;
    public final defpackage.ptx k;
    public final zpz l;
    public final defpackage.oyx m;
    public final hwv n;
    public final hwv o;
    private final mba p;
    private final defpackage.zjt q;
    private final defpackage.afpl s;
    private final aogc t;
    public final defpackage.puw b = new defpackage.qpj(this, 1);
    final defpackage.put c = new defpackage.pvp(this, 0);
    public final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference(defpackage.puy.a);
    private final java.util.concurrent.atomic.AtomicReference r = new java.util.concurrent.atomic.AtomicReference(ajcm.a);
    public final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final java.util.concurrent.atomic.AtomicReference j = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());

    public pvr(android.telecom.Call call, defpackage.oyx oyxVar, defpackage.ptx ptxVar, defpackage.pvf pvfVar, hwv hwvVar, aogc aogcVar, defpackage.afpl afplVar, hwv hwvVar2, ajcu ajcuVar, zpz zpzVar, rlv rlvVar, defpackage.zjt zjtVar, mba mbaVar) {
        this.d = call;
        this.m = oyxVar;
        this.k = ptxVar;
        this.e = pvfVar;
        this.n = hwvVar;
        this.t = aogcVar;
        this.s = afplVar;
        this.o = hwvVar2;
        this.f = ajcuVar;
        this.l = zpzVar;
        this.g = rlvVar;
        this.q = zjtVar;
        this.p = mbaVar;
    }

    public final defpackage.zcy a() {
        return defpackage.zcy.a(this.d);
    }

    public final ajcq b() {
        ajcq ajcqVarC;
        ahoq ahoqVarW = ahvr.W(542, "VideoControllerImpl_acceptUpgradeRequest");
        try {
            j$.util.Optional optional = (j$.util.Optional) this.j.get();
            if (optional.isPresent()) {
                ajcqVarC = c((defpackage.zcy) optional.orElseThrow());
                ahoqVarW.a(ajcqVarC);
            } else {
                a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "acceptUpgradeRequest", 321, "VideoControllerImpl.java").v("requested video state missing");
                ajcqVarC = ajcm.a;
            }
            ahoqVarW.close();
            return ajcqVarC;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq c(defpackage.zcy zcyVar) {
        int i;
        ajcq ajcqVar;
        ahoq ahoqVarW = ahvr.W(543, "VideoControllerImpl_acceptUpgradeRequestWithState");
        try {
            if (this.m.l().isPresent()) {
                if (!this.o.m()) {
                    a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "acceptUpgradeRequestWithState", 347, "VideoControllerImpl.java").v("accepting upgrade when there are not requests.");
                }
                defpackage.zcy zcyVar2 = defpackage.zcy.d;
                defpackage.pvf pvfVar = this.e;
                if (zcyVar == zcyVar2) {
                    pvfVar.f(defpackage.pur.c);
                } else {
                    pvfVar.f(defpackage.pur.b);
                }
                this.j.set(j$.util.Optional.empty());
                int iOrdinal = zcyVar.ordinal();
                if (iOrdinal != 0) {
                    i = 3;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i = 2;
                        } else {
                            if (iOrdinal != 3) {
                                throw new java.lang.AssertionError("exhaustive switch");
                            }
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                l(new android.telecom.VideoProfile(i));
                ajcqVar = ajcm.a;
                ahoqVarW.a(ajcqVar);
            } else {
                a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "acceptUpgradeRequestWithState", 338, "VideoControllerImpl.java").v("InCallService.VideoCall is null.");
                ajcqVar = ajcm.a;
            }
            ahoqVarW.close();
            return ajcqVar;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq d() {
        return ((defpackage.pvq) aooc.ar(this.s.Y(), defpackage.pvq.class)).aT();
    }

    public final ajcq e() {
        a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "pauseVideo", 117, "VideoControllerImpl.java").v("pause video");
        ahoq ahoqVarW = ahvr.W(548, "VideoControllerImpl_pauseVideo");
        try {
            ajcq ajcqVarH = ahvr.H(((defpackage.pvq) aooc.ar(this.s.Y(), defpackage.pvq.class)).G(), new defpackage.phr(this, 6), this.f);
            this.l.a(ajcqVarH);
            ahoqVarW.a(ajcqVarH);
            ahoqVarW.close();
            return ajcqVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq f() {
        ajcq ajcqVar;
        ahoq ahoqVarW = ahvr.W(549, "VideoControllerImpl_rejectUpgradeRequest");
        try {
            if (this.m.l().isPresent()) {
                hwv hwvVar = this.o;
                if (!hwvVar.m()) {
                    a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "rejectUpgradeRequest", 380, "VideoControllerImpl.java").v("rejecting upgrade when there are not requests.");
                }
                l(new android.telecom.VideoProfile(this.d.getDetails().getVideoState()));
                hwvVar.l(false);
                this.j.set(j$.util.Optional.empty());
                ajcqVar = ajcm.a;
                ahoqVarW.a(ajcqVar);
            } else {
                a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "rejectUpgradeRequest", 371, "VideoControllerImpl.java").v("InCallService.VideoCall is null.");
                ajcqVar = ajcm.a;
            }
            ahoqVarW.close();
            return ajcqVar;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq g() {
        a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "resumeVideo", 144, "VideoControllerImpl.java").v("resume video");
        ahoq ahoqVarW = ahvr.W(551, "VideoControllerImpl_resumeVideo");
        try {
            ajcq ajcqVarH = ahvr.H(d(), new defpackage.phr(this, 10), this.f);
            this.l.a(ajcqVarH);
            ahoqVarW.a(ajcqVarH);
            ahoqVarW.close();
            return ajcqVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final j$.util.Optional h() {
        return (j$.util.Optional) this.j.get();
    }

    public final void i() {
        a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "clearSentRequestVideoProfile", 607, "VideoControllerImpl.java").v("sentRequestVideoProfile is cleared");
        this.i.set(j$.util.Optional.empty());
    }

    public final void j() {
        this.l.a(ahvr.H(this.t.bl(new lbn(6)), new defpackage.phr(this, 9), this.f));
    }

    public final void k(int i) {
        defpackage.oyx oyxVar = this.m;
        boolean zIsPresent = oyxVar.l().isPresent();
        aimz aimzVar = a;
        if (!zIsPresent) {
            a.bI(aimzVar.c().m(aioa.b), "InCallService.VideoCall is null.", "com/android/dialer/incall/core/video/impl/VideoControllerImpl", "sendSessionModifyRequest", (char) 557, "VideoControllerImpl.java", zct.b);
            this.p.a(mcd.aq);
            return;
        }
        aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "sendSessionModifyRequest", 561, "VideoControllerImpl.java").y("sending session modify request: %s", android.telecom.VideoProfile.videoStateToString(i));
        java.util.concurrent.atomic.AtomicReference atomicReference = this.i;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) atomicReference.get();
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((android.telecom.VideoProfile) optionalOfNullable.get()).getVideoState()));
        }
        int iIntValue = ((java.lang.Integer) optionalOfNullable.orElse(java.lang.Integer.valueOf(this.d.getDetails().getVideoState()))).intValue();
        android.telecom.VideoProfile videoProfile = new android.telecom.VideoProfile(i);
        if (i != iIntValue) {
            atomicReference.set(j$.util.Optional.of(videoProfile));
        }
        ((android.telecom.InCallService.VideoCall) oyxVar.l().orElseThrow()).sendSessionModifyRequest(videoProfile);
        this.q.b(mfy.do, aify.p(gus.au(videoProfile.getVideoState())));
    }

    public final void l(android.telecom.VideoProfile videoProfile) {
        ((android.telecom.InCallService.VideoCall) this.m.l().orElseThrow()).sendSessionModifyResponse(videoProfile);
        this.q.b(mfy.dp, aify.p(gus.au(videoProfile.getVideoState())));
    }

    public final void m(defpackage.puy puyVar) {
        this.h.set(puyVar);
        ajcs ajcsVarC = this.f.c(ahqx.i(new omj(this, 15)), 4L, java.util.concurrent.TimeUnit.SECONDS);
        agsm.i(552, ajcsVarC, "unable to clear failure reason", new java.lang.Object[0]);
        ((ajcq) this.r.getAndSet(ajcsVarC)).cancel(true);
        this.l.a(ajcm.a);
    }

    public final void n() {
        agsm.i(553, this.o.k(false), "unable to set video request state", new java.lang.Object[0]);
        i();
    }
}
