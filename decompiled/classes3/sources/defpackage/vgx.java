package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vgx implements defpackage.vfe {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final android.telecom.PhoneAccountHandle e;
    public final boolean f;
    public final java.lang.String g;
    public final j$.util.Optional h;

    public vgx(java.lang.String str, java.lang.String str2, long j, long j2, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, java.lang.String str3, j$.util.Optional optional) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = phoneAccountHandle;
        this.f = z;
        this.g = str3;
        this.h = optional;
    }

    @Override // defpackage.vfe
    public final java.lang.String a() {
        return this.a;
    }

    @Override // defpackage.vfe
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vgx) {
            defpackage.vgx vgxVar = (defpackage.vgx) obj;
            if (this.a.equals(vgxVar.a) && this.b.equals(vgxVar.b) && this.c == vgxVar.c && this.d == vgxVar.d && this.e.equals(vgxVar.e) && this.f == vgxVar.f && this.g.equals(vgxVar.g) && this.h.equals(vgxVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.d;
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.e;
        long j2 = (j >>> 32) ^ j;
        long j3 = this.c;
        return (((((((((((iHashCode * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) j2)) * 1000003) ^ phoneAccountHandle.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.h;
        return "ServerVoicemail{sourceId=" + this.a + ", fromNumber=" + this.b + ", createTimeStampMillisecond=" + this.c + ", durationSecond=" + this.d + ", phoneAccountHandle=" + java.lang.String.valueOf(this.e) + ", isRead=" + this.f + ", sourcePackage=" + this.g + ", transcription=" + java.lang.String.valueOf(optional) + '}';
    }

    public vgx() {
        throw null;
    }
}
