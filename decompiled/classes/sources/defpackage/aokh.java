package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aokh implements java.lang.Iterable, defpackage.aoow {
    private final defpackage.aomy a;

    public aokh(defpackage.aomy aomyVar) {
        this.a = aomyVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.aoki((java.util.Iterator) this.a.a());
    }
}
