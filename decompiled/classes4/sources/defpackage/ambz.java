package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ambz {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCacheMatchProcessor");
    public static final ahzf b = ahzf.c(ahxm.b).a().f();
    public static final aify c = aify.q("press", "select");

    public static float a(java.lang.String str, java.lang.String str2) {
        int iMax = java.lang.Math.max(str.length(), str2.length());
        if (iMax == 0) {
            return 0.0f;
        }
        return defpackage.amef.a(str, str2) / iMax;
    }

    public static boolean b(java.lang.String str) {
        return j$.util.Collection.-EL.stream(aify.n(defpackage.amef.a.c())).anyMatch(new defpackage.alks(str, 20));
    }

    static final float c(int i, int i2, aify aifyVar, defpackage.amdp amdpVar) {
        return (i + e(i2, aifyVar, amdpVar)) / aifyVar.size();
    }

    static final float d(int i, java.util.Map map, aigf aigfVar, aify aifyVar, defpackage.amdp amdpVar) {
        int size = aifyVar.size();
        int i2 = amdpVar.h;
        int iMax = java.lang.Math.max(0, size - i2);
        int iIntValue = map.isEmpty() ? 0 : (((java.lang.Integer) java.util.Collections.max(map.keySet())).intValue() + 1) - i2;
        int size2 = aifyVar.size() - iMax;
        if (size2 <= 3) {
            return 1.0f;
        }
        aike aikeVarX = aify.x(j$.util.Comparator.-CC.reverseOrder(), map.keySet());
        int i3 = 0;
        for (int i4 = 0; i4 < i2 && i4 < aikeVarX.d; i4++) {
            java.lang.Integer num = (java.lang.Integer) aikeVarX.get(i4);
            if (num.intValue() < iIntValue || ((java.lang.Integer) aigfVar.get(num)).intValue() < iMax) {
                break;
            }
            if (((java.lang.Boolean) map.get(num)).booleanValue()) {
                i3++;
            }
        }
        return (i3 + e(i, aifyVar, amdpVar)) / size2;
    }

    private static final int e(int i, aify aifyVar, defpackage.amdp amdpVar) {
        return java.lang.Math.min((aifyVar.size() - 1) - i, amdpVar.l);
    }
}
