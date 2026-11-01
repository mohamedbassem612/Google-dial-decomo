package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ainp {
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    private final java.lang.Class e;

    public ainp(java.lang.String str, java.lang.Class cls, boolean z, boolean z2) {
        if (!defpackage.aiql.k(str.charAt(0))) {
            throw new java.lang.IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!defpackage.aiql.k(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                throw new java.lang.IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.a = str;
        this.e = cls;
        this.b = z;
        this.c = z2;
        int iIdentityHashCode = java.lang.System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.d = j;
    }

    public void a(java.util.Iterator it, defpackage.aino ainoVar) {
        while (it.hasNext()) {
            b(it.next(), ainoVar);
        }
    }

    public void b(java.lang.Object obj, defpackage.aino ainoVar) {
        ainoVar.a(this.a, obj);
    }

    public final java.lang.Object c(java.lang.Object obj) {
        return this.e.cast(obj);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.e;
        return getClass().getName() + '/' + this.a + '[' + cls.getName() + ']';
    }
}
