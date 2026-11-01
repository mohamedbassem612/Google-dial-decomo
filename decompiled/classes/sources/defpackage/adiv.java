package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adiv {
    private com.google.android.libraries.micore.superpacks.common.PackManifest a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte g;

    public final com.google.android.libraries.micore.superpacks.common.Slice a() {
        final com.google.android.libraries.micore.superpacks.common.PackManifest packManifest;
        if (this.g == 31 && (packManifest = this.a) != null) {
            final int i = this.b;
            final int i2 = this.c;
            final int i3 = this.d;
            final int i4 = this.e;
            final int i5 = this.f;
            return new com.google.android.libraries.micore.superpacks.common.AutoValue_Slice(packManifest, i, i2, i3, i4, i5);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" packManifest");
        }
        if ((this.g & 1) == 0) {
            sb.append(" connectionConstraints");
        }
        if ((this.g & 2) == 0) {
            sb.append(" chargingConstraints");
        }
        if ((this.g & 4) == 0) {
            sb.append(" idleConstraints");
        }
        if ((this.g & 8) == 0) {
            sb.append(" batteryConstraints");
        }
        if ((this.g & 16) == 0) {
            sb.append(" schedulingFlags");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.g = (byte) (this.g | 8);
    }

    public final void c(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
    }

    public final void d(int i) {
        this.b = i;
        this.g = (byte) (this.g | 1);
    }

    public final void e(int i) {
        this.d = i;
        this.g = (byte) (this.g | 4);
    }

    public final void f(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        if (packManifest == null) {
            throw new java.lang.NullPointerException("Null packManifest");
        }
        this.a = packManifest;
    }

    public final void g(int i) {
        this.f = i;
        this.g = (byte) (this.g | 16);
    }
}
