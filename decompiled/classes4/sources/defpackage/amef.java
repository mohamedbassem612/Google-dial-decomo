package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amef {
    public static final aigf a;

    static {
        aigb aigbVar = new aigb(4);
        aigbVar.i("0", "zero");
        aigbVar.i("1", "one");
        aigbVar.i("2", "two");
        aigbVar.i("3", "three");
        aigbVar.i("4", "four");
        aigbVar.i("5", "five");
        aigbVar.i("6", "six");
        aigbVar.i("7", "seven");
        aigbVar.i("8", "eight");
        aigbVar.i("9", "nine");
        aigbVar.i("#", "pound");
        aigbVar.i("*", "star");
        a = aigbVar.e(true);
    }

    public static int a(java.lang.String str, java.lang.String str2) {
        if (str.isEmpty()) {
            if (!str2.isEmpty() && !str2.equals("\u0007")) {
                return str2.length();
            }
        } else if (str2.isEmpty()) {
            if (!str.isEmpty() && !str.equals("\u0007")) {
                return str.length();
            }
        } else if (!str.equals("\u0007") && !str2.equals("\u0007")) {
            return ailn.a.bt(f(str)).w(f(str2), Integer.MAX_VALUE);
        }
        return 0;
    }

    public static aigf b(aify aifyVar, aify aifyVar2, defpackage.amec amecVar) {
        int i;
        aify aifyVarA = aifyVar.a();
        aify aifyVarA2 = aifyVar2.a();
        int size = aifyVarA.size() + 1;
        int size2 = aifyVarA2.size() + 1;
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, size, size2);
        defpackage.amwo[][] amwoVarArr = (defpackage.amwo[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) defpackage.amwo.class, size, size2);
        int i2 = 0;
        while (i2 < aifyVar.size()) {
            int i3 = i2 + 1;
            fArr[i3][0] = fArr[i2][0] + amecVar.a(i2, -1, aifyVarA, aifyVarA2);
            amwoVarArr[i3][0] = new defpackage.amwo(-1, 0);
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < aifyVar2.size()) {
            float[] fArr2 = fArr[0];
            int i5 = i4 + 1;
            fArr2[i5] = fArr2[i4] + e(-1, i4, aifyVarA, aifyVarA2);
            amwoVarArr[0][i5] = new defpackage.amwo(0, -1);
            i4 = i5;
        }
        int i6 = 0;
        while (i6 < aifyVar.size()) {
            int i7 = 0;
            while (true) {
                i = i6 + 1;
                if (i7 < aifyVar2.size()) {
                    int i8 = i7 + 1;
                    float fA = fArr[i6][i8] + amecVar.a(i6, i7, aifyVarA, aifyVarA2);
                    float fE = fArr[i][i7] + e(i6, i7, aifyVarA, aifyVarA2);
                    float fA2 = fArr[i6][i7] + a((java.lang.String) aifyVarA.get(i6), (java.lang.String) aifyVarA2.get(i7));
                    float fFloatValue = ((java.lang.Float) java.util.Collections.min(aify.r(java.lang.Float.valueOf(fA), java.lang.Float.valueOf(fE), java.lang.Float.valueOf(fA2)))).floatValue();
                    if (fFloatValue == fA2) {
                        amwoVarArr[i][i8] = new defpackage.amwo(-1, -1);
                    } else if (fFloatValue == fA) {
                        amwoVarArr[i][i8] = new defpackage.amwo(-1, 0);
                    } else {
                        amwoVarArr[i][i8] = new defpackage.amwo(0, -1);
                    }
                    fArr[i][i8] = fFloatValue;
                    i7 = i8;
                }
            }
            i6 = i;
        }
        java.util.HashMap map = new java.util.HashMap();
        int size3 = aifyVarA.size();
        int size4 = aifyVarA2.size();
        while (true) {
            if (size3 <= 0 && size4 <= 0) {
                return (aigf) j$.util.Collection.-EL.stream(map.entrySet()).collect(aido.b(new defpackage.amcr(aifyVar, 9), new defpackage.amcr(aifyVar2, 10)));
            }
            defpackage.amwo amwoVar = amwoVarArr[size3][size4];
            int i9 = amwoVar.a;
            if (i9 == -1 && amwoVar.b == -1) {
                map.put(java.lang.Integer.valueOf(size3 - 1), java.lang.Integer.valueOf(size4 - 1));
            }
            size3 += i9;
            size4 += amwoVar.b;
        }
    }

    public static float c(int i, aify aifyVar) {
        return a("", (java.lang.String) aifyVar.get(i));
    }

    public static j$.util.Optional d(aify aifyVar, aify aifyVar2) {
        j$.util.Optional optionalOf;
        int size = aifyVar2.size();
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        int i = 0;
        if (java.lang.Math.abs(aifyVar.size() - aifyVar2.size()) <= 3) {
            optionalOf = j$.util.Optional.of(aifyVar);
        } else {
            int size2 = aifyVar.size();
            int i2 = Integer.MAX_VALUE;
            int i3 = 0;
            while (i < size2) {
                int i4 = i + 1;
                int i5 = i + size;
                for (int iMax = java.lang.Math.max(i4, i5 - 3); iMax < java.lang.Math.min(i5 + 4, aifyVar.size() + 1); iMax++) {
                    aify aifyVarB = aifyVar.b(i, iMax);
                    if (!aifyVarB.isEmpty()) {
                        int iA = a(defpackage.amjk.f(aifyVarB), defpackage.amjk.f(aifyVar2)) + java.lang.Math.abs(aifyVarB.size() - aifyVar2.size());
                        if (iA < i2) {
                            optionalEmpty = j$.util.Optional.of(aifyVarB);
                            i3 = i;
                            i2 = iA;
                        }
                    }
                }
                i = i4;
            }
            optionalOf = optionalEmpty;
            i = i3;
        }
        if (!optionalOf.isPresent()) {
            return j$.util.Optional.empty();
        }
        return j$.util.Optional.of((java.util.Map) j$.util.Collection.-EL.stream(b((aify) optionalOf.get(), aifyVar2, new defpackage.ameb(2)).entrySet()).collect(aido.b(new defpackage.exw(i, 11), new defpackage.amdk(15))));
    }

    private static float e(int i, int i2, aify aifyVar, aify aifyVar2) {
        float fA = a((java.lang.String) aifyVar2.get(i2), "");
        return (i >= aifyVar.size() + (-1) || !((java.lang.String) aifyVar.get(i + 1)).equals("\u0007")) ? fA : fA * 0.3f;
    }

    private static java.lang.String f(java.lang.String str) {
        java.lang.String strReplace = str.replace("\u0007", "");
        return (java.lang.String) a.getOrDefault(strReplace, ahvr.p(strReplace));
    }
}
