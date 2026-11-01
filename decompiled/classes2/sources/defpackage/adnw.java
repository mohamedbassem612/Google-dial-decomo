package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adnw {
    public final j$.util.Optional a;
    public final j$.util.Optional b;
    private final j$.util.Optional c;
    private final j$.util.Optional d;

    public adnw(j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null messageId");
        }
        this.c = optional;
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null audioFile");
        }
        this.a = optional2;
        if (optional3 == null) {
            throw new java.lang.NullPointerException("Null messageText");
        }
        this.b = optional3;
        if (optional4 == null) {
            throw new java.lang.NullPointerException("Null voiceId");
        }
        this.d = optional4;
    }

    public static defpackage.adnw a(java.io.File file, java.lang.String str) {
        return new defpackage.adnw(j$.util.Optional.empty(), j$.util.Optional.of(file), j$.util.Optional.of(str), j$.util.Optional.empty());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adnw) {
            defpackage.adnw adnwVar = (defpackage.adnw) obj;
            if (this.c.equals(adnwVar.c) && this.a.equals(adnwVar.a) && this.b.equals(adnwVar.b) && this.d.equals(adnwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.d;
        j$.util.Optional optional2 = this.b;
        j$.util.Optional optional3 = this.a;
        return "AudioMessagePlaybackRequest{messageId=" + this.c.toString() + ", audioFile=" + optional3.toString() + ", messageText=" + optional2.toString() + ", voiceId=" + optional.toString() + '}';
    }

    public adnw() {
        throw null;
    }
}
