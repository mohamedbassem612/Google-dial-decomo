package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abck implements java.io.Closeable {
    private static final aimz c = aimz.i("com/google/android/libraries/abuse/hades/tartarus/core/TartarusRuntime");
    public final com.google.android.libraries.abuse.hades.tartarus.core.E a;
    public boolean b = false;

    public abck(com.google.android.libraries.abuse.hades.tartarus.core.E e) {
        this.a = e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            c.d().l("com/google/android/libraries/abuse/hades/tartarus/core/TartarusRuntime", "close", 58, "TartarusRuntime.kt").v("Failed to release runtime.");
        } else {
            this.b = true;
            this.a.close();
        }
    }
}
