package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acuq extends defpackage.acus {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;

    public acuq(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.acus
    public final java.lang.String a() {
        return this.c;
    }

    @Override // defpackage.acus
    public final java.lang.String b() {
        return this.b;
    }

    @Override // defpackage.acus
    public final java.lang.String c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acus) {
            defpackage.acus acusVar = (defpackage.acus) obj;
            if (this.a.equals(acusVar.c()) && this.b.equals(acusVar.b()) && this.c.equals(acusVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
