package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ydu {
    public final java.util.Set a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    public final java.util.Set b = new java.util.HashSet();
    public boolean c;

    public final boolean a(defpackage.yek yekVar) {
        boolean z = true;
        if (yekVar != null) {
            java.util.Set set = this.a;
            java.util.Set set2 = this.b;
            boolean zRemove = set.remove(yekVar);
            if (!set2.remove(yekVar) && !zRemove) {
                z = false;
            }
            if (z) {
                yekVar.c();
            }
        }
        return z;
    }

    public final java.lang.String toString() {
        java.util.Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + '}';
    }
}
