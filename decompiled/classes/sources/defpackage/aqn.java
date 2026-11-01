package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aqn implements defpackage.asv {
    final /* synthetic */ defpackage.aqo a;

    public aqn(defpackage.aqo aqoVar) {
        this.a = aqoVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    @Override // defpackage.asv
    public final float a(float f) {
        if (java.lang.Float.isNaN(f)) {
            return 0.0f;
        }
        defpackage.aqo aqoVar = this.a;
        float fFloatValue = ((java.lang.Number) aqoVar.a.a(java.lang.Float.valueOf(f))).floatValue();
        aqoVar.d.b(java.lang.Boolean.valueOf(fFloatValue > 0.0f));
        aqoVar.e.b(java.lang.Boolean.valueOf((boolean) ((fFloatValue > 0.0f ? 1 : (fFloatValue == 0.0f ? 0 : -1)) >>> 31)));
        return fFloatValue;
    }
}
