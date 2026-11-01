package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afyr extends android.util.Property {
    public afyr(java.lang.Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int[] iArr = defpackage.afys.a;
        return java.lang.Float.valueOf(((defpackage.afys) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list;
        defpackage.afys afysVar = (defpackage.afys) obj;
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        afysVar.g = fFloatValue;
        float f = fFloatValue * 1800.0f;
        int i = 0;
        while (true) {
            list = afysVar.k;
            if (i >= list.size()) {
                break;
            }
            int i2 = (int) f;
            defpackage.afyg afygVar = (defpackage.afyg) list.get(i);
            int[] iArr = defpackage.afys.b;
            int i3 = i << 1;
            int i4 = iArr[i3];
            int[] iArr2 = defpackage.afys.a;
            float fH = defpackage.afys.h(i2, i4, iArr2[i3]);
            android.view.animation.Interpolator[] interpolatorArr = afysVar.c;
            afygVar.a = dzk.A(interpolatorArr[i3].getInterpolation(fH), 0.0f, 1.0f);
            int i5 = i3 + 1;
            afygVar.b = dzk.A(interpolatorArr[i5].getInterpolation(defpackage.afys.h(i2, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
            i++;
        }
        if (afysVar.f) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((defpackage.afyg) it.next()).c = afysVar.d.e[afysVar.e];
            }
            afysVar.f = false;
        }
        afysVar.j.invalidateSelf();
    }
}
