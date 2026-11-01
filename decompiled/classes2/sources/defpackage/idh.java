package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class idh {
    private static final aimz f = aimz.i("com/android/dialer/audio/tidepods/impl/TidepodsCallAudioImpl");
    public final java.lang.String a;
    public final aoin b;
    public final ajct c;
    public final ruc d;
    public final qbe e;
    private final aoin g;
    private final defpackage.ibd h;
    private final zzx i;

    public idh(java.lang.String str, defpackage.ibd ibdVar, zzx zzxVar, aoin aoinVar, aoin aoinVar2, ajct ajctVar, qbe qbeVar, ruc rucVar) {
        this.a = str;
        this.h = ibdVar;
        this.i = zzxVar;
        this.g = aoinVar;
        this.b = aoinVar2;
        this.c = ajctVar;
        this.e = qbeVar;
        this.d = rucVar;
    }

    public final ajcq a(j$.time.Duration duration) {
        ahoq ahoqVarW = ahvr.W(106, "TidepodsCallAudioImpl_createDownlinkTee");
        try {
            ahrv ahrvVarI = ahrv.g(c()).i(new defpackage.idd(this, duration, 1), this.c);
            ahoqVarW.a(ahrvVarI);
            ahoqVarW.close();
            return ahrvVarI;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq b(j$.time.Duration duration) {
        ahoq ahoqVarW = ahvr.W(107, "TidepodsCallAudioImpl_createUplinkTee");
        try {
            ahrv ahrvVarI = ahrv.g(c()).i(new defpackage.idd(this, duration, 2), this.c);
            ahoqVarW.a(ahrvVarI);
            ahoqVarW.close();
            return ahrvVarI;
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
        ahoq ahoqVarW = ahvr.W(108, "TidepodsCallAudioImpl_getCallAudio");
        try {
            ahrv ahrvVarH = ahrv.g(this.h.a(((java.lang.Long) this.g.a()).longValue())).h(new defpackage.hup(this, 10), this.c);
            ahoqVarW.a(ahrvVarH);
            ahoqVarW.close();
            return ahrvVarH;
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
        defpackage.ibd ibdVar = this.h;
        ajcq ajcqVarH = ahvr.H(ibdVar.b.a(), new defpackage.hup(ibdVar, 5), ibdVar.d);
        defpackage.hup hupVar = new defpackage.hup(this, 11);
        ajct ajctVar = this.c;
        return ahvr.H(ahvr.H(ajcqVarH, hupVar, ajctVar), new defpackage.exn(13), ajctVar);
    }

    public final ajcq e(java.lang.String str) {
        f.b().l("com/android/dialer/audio/tidepods/impl/TidepodsCallAudioImpl", "play", 96, "TidepodsCallAudioImpl.java").y("play(%s)", str);
        ahoq ahoqVarW = ahvr.W(109, "TidepodsCallAudioImpl_play");
        try {
            ahrv ahrvVarH = ahrv.g(c()).h(new icy(this, str, this.d.a(), 1), this.c);
            ahoqVarW.a(ahrvVarH);
            ahoqVarW.close();
            return ahrvVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq f(java.lang.String str) {
        f.b().l("com/android/dialer/audio/tidepods/impl/TidepodsCallAudioImpl", "playAllowingMutedCall", 131, "TidepodsCallAudioImpl.java").y("playAllowingMutedCall(%s)", str);
        ahoq ahoqVarW = ahvr.W(110, "TidepodsCallAudioImpl_playAllowingMutedCall");
        try {
            ahrv ahrvVarH = ahrv.g(c()).h(new icy(this, str, this.d.a(), 0), this.c);
            ahoqVarW.a(ahrvVarH);
            ahoqVarW.close();
            return ahrvVarH;
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
        ahoq ahoqVarW = ahvr.W(111, "TidepodsCallAudioImpl_setDownlinkMuted");
        try {
            ahrv ahrvVarI = ahrv.g(c()).i(new defpackage.icz(this, z, 1), this.c);
            ahoqVarW.a(ahrvVarI);
            ahoqVarW.close();
            return ahrvVarI;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ajcq h(boolean z) {
        ahoq ahoqVarW = ahvr.W(112, "TidepodsCallAudioImpl_setUplinkMuted");
        try {
            ahrv ahrvVarI = ahrv.g(c()).i(new defpackage.icz(this, z, 0), this.c);
            ahoqVarW.a(ahrvVarI);
            ahoqVarW.close();
            return ahrvVarI;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [hxf, java.lang.Object] */
    public final void i(defpackage.hxf hxfVar, j$.util.Optional optional, aenj aenjVar) {
        defpackage.mie mieVar = new defpackage.mie(this, hxfVar, aenjVar, 1);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = mieVar.b;
            mieVar.a.c().c(new defpackage.ac(obj2, obj, mieVar.c, 18, (short[]) null), ((defpackage.idh) obj2).c);
        }
    }

    public final void j(j$.util.Optional optional, aenj aenjVar) {
        defpackage.hvp hvpVar = new defpackage.hvp(this, aenjVar, 2, null);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = hvpVar.b;
            java.lang.Object obj3 = hvpVar.a;
            aeun aeunVar = (aeun) obj;
            ((defpackage.idh) obj2).d.q(aeunVar, (aenj) obj3, rub.c);
        }
    }

    public final void k(java.lang.String str) {
        ailj ailjVarK = this.i.e().k();
        while (ailjVarK.hasNext()) {
            defpackage.icm icmVar = (defpackage.icm) ailjVarK.next();
            aooh.f(str, "filePath");
            aimz aimzVar = defpackage.icm.a;
            aimzVar.b().l("com/android/dialer/audio/recorder/impl/RecorderFactoryImpl", "sessionCreated", 351, "RecorderFactoryImpl.kt").v("playback detected");
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = icmVar.f;
            if (!concurrentHashMap.isEmpty()) {
                java.util.Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                }
            }
            aimzVar.b().l("com/android/dialer/audio/recorder/impl/RecorderFactoryImpl", "sessionCreated", 353, "RecorderFactoryImpl.kt").v("playback not recorded");
        }
    }
}
