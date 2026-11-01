package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adnr implements defpackage.adnm {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl");
    public final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final java.util.Map e = new java.util.EnumMap(defpackage.adoa.class);
    private final defpackage.aiyy f;

    public adnr(defpackage.aiyy aiyyVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.f = aiyyVar;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.b = aoinVar3;
    }

    private final synchronized adnj f(defpackage.adoa adoaVar, adog adogVar, j$.util.Optional optional, java.util.concurrent.Executor executor, j$.util.Optional optional2) {
        if (!e(adoaVar)) {
            throw new adnl(java.lang.String.format("Can't create a session for channel '%s' - it hasn't been initialized.", adoaVar));
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "createSessionInternal", 267, "CallAvatarSessionManagerImpl.java")).y("createSession(): Creating new AvatarSession for channel: %s", adoaVar);
        return new adnk(adoaVar, adogVar, (alln) this.c.a(), optional, executor, optional2);
    }

    private final defpackage.adnq g(defpackage.adoa adoaVar) {
        return (defpackage.adnq) j$.util.Map.-EL.computeIfAbsent(this.e, adoaVar, new defpackage.vaq(12));
    }

    private final defpackage.ajcq h(defpackage.adoa adoaVar, defpackage.adop adopVar) {
        defpackage.aiyy aiyyVar = this.f;
        defpackage.adnq adnqVarG = g(adoaVar);
        defpackage.adod adodVarB = aiyyVar.b();
        defpackage.ajcu ajcuVar = adodVarB.a;
        defpackage.ajwz ajwzVar = (defpackage.ajwz) this.d.a();
        if (adodVarB.i == 0) {
            throw null;
        }
        java.lang.Object obj = ajwzVar.c;
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.adrw.a.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "loadResources", 69, "TerseModelManagerImpl.java");
        defpackage.adrw adrwVar = (defpackage.adrw) obj;
        java.lang.String str = adrwVar.e;
        int i = adrwVar.f;
        aimwVar.G("Loading Terse model from superpack '%s' version %d.", str, i);
        return defpackage.ajck.w(new defpackage.ajbh(defpackage.aify.o(new defpackage.ajcq[]{defpackage.ajck.w(adrwVar.c.a(str, i, adrwVar.b, ajcuVar)).y(new defpackage.vmn(obj, 20), ajcuVar), defpackage.ajck.w(((defpackage.adqn) this.b.a()).c(ajcuVar, adodVarB.f)).x(new defpackage.rml(this, adnqVarG, adopVar, 5), ajcuVar)}), true)).y(new defpackage.adpx(this, adoaVar, 1), ajcuVar);
    }

    private final boolean i(defpackage.adoa adoaVar) {
        boolean z;
        defpackage.adnq adnqVarG = g(adoaVar);
        synchronized (adnqVarG) {
            z = false;
            if (adnqVarG.b && adnqVarG.c) {
                z = true;
            }
            if (!z) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "isChannelAvailable", 282, "CallAvatarSessionManagerImpl.java")).y("isAvailable - Channel %s is not in list of available channels", adoaVar);
            }
        }
        return z;
    }

    @Override // defpackage.adnm
    public final synchronized adnj a(adob adobVar, java.util.concurrent.Executor executor) throws java.lang.Throwable {
        try {
            try {
                return f(adobVar.a, adobVar.b, adobVar.d, executor, adobVar.e);
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [ajcq, java.lang.Object] */
    @Override // defpackage.adnm
    public final defpackage.ajcq b(defpackage.adoa adoaVar) {
        defpackage.ajcq ajcqVarH;
        defpackage.adnq adnqVarG = g(adoaVar);
        synchronized (adnqVarG) {
            if (i(adoaVar)) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "init", 158, "CallAvatarSessionManagerImpl.java")).y("init(): Channel '%s' has already been initialized and is available.", adoaVar);
                return defpackage.ajcm.a;
            }
            j$.util.Optional optionalOf = adnqVarG.a;
            if (!optionalOf.isPresent() || optionalOf.get().isDone()) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "init", 167, "CallAvatarSessionManagerImpl.java")).y("init(): 'init' called for channel '%s'.", adoaVar);
                int iOrdinal = adoaVar.ordinal();
                if (iOrdinal == 0) {
                    ajcqVarH = h(adoaVar, new defpackage.adop() { // from class: adnn
                        @Override // defpackage.adop
                        public final void a(java.lang.String str) {
                            this.a.d(defpackage.adoa.a, str);
                        }
                    });
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    ajcqVarH = h(adoaVar, new defpackage.adop() { // from class: adnn
                        @Override // defpackage.adop
                        public final void a(java.lang.String str) {
                            this.a.d(defpackage.adoa.a, str);
                        }
                    });
                } else {
                    ajcqVarH = h(adoaVar, new ljl(this, 2));
                }
                defpackage.jtv jtvVar = new defpackage.jtv(adoaVar, adnqVarG, 14, null);
                defpackage.ajcu ajcuVar = this.f.b().a;
                defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarH, jtvVar);
                ajcqVarH.c(ajamVar, defpackage.aiql.t(ajcuVar, ajamVar));
                optionalOf = j$.util.Optional.of(ajamVar);
                adnqVarG.a = optionalOf;
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "init", 165, "CallAvatarSessionManagerImpl.java")).y("init(): 'init' is currently running for channel '%s'.", adoaVar);
            }
            return optionalOf.get();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ajcq, java.lang.Object] */
    public final defpackage.ajcq c(defpackage.adoa adoaVar) {
        defpackage.aimz aimzVar;
        defpackage.ajcq ajcqVarE;
        defpackage.ajcq ajcqVarF;
        defpackage.aiyy aiyyVar = this.f;
        defpackage.adnq adnqVarG = g(adoaVar);
        defpackage.ajcu ajcuVar = aiyyVar.b().a;
        synchronized (adnqVarG) {
            defpackage.adnq adnqVarG2 = g(adoaVar);
            synchronized (adnqVarG2) {
                try {
                    aimzVar = a;
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "markChannelUnavailable", 76, "CallAvatarSessionManagerImpl.java")).y("markChannelUnavailable(): marking channel '%s' as not available.", adoaVar);
                    adnqVarG2.c = false;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            int iOrdinal = adoaVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                defpackage.aihd aihdVar = aiyyVar.b().f.c;
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "prepareResources", 139, "CallAvatarSessionManagerImpl.java")).B("prepareResources(): preparing %d files with %d total characters.", aihdVar.size(), new adno(aihdVar));
                ajcqVarE = ((defpackage.adqn) this.b.a()).e(aihdVar);
            } else {
                ajcqVarE = defpackage.aiql.y(new adnl(defpackage.a.bJ(adoaVar, "Unsupported channel '", "'.")));
            }
            j$.util.Optional optionalOf = j$.util.Optional.of(ajcqVarE);
            adnqVarG.d = optionalOf;
            ajcqVarF = defpackage.ajan.f(adnqVarG.d.get(), new adbh(adnqVarG, optionalOf, adoaVar, 2), ajcuVar);
        }
        return ajcqVarF;
    }

    public final void d(defpackage.adoa adoaVar, java.lang.String str) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "onVoiceChange", 349, "CallAvatarSessionManagerImpl.java")).y("onVoiceCallVoiceChange():  detected voice change to %s.", str);
        defpackage.aiql.I(c(adoaVar), new uwo(this, adoaVar, 10), this.f.b().a);
    }

    @Override // defpackage.adnm
    public final boolean e(defpackage.adoa adoaVar) {
        return i(adoaVar);
    }
}
