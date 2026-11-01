package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aipo extends defpackage.aion {
    private final java.lang.String a;

    protected aipo(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.aion
    public void c(java.lang.RuntimeException runtimeException, defpackage.aiom aiomVar) {
        android.util.Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    @Override // defpackage.aion
    public java.lang.String d() {
        return this.a;
    }
}
