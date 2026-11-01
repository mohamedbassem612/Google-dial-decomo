package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
abstract class xxl {
    private final java.util.Queue a;

    public xxl() {
        char[] cArr = defpackage.ygc.a;
        this.a = new java.util.ArrayDeque(20);
    }

    public abstract defpackage.xxw a();

    final defpackage.xxw b() {
        defpackage.xxw xxwVar = (defpackage.xxw) this.a.poll();
        return xxwVar == null ? a() : xxwVar;
    }

    public final void c(defpackage.xxw xxwVar) {
        java.util.Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(xxwVar);
        }
    }
}
