package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ljd {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache");
    public final defpackage.ljf b;
    public final defpackage.rlv c;
    public final java.util.concurrent.Executor d;
    public final long e;
    public java.util.function.Supplier f;
    public final defpackage.zpz h;
    private final defpackage.ajct i;
    private j$.util.Optional j = j$.util.Optional.empty();
    public int g = 0;

    public ljd(defpackage.ljf ljfVar, defpackage.rlv rlvVar, defpackage.ajct ajctVar, defpackage.zpz zpzVar, defpackage.aoin aoinVar) {
        this.b = ljfVar;
        this.c = rlvVar;
        this.i = ajctVar;
        this.h = zpzVar;
        this.d = new defpackage.ajdc(ajctVar);
        this.e = ((java.lang.Long) aoinVar.a()).longValue();
    }

    public final defpackage.ajcq a() {
        java.util.function.Supplier supplier = this.f;
        if (supplier == null) {
            defpackage.ajcq ajcqVarC = c();
            defpackage.kvf kvfVar = new defpackage.kvf(4);
            defpackage.ajct ajctVar = this.i;
            long j = defpackage.ahqx.a;
            defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarC, new defpackage.ahqv(defpackage.ahns.c(false), kvfVar));
            ajcqVarC.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
            return ajamVar;
        }
        defpackage.ajcq ajcqVar = (defpackage.ajcq) aa$.ExternalSyntheticApiModelOutline1.m(supplier);
        defpackage.lix lixVar = new defpackage.lix(2);
        defpackage.ajct ajctVar2 = this.i;
        long j2 = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), lixVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar2 = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar2, defpackage.aiql.t(ajctVar2, ajamVar2));
        return ajamVar2;
    }

    public final defpackage.ajcq b() {
        if (this.j.isPresent() && !((defpackage.ajcq) this.j.orElseThrow()).isDone()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "retryInitialization", 159, "AvatarSessionManagerCache.java")).v("attempted to retry, but is already in progress");
            return defpackage.ajcm.a;
        }
        this.g++;
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "retryInitialization", 164, "AvatarSessionManagerCache.java")).w("retry to initialize. retry attempt: : %d", this.g);
        j$.util.Optional optionalOf = j$.util.Optional.of(this.b.a());
        this.j = optionalOf;
        return defpackage.ahvr.I((defpackage.ajcq) optionalOf.orElseThrow(), new lhy(this, 6), this.d);
    }

    public final defpackage.ajcq c() {
        defpackage.ljf ljfVar = this.b;
        j$.util.Objects.requireNonNull(ljfVar);
        defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(new defpackage.hlv(ljfVar, 13));
        j$.util.Objects.requireNonNull(ahziVarBI);
        defpackage.vmp vmpVar = new defpackage.vmp(ahziVarBI, 1);
        this.f = vmpVar;
        defpackage.ajcq ajcqVar = (defpackage.ajcq) aa$.ExternalSyntheticApiModelOutline1.m(vmpVar);
        j$.util.Objects.requireNonNull(ljfVar);
        defpackage.jyx jyxVar = new defpackage.jyx(ljfVar, 3);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar);
        int i = defpackage.ajan.c;
        defpackage.ajct ajctVar = this.i;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }

    public final j$.util.Optional d() {
        java.util.function.Supplier supplier = this.f;
        if (supplier == null) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "avatarSessionManager", 'u', "AvatarSessionManagerCache.java")).v("cache is null (not initialized)");
            return j$.util.Optional.empty();
        }
        if (!((defpackage.ajcq) aa$.ExternalSyntheticApiModelOutline1.m(supplier)).isDone()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "avatarSessionManager", '}', "AvatarSessionManagerCache.java")).v("modelAvailabilityCache not available since the future is still running");
            return j$.util.Optional.empty();
        }
        try {
            java.util.concurrent.Future future = (java.util.concurrent.Future) aa$.ExternalSyntheticApiModelOutline1.m(this.f);
            defpackage.ahvr.cc(future.isDone(), "Future was expected to be done: %s", future);
            defpackage.aigf aigfVar = (defpackage.aigf) defpackage.a.h(future);
            j$.util.Optional optionalB = this.b.b(aigfVar);
            if (aigfVar.containsValue(defpackage.lje.c)) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "avatarSessionManager", (char) 145, "AvatarSessionManagerCache.java")).v("retrying initialization after timeout");
                defpackage.agsm.i(298, b(), "avatarSessionManagerCache timeout retry failed", new java.lang.Object[0]);
            }
            return optionalB;
        } catch (java.util.concurrent.ExecutionException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "avatarSessionManager", (char) 133, "AvatarSessionManagerCache.java")).v("initialization failed");
            return j$.util.Optional.empty();
        }
    }
}
