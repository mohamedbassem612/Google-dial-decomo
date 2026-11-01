package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class og {
    public final java.util.Set a = new java.util.concurrent.CopyOnWriteArraySet();
    public volatile android.content.Context b;

    public final void a() {
        this.b = null;
    }

    public final void b(android.content.Context context) {
        this.b = context;
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.oh) it.next()).a();
        }
    }
}
