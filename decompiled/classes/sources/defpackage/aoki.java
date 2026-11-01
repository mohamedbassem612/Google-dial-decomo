package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoki implements java.util.Iterator, defpackage.aoow {
    private final java.util.Iterator a;
    private int b;

    public aoki(java.util.Iterator it) {
        if (it == null) {
            defpackage.aooh.i("iterator");
        }
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        if (i < 0) {
            defpackage.ajsz.bh();
        }
        return new defpackage.aokg(i, this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.a.am();
    }
}
