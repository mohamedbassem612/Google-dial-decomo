package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aojz implements java.lang.Iterable, defpackage.aoow {
    final /* synthetic */ java.lang.Object[] a;

    public aojz(java.lang.Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.lang.Object[] objArr = this.a;
        if (objArr == null) {
            defpackage.aooh.i("array");
        }
        return new defpackage.aonw(objArr);
    }
}
