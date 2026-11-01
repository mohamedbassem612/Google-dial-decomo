package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apz implements defpackage.aqb {
    @Override // defpackage.aqb
    public final /* synthetic */ float a(float f, float f2, float f3) {
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return java.lang.Math.abs(f) >= java.lang.Math.abs(f5) ? f5 : f;
    }

    @Override // defpackage.aqb
    public final /* synthetic */ defpackage.aiq b() {
        return defpackage.aqa.a;
    }
}
