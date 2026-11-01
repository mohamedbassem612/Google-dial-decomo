package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqq {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final defpackage.eqn c;
    public final java.util.List e;
    public final aify g;
    public final java.lang.Object h;
    public final long i;
    public final defpackage.eqj d = null;
    public final java.lang.String f = null;

    static {
        eum.a;
    }

    public eqq(android.net.Uri uri, java.lang.String str, defpackage.eqn eqnVar, java.util.List list, aify aifyVar, long j) {
        this.a = uri;
        this.b = defpackage.eqz.d(str);
        this.c = eqnVar;
        this.e = list;
        this.g = aifyVar;
        aift aiftVar = new aift(4);
        if (((aike) aifyVar).d > 0) {
            throw null;
        }
        aiftVar.h();
        this.h = null;
        this.i = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eqq) {
            defpackage.eqq eqqVar = (defpackage.eqq) obj;
            if (this.a.equals(eqqVar.a) && j$.util.Objects.equals(this.b, eqqVar.b) && j$.util.Objects.equals(this.c, eqqVar.c)) {
                defpackage.eqj eqjVar = eqqVar.d;
                if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && this.e.equals(eqqVar.e)) {
                    java.lang.String str = eqqVar.f;
                    if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && ahvr.aP(this.g, eqqVar.g)) {
                        java.lang.Object obj2 = eqqVar.h;
                        if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && this.i == eqqVar.i) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        defpackage.eqn eqnVar = this.c;
        return (int) ((((long) ((((((iHashCode2 + (eqnVar != null ? eqnVar.hashCode() : 0)) * 961) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31)) * 31) + this.i);
    }
}
