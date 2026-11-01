package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afxw extends android.util.Property {
    public afxw(java.lang.Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int[] iArr = defpackage.afxy.a;
        return java.lang.Float.valueOf(((defpackage.afxy) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        defpackage.afxy afxyVar = (defpackage.afxy) obj;
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        afxyVar.f = fFloatValue;
        float f = fFloatValue * 6000.0f;
        java.util.List list = afxyVar.k;
        defpackage.afyg afygVar = (defpackage.afyg) list.get(0);
        float f2 = afxyVar.f * 1080.0f;
        int[] iArr = defpackage.afxy.a;
        int length = iArr.length;
        int i2 = 0;
        float interpolation = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            interpolation += afxyVar.c.getInterpolation(defpackage.afxy.h(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        afygVar.g = f2 + interpolation;
        android.animation.TimeInterpolator timeInterpolator = afxyVar.c;
        float interpolation2 = timeInterpolator.getInterpolation(defpackage.afxy.h(i, 0, 3000)) - timeInterpolator.getInterpolation(defpackage.afxy.h(i, 3000, 3000));
        afygVar.a = 0.0f;
        float[] fArr = defpackage.afxy.b;
        float f3 = ((1.0f - interpolation2) * fArr[0]) + (interpolation2 * fArr[1]);
        afygVar.b = f3;
        float f4 = afxyVar.g;
        if (f4 > 0.0f) {
            afygVar.b = f3 * (1.0f - f4);
        }
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i3 >= 4) {
                break;
            }
            float fH = defpackage.afxy.h(i, iArr[i3], 100);
            if (fH >= 0.0f && fH <= 1.0f) {
                int i4 = i3 + afxyVar.e;
                int[] iArr2 = afxyVar.d.e;
                int length3 = iArr2.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr2[i5];
                int i8 = iArr2[i6];
                ((defpackage.afyg) list.get(0)).c = defpackage.afpd.a(timeInterpolator.getInterpolation(fH), java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        afxyVar.j.invalidateSelf();
    }
}
