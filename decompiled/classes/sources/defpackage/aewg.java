package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aewg {
    public static final java.util.concurrent.ConcurrentMap a = new j$.util.concurrent.ConcurrentHashMap();
    public static final java.lang.String[] b = {"key", "value"};
    public final android.content.ContentResolver c;
    public final android.net.Uri d;
    public volatile java.util.Map h;
    public android.database.ContentObserver e = null;
    public volatile boolean f = true;
    public final java.lang.Object g = new java.lang.Object();
    private final java.util.List i = new java.util.ArrayList();

    public aewg(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        contentResolver.getClass();
        this.c = contentResolver;
        this.d = uri;
    }

    public static defpackage.aewg a(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        if (uri == null) {
            return null;
        }
        defpackage.aewg aewgVar = (defpackage.aewg) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(a, uri, new defpackage.sqg(contentResolver, uri, 3));
        try {
            if (aewgVar.f) {
                synchronized (aewgVar) {
                    if (aewgVar.f) {
                        defpackage.aewf aewfVar = new defpackage.aewf(aewgVar);
                        aewgVar.c.registerContentObserver(aewgVar.d, false, aewfVar);
                        aewgVar.e = aewfVar;
                        aewgVar.f = false;
                    }
                }
            }
            return aewgVar;
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public final void b() {
        synchronized (this.g) {
            this.h = null;
            defpackage.aexb.e();
        }
        synchronized (this) {
            java.util.Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((aewh) it.next()).a();
            }
        }
    }
}
