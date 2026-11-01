package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajui {
    private final java.lang.Class a;
    private final java.lang.Class b;

    public ajui(java.lang.Class cls, java.lang.Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ajui ajuiVar = (defpackage.ajui) obj;
            if (this.b.equals(ajuiVar.b)) {
                return this.a.equals(ajuiVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.a;
        java.lang.Class cls2 = this.b;
        if (cls == defpackage.ajuh.class) {
            return cls2.getName();
        }
        return "@" + cls.getName() + ' ' + cls2.getName();
    }
}
