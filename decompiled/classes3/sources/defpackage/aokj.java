package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aokj implements java.util.Iterator, aoow {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
