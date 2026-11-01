package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amul {
    public static final defpackage.amul a;
    public static final defpackage.amul b;
    public static final defpackage.amul c;
    public static final defpackage.amul d;
    public final java.lang.String e;

    static {
        defpackage.amul amulVar = defpackage.amuf.a;
        a = defpackage.amuf.a;
        b = defpackage.amuf.b;
        c = defpackage.amuf.c;
        d = defpackage.amuf.d;
        int i = defpackage.amug.a;
        int i2 = defpackage.amuh.a;
        int i3 = defpackage.amui.a;
        int i4 = defpackage.amuj.a;
        int i5 = defpackage.amuk.a;
    }

    public amul(java.lang.String str) {
        this.e = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.amul) {
            return this.e.equals(((defpackage.amul) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "<" + getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " name=" + this.e + '>';
    }
}
