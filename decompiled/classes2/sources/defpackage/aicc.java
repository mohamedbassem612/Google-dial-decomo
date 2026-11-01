package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aicc implements java.util.Iterator {
    final java.util.Iterator a;
    java.util.Collection b;
    final /* synthetic */ defpackage.aicd c;

    public aicc(defpackage.aicd aicdVar) {
        j$.util.Objects.requireNonNull(aicdVar);
        this.c = aicdVar;
        this.a = aicdVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.a.next();
        this.b = (java.util.Collection) entry.getValue();
        return this.c.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        ahvr.bZ(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.c.b.b -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}
