package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jwo extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public jwo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.jwo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        zpo zpoVar = (zpo) list.get(0);
        android.os.Bundle bundle = (android.os.Bundle) list.get(1);
        defpackage.jwa jwaVar = (defpackage.jwa) list.get(2);
        if (zpoVar == zpo.f) {
            int i = bundle.getInt("android.telecom.extra.AUDIO_CODEC", 0);
            if (android.os.Build.VERSION.SDK_INT != 30) {
                int i2 = bundle.getInt("android.telecom.extra.AUDIO_CODEC", 0);
                float fAbs = java.lang.Math.abs(bundle.getFloat("android.telecom.extra.AUDIO_CODEC_BITRATE_KBPS", 0.0f) - 24.4f);
                if (i2 == 19 || (i2 == 20 && fAbs < 0.01f)) {
                    z = true;
                }
            } else if (i == 19) {
                z = true;
            }
        }
        jwaVar.a |= z;
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
