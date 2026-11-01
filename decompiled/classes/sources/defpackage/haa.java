package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class haa {
    public static java.util.concurrent.Executor a = java.util.concurrent.Executors.newCachedThreadPool(new defpackage.hgf());
    private final java.util.Set c = new java.util.LinkedHashSet(1);
    private final java.util.Set d = new java.util.LinkedHashSet(1);
    private final android.os.Handler e = new android.os.Handler(android.os.Looper.getMainLooper());
    public volatile gzy b = null;

    public haa(java.util.concurrent.Callable callable, boolean z) {
        if (!z) {
            a.execute(new gzz(this, callable));
            return;
        }
        try {
            b((gzy) callable.call());
        } catch (java.lang.Throwable th) {
            b(new gzy(th));
        }
    }

    private final synchronized void g(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.d);
        if (arrayList.isEmpty()) {
            hge.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gzu) arrayList.get(i)).a(th);
        }
    }

    private final synchronized void h(java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gzu) arrayList.get(i)).a(obj);
        }
    }

    public final void a() {
        gzy gzyVar = this.b;
        if (gzyVar != null) {
            java.lang.Object obj = gzyVar.a;
            if (obj != null) {
                h(obj);
            } else {
                g(gzyVar.b);
            }
        }
    }

    public final void b(gzy gzyVar) {
        if (this.b != null) {
            throw new java.lang.IllegalStateException("A task may only be set once.");
        }
        this.b = gzyVar;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            a();
        } else {
            this.e.post(new fkh(this, 12, (byte[]) null));
        }
    }

    public final synchronized void c(gzu gzuVar) {
        java.lang.Throwable th;
        gzy gzyVar = this.b;
        if (gzyVar != null && (th = gzyVar.b) != null) {
            gzuVar.a(th);
        }
        this.d.add(gzuVar);
    }

    public final synchronized void d(gzu gzuVar) {
        java.lang.Object obj;
        gzy gzyVar = this.b;
        if (gzyVar != null && (obj = gzyVar.a) != null) {
            gzuVar.a(obj);
        }
        this.c.add(gzuVar);
    }

    public final synchronized void e(gzu gzuVar) {
        this.d.remove(gzuVar);
    }

    public final synchronized void f(gzu gzuVar) {
        this.c.remove(gzuVar);
    }

    public haa(java.lang.Object obj) {
        b(new gzy(obj));
    }
}
