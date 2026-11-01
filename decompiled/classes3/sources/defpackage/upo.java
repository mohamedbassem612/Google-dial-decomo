package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class upo {
    public final java.lang.Long a;
    public final j$.util.Optional b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final defpackage.upl f;

    public upo(java.lang.Long l, j$.util.Optional optional, long j, java.lang.String str, java.lang.String str2, defpackage.upl uplVar) {
        this.a = l;
        this.b = optional;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.f = uplVar;
    }

    public static defpackage.adrp a() {
        defpackage.adrp adrpVar = new defpackage.adrp(null, null);
        adrpVar.p(j$.util.Optional.empty());
        return adrpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.upo) {
            defpackage.upo upoVar = (defpackage.upo) obj;
            java.lang.Long l = this.a;
            if (l != null ? l.equals(upoVar.a) : upoVar.a == null) {
                if (this.b.equals(upoVar.b) && this.c == upoVar.c && this.d.equals(upoVar.d) && ((str = this.e) != null ? str.equals(upoVar.e) : upoVar.e == null)) {
                    defpackage.upl uplVar = this.f;
                    if (uplVar == null) {
                        if (upoVar.f == null) {
                            return true;
                        }
                    } else if (uplVar.equals(upoVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Long l = this.a;
        int iHashCode = (((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        int iHashCode2 = (((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.d.hashCode();
        java.lang.String str = this.e;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        defpackage.upl uplVar = this.f;
        return iHashCode3 ^ (uplVar != null ? uplVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.upl uplVar = this.f;
        return "SpeedDialEntry{id=" + this.a + ", pinnedPosition=" + java.lang.String.valueOf(this.b) + ", contactId=" + this.c + ", lookupKey=" + this.d + ", sourceId=" + this.e + ", defaultChannel=" + java.lang.String.valueOf(uplVar) + '}';
    }

    public upo() {
        throw null;
    }
}
