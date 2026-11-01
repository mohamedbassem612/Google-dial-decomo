package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afxr extends android.util.Property {
    public afxr(java.lang.Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int[] iArr = defpackage.afxt.a;
        return java.lang.Float.valueOf(((defpackage.afxt) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        defpackage.afxt afxtVar = (defpackage.afxt) obj;
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        afxtVar.g = fFloatValue;
        float f = fFloatValue * 5400.0f;
        java.util.List list = afxtVar.k;
        defpackage.afyg afygVar = (defpackage.afyg) list.get(0);
        float f2 = afxtVar.g * 1520.0f;
        afygVar.a = (-20.0f) + f2;
        afygVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            float fH = defpackage.afxt.h(i, defpackage.afxt.a[i2], 667);
            float f3 = afygVar.b;
            emd emdVar = afxtVar.d;
            afygVar.b = f3 + (emdVar.getInterpolation(fH) * 250.0f);
            afygVar.a += emdVar.getInterpolation(defpackage.afxt.h(i, defpackage.afxt.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f4 = afygVar.a;
        float f5 = afygVar.b;
        float f6 = f4 + ((f5 - f4) * afxtVar.h);
        afygVar.a = f6;
        afygVar.a = f6 / 360.0f;
        afygVar.b = f5 / 360.0f;
        for (int i3 = 0; i3 < 4; i3++) {
            float fH2 = defpackage.afxt.h(i, defpackage.afxt.c[i3], 333);
            if (fH2 > 0.0f && fH2 < 1.0f) {
                int i4 = i3 + afxtVar.f;
                int[] iArr = afxtVar.e.e;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((defpackage.afyg) list.get(0)).c = defpackage.afpd.a(afxtVar.d.getInterpolation(fH2), java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i8)).intValue();
                break;
            }
        }
        afxtVar.j.invalidateSelf();
    }
}
