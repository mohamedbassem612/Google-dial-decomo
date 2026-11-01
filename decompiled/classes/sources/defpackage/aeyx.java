package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeyx {
    public defpackage.ajcq a = null;
    public final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    public final boolean a(java.util.Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        java.util.Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= !(((defpackage.zzx) this.b.get((java.lang.String) it.next())) == null);
        }
        return z;
    }

    public final synchronized void b(defpackage.aewq aewqVar) {
        if (this.a == null) {
            this.a = defpackage.abyl.e(aewqVar.c, new defpackage.aetv(this, 13), aewqVar.c());
        }
    }
}
