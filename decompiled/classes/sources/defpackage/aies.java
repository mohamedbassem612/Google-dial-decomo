package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aies extends defpackage.ailk {
    final /* synthetic */ java.lang.Iterable[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aies(defpackage.aiet aietVar, int i, java.lang.Iterable[] iterableArr) {
        super(i, 0);
        this.a = iterableArr;
        j$.util.Objects.requireNonNull(aietVar);
    }

    @Override // defpackage.ailk
    public final /* bridge */ /* synthetic */ java.lang.Object a(int i) {
        return this.a[i].iterator();
    }
}
