package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ljn implements defpackage.adnm {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl");
    public final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.lbw d;
    private final java.util.Map e = new java.util.EnumMap(defpackage.adoa.class);
    private final defpackage.aiyy f;

    public ljn(defpackage.aiyy aiyyVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.lbw lbwVar) {
        this.f = aiyyVar;
        this.c = aoinVar;
        this.b = aoinVar2;
        this.d = lbwVar;
    }

    private final ljm f(defpackage.adoa adoaVar) {
        return (ljm) j$.util.Map.-EL.computeIfAbsent(this.e, adoaVar, new kle(16));
    }

    private final synchronized adnj g(defpackage.adoa adoaVar, adog adogVar, j$.util.Optional optional, java.util.concurrent.Executor executor, j$.util.Optional optional2, j$.util.Optional optional3) {
        if (!e(adoaVar)) {
            throw new adnl(java.lang.String.format("Can't create a session for channel '%s' - it hasn't been initialized.", adoaVar));
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl", "createSessionInternal", 220, "ForkedCallAvatarSessionManagerImpl.java")).y("createSession(): Creating new AvatarSession for channel: %s", adoaVar);
        return new ljk(adoaVar, adogVar, (defpackage.ljo) this.c.a(), optional, executor, optional2, this.d, optional3);
    }

    private final defpackage.ajcq h(defpackage.adoa adoaVar, defpackage.adop adopVar) {
        ljm ljmVarF = f(adoaVar);
        defpackage.adod adodVarB = this.f.b();
        defpackage.ajcu ajcuVar = adodVarB.a;
        return defpackage.ajck.w(defpackage.aiql.w(defpackage.ajck.w(((defpackage.adqn) this.b.a()).c(ajcuVar, adodVarB.f)).x(new defpackage.icy((java.lang.Object) this, (java.lang.Object) ljmVarF, (java.lang.Object) adopVar, 7, (char[]) null), ajcuVar))).y(new kwa(this, adoaVar, 19), ajcuVar);
    }

    private final boolean i(defpackage.adoa adoaVar) {
        boolean z;
        ljm ljmVarF = f(adoaVar);
        synchronized (ljmVarF) {
            z = false;
            if (ljmVarF.b && ljmVarF.c) {
                z = true;
            }
            if (!z) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl", "isChannelAvailable", 237, "ForkedCallAvatarSessionManagerImpl.java")).y("isAvailable - Channel %s is not in list of available channels", adoaVar);
            }
        }
        return z;
    }

    @Override // defpackage.adnm
    public final synchronized adnj a(adob adobVar, java.util.concurrent.Executor executor) throws java.lang.Throwable {
        try {
            try {
                return g(adobVar.a, adobVar.b, adobVar.d, executor, adobVar.e, j$.util.Optional.of(java.lang.Integer.valueOf(adobVar.c)));
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009f A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:4:0x0008, B:7:0x0011, B:8:0x002e, B:10:0x0030, B:12:0x0038, B:14:0x0044, B:24:0x00c1, B:25:0x00c7, B:15:0x005e, B:20:0x0082, B:23:0x00a8, B:21:0x0094, B:22:0x009f), top: B:31:0x0008 }] */
    @Override // defpackage.adnm
    public final defpackage.ajcq b(defpackage.adoa adoaVar) {
        defpackage.ajcq ajcqVarH;
        ljm ljmVarF = f(adoaVar);
        ljmVarF.c = true;
        synchronized (ljmVarF) {
            if (i(adoaVar)) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl", "init", 104, "ForkedCallAvatarSessionManagerImpl.java")).y("init(): Channel '%s' has already been initialized and is available.", adoaVar);
                return defpackage.aiql.z(null);
            }
            j$.util.Optional optionalOf = ljmVarF.a;
            if (!optionalOf.isPresent() || ((defpackage.ajcq) optionalOf.orElseThrow()).isDone()) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl", "init", 114, "ForkedCallAvatarSessionManagerImpl.java")).y("init(): 'init' called for channel '%s'.", adoaVar);
                int iOrdinal = adoaVar.ordinal();
                if (iOrdinal == 0) {
                    ajcqVarH = h(adoaVar, new ljl(this, 1));
                } else if (iOrdinal == 1) {
                    ajcqVarH = h(adoaVar, new ljl(this, 0));
                } else if (iOrdinal != 2) {
                    ajcqVarH = defpackage.aiql.y(new adnl(defpackage.a.bJ(adoaVar, "Unsupported channel '", "'.")));
                } else {
                    ajcqVarH = h(adoaVar, new ljl(this, 1));
                }
                optionalOf = j$.util.Optional.of(defpackage.ahvr.H(ajcqVarH, new iau(adoaVar, ljmVarF, 19, (byte[]) null), this.f.b().a));
                ljmVarF.a = optionalOf;
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl", "init", 112, "ForkedCallAvatarSessionManagerImpl.java")).y("init(): 'init' is currently running for channel '%s'.", adoaVar);
            }
            return (defpackage.ajcq) optionalOf.orElseThrow();
        }
    }

    public final defpackage.ajcq c(defpackage.adoa adoaVar) {
        f(adoaVar).c = true;
        return defpackage.ajcm.a;
    }

    public final void d(defpackage.adoa adoaVar, java.lang.String str) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl", "onVoiceChange", 302, "ForkedCallAvatarSessionManagerImpl.java")).y("onVoiceCallVoiceChange():  detected voice change to %s.", str);
        defpackage.ahvr.J(c(adoaVar), new kxt(this, adoaVar, 5), this.f.b().a);
    }

    @Override // defpackage.adnm
    public final boolean e(defpackage.adoa adoaVar) {
        return i(adoaVar);
    }
}
