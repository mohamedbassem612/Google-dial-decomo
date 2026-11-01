package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahym {
    private final java.lang.String a;
    private final defpackage.ahyl b;
    private defpackage.ahyl c;
    private boolean d;

    public ahym(java.lang.String str) {
        defpackage.ahyl ahylVar = new defpackage.ahyl();
        this.b = ahylVar;
        this.c = ahylVar;
        this.d = false;
        str.getClass();
        this.a = str;
    }

    private final defpackage.ahyl h() {
        defpackage.ahyl ahylVar = new defpackage.ahyl();
        this.c.c = ahylVar;
        this.c = ahylVar;
        return ahylVar;
    }

    private final void i(java.lang.String str, java.lang.Object obj) {
        defpackage.ahyk ahykVar = new defpackage.ahyk();
        this.c.c = ahykVar;
        this.c = ahykVar;
        ahykVar.b = obj;
        ahykVar.a = str;
    }

    public final void a(java.lang.Object obj) {
        h().b = obj;
    }

    public final void b(java.lang.String str, java.lang.Object obj) {
        defpackage.ahyl ahylVarH = h();
        ahylVarH.b = obj;
        ahylVarH.a = str;
    }

    public final void c() {
        this.d = true;
    }

    public final void d(java.lang.String str, double d) {
        i(str, java.lang.String.valueOf(d));
    }

    public final void e(java.lang.String str, int i) {
        i(str, java.lang.String.valueOf(i));
    }

    public final void f(java.lang.String str, long j) {
        i(str, java.lang.String.valueOf(j));
    }

    public final void g(java.lang.String str, boolean z) {
        i(str, java.lang.String.valueOf(z));
    }

    public final java.lang.String toString() {
        boolean z = this.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        java.lang.String str = "";
        for (defpackage.ahyl ahylVar = this.b.c; ahylVar != null; ahylVar = ahylVar.c) {
            boolean z2 = ahylVar instanceof defpackage.ahyk;
            java.lang.Object obj = ahylVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                java.lang.String str2 = ahylVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                    sb.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
