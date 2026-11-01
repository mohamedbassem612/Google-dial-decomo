package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahrv extends defpackage.ajbz {
    public static defpackage.ahrv g(defpackage.ajcq ajcqVar) {
        return ajcqVar instanceof defpackage.ahrv ? (defpackage.ahrv) ajcqVar : new defpackage.ahrv(ajcqVar);
    }

    public final defpackage.ahrv e(java.lang.Class cls, defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), ahycVar);
        int i = defpackage.aizu.d;
        defpackage.ajcq ajcqVar = this.b;
        defpackage.aizt aiztVar = new defpackage.aizt(ajcqVar, cls, ahqvVar);
        ajcqVar.c(aiztVar, defpackage.aiql.t(executor, aiztVar));
        return new defpackage.ahrv(aiztVar);
    }

    public final defpackage.ahrv f(java.lang.Class cls, defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        return new defpackage.ahrv(defpackage.ahvr.C(this.b, cls, ajatVar, executor));
    }

    public final defpackage.ahrv h(defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), ahycVar);
        int i = defpackage.ajan.c;
        defpackage.ajcq ajcqVar = this.b;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(executor, ajamVar));
        return new defpackage.ahrv(ajamVar);
    }

    public final defpackage.ahrv i(defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        long j = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), ajatVar, 1);
        int i = defpackage.ajan.c;
        defpackage.ajcq ajcqVar = this.b;
        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar, ajaxVar);
        ajcqVar.c(ajalVar, defpackage.aiql.t(executor, ajalVar));
        return new defpackage.ahrv(ajalVar);
    }

    public final defpackage.ahrv j(long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return new defpackage.ahrv(defpackage.aiql.G(this.b, j, timeUnit, scheduledExecutorService));
    }

    public final void k(defpackage.ajcb ajcbVar, java.util.concurrent.Executor executor) {
        defpackage.ahvr.J(this.b, ajcbVar, executor);
    }
}
