package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahvx implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ahvx(defpackage.xtd xtdVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xtdVar);
        this.a = xtdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i == 0) {
            return defpackage.ahwa.a(((defpackage.ahwd) obj).c(), defpackage.ahwd.d);
        }
        synchronized (obj) {
            if (((defpackage.xtd) obj).f != null) {
                ((defpackage.xtd) obj).h();
                if (((defpackage.xtd) obj).i()) {
                    ((defpackage.xtd) obj).f();
                    ((defpackage.xtd) obj).h = 0;
                }
            }
        }
        return null;
    }

    public ahvx(defpackage.ahwd ahwdVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ahwdVar);
        this.a = ahwdVar;
    }
}
