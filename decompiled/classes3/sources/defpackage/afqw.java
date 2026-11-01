package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afqw extends defpackage.afqs {
    final /* synthetic */ defpackage.afqy a;

    public afqw(defpackage.afqy afqyVar) {
        j$.util.Objects.requireNonNull(afqyVar);
        this.a = afqyVar;
    }

    @Override // defpackage.afqs
    public final void a(android.view.View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }

    @Override // defpackage.afqs
    public final void b(android.view.View view) {
    }
}
