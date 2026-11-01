package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vuz {
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;
    public final j$.util.Optional d;
    public final android.net.Uri e;

    public vuz(java.lang.String str, long j, java.lang.String str2, j$.util.Optional optional, android.net.Uri uri) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = optional;
        this.e = uri;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vuz) {
            defpackage.vuz vuzVar = (defpackage.vuz) obj;
            if (this.a.equals(vuzVar.a) && this.b == vuzVar.b && this.c.equals(vuzVar.c) && this.d.equals(vuzVar.d) && this.e.equals(vuzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        android.net.Uri uri = this.e;
        return "VoicemailContentInfo{name=" + this.a + ", date=" + this.b + ", mimeType=" + this.c + ", transcription=" + java.lang.String.valueOf(this.d) + ", uri=" + java.lang.String.valueOf(uri) + '}';
    }

    public vuz() {
        throw null;
    }
}
