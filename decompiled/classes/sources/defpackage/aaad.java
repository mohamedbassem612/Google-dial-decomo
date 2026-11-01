package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aaad extends defpackage.aaah {
    final /* synthetic */ defpackage.aaae a;

    public aaad(defpackage.aaae aaaeVar) {
        j$.util.Objects.requireNonNull(aaaeVar);
        this.a = aaaeVar;
    }

    @Override // defpackage.aaah
    public final void b(com.google.android.gms.common.api.Status status) {
        this.a.l(status);
    }
}
