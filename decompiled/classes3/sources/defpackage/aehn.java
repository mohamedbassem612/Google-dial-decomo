package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aehn {
    public boolean a;
    public byte b;
    public int c;

    public final void a(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final com.google.android.libraries.dialer.videocall.ViLteStatus b() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new com.google.android.libraries.dialer.videocall.AutoValue_ViLteStatus(this.a, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == 0) {
            sb.append(" viLteAvailable");
        }
        if (this.c == 0) {
            sb.append(" resultCode");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}
