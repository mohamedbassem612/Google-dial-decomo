package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class st extends su implements java.util.Iterator {
    sr a;
    sr b;

    public st(sr srVar, sr srVar2) {
        this.a = srVar2;
        this.b = srVar;
    }

    private final sr a() {
        sr srVar = this.b;
        sr srVar2 = this.a;
        if (srVar == srVar2 || srVar2 == null) {
            return null;
        }
        return srVar.c;
    }

    public final void b(sr srVar) {
        if (this.a == srVar && srVar == this.b) {
            this.b = null;
            this.a = null;
        }
        sr srVar2 = this.a;
        if (srVar2 == srVar) {
            this.a = srVar2.d;
        }
        if (this.b == srVar) {
            this.b = a();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        sr srVar = this.b;
        this.b = a();
        return srVar;
    }
}
