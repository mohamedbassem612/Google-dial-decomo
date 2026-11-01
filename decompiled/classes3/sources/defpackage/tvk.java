package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tvk {
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;

    public tvk(long j, java.lang.String str, java.lang.String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tvk) {
            defpackage.tvk tvkVar = (defpackage.tvk) obj;
            if (this.a == tvkVar.a && this.b.equals(tvkVar.b)) {
                java.lang.String str = this.c;
                if (str == null) {
                    if (tvkVar.c == null) {
                        return true;
                    }
                } else if (str.equals(tvkVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
        java.lang.String str = this.c;
        return ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
    }

    public final java.lang.String toString() {
        return "ShortcutSpeedDialInfo{id=" + this.a + ", lookupKey=" + this.b + ", namePrimary=" + this.c + ", nameAlternative=null}";
    }

    public tvk() {
        throw null;
    }
}
