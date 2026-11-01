package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiih extends defpackage.ailj {
    private final java.lang.Object a;
    private boolean b;

    public aiih(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.b) {
            throw new java.util.NoSuchElementException();
        }
        this.b = true;
        return this.a;
    }
}
