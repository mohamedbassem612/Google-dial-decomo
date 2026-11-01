package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class albz implements java.util.Iterator {
    final /* synthetic */ defpackage.alcb a;
    private int b;

    public albz(defpackage.alcb alcbVar) {
        j$.util.Objects.requireNonNull(alcbVar);
        this.a = alcbVar;
        this.b = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        defpackage.alcb alcbVar = this.a;
        alcbVar.c();
        return this.b + 1 < alcbVar.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        defpackage.alcb alcbVar = this.a;
        alcbVar.c();
        int i = this.b + 1;
        if (i >= alcbVar.b) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i;
        return (defpackage.alby) alcbVar.a[i];
    }
}
