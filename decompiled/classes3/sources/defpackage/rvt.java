package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rvt extends afpn {
    final /* synthetic */ defpackage.rvu a;
    final /* synthetic */ zjm b;

    public rvt(defpackage.rvu rvuVar, zjm zjmVar) {
        this.b = zjmVar;
        j$.util.Objects.requireNonNull(rvuVar);
        this.a = rvuVar;
    }

    public final void a(int i, float f) {
        if (this.b.g().isEmpty()) {
            this.a.b.getWindow().setStatusBarColor(i);
        }
    }
}
