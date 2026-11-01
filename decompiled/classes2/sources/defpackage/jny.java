package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jny implements znv, znu, znt, zoi {
    public static final aimz a = aimz.i("com/android/dialer/callannouncer/impl/service/CallAnnouncer");
    public final java.util.concurrent.Executor b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final rlv d;
    public j$.util.Optional e = j$.util.Optional.empty();
    public j$.util.Optional f = j$.util.Optional.empty();
    public boolean g = false;
    public boolean h = true;
    public final defpackage.jns i;
    public final defpackage.heq j;
    private final aoin k;
    private final agsm l;

    public jny(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.jns jnsVar, rlv rlvVar, aoin aoinVar, defpackage.heq heqVar, agsm agsmVar) {
        this.b = new ajdc(scheduledExecutorService);
        this.c = scheduledExecutorService;
        this.i = jnsVar;
        this.d = rlvVar;
        this.k = aoinVar;
        this.j = heqVar;
        this.l = agsmVar;
    }

    public final ajcq a() {
        return ahvr.F(new defpackage.hkx(this, 12), this.b);
    }

    public final ajcq b() {
        a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "onRingerSilenced", 124, "CallAnnouncer.java").v("ringing silenced");
        return a();
    }

    public final ajcq c() {
        a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "onCallRingingEnded", 118, "CallAnnouncer.java").v("call ringing ended");
        return a();
    }

    public final ajcq e(defpackage.jnu jnuVar) {
        return aiql.G(dff.m(new defpackage.jnr(this, jnuVar, 2, null)), 10L, java.util.concurrent.TimeUnit.SECONDS, this.c);
    }

    public final void eh() {
        a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "onCallScopeRemoved", 130, "CallAnnouncer.java").v("call scope removed");
        this.l.g(a(), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final ajcq ej() {
        a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "onCallRingingStarted", 96, "CallAnnouncer.java").v("call ringing started");
        return ahvr.I(((defpackage.jnx) aooc.ar(((afpl) this.k.a()).Y(), defpackage.jnx.class)).am(), new defpackage.hky(this, 5), this.b);
    }

    public final ajcq f(defpackage.jnu jnuVar) {
        return !jnuVar.d.isPresent() ? aiql.y(new java.lang.IllegalStateException("missing announcement delay")) : ahvr.H(e(jnuVar), new defpackage.iau(this, jnuVar, 7, null), this.b);
    }
}
