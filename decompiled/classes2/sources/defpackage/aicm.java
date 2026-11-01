package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class aicm implements java.util.Iterator {
    final java.util.Iterator a;
    final java.util.Collection b;
    final /* synthetic */ defpackage.aicn c;

    public aicm(defpackage.aicn aicnVar) {
        j$.util.Objects.requireNonNull(aicnVar);
        this.c = aicnVar;
        this.b = aicnVar.b;
        java.util.Collection collection = aicnVar.b;
        this.a = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        defpackage.aicn aicnVar = this.c;
        aicnVar.b();
        if (aicnVar.b != this.b) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        defpackage.aicn aicnVar = this.c;
        aicnVar.e.b--;
        aicnVar.c();
    }

    public aicm(defpackage.aicn aicnVar, java.util.Iterator it) {
        j$.util.Objects.requireNonNull(aicnVar);
        this.c = aicnVar;
        this.b = aicnVar.b;
        this.a = it;
    }
}
