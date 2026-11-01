package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aicf implements java.util.Iterator {
    java.util.Map.Entry a;
    final /* synthetic */ java.util.Iterator b;
    final /* synthetic */ defpackage.aicg c;

    public aicf(defpackage.aicg aicgVar, java.util.Iterator it) {
        this.b = it;
        j$.util.Objects.requireNonNull(aicgVar);
        this.c = aicgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.ahvr.bZ(this.a != null, "no calls to next() since the last call to remove()");
        java.util.Collection collection = (java.util.Collection) this.a.getValue();
        this.b.remove();
        this.c.a.b -= collection.size();
        collection.clear();
        this.a = null;
    }
}
