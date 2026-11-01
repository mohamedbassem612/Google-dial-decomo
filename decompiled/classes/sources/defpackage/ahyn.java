package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ahyn implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    public static defpackage.ahyn g(java.lang.Object obj) {
        return obj == null ? defpackage.ahwt.a : new defpackage.ahys(obj);
    }

    public static defpackage.ahyn h(java.lang.Object obj) {
        obj.getClass();
        return new defpackage.ahys(obj);
    }

    public abstract defpackage.ahyn a(defpackage.ahyc ahycVar);

    public abstract java.lang.Object b();

    public abstract java.lang.Object c(defpackage.ahzi ahziVar);

    public abstract java.lang.Object d(java.lang.Object obj);

    public abstract java.lang.Object e();

    public abstract boolean equals(java.lang.Object obj);

    public abstract boolean f();

    public abstract int hashCode();

    public abstract java.lang.String toString();
}
