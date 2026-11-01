package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class anop extends defpackage.anod {
    private static final defpackage.anpr a = new defpackage.anpr(new defpackage.anoo());

    public defpackage.anpr b(java.util.Map map) {
        return a;
    }

    public abstract java.lang.String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym(getClass().getSimpleName());
        ahymVar.b("policy", c());
        ahymVar.e("priority", 5);
        ahymVar.g("available", true);
        return ahymVar.toString();
    }
}
