package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaww implements aadj, aadl {
    private final /* synthetic */ int $cid;
    public final com.google.android.gms.common.api.Status a;
    public final java.lang.Object b;

    public aaww(com.google.android.gms.common.api.Status status, java.io.InputStream inputStream, int i) {
        this.$cid = i;
        ahvr.ci(status);
        this.a = status;
        this.b = inputStream;
    }

    public final void a() {
        int i = this.$cid;
        java.lang.Object obj = this.b;
        try {
            if (i != 0) {
                if (obj == null) {
                } else {
                    ((java.io.InputStream) obj).close();
                }
            } else if (obj == null) {
            } else {
                ((java.io.OutputStream) obj).close();
            }
        } catch (java.io.IOException unused) {
        }
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.a;
    }

    public aaww(com.google.android.gms.common.api.Status status, java.io.OutputStream outputStream, int i) {
        this.$cid = i;
        this.a = status;
        this.b = outputStream;
    }
}
