package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vdg {
    public final android.net.Uri a;
    public final long b;
    public final java.lang.String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final j$.util.Optional g;
    public final boolean h;
    private final j$.util.Optional i;
    private final j$.util.Optional j;
    private final defpackage.uzm k;

    public vdg(android.net.Uri uri, long j, java.lang.String str, boolean z, boolean z2, boolean z3, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, defpackage.uzm uzmVar, boolean z4) {
        this.a = uri;
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.i = optional;
        this.j = optional2;
        this.g = optional3;
        this.k = uzmVar;
        this.h = z4;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optional = this.j;
        if (optional.isPresent()) {
            j$.util.Optional optional2 = this.i;
            if (optional2.isPresent()) {
                return j$.util.Optional.of(new android.telecom.PhoneAccountHandle(android.content.ComponentName.unflattenFromString((java.lang.String) optional.orElseThrow()), (java.lang.String) optional2.orElseThrow()));
            }
        }
        return j$.util.Optional.empty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vdg) {
            defpackage.vdg vdgVar = (defpackage.vdg) obj;
            if (this.a.equals(vdgVar.a) && this.b == vdgVar.b && this.c.equals(vdgVar.c) && this.d == vdgVar.d && this.e == vdgVar.e && this.f == vdgVar.f && this.i.equals(vdgVar.i) && this.j.equals(vdgVar.j) && this.g.equals(vdgVar.g) && this.k.equals(vdgVar.k) && this.h == vdgVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((((((((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        defpackage.uzm uzmVar = this.k;
        j$.util.Optional optional = this.g;
        j$.util.Optional optional2 = this.j;
        j$.util.Optional optional3 = this.i;
        return "Voicemail{uri=" + java.lang.String.valueOf(this.a) + ", id=" + this.b + ", remoteSourceId=" + this.c + ", isRead=" + this.d + ", isDeleted=" + this.e + ", isArchived=" + this.f + ", phoneAccountId=" + java.lang.String.valueOf(optional3) + ", phoneAccountComponentName=" + java.lang.String.valueOf(optional2) + ", transcription=" + java.lang.String.valueOf(optional) + ", transcriptionState=" + java.lang.String.valueOf(uzmVar) + ", hasContent=" + this.h + '}';
    }

    public vdg() {
        throw null;
    }
}
