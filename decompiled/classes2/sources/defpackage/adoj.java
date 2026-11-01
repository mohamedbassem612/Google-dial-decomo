package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adoj {
    public final defpackage.adnw a;
    public final java.lang.String b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final int e;

    public adoj(defpackage.adnw adnwVar, int i, java.lang.String str, j$.util.Optional optional, j$.util.Optional optional2) {
        if (adnwVar == null) {
            throw new java.lang.NullPointerException("Null message");
        }
        this.a = adnwVar;
        this.e = i;
        if (str == null) {
            throw new java.lang.NullPointerException("Null playbackId");
        }
        this.b = str;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null durationMs");
        }
        this.c = optional;
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null progress");
        }
        this.d = optional2;
    }

    public static defpackage.adoj a(defpackage.adnw adnwVar, java.lang.String str) {
        return new defpackage.adoj(adnwVar, 3, str, j$.util.Optional.empty(), j$.util.Optional.of(100));
    }

    public static defpackage.adoj b(defpackage.adnw adnwVar, java.lang.String str, int i) {
        return new defpackage.adoj(adnwVar, 2, str, j$.util.Optional.empty(), j$.util.Optional.of(java.lang.Integer.valueOf(i)));
    }

    public static defpackage.adoj c(defpackage.adnw adnwVar, java.lang.String str) {
        return new defpackage.adoj(adnwVar, 4, str, j$.util.Optional.empty(), j$.util.Optional.empty());
    }

    public static defpackage.adoj d(defpackage.adnw adnwVar, java.lang.String str, int i) {
        return new defpackage.adoj(adnwVar, 1, str, j$.util.Optional.of(java.lang.Integer.valueOf(i)), j$.util.Optional.of(0));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adoj) {
            defpackage.adoj adojVar = (defpackage.adoj) obj;
            if (this.a.equals(adojVar.a) && this.e == adojVar.e && this.b.equals(adojVar.b) && this.c.equals(adojVar.c) && this.d.equals(adojVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.e;
        java.lang.String string = this.a.toString();
        if (i == 1) {
            str = "STARTED_PLAYING";
        } else if (i != 2) {
            str = i != 3 ? "INTERRUPTED_WHILE_PLAYED" : "FINISHED_PLAYING";
        } else {
            str = "PLAYBACK_IN_PROGRESS";
        }
        java.lang.String str2 = this.b;
        j$.util.Optional optional = this.c;
        j$.util.Optional optional2 = this.d;
        return "PlayedMessageArgs{message=" + string + ", playStatus=" + str + ", playbackId=" + str2 + ", durationMs=" + optional.toString() + ", progress=" + optional2.toString() + '}';
    }

    public adoj() {
        throw null;
    }
}
