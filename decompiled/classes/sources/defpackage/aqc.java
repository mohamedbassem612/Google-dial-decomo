package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aqc implements defpackage.aqb {
    @Override // defpackage.aqb
    public final float a(float f, float f2, float f3) {
        float fAbs = java.lang.Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        if (fAbs <= f3 && f3 - f4 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }

    @Override // defpackage.aqb
    public final /* synthetic */ defpackage.aiq b() {
        return defpackage.aqa.a;
    }
}
