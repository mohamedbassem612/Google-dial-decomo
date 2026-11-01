package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ere {
    public static final /* synthetic */ int b = 0;
    public final defpackage.eqd a;

    static {
        int i = defpackage.erd.a;
        defpackage.erd.a(new ygq((byte[]) null));
        java.lang.String str = eum.a;
    }

    public ere(defpackage.eqd eqdVar) {
        this.a = eqdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ere) {
            return this.a.equals(((defpackage.ere) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
