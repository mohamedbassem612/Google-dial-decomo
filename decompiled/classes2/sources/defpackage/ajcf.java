package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajcf {
    public final java.util.concurrent.atomic.AtomicInteger c;
    public final ajcq[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public ajcf(ajcq[] ajcqVarArr) {
        this.d = ajcqVarArr;
        this.c = new java.util.concurrent.atomic.AtomicInteger(ajcqVarArr.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (ajcq ajcqVar : this.d) {
                if (ajcqVar != null) {
                    ajcqVar.cancel(this.b);
                }
            }
        }
    }
}
