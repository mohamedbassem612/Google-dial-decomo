package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class chw extends defpackage.chp {
    private final java.lang.Object c;

    public chw(java.lang.Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // defpackage.chp, java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        a();
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        b();
        this.a--;
        return this.c;
    }
}
