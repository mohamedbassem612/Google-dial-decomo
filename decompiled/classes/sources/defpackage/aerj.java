package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerj implements defpackage.ahzi {
    private final android.content.Context a;

    public aerj(android.content.Context context) {
        this.a = context;
    }

    @Override // defpackage.ahzi
    public final /* bridge */ /* synthetic */ java.lang.Object eZ() {
        android.content.Context context = this.a;
        return !defpackage.abyl.h(context) ? defpackage.ahwt.a : defpackage.ahyn.h(new java.io.File(context.getFilesDir(), "primes/crash"));
    }
}
