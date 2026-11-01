package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afml implements defpackage.afmj {
    private final java.lang.Object a;

    public afml(defpackage.afmn afmnVar) {
        this.a = afmnVar;
        if (afmnVar.e) {
            return;
        }
        ajcq ajcqVarEU = afmnVar.c.eU(new defpackage.zpk(afmnVar, 20));
        ajcqVarEU.c(new defpackage.aekf(afmnVar, ajcqVarEU, 15), ajbm.a);
        afmnVar.e = true;
    }

    public static final int a(java.lang.String str) {
        return str == null ? defpackage.afmk.a[0] : defpackage.afmk.a[java.lang.Math.abs(str.hashCode()) % 21];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence] */
    public final java.lang.CharSequence b(defpackage.aprf aprfVar) {
        java.lang.Object string;
        java.lang.Object obj;
        if (aprfVar == null) {
            return null;
        }
        int i = 0;
        while (true) {
            java.lang.String[] strArr = (java.lang.String[]) aprfVar.a;
            if (i >= strArr.length) {
                return null;
            }
            java.lang.String str = strArr[i];
            if (str == null || str.isEmpty() || str.equals(".")) {
                string = null;
            } else if (str.length() > 2) {
                defpackage.afmn afmnVar = (defpackage.afmn) ((defpackage.afml) this.a).a;
                ahvr.bY(afmnVar.e);
                java.lang.Object obj2 = (aec) afmnVar.d.get();
                if (obj2 != null) {
                    int length = str.length();
                    obj = null;
                    for (int i2 = 0; i2 < length && obj2 != null; i2++) {
                        defpackage.afmm afmmVar = (defpackage.afmm) ((aec) obj2).get(java.lang.Character.valueOf(str.charAt(i2)));
                        if (afmmVar == null) {
                            break;
                        }
                        java.lang.Object obj3 = afmmVar.a;
                        if (obj3 != null) {
                            obj = obj3;
                        }
                        obj2 = afmmVar.b;
                    }
                } else {
                    obj = null;
                }
                if (obj == null) {
                    string = str;
                    string = str;
                    string = new java.lang.StringBuilder().appendCodePoint(str.codePointAt(0)).toString();
                } else {
                    string = str;
                    string = str;
                    string = obj;
                }
            }
            if (string != null) {
                return string;
            }
            i++;
        }
    }

    public afml(defpackage.afmj afmjVar) {
        this.a = afmjVar;
    }
}
