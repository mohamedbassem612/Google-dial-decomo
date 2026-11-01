package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class adhw implements java.lang.Comparable {
    private static final defpackage.ahzf a = defpackage.ahzf.b(':').f().a();
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: Thrown type has an unknown type hierarchy: adht */
    public static defpackage.adhw d(java.lang.String str) throws adht {
        java.util.List listJ = a.j(str);
        if (listJ.size() == 2) {
            return new defpackage.adhb((java.lang.String) listJ.get(0), (java.lang.String) listJ.get(1));
        }
        throw new adht("Invalid input: ".concat(java.lang.String.valueOf(str)));
    }

    public static final java.lang.String f(java.lang.String str, java.lang.String str2) {
        return str + ':' + str2;
    }

    public abstract java.lang.String a();

    public abstract java.lang.String b();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.adhw adhwVar) {
        int iCompareTo = b().compareTo(adhwVar.b());
        return iCompareTo == 0 ? a().compareTo(adhwVar.a()) : iCompareTo;
    }

    public final java.lang.String e(boolean z) {
        boolean zContains;
        java.lang.String strB = b();
        synchronized (defpackage.adik.b) {
            zContains = defpackage.adik.a.contains(strB);
        }
        java.lang.String strA = zContains ? "redacted" : a();
        return z ? f(strB, strA) : strA;
    }

    public java.lang.String toString() {
        return f(b(), a());
    }
}
