package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adcw implements defpackage.ajcb {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ long b;

    public adcw(defpackage.aogc aogcVar, java.lang.String str, long j) {
        this.a = str;
        this.b = j;
        j$.util.Objects.requireNonNull(aogcVar);
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        android.util.Log.e("MDDTikTokTaskScheduler", "Failed to scheduled periodic tasks for MDD lib " + this.a + ' ' + this.b);
    }

    @Override // defpackage.ajcb
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        android.util.Log.d("MDDTikTokTaskScheduler", "Successfully scheduled periodic tasks for MDD lib " + this.a + " period " + this.b + " UUID " + java.lang.String.valueOf((java.util.UUID) obj));
    }
}
