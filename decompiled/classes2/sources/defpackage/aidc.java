package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class aidc extends ailj {
    private java.lang.Object a;

    protected aidc(java.lang.Object obj) {
        this.a = obj;
    }

    protected abstract java.lang.Object a(java.lang.Object obj);

    public final boolean hasNext() {
        return this.a != null;
    }

    public final java.lang.Object next() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.util.NoSuchElementException();
        }
        this.a = a(obj);
        return obj;
    }
}
