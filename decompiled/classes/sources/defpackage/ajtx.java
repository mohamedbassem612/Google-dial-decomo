package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajtx {
    public final defpackage.ajui a;
    public final int b;
    private final int c;

    public ajtx(java.lang.Class cls, int i, int i2) {
        this(new defpackage.ajui(defpackage.ajuh.class, cls), i, i2);
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean b() {
        return this.b == 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajtx)) {
            return false;
        }
        defpackage.ajtx ajtxVar = (defpackage.ajtx) obj;
        return this.a.equals(ajtxVar.a) && this.b == ajtxVar.b && this.c == ajtxVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(this.c != 0 ? "provider" : "direct");
        sb.append('}');
        return sb.toString();
    }

    public ajtx(defpackage.ajui ajuiVar, int i, int i2) {
        this.a = ajuiVar;
        this.b = i;
        this.c = i2;
    }
}
