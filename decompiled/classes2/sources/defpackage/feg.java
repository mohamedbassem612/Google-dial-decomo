package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class feg extends java.lang.Exception {
    public final java.lang.String a;
    public final boolean b;
    public final defpackage.fee c;
    public final java.lang.String d;

    public feg(defpackage.eqg eqgVar, java.lang.Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + eqgVar.toString(), th, eqgVar.p, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + java.lang.Math.abs(i));
    }

    public feg(java.lang.String str, java.lang.Throwable th, java.lang.String str2, boolean z, defpackage.fee feeVar, java.lang.String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = feeVar;
        this.d = str3;
    }
}
