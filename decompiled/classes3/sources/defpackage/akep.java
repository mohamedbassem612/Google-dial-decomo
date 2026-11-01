package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
abstract class akep implements java.util.Iterator {
    defpackage.akeq a;
    defpackage.akeq b;
    int c;
    final /* synthetic */ defpackage.aker d;

    public akep(defpackage.aker akerVar) {
        j$.util.Objects.requireNonNull(akerVar);
        this.d = akerVar;
        this.a = akerVar.d.d;
        this.b = null;
        this.c = akerVar.c;
    }

    public final defpackage.akeq a() {
        defpackage.aker akerVar = this.d;
        defpackage.akeq akeqVar = this.a;
        if (akeqVar == akerVar.d) {
            throw new java.util.NoSuchElementException();
        }
        if (akerVar.c != this.c) {
            throw new java.util.ConcurrentModificationException();
        }
        this.a = akeqVar.d;
        this.b = akeqVar;
        return akeqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.akeq akeqVar = this.b;
        if (akeqVar == null) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.aker akerVar = this.d;
        akerVar.e(akeqVar, true);
        this.b = null;
        this.c = akerVar.c;
    }
}
