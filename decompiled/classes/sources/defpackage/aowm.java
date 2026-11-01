package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aowm {
    public static final defpackage.aowl a = new defpackage.aowl();
    public final java.lang.Object b;

    public /* synthetic */ aowm(java.lang.Object obj) {
        this.b = obj;
    }

    public static final java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof defpackage.aowl) {
            return null;
        }
        return obj;
    }

    public static final java.lang.Throwable b(java.lang.Object obj) {
        defpackage.aowk aowkVar = obj instanceof defpackage.aowk ? (defpackage.aowk) obj : null;
        if (aowkVar != null) {
            return aowkVar.a;
        }
        return null;
    }

    public static final boolean c(java.lang.Object obj) {
        return !(obj instanceof defpackage.aowl);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aowm) && defpackage.aooh.n(this.b, ((defpackage.aowm) obj).b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        return obj instanceof defpackage.aowk ? ((defpackage.aowk) obj).toString() : defpackage.a.bF((byte) 41, obj, "Value(");
    }
}
