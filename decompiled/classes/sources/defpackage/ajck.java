package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ajck extends defpackage.ajac {
    public static defpackage.ajck w(defpackage.ajcq ajcqVar) {
        return ajcqVar instanceof defpackage.ajck ? (defpackage.ajck) ajcqVar : new defpackage.ajbx(ajcqVar);
    }

    public final defpackage.ajck u(java.lang.Class cls, defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        int i = defpackage.aizu.d;
        defpackage.aizt aiztVar = new defpackage.aizt(this, cls, ahycVar);
        c(aiztVar, defpackage.aiql.t(executor, aiztVar));
        return aiztVar;
    }

    public final defpackage.ajck v(java.lang.Class cls, defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        int i = defpackage.aizu.d;
        defpackage.aizs aizsVar = new defpackage.aizs(this, cls, ajatVar);
        c(aizsVar, defpackage.aiql.t(executor, aizsVar));
        return aizsVar;
    }

    public final defpackage.ajck x(defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(this, ahycVar);
        c(ajamVar, defpackage.aiql.t(executor, ajamVar));
        return ajamVar;
    }

    public final defpackage.ajck y(defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        int i = defpackage.ajan.c;
        defpackage.ajal ajalVar = new defpackage.ajal(this, ajatVar);
        c(ajalVar, defpackage.aiql.t(executor, ajalVar));
        return ajalVar;
    }

    public final defpackage.ajck z(long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return (defpackage.ajck) defpackage.aiql.G(this, j, timeUnit, scheduledExecutorService);
    }
}
