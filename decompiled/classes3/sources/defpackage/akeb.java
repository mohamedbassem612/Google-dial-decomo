package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akeb extends defpackage.akec implements java.lang.Iterable {
    public final java.util.ArrayList a = new java.util.ArrayList();

    @Override // defpackage.akec
    public final java.lang.String a() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return ((defpackage.akec) arrayList.get(0)).a();
        }
        throw new java.lang.IllegalStateException(a.bj(size, "Array must have size 1, but has size "));
    }

    public final void b(defpackage.akec akecVar) {
        this.a.add(akecVar);
    }

    public final defpackage.akec c() {
        return (defpackage.akec) this.a.get(0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.akeb) && ((defpackage.akeb) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.iterator();
    }
}
