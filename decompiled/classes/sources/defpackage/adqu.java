package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/infra/SequentialTaskSubmitter");
    private final defpackage.ajct b;
    private final java.util.Queue c = new java.util.ArrayDeque();
    private j$.util.Optional d = j$.util.Optional.empty();

    public adqu(defpackage.ajct ajctVar) {
        this.b = ajctVar;
    }

    private final void f(defpackage.ajcr ajcrVar) {
        this.d = j$.util.Optional.of(ajcrVar);
        java.lang.Runnable abqgVar = new defpackage.abqg(this, 2);
        defpackage.ajct ajctVar = this.b;
        ajcrVar.c(abqgVar, ajctVar);
        ajctVar.execute(ajcrVar);
    }

    public final synchronized defpackage.ajcq a(java.util.concurrent.Callable callable, java.lang.Object obj) {
        defpackage.ajcr ajcrVar;
        ajcrVar = new defpackage.ajcr(callable);
        if (this.d.isEmpty()) {
            f(ajcrVar);
        } else {
            this.c.add(new defpackage.adqt(j$.util.Optional.ofNullable(obj), ajcrVar));
        }
        return ajcrVar;
    }

    public final synchronized j$.util.Optional b() {
        j$.util.Optional optional;
        optional = this.d;
        this.d = j$.util.Optional.empty();
        java.util.Queue queue = this.c;
        java.util.Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((defpackage.adqt) it.next()).b.cancel(false);
        }
        queue.clear();
        return optional;
    }

    public final synchronized void c(java.lang.Object obj) {
        java.util.Queue queue = this.c;
        j$.util.Collection.-EL.stream(queue).filter(new abdh(obj, 10)).forEach(new uwm(17));
        j$.util.Collection.-EL.removeIf(queue, new abdh(obj, 11));
    }

    public final void d(java.lang.Runnable runnable, java.lang.Object obj) {
        a(new zpk(this, runnable, 11), obj);
    }

    public final synchronized void e() {
        defpackage.adqt adqtVar = (defpackage.adqt) this.c.poll();
        if (adqtVar == null) {
            this.d = j$.util.Optional.empty();
        } else {
            f(adqtVar.b);
        }
    }
}
