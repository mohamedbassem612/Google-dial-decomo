package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wxo {
    public final java.lang.String a;
    public final boolean b;
    public final long c;

    public wxo(java.lang.String str, boolean z, long j) {
        this.a = str;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wxo) {
            defpackage.wxo wxoVar = (defpackage.wxo) obj;
            if (this.a.equals(wxoVar.a) && this.b == wxoVar.b && this.c == wxoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.b ? 1237 : 1231;
        long j = this.c;
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "AtlasBusinessQuery{phoneNumber=" + this.a + ", isIncomingCall=" + this.b + ", callCreationTimeMillis=" + this.c + '}';
    }

    public wxo() {
        throw null;
    }
}
