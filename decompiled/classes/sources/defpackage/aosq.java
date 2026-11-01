package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aosq extends defpackage.aolj implements defpackage.aovi {
    public static final abcl b = new abcl();
    public final long a;

    public aosq(long j) {
        super(b);
        this.a = j;
    }

    @Override // defpackage.aovi
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.aolr aolrVar) {
        defpackage.aosr aosrVar = (defpackage.aosr) aolrVar.get(defpackage.aosr.b);
        java.lang.String str = aosrVar != null ? aosrVar.a : "coroutine";
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name = threadCurrentThread.getName();
        int iAc = defpackage.aoov.ac(name, " @");
        if (iAc < 0) {
            iAc = name.length();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + iAc + 10);
        java.lang.String strSubstring = name.substring(0, iAc);
        defpackage.aooh.e(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.aovi
    public final /* bridge */ /* synthetic */ void c(defpackage.aolr aolrVar, java.lang.Object obj) {
        java.lang.Thread.currentThread().setName((java.lang.String) obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.aosq) && this.a == ((defpackage.aosq) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return defpackage.anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "CoroutineId(" + this.a + ')';
    }
}
