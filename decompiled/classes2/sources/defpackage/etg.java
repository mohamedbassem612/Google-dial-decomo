package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class etg implements java.lang.Iterable {
    public final java.lang.Object a = new java.lang.Object();
    public final java.util.Map b = new java.util.HashMap();
    public java.util.Set c = java.util.Collections.EMPTY_SET;
    public java.util.List d = java.util.Collections.EMPTY_LIST;

    public final int a(java.lang.Object obj) {
        int iIntValue;
        synchronized (this.a) {
            iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(this.b, obj, 0)).intValue();
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
