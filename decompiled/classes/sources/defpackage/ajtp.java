package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajtp {
    public final java.lang.String a;
    public final java.util.Set b;
    public final java.util.Set c;
    public final int d;
    public final int e;
    public final defpackage.ajtr f;
    public final java.util.Set g;

    public ajtp(java.lang.String str, java.util.Set set, java.util.Set set2, int i, int i2, defpackage.ajtr ajtrVar, java.util.Set set3) {
        this.a = str;
        this.b = j$.util.DesugarCollections.unmodifiableSet(set);
        this.c = j$.util.DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ajtrVar;
        this.g = j$.util.DesugarCollections.unmodifiableSet(set3);
    }

    public static defpackage.ajto a(defpackage.ajui ajuiVar) {
        return new defpackage.ajto(ajuiVar, new defpackage.ajui[0]);
    }

    public static defpackage.ajto b(java.lang.Class cls) {
        return new defpackage.ajto(cls, new java.lang.Class[0]);
    }

    public static defpackage.ajto c(java.lang.Class cls) {
        defpackage.ajto ajtoVarB = b(cls);
        ajtoVarB.b = 1;
        return ajtoVarB;
    }

    public static defpackage.ajtp d(java.lang.Object obj, java.lang.Class cls) {
        defpackage.ajto ajtoVarC = c(cls);
        ajtoVarC.c = new defpackage.ajtn(obj, 1);
        return ajtoVarC.a();
    }

    @java.lang.SafeVarargs
    public static defpackage.ajtp e(java.lang.Object obj, java.lang.Class cls, java.lang.Class... clsArr) {
        defpackage.ajto ajtoVar = new defpackage.ajto(cls, clsArr);
        ajtoVar.c = new defpackage.ajtn(obj, 0);
        return ajtoVar.a();
    }

    public final boolean f() {
        return this.e == 0;
    }

    public final java.lang.String toString() {
        return "Component<" + java.util.Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + java.util.Arrays.toString(this.c.toArray()) + '}';
    }
}
