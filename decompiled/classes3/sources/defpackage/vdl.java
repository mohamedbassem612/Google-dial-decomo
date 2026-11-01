package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vdl {
    public final long a;
    public final java.lang.String b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    public final android.telecom.PhoneAccountHandle g;
    public final j$.util.Optional h;
    public final j$.util.Optional i;

    public vdl(long j, java.lang.String str, long j2, java.lang.String str2, java.lang.String str3, boolean z, android.telecom.PhoneAccountHandle phoneAccountHandle, j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = phoneAccountHandle;
        this.h = optional;
        this.i = optional2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vdl) {
            defpackage.vdl vdlVar = (defpackage.vdl) obj;
            if (this.a == vdlVar.a && this.b.equals(vdlVar.b) && this.c == vdlVar.c && this.d.equals(vdlVar.d) && this.e.equals(vdlVar.e) && this.f == vdlVar.f && this.g.equals(vdlVar.g) && this.h.equals(vdlVar.h) && this.i.equals(vdlVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
        java.lang.String str = this.d;
        long j2 = this.c;
        return (((((((((((((iHashCode * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ str.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.i;
        j$.util.Optional optional2 = this.h;
        return "VoicemailInsertContent{createdAtMillis=" + this.a + ", senderPhoneNumber=" + this.b + ", durationSeconds=" + this.c + ", sourcePackage=" + this.d + ", remoteSourceId=" + this.e + ", isRead=" + this.f + ", phoneAccountHandle=" + java.lang.String.valueOf(this.g) + ", transcription=" + java.lang.String.valueOf(optional2) + ", transcriptionState=" + java.lang.String.valueOf(optional) + '}';
    }

    public vdl() {
        throw null;
    }
}
