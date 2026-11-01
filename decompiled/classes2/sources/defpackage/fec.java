package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class fec extends defpackage.ews {
    public final int a;

    public fec(java.lang.Throwable th, defpackage.fee feeVar) {
        int errorCode;
        super("Decoder failed: ".concat(java.lang.String.valueOf(feeVar == null ? null : feeVar.b)), th);
        if (th instanceof android.media.MediaCodec.CodecException) {
            ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
            errorCode = ((android.media.MediaCodec.CodecException) th).getErrorCode();
        } else {
            errorCode = 0;
        }
        this.a = errorCode;
    }
}
