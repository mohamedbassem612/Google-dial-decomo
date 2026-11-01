package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahla {
    public final defpackage.ahmq a;

    public ahla(defpackage.ahmq ahmqVar) {
        this.a = ahmqVar;
    }

    public static defpackage.ahla a(java.lang.String str) {
        defpackage.akzx akzxVarM = defpackage.ahmq.a.m();
        akzxVarM.u();
        defpackage.ahmq ahmqVar = (defpackage.ahmq) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        ahmqVar.b |= 1;
        ahmqVar.c = str;
        return new defpackage.ahla((defpackage.ahmq) akzxVarM.r());
    }

    public final java.lang.String b() {
        return this.a.c;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ahla) && this.a.c.equals(((defpackage.ahla) obj).a.c);
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("SyncKey[name=%s]", b());
    }
}
