package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adsi {
    public final java.lang.String a;
    public final java.lang.String b;
    private final java.lang.String c;
    private final int d;

    public adsi(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adsi) {
            defpackage.adsi adsiVar = (defpackage.adsi) obj;
            if (this.a.equals(adsiVar.a) && this.c.equals(adsiVar.c) && this.b.equals(adsiVar.b)) {
                int i = this.d;
                int i2 = adsiVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
        int i = this.d;
        defpackage.anty.aJ(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.d;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "FEMALE";
        } else {
            str = "MALE";
        }
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        return "TtsVoice{voiceId=" + this.a + ", voiceName=" + str3 + ", langCode=" + str2 + ", gender=" + str + '}';
    }

    public adsi() {
        throw null;
    }
}
