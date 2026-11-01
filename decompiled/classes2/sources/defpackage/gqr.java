package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqr extends defpackage.gqq {
    private final java.util.concurrent.locks.ReentrantLock b;
    private final java.util.Map c;
    private final java.util.Map d;

    public gqr(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent, gne gneVar) {
        super(windowLayoutComponent, gneVar);
        this.b = new java.util.concurrent.locks.ReentrantLock();
        this.c = new java.util.LinkedHashMap();
        this.d = new java.util.LinkedHashMap();
    }

    @Override // defpackage.gqq, defpackage.gqp, defpackage.gqo
    public final void a(dxw dxwVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            java.util.Map map = this.d;
            android.content.Context context = (android.content.Context) map.get(dxwVar);
            if (context != null) {
                java.util.Map map2 = this.c;
                defpackage.gqs gqsVar = (defpackage.gqs) map2.get(context);
                if (gqsVar != null) {
                    gqsVar.removeListener(dxwVar);
                    map.remove(dxwVar);
                    if (gqsVar.isEmpty()) {
                        map2.remove(context);
                        this.a.removeWindowLayoutInfoListener(gqsVar);
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.gqq, defpackage.gqp, defpackage.gqo
    public final void b(android.content.Context context, dxw dxwVar) {
        aooh.f(context, "context");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            java.util.Map map = this.c;
            defpackage.gqs gqsVar = (defpackage.gqs) map.get(context);
            if (gqsVar != null) {
                gqsVar.addListener(dxwVar);
                this.d.put(dxwVar, context);
            } else {
                defpackage.gqs gqsVar2 = new defpackage.gqs(context);
                map.put(context, gqsVar2);
                this.d.put(dxwVar, context);
                gqsVar2.addListener(dxwVar);
                this.a.addWindowLayoutInfoListener(context, gqsVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
