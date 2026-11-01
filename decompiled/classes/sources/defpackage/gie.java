package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gie {
    public static final android.os.Bundle a(android.os.Bundle bundle, java.lang.String str) {
        defpackage.aooh.f(str, "key");
        android.os.Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        hgu.L(str);
        throw new defpackage.aoiq();
    }

    public static final android.os.Bundle b(android.os.Bundle bundle, java.lang.String str) {
        defpackage.aooh.f(str, "key");
        return bundle.getBundle(str);
    }

    public static final java.util.List c(android.os.Bundle bundle, java.lang.String str) {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        java.util.ArrayList arrayListM = android.os.Build.VERSION.SDK_INT >= 34 ? ae$.ExternalSyntheticApiModelOutline0.m(bundle, str, defpackage.aooc.I(new defpackage.aooa(android.os.Bundle.class))) : bundle.getParcelableArrayList(str);
        if (arrayListM != null) {
            return arrayListM;
        }
        hgu.L(str);
        throw new defpackage.aoiq();
    }

    public static final java.util.List d(android.os.Bundle bundle, java.lang.String str) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        hgu.L(str);
        throw new defpackage.aoiq();
    }

    public static final java.util.Map e(android.os.Bundle bundle) {
        defpackage.aola aolaVar = new defpackage.aola(bundle.size());
        for (java.lang.String str : bundle.keySet()) {
            if (str == null) {
                defpackage.aooh.g();
            }
            aolaVar.put(str, bundle.get(str));
        }
        return aolaVar.e();
    }

    public static final boolean f(android.os.Bundle bundle, java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("key");
        }
        return bundle.containsKey(str);
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
