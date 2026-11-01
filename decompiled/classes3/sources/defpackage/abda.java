package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abda extends defpackage.abcq {
    public abda() {
        super(defpackage.zvl.COMPONENT_ENABLED_SETTING_FIX, 0L);
    }

    private static android.content.ComponentName c(android.content.Context context, java.lang.String str) {
        return new android.content.ComponentName(context.getPackageName(), str);
    }

    private static int d(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 != 3) {
            throw new java.lang.UnsupportedOperationException();
        }
        return 1;
    }

    @Override // defpackage.abcq
    public final defpackage.abcv a(defpackage.abcv abcvVar, ahyn ahynVar) {
        if (!ahynVar.f() || ((defpackage.zvz) ahynVar.b()).c != 8) {
            throw new java.lang.IllegalArgumentException();
        }
        defpackage.zvz zvzVar = (defpackage.zvz) ahynVar.b();
        defpackage.zvn zvnVar = zvzVar.c == 8 ? (defpackage.zvn) zvzVar.d : defpackage.zvn.a;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = zvnVar.b.iterator();
        while (it.hasNext()) {
            if (!hashSet.add(((defpackage.zvm) it.next()).b)) {
                throw new java.lang.IllegalArgumentException("Duplicate componentName in config");
            }
        }
        android.content.Context context = abcvVar.b;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (defpackage.zvm zvmVar : zvnVar.b) {
                android.content.ComponentName componentNameC = c(context, zvmVar.b);
                int iW = a.W(zvmVar.c);
                if (iW == 0) {
                    iW = 1;
                }
                arrayList.add(new android.content.pm.PackageManager.ComponentEnabledSetting(componentNameC, d(iW), 1));
            }
            context.getPackageManager().setComponentEnabledSettings(arrayList);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i = 0;
            while (i < zvnVar.b.size()) {
                try {
                    defpackage.zvm zvmVar2 = (defpackage.zvm) zvnVar.b.get(i);
                    android.content.pm.PackageManager packageManager = context.getPackageManager();
                    android.content.ComponentName componentNameC2 = c(context, zvmVar2.b);
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentNameC2);
                    int iW2 = a.W(zvmVar2.c);
                    if (iW2 == 0) {
                        iW2 = 1;
                    }
                    packageManager.setComponentEnabledSetting(componentNameC2, d(iW2), 1);
                    arrayList2.add(java.lang.Integer.valueOf(componentEnabledSetting));
                    i++;
                } catch (java.lang.IllegalArgumentException e) {
                    android.content.pm.PackageManager packageManager2 = context.getPackageManager();
                    while (true) {
                        i--;
                        if (i < 0) {
                            throw new java.lang.IllegalArgumentException("Failed to set componentEnabled state.", e);
                        }
                        packageManager2.setComponentEnabledSetting(c(context, ((defpackage.zvm) zvnVar.b.get(i)).b), ((java.lang.Integer) arrayList2.get(i)).intValue(), 1);
                    }
                }
            }
        }
        if (zvnVar.c) {
            return abcvVar;
        }
        defpackage.abcu abcuVar = new defpackage.abcu(abcvVar);
        abcuVar.c();
        return abcuVar.a();
    }

    @Override // defpackage.abcq
    public final java.lang.String b() {
        return "COMPONENT_ENABLED_SETTING_FIX";
    }
}
