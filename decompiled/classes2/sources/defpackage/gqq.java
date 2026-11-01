package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class gqq extends defpackage.gqp {
    public final androidx.window.extensions.layout.WindowLayoutComponent a;
    private final java.util.concurrent.locks.ReentrantLock b = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.Map c = new java.util.LinkedHashMap();
    private final java.util.Map d = new java.util.LinkedHashMap();
    private final java.util.Map e = new java.util.LinkedHashMap();
    private final gne f;

    public gqq(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent, gne gneVar) {
        this.a = windowLayoutComponent;
        this.f = gneVar;
    }

    @Override // defpackage.gqp, defpackage.gqo
    public void a(dxw dxwVar) {
        androidx.window.layout.adapter.extensions.MulticastConsumer multicastConsumer;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            android.content.Context context = (android.content.Context) this.d.get(dxwVar);
            if (context != null && (multicastConsumer = (androidx.window.layout.adapter.extensions.MulticastConsumer) this.c.get(context)) != null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = multicastConsumer.a;
                reentrantLock2.lock();
                try {
                    multicastConsumer.b.remove(dxwVar);
                    reentrantLock2.unlock();
                    this.d.remove(dxwVar);
                    if (multicastConsumer.b.isEmpty()) {
                        this.c.remove(context);
                        defpackage.gmy gmyVar = (defpackage.gmy) this.e.remove(multicastConsumer);
                        if (gmyVar != null) {
                            gmyVar.a.invoke(gmyVar.b, gmyVar.c);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // defpackage.gqp, defpackage.gqo
    public void b(android.content.Context context, dxw dxwVar) {
        aooh.f(context, "context");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            java.util.Map map = this.c;
            androidx.window.layout.adapter.extensions.MulticastConsumer multicastConsumer = (androidx.window.layout.adapter.extensions.MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(dxwVar);
                this.d.put(dxwVar, context);
            } else {
                androidx.window.layout.adapter.extensions.MulticastConsumer multicastConsumer2 = new androidx.window.layout.adapter.extensions.MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.d.put(dxwVar, context);
                multicastConsumer2.a(dxwVar);
                if (context instanceof android.app.Activity) {
                    gne gneVar = this.f;
                    androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent = this.a;
                    aopu[] aopuVarArr = aoou.a;
                    aooa aooaVar = new aooa(androidx.window.extensions.layout.WindowLayoutInfo.class);
                    android.app.Activity activity = (android.app.Activity) context;
                    gbp gbpVar = new gbp(multicastConsumer2, 2, (char[]) null);
                    aooh.f(activity, "activity");
                    java.lang.Object objF = gneVar.f(aooaVar, gbpVar);
                    windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", android.app.Activity.class, gneVar.e()).invoke(windowLayoutComponent, activity, objF);
                    this.e.put(multicastConsumer2, new defpackage.gmy(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", gneVar.e()), windowLayoutComponent, objF));
                } else {
                    multicastConsumer2.accept(new androidx.window.extensions.layout.WindowLayoutInfo(aokc.a));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
