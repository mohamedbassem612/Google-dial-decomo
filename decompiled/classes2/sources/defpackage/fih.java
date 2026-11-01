package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fih extends defpackage.fim {
    public static final java.util.Comparator a = new defpackage.djh(8);
    public final android.content.Context b;
    public defpackage.fib c;
    public defpackage.fib d;
    public volatile java.lang.Thread e;
    public defpackage.epu f;
    public java.lang.Boolean g;
    public defpackage.aeic h;
    public final defpackage.oq i;

    public fih(android.content.Context context) {
        defpackage.oq oqVar = new defpackage.oq(null, null, null);
        defpackage.fib fibVar = defpackage.fib.J;
        this.b = context != null ? context.getApplicationContext() : null;
        this.i = oqVar;
        if (!(fibVar instanceof defpackage.fib)) {
            defpackage.fia fiaVar = new defpackage.fia(fibVar);
            fiaVar.b(fibVar);
            fibVar = new defpackage.fib(fiaVar);
        }
        this.c = fibVar;
        this.d = fibVar;
        this.f = defpackage.epu.a;
        if (fibVar.U && context == null) {
            defpackage.etr.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(defpackage.eqg eqgVar, aify aifyVar) {
        for (int i = 0; i < ((aike) aifyVar).d; i++) {
            int i2 = 0;
            while (true) {
                java.util.List list = eqgVar.c;
                if (i2 < list.size()) {
                    if (((defpackage.eqi) list.get(i2)).b.equals(aifyVar.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected static int b(defpackage.eqg eqgVar, java.lang.String str, boolean z) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(eqgVar.d)) {
            return 4;
        }
        java.lang.String strD = d(str);
        java.lang.String strD2 = d(eqgVar.d);
        if (strD2 == null || strD == null) {
            if (z && strD2 == null) {
                return 1;
            }
        } else {
            if (strD2.startsWith(strD) || strD.startsWith(strD2)) {
                return 3;
            }
            java.lang.String str2 = eum.a;
            if (strD2.split("-", 2)[0].equals(strD.split("-", 2)[0])) {
                return 2;
            }
        }
        return 0;
    }

    public static int c(int i, int i2) {
        return (i == 0 || i != i2) ? java.lang.Integer.bitCount(i & i2) : androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected static java.lang.String d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static final android.util.Pair g(int i, tgf tgfVar, int[][][] iArr, defpackage.fie fieVar, java.util.Comparator comparator) {
        aify aifyVarP;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < tgfVar.a; i2++) {
            if (i == tgfVar.f(i2)) {
                defpackage.fhg fhgVarH = tgfVar.h(i2);
                for (int i3 = 0; i3 < fhgVarH.b; i3++) {
                    defpackage.ern ernVarB = fhgVarH.b(i3);
                    java.util.List listA = fieVar.a(i2, ernVarB, iArr[i2][i3]);
                    int i4 = ernVarB.a;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        defpackage.fif fifVar = (defpackage.fif) listA.get(i5);
                        int iB = fifVar.b();
                        if (!zArr[i5] && iB != 0) {
                            boolean z = true;
                            if (iB == 1) {
                                aifyVarP = aify.p(fifVar);
                            } else {
                                aify arrayList2 = new java.util.ArrayList();
                                arrayList2.add(fifVar);
                                int i7 = i6;
                                while (i7 < i4) {
                                    boolean z2 = z;
                                    defpackage.fif fifVar2 = (defpackage.fif) listA.get(i7);
                                    if (fifVar2.b() == 2 && fifVar.c(fifVar2)) {
                                        arrayList2.add(fifVar2);
                                        zArr[i7] = z2;
                                    }
                                    i7++;
                                    z = z2;
                                }
                                aifyVarP = arrayList2;
                            }
                            arrayList.add(aifyVarP);
                        }
                        i5 = i6;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) java.util.Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((defpackage.fif) list.get(i8)).c;
        }
        defpackage.fif fifVar3 = (defpackage.fif) list.get(0);
        return android.util.Pair.create(new defpackage.kvt(fifVar3.b, iArr2), java.lang.Integer.valueOf(fifVar3.a));
    }

    public static void h(tgf tgfVar, defpackage.err errVar) {
        int i;
        java.util.HashMap map = new java.util.HashMap();
        int i2 = 0;
        while (true) {
            i = tgfVar.a;
            if (i2 >= i) {
                break;
            }
            n(tgfVar.h(i2), errVar);
            i2++;
        }
        n((defpackage.fhg) tgfVar.b, errVar);
        for (int i3 = 0; i3 < i; i3++) {
            if (((defpackage.ero) map.get(java.lang.Integer.valueOf(tgfVar.f(i3)))) != null) {
                throw null;
            }
        }
    }

    public static android.util.Pair i(defpackage.kvt[] kvtVarArr, int i) {
        for (int i2 = 0; i2 < kvtVarArr.length; i2++) {
            defpackage.kvt kvtVar = kvtVarArr[i2];
            if (kvtVar != null && ((defpackage.ern) kvtVar.b).c == i) {
                return android.util.Pair.create(kvtVar, java.lang.Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static final defpackage.kvt j(defpackage.fhg fhgVar, int[][] iArr, defpackage.fib fibVar) {
        int i = fibVar.w.b;
        int i2 = 0;
        defpackage.ern ernVar = null;
        defpackage.fhz fhzVar = null;
        for (int i3 = 0; i3 < fhgVar.b; i3++) {
            defpackage.ern ernVarB = fhgVar.b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < ernVarB.a; i4++) {
                if (defpackage.hgt.aw(iArr2[i4], fibVar.V)) {
                    defpackage.fhz fhzVar2 = new defpackage.fhz(ernVarB.a(i4), iArr2[i4]);
                    if (fhzVar == null || fhzVar2.compareTo(fhzVar) > 0) {
                        ernVar = ernVarB;
                        i2 = i4;
                        fhzVar = fhzVar2;
                    }
                }
            }
        }
        if (ernVar != null) {
            return new defpackage.kvt(ernVar, new int[]{i2});
        }
        return null;
    }

    public static void k(tgf tgfVar, defpackage.fib fibVar, defpackage.kvt[] kvtVarArr) {
        for (int i = 0; i < tgfVar.a; i++) {
            defpackage.fhg fhgVarH = tgfVar.h(i);
            android.util.SparseArray sparseArray = fibVar.Z;
            java.util.Map map = (java.util.Map) sparseArray.get(i);
            if (map != null && map.containsKey(fhgVarH)) {
                java.util.Map map2 = (java.util.Map) sparseArray.get(i);
                if ((map2 != null ? (defpackage.fic) map2.get(fhgVarH) : null) != null) {
                    throw null;
                }
                kvtVarArr[i] = null;
            }
        }
    }

    public static void l(tgf tgfVar, defpackage.fib fibVar, defpackage.kvt[] kvtVarArr) {
        for (int i = 0; i < tgfVar.a; i++) {
            int iF = tgfVar.f(i);
            if (fibVar.a(i) || fibVar.I.contains(java.lang.Integer.valueOf(iF))) {
                kvtVarArr[i] = null;
            }
        }
    }

    private static void n(defpackage.fhg fhgVar, defpackage.err errVar) {
        for (int i = 0; i < fhgVar.b; i++) {
            if (((defpackage.ero) errVar.H.get(fhgVar.b(i))) != null) {
                throw null;
            }
        }
    }

    public final void e() {
        defpackage.aeic aeicVar;
        if (!this.d.U || android.os.Build.VERSION.SDK_INT < 32 || (aeicVar = this.h) == null || !aeicVar.a) {
            return;
        }
        m(null);
    }

    public final void f(defpackage.fib fibVar) {
        boolean zEquals = this.c.equals(fibVar);
        this.c = fibVar;
        if (zEquals) {
            return;
        }
        if (fibVar.U && this.b == null) {
            defpackage.etr.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m(fibVar);
    }
}
