package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vmf implements defpackage.vfe {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final j$.util.Optional f;
    private final j$.util.Optional g;

    public vmf(java.lang.String str, java.lang.String str2, long j, long j2, boolean z, j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = optional;
        this.g = optional2;
    }

    @Override // defpackage.vfe
    public final java.lang.String a() {
        return this.a;
    }

    @Override // defpackage.vfe
    public final boolean b() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vmf) {
            defpackage.vmf vmfVar = (defpackage.vmf) obj;
            if (this.a.equals(vmfVar.a) && this.b.equals(vmfVar.b) && this.c == vmfVar.c && this.d == vmfVar.d && this.e == vmfVar.e && this.f.equals(vmfVar.f) && this.g.equals(vmfVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = true != this.e ? 1237 : 1231;
        long j = this.c;
        long j2 = this.d;
        return (((((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.g;
        return "ServerVoicemail{objectId=" + this.a + ", fromNumber=" + this.b + ", createdAtEpochMillisecond=" + this.c + ", durationSecond=" + this.d + ", isRead=" + this.e + ", audioUrl=" + java.lang.String.valueOf(this.f) + ", transcriptionUrl=" + java.lang.String.valueOf(optional) + '}';
    }

    public vmf() {
        throw null;
    }
}
