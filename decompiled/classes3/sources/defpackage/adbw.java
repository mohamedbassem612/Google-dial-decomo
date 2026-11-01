package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adbw {
    public final boolean a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public adbw(boolean z, java.lang.Object obj, java.lang.Object obj2) {
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }

    public static boolean d(defpackage.adbw adbwVar, defpackage.adbw adbwVar2, java.util.Comparator comparator) {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (adbwVar == null || !adbwVar.a || (obj = adbwVar.b) == null || adbwVar2 == null || !adbwVar2.a || (obj2 = adbwVar2.b) == null) {
            return anty.H(adbwVar, adbwVar2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) obj);
        java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) obj2);
        java.util.Collections.sort(arrayList, comparator);
        java.util.Collections.sort(arrayList2, comparator);
        return arrayList.equals(arrayList2);
    }

    public final java.lang.Object a() {
        if (this.a) {
            return this.b;
        }
        throw new java.lang.IllegalStateException("Either was not left");
    }

    public final java.lang.Object b() {
        if (c()) {
            return this.c;
        }
        throw new java.lang.IllegalStateException("Either was not right");
    }

    public final boolean c() {
        return !this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adbw)) {
            return false;
        }
        defpackage.adbw adbwVar = (defpackage.adbw) obj;
        if (this.a) {
            if (!adbwVar.a || !anty.H(a(), adbwVar.a())) {
                return false;
            }
        } else if (!adbwVar.c() || !anty.H(b(), adbwVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), this.b, this.c});
    }
}
