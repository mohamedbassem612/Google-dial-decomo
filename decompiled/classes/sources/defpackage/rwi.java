package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rwi {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/notification/DialerNotificationManager");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final android.app.NotificationManager d;
    public final defpackage.mgu e;
    public final defpackage.zjv f;
    public final java.util.HashSet g = new java.util.HashSet();
    private final java.util.concurrent.Executor h;
    private final defpackage.rwo i;

    public rwi(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, android.app.NotificationManager notificationManager, defpackage.rwo rwoVar, defpackage.mgu mguVar, defpackage.zjv zjvVar) {
        this.b = context;
        this.h = new defpackage.ajdc(ajctVar);
        this.c = ajctVar2;
        this.d = notificationManager;
        this.i = rwoVar;
        this.e = mguVar;
        this.f = zjvVar;
    }

    public final int a() {
        int currentInterruptionFilter = this.d.getCurrentInterruptionFilter();
        defpackage.mgu mguVar = this.e;
        j$.util.Objects.requireNonNull(mguVar);
        return defpackage.gus.aD(defpackage.mgv.NOTIFICATION_GET_CURRENT_INTERRUPTION_FILTER, currentInterruptionFilter, mguVar).f();
    }

    public final android.app.NotificationManager.Policy b() {
        return (android.app.NotificationManager.Policy) new defpackage.mgr(this.e, this.d.getNotificationPolicy()).b(defpackage.mgv.NOTIFICATION_GET_NOTIFICATION_POLICY).d(new rat(7));
    }

    public final defpackage.aify c() {
        return (defpackage.aify) new defpackage.mgr(this.e, defpackage.aify.o(this.d.getActiveNotifications())).b(defpackage.mgv.NOTIFICATION_GET_ACTIVE_NOTIFICATIONS).d(new defpackage.kju(19));
    }

    public final defpackage.ajcq d(java.lang.String str, int i) {
        defpackage.ahvr.bM(!android.text.TextUtils.isEmpty(str));
        defpackage.rwo rwoVar = this.i;
        j$.util.Optional optionalOf = j$.util.Optional.of(str);
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(rwoVar.c());
        rwg rwgVar = new rwg(this, optionalOf, i, 0);
        java.util.concurrent.Executor executor = this.h;
        return ahrvVarG.h(rwgVar, executor).h(new qgx(this, 19), executor).h(new qgx(this, 20), executor);
    }

    public final defpackage.ajcq e(java.lang.String str) {
        defpackage.ahvr.bM(!android.text.TextUtils.isEmpty(str));
        return defpackage.ahvr.H(f(), new oqe(this, str, 16), this.h);
    }

    public final defpackage.ajcq f() {
        defpackage.ajcq ajcqVarC = this.i.c();
        defpackage.jyx jyxVar = new defpackage.jyx(this, 7);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar);
        int i = defpackage.ajan.c;
        java.util.concurrent.Executor executor = this.h;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarC, ahqvVar);
        ajcqVarC.c(ajamVar, defpackage.aiql.t(executor, ajamVar));
        return ajamVar;
    }

    public final defpackage.ajcq g() {
        return defpackage.ahvr.F(new defpackage.raj(this, 10), this.c);
    }

    public final defpackage.ajcq h(java.lang.String str, int i, android.app.Notification notification) {
        defpackage.ahvr.bM(!android.text.TextUtils.isEmpty(str));
        j$.util.Optional optionalOf = j$.util.Optional.of(str);
        defpackage.ahvr.bM(!android.text.TextUtils.isEmpty(aa$.ExternalSyntheticApiModelOutline0.m(notification)));
        return defpackage.ahvr.H(this.i.c(), new rwf(this, optionalOf, i, notification), this.h);
    }

    public final void i(int i) {
        this.d.cancel(i);
        defpackage.zjv.i(this.f, defpackage.mgv.NOTIFICATION_CANCEL, defpackage.aify.q(defpackage.mhc.a, defpackage.gus.au(i)), null, 0, 28);
    }

    public final void j(java.lang.String str, int i) {
        this.d.cancel(str, i);
        defpackage.zjv.i(this.f, defpackage.mgv.NOTIFICATION_CANCEL, defpackage.aify.q(defpackage.aais.aG(str), defpackage.gus.au(i)), null, 0, 28);
    }

    public final void k(java.lang.String str, int i, android.app.Notification notification) {
        this.d.notify(str, i, notification);
        defpackage.zjv.i(this.f, defpackage.mgv.NOTIFICATION_NOTIFY, defpackage.aify.q(defpackage.gus.aw(str), defpackage.gus.au(i)), null, 0, 28);
    }
}
