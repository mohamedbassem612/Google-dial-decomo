package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpw {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    private static volatile defpackage.aed c = new defpackage.aed(null);
    private static final java.lang.Object[] d;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        d = objArr;
        synchronized (objArr) {
            c(c, 1.15f, new defpackage.dpx(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            c(c, 1.3f, new defpackage.dpx(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            c(c, 1.5f, new defpackage.dpx(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            c(c, 1.8f, new defpackage.dpx(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            c(c, 2.0f, new defpackage.dpx(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((c.b(0) / 100.0f) - 0.01f <= 1.03f) {
            dpm.b("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static final defpackage.dpv a(float f) {
        defpackage.dpv dpxVar;
        float f2;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        defpackage.dpv dpvVar = (defpackage.dpv) aee.a(c, i);
        if (dpvVar != null) {
            return dpvVar;
        }
        int iA = c.a(i);
        defpackage.aed aedVar = c;
        if (iA >= 0) {
            return (defpackage.dpv) aedVar.e(iA);
        }
        int i2 = -(iA + 1);
        int i3 = i2 - 1;
        if (i2 >= aedVar.c()) {
            defpackage.dpx dpxVar2 = new defpackage.dpx(new float[]{1.0f}, new float[]{f});
            b(f, dpxVar2);
            return dpxVar2;
        }
        if (i3 < 0) {
            float[] fArr = b;
            dpxVar = new defpackage.dpx(fArr, fArr);
            f2 = 1.0f;
        } else {
            float fB = c.b(i3);
            dpxVar = (defpackage.dpv) c.e(i3);
            f2 = fB / 100.0f;
        }
        float f3 = dnv.f(0.0f, 1.0f, f2, c.b(i2) / 100.0f, f);
        defpackage.dpv dpvVar2 = (defpackage.dpv) c.e(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = b[i4];
            float fB2 = dpxVar.b(f4);
            fArr2[i4] = fB2 + ((dpvVar2.b(f4) - fB2) * f3);
        }
        defpackage.dpx dpxVar3 = new defpackage.dpx(b, fArr2);
        b(f, dpxVar3);
        return dpxVar3;
    }

    private static final void b(float f, defpackage.dpv dpvVar) {
        synchronized (d) {
            defpackage.aed aedVarClone = c.clone();
            aedVarClone.f((int) (f * 100.0f), dpvVar);
            c = aedVarClone;
        }
    }

    private static final void c(defpackage.aed aedVar, float f, defpackage.dpv dpvVar) {
        aedVar.f((int) (f * 100.0f), dpvVar);
    }
}
