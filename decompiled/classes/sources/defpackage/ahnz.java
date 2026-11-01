package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahnz implements defpackage.ahqh {
    public final defpackage.ahqm a;

    public ahnz(defpackage.ahqm ahqmVar) {
        this.a = ahqmVar;
    }

    public static void b(defpackage.ahqy ahqyVar, int i) {
        java.lang.String strConcat;
        if ((ahqyVar.b & 32) != 0) {
            defpackage.ahna ahnaVar = ahqyVar.i;
            if (ahnaVar == null) {
                ahnaVar = defpackage.ahna.a;
            }
            if ((ahnaVar.b & 2) != 0) {
                java.util.Locale locale = java.util.Locale.US;
                java.lang.String str = ((defpackage.ahop) ahqyVar.e.get(0)).c;
                ahmy ahmyVar = ahnaVar.d;
                if (ahmyVar == null) {
                    ahmyVar = ahmy.a;
                }
                android.util.Log.println(i, "trace_manager", java.lang.String.format(locale, "Trace %s timed out before completion. %s spans remaining", str, java.lang.Integer.valueOf(ahmyVar.d)));
            }
            if ((ahnaVar.b & 1) != 0) {
                java.util.Locale locale2 = java.util.Locale.US;
                java.lang.String str2 = ((defpackage.ahop) ahqyVar.e.get(0)).c;
                ahmz ahmzVar = ahnaVar.c;
                if (ahmzVar == null) {
                    ahmzVar = ahmz.a;
                }
                android.util.Log.println(i, "trace_manager", java.lang.String.format(locale2, "Trace %s tried to log too many spans. %s spans dropped", str2, java.lang.Integer.valueOf(ahmzVar.c)));
            }
        }
        defpackage.adb adbVar = new defpackage.adb(10);
        for (defpackage.ahop ahopVar : ahqyVar.e) {
            adbVar.g(ahopVar.d, ahopVar);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < adbVar.b(); i2++) {
            defpackage.ahop ahopVar2 = (defpackage.ahop) adbVar.e(i2);
            long j = ahopVar2.d;
            java.lang.String str3 = (ahopVar2.b & 32) != 0 ? ahopVar2.h + " ms" : "unfinished";
            while (true) {
                defpackage.ahop ahopVar3 = (defpackage.ahop) adbVar.d(j);
                if (ahopVar3 == null) {
                    strConcat = "Orphaned Root > ".concat(str3);
                    break;
                }
                long j2 = ahopVar3.e;
                str3 = ahopVar3.c + " > " + str3;
                if (j2 == -1) {
                    strConcat = str3;
                    break;
                }
                j = j2;
            }
            arrayList.add(java.lang.String.format(java.util.Locale.US, "%06d\t%s", java.lang.Long.valueOf(ahopVar2.f), strConcat));
        }
        java.util.Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            android.util.Log.println(i, "trace_manager", (java.lang.String) arrayList.get(i3));
        }
    }

    @Override // defpackage.ahqh
    public final void a(defpackage.ahqy ahqyVar, android.util.SparseArray sparseArray) {
        if (android.util.Log.isLoggable("trace_manager", 2)) {
            b(ahqyVar, 2);
        }
    }
}
