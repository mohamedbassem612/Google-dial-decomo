package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class annm {
    public final java.lang.String a;
    public final defpackage.annl b;
    public final long c;
    public final defpackage.anny d = null;
    public final defpackage.anny e;

    public annm(java.lang.String str, defpackage.annl annlVar, long j, defpackage.anny annyVar) {
        this.a = str;
        this.b = annlVar;
        this.c = j;
        this.e = annyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.annm)) {
            return false;
        }
        defpackage.annm annmVar = (defpackage.annm) obj;
        if (!j$.util.Objects.equals(this.a, annmVar.a) || !j$.util.Objects.equals(this.b, annmVar.b) || this.c != annmVar.c) {
            return false;
        }
        defpackage.anny annyVar = annmVar.d;
        return j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.e, annmVar.e);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Long.valueOf(this.c), null, this.e});
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.b("description", this.a);
        ahymVarL.b("severity", this.b);
        ahymVarL.f("timestampNanos", this.c);
        ahymVarL.b("channelRef", null);
        ahymVarL.b("subchannelRef", this.e);
        return ahymVarL.toString();
    }
}
