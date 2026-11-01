package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class clo extends defpackage.clp implements java.util.Iterator, aoow {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        a();
        if (this.c != null) {
            return new defpackage.cln(this);
        }
        throw new java.lang.IllegalStateException();
    }
}
