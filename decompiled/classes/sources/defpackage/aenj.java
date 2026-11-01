package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aenj {
    public final java.lang.String a;

    public aenj(java.lang.String str) {
        this.a = str;
    }

    public static defpackage.aenj a(defpackage.aenj aenjVar, defpackage.aenj aenjVar2) {
        return new defpackage.aenj(java.lang.String.valueOf(aenjVar.a).concat(java.lang.String.valueOf(aenjVar2.a)));
    }

    public static defpackage.aenj b(defpackage.aenj aenjVar, defpackage.aenj... aenjVarArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(aenjVar.a);
        for (defpackage.aenj aenjVar2 : aenjVarArr) {
            sb.append(aenjVar2.a);
        }
        return new defpackage.aenj(sb.toString());
    }

    public static defpackage.aenj c(java.lang.String str, java.lang.Enum r2) {
        if (defpackage.ahvr.cp(str)) {
            return new defpackage.aenj(r2.name());
        }
        return new defpackage.aenj(java.lang.String.valueOf(str).concat(java.lang.String.valueOf(r2.name())));
    }

    public static java.lang.String d(defpackage.aenj aenjVar) {
        if (aenjVar == null) {
            return null;
        }
        return aenjVar.a;
    }

    public static defpackage.aenj e(java.lang.Class cls) {
        return new defpackage.aenj(cls.getSimpleName());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aenj) {
            return this.a.equals(((defpackage.aenj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
