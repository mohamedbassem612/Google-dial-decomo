package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aiet extends defpackage.aieu {
    final /* synthetic */ java.lang.Iterable[] a;

    public aiet(java.lang.Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.lang.Iterable[] iterableArr = this.a;
        return new defpackage.aiie(new defpackage.aies(this, iterableArr.length, iterableArr));
    }
}
