package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class trv {
    public static final defpackage.trv a = new defpackage.trv();
    private static final java.util.Set b = ajsz.cW(new defpackage.trt[]{defpackage.trt.ENROLLMENT_STATUS_MANUAL_ENROLLED_FROM_SETTINGS, defpackage.trt.ENROLLMENT_STATUS_AUTO_ENROLLED_FROM_PROMO, defpackage.trt.ENROLLMENT_STATUS_MANUAL_ENROLLED_FROM_JOYBALL});

    public final boolean a(tru truVar) {
        aooh.f(truVar, "<this>");
        defpackage.trt trtVarB = defpackage.trt.b(truVar.c);
        if (trtVarB == null) {
            trtVarB = defpackage.trt.UNRECOGNIZED;
        }
        return trtVarB != defpackage.trt.ENROLLMENT_STATUS_UNKNOWN;
    }

    public final boolean b(defpackage.trt trtVar) {
        return b.contains(trtVar);
    }
}
