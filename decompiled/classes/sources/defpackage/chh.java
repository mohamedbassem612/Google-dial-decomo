package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class chh {
    public static final void a(defpackage.chi chiVar, int i, java.lang.Object obj) {
        chiVar.e[(chiVar.f - chiVar.a[chiVar.b - 1].c) + i] = obj;
    }

    public static final void b(defpackage.chi chiVar, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        int i3 = chiVar.f - chiVar.a[chiVar.b - 1].c;
        java.lang.Object[] objArr = chiVar.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void c(defpackage.chi chiVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = chiVar.f - chiVar.a[chiVar.b - 1].c;
        java.lang.Object[] objArr = chiVar.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
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
