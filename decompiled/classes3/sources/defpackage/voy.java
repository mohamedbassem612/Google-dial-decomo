package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class voy {
    public final android.telecom.PhoneAccountHandle a;
    public final long b;
    public final aify c;
    public final android.net.Uri d;
    public final java.lang.String e;
    private final j$.util.Optional f;

    public voy(android.telecom.PhoneAccountHandle phoneAccountHandle, long j, aify aifyVar, android.net.Uri uri, j$.util.Optional optional, java.lang.String str) {
        this.a = phoneAccountHandle;
        this.b = j;
        this.c = aifyVar;
        this.d = uri;
        this.f = optional;
        this.e = str;
    }

    public static defpackage.adrp a() {
        defpackage.adrp adrpVar = new defpackage.adrp((char[]) null);
        adrpVar.a = j$.util.Optional.of(defpackage.vox.a);
        return adrpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        aify aifyVar;
        android.net.Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.voy) {
            defpackage.voy voyVar = (defpackage.voy) obj;
            if (this.a.equals(voyVar.a) && this.b == voyVar.b && ((aifyVar = this.c) != null ? ahvr.aP(aifyVar, voyVar.c) : voyVar.c == null) && ((uri = this.d) != null ? uri.equals(voyVar.d) : voyVar.d == null) && this.f.equals(voyVar.f)) {
                java.lang.String str = this.e;
                if (str == null) {
                    if (voyVar.e == null) {
                        return true;
                    }
                } else if (str.equals(voyVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        aify aifyVar = this.c;
        int iHashCode2 = aifyVar == null ? 0 : aifyVar.hashCode();
        long j = this.b;
        int i = ((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ iHashCode2) * 1000003;
        android.net.Uri uri = this.d;
        int iHashCode3 = (((i ^ (uri == null ? 0 : uri.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        java.lang.String str = this.e;
        return iHashCode3 ^ (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.f;
        android.net.Uri uri = this.d;
        aify aifyVar = this.c;
        return "VoicemailGreeting{phoneAccountHandle=" + java.lang.String.valueOf(this.a) + ", durationMillis=" + this.b + ", audioData=" + java.lang.String.valueOf(aifyVar) + ", audioUri=" + java.lang.String.valueOf(uri) + ", greetingType=" + java.lang.String.valueOf(optional) + ", greetingUid=" + this.e + '}';
    }

    public voy() {
        throw null;
    }
}
