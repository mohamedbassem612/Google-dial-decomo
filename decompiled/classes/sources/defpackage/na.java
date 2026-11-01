package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class na {
    public boolean b;
    private final java.util.List a = new java.util.ArrayList();
    public final java.util.concurrent.CopyOnWriteArrayList c = new java.util.concurrent.CopyOnWriteArrayList();

    public na(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) it.next();
            if (autoCloseable instanceof java.lang.AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof java.util.concurrent.ExecutorService) {
                defpackage.anty.aj((java.util.concurrent.ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof android.content.res.TypedArray) {
                ((android.content.res.TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof android.media.MediaMetadataRetriever) {
                ((android.media.MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof android.media.MediaDrm) {
                ((android.media.MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof android.drm.DrmManagerClient) {
                ((android.drm.DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof android.content.ContentProviderClient)) {
                    throw new java.lang.IllegalArgumentException();
                }
                ((android.content.ContentProviderClient) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        java.util.List list = this.a;
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((defpackage.mz) it2.next()).f();
        }
        list.clear();
    }

    public final void f(boolean z) {
        this.b = z;
        for (defpackage.mz mzVar : this.a) {
            boolean z2 = false;
            if (mzVar.a && z) {
                z2 = true;
            }
            mzVar.g(z2);
        }
    }

    public final defpackage.mz g(defpackage.dzl dzlVar) {
        defpackage.mz mzVar = new defpackage.mz(this, dzlVar);
        this.a.add(mzVar);
        return mzVar;
    }

    public void a() {
    }

    public void d() {
    }

    public void c(mk mkVar) {
    }
}
