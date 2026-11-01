package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gor {
    public static final defpackage.gor a;
    public final defpackage.gon b;
    public final defpackage.goq c;
    public final defpackage.goq d;

    static {
        defpackage.gon gonVar = defpackage.gon.b;
        defpackage.goq goqVar = defpackage.goq.b;
        a = new defpackage.gor(gonVar, goqVar, goqVar);
        new defpackage.gor(defpackage.gon.b, defpackage.goq.b, defpackage.goq.c);
        new defpackage.gor(defpackage.gon.a, defpackage.goq.c, defpackage.goq.b);
        new defpackage.gor(defpackage.gon.d, defpackage.goq.b, defpackage.goq.c);
        new defpackage.gor(defpackage.gon.c, defpackage.goq.c, defpackage.goq.b);
    }

    public gor(defpackage.gon gonVar, defpackage.goq goqVar, defpackage.goq goqVar2) {
        aooh.f(gonVar, "alignment");
        aooh.f(goqVar, "width");
        aooh.f(goqVar2, "height");
        this.b = gonVar;
        this.c = goqVar;
        this.d = goqVar2;
    }

    public static final defpackage.gpy c(defpackage.gqd gqdVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : gqdVar.a) {
            if (obj instanceof defpackage.gpy) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (defpackage.gpy) arrayList.get(0);
        }
        return null;
    }

    public final boolean a(defpackage.gqd gqdVar) {
        if (!aooh.n(this.d, defpackage.goq.c)) {
            return false;
        }
        defpackage.gpy gpyVarC = c(gqdVar);
        return gpyVarC == null || !aooh.n(gpyVarC.b(), defpackage.gpv.b) || ajsz.bb(new defpackage.gon[]{defpackage.gon.a, defpackage.gon.c}).contains(this.b);
    }

    public final boolean b(defpackage.gqd gqdVar) {
        if (!aooh.n(this.c, defpackage.goq.c)) {
            return false;
        }
        defpackage.gpy gpyVarC = c(gqdVar);
        return gpyVarC == null || !aooh.n(gpyVarC.b(), defpackage.gpv.a) || ajsz.bb(new defpackage.gon[]{defpackage.gon.b, defpackage.gon.d}).contains(this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gor) {
            defpackage.gor gorVar = (defpackage.gor) obj;
            if (aooh.n(this.b, gorVar.b) && aooh.n(this.c, gorVar.c) && aooh.n(this.d, gorVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.e * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "Bounds:{alignment=" + this.b + ", width=" + this.c + ", height=" + this.d + '}';
    }
}
