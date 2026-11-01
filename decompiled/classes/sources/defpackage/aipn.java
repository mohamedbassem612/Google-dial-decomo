package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aipn {
    public final defpackage.aira a;
    public final java.lang.String b;

    public aipn(defpackage.aira airaVar, java.lang.String str) {
        defpackage.aiql.l(airaVar, "parser");
        this.a = airaVar;
        defpackage.aiql.l(str, "message");
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aipn)) {
            return false;
        }
        defpackage.aipn aipnVar = (defpackage.aipn) obj;
        return this.a.equals(aipnVar.a) && this.b.equals(aipnVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
