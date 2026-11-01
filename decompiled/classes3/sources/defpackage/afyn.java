package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afyn extends android.util.Property {
    public afyn(java.lang.Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int i = defpackage.afyo.f;
        return java.lang.Float.valueOf(((defpackage.afyo) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.afyo afyoVar = (defpackage.afyo) obj;
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        afyoVar.e = fFloatValue;
        java.util.List list = afyoVar.k;
        ((defpackage.afyg) list.get(0)).a = 0.0f;
        defpackage.afyg afygVar = (defpackage.afyg) list.get(0);
        defpackage.afyg afygVar2 = (defpackage.afyg) list.get(1);
        emd emdVar = afyoVar.a;
        float fH = defpackage.afyo.h((int) (fFloatValue * 333.0f), 0, 667);
        float interpolation = emdVar.getInterpolation(fH);
        afygVar2.a = interpolation;
        afygVar.b = interpolation;
        defpackage.afyg afygVar3 = (defpackage.afyg) list.get(1);
        defpackage.afyg afygVar4 = (defpackage.afyg) list.get(2);
        float interpolation2 = emdVar.getInterpolation(fH + 0.49925038f);
        afygVar4.a = interpolation2;
        afygVar3.b = interpolation2;
        ((defpackage.afyg) list.get(2)).b = 1.0f;
        if (afyoVar.d && ((defpackage.afyg) list.get(1)).b < 1.0f) {
            ((defpackage.afyg) list.get(2)).c = ((defpackage.afyg) list.get(1)).c;
            ((defpackage.afyg) list.get(1)).c = ((defpackage.afyg) list.get(0)).c;
            ((defpackage.afyg) list.get(0)).c = afyoVar.b.e[afyoVar.c];
            afyoVar.d = false;
        }
        afyoVar.j.invalidateSelf();
    }
}
