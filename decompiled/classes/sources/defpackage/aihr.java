package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aihr extends defpackage.aieu {
    final /* synthetic */ java.lang.Iterable a;
    final /* synthetic */ int b;

    public aihr(java.lang.Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.a.iterator();
        it.getClass();
        return new defpackage.aihz(it, this.b);
    }
}
