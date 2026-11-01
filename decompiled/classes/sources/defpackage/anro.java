package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anro {
    public static final defpackage.anro a;
    public final int b;

    static {
        defpackage.anrn anrnVar = new defpackage.anrn(0);
        anrnVar.b(1);
        a = anrnVar.a();
    }

    public anro(int i) {
        this.b = i;
    }

    public final defpackage.anrn a() {
        return new defpackage.anrn(this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.b == ((defpackage.anro) obj).b;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "BindServiceFlags{" + java.lang.Integer.toHexString(this.b) + '}';
    }
}
