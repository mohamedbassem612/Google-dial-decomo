package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aaen implements defpackage.aadz {
    final /* synthetic */ defpackage.aaet a;

    public aaen(defpackage.aaet aaetVar) {
        j$.util.Objects.requireNonNull(aaetVar);
        this.a = aaetVar;
    }

    @Override // defpackage.aadz
    public final void a(boolean z) {
        android.os.Handler handler = this.a.r;
        handler.sendMessage(handler.obtainMessage(1, java.lang.Boolean.valueOf(z)));
    }
}
