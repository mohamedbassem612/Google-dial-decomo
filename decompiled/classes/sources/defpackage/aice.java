package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class aice implements java.util.Iterator {
    final java.util.Iterator a;
    java.lang.Object b;
    java.util.Collection c;
    java.util.Iterator d;
    final /* synthetic */ defpackage.aicr e;

    public aice(defpackage.aicr aicrVar) {
        j$.util.Objects.requireNonNull(aicrVar);
        this.e = aicrVar;
        this.a = aicrVar.a.entrySet().iterator();
        this.b = null;
        this.c = null;
        this.d = defpackage.aiif.INSTANCE;
    }

    public abstract java.lang.Object a(java.lang.Object obj, java.lang.Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.d.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.a.next();
            this.b = entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return a(this.b, this.d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        if (((java.util.Collection) j$.util.Objects.requireNonNull(this.c)).isEmpty()) {
            this.a.remove();
        }
        this.e.b--;
    }
}
