package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jog extends amzm {
    private final amzg b;

    public jog(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jog.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        android.media.AudioAttributes audioAttributesBuild;
        int iOrdinal = ((defpackage.jor) obj).ordinal();
        if (iOrdinal != 1) {
            audioAttributesBuild = iOrdinal != 2 ? new android.media.AudioAttributes.Builder().setContentType(1).setUsage(0).build() : new android.media.AudioAttributes.Builder().setContentType(1).setUsage(2).build();
        } else {
            audioAttributesBuild = new android.media.AudioAttributes.Builder().setContentType(1).setUsage(6).build();
        }
        return aiql.z(audioAttributesBuild);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
