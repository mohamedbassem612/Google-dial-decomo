package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abyy implements defpackage.xuo {
    public int b;
    public int c;
    public boolean d;
    public final int e = -1;
    public final int f = -1;
    public final int g = -1;
    private java.lang.Integer h;
    private java.lang.Integer i;
    private java.lang.Integer j;
    private java.lang.String k;
    private int l;
    private int m;

    public static final int b(int i) {
        if (i == Integer.MIN_VALUE) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(java.nio.ByteBuffer.allocate(21).putInt(this.c).put(this.d ? (byte) 1 : (byte) 0).putInt(0).putInt(-1).putInt(-1).putInt(-1).array());
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.abyy)) {
            return false;
        }
        defpackage.abyy abyyVar = (defpackage.abyy) obj;
        if (this.c != abyyVar.c || this.d != abyyVar.d) {
            return false;
        }
        java.lang.Integer num = abyyVar.h;
        char[] cArr = defpackage.ygc.a;
        if (!a.L((java.lang.Object) null, (java.lang.Object) null)) {
            return false;
        }
        int i = abyyVar.e;
        int i2 = abyyVar.f;
        int i3 = abyyVar.g;
        java.lang.Integer num2 = abyyVar.i;
        if (!a.L((java.lang.Object) null, (java.lang.Object) null)) {
            return false;
        }
        java.lang.Integer num3 = abyyVar.j;
        if (!a.L((java.lang.Object) null, (java.lang.Object) null)) {
            return false;
        }
        int i4 = abyyVar.l;
        if (!a.L((java.lang.Object) null, (java.lang.Object) null)) {
            return false;
        }
        int i5 = abyyVar.m;
        if (!a.L((java.lang.Object) null, (java.lang.Object) null)) {
            return false;
        }
        java.lang.String str = abyyVar.k;
        return a.L((java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        char[] cArr = defpackage.ygc.a;
        return defpackage.ygc.c(null, defpackage.ygc.c(null, defpackage.ygc.c(null, (((defpackage.ygc.c(null, 486694574) * 31) + (this.d ? 1 : 0)) * 31) + this.c)));
    }

    public final java.lang.String toString() {
        int i = this.b;
        int i2 = i & 16;
        int i3 = i & 4;
        int i4 = defpackage.afbo.a;
        int i5 = i & 8192;
        int i6 = this.b;
        int i7 = i6 & 1;
        int i8 = 4194304 & i6;
        int i9 = i6 & 8;
        int i10 = 33554432 & i6;
        int i11 = i6 & 4096;
        int i12 = i6 & 512;
        int i13 = i6 & 2048;
        int i14 = i6 & 32;
        int i15 = i6 & 16384;
        int i16 = 32768 & i6;
        int i17 = 131072 & i6;
        int i18 = i6 & 65536;
        int i19 = i6 & 262144;
        int i20 = i6 & 524288;
        int i21 = i6 & 64;
        int i22 = i6 & 8388608;
        int i23 = i6 & 16777216;
        java.lang.String str = true != this.d ? "" : "custom_size ";
        java.lang.String str2 = (i6 & 256) != 0 ? "soften-1,null,null " : "";
        java.lang.String str3 = 1 != i7 ? "" : "crop ";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FifeUrlOptions{ ");
        sb.append(i2 != 0 ? "kill_animation " : "");
        sb.append(i3 != 0 ? "no_overlay " : "");
        sb.append(i5 != 0 ? "app_domain " : "");
        sb.append(str3);
        sb.append(i8 != 0 ? "circlecrop " : "");
        sb.append(i9 != 0 ? "smartcrop " : "");
        sb.append("");
        sb.append(i10 != 0 ? "centercrop " : "");
        sb.append(i11 != 0 ? "loose_face_crop " : "");
        sb.append(i12 != 0 ? "exif " : "");
        sb.append(i13 != 0 ? "jpeg " : "");
        sb.append("");
        sb.append(i14 != 0 ? "webp " : "");
        sb.append(i15 != 0 ? "webp_animation " : "");
        sb.append(i16 != 0 ? "blur " : "");
        sb.append(i17 != 0 ? "mp4 " : "");
        sb.append(i18 != 0 ? "loop " : "");
        sb.append(i19 != 0 ? "no_silhouette " : "");
        sb.append(i20 != 0 ? "monogram " : "");
        sb.append(i21 != 0 ? "no_upscale " : "");
        sb.append(i22 != 0 ? "no_google_metadata " : "");
        sb.append(i23 != 0 ? "google_metadata " : "");
        sb.append("");
        sb.append(str);
        sb.append("");
        sb.append(str2);
        sb.append(" }");
        return sb.toString();
    }
}
