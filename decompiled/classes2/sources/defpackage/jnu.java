package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jnu {
    public final java.lang.String a;
    public final java.lang.String b;
    public final android.media.AudioAttributes c;
    public final j$.util.OptionalLong d;

    public jnu(java.lang.String str, java.lang.String str2, android.media.AudioAttributes audioAttributes, j$.util.OptionalLong optionalLong) {
        this.a = str;
        this.b = str2;
        this.c = audioAttributes;
        this.d = optionalLong;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jnu) {
            defpackage.jnu jnuVar = (defpackage.jnu) obj;
            if (this.a.equals(jnuVar.a) && this.b.equals(jnuVar.b) && this.c.equals(jnuVar.c) && this.d.equals(jnuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.OptionalLong optionalLong = this.d;
        return "Announcement{id=" + this.a + ", text=" + this.b + ", audioAttributes=" + java.lang.String.valueOf(this.c) + ", repeatAnnouncementDelayMillis=" + java.lang.String.valueOf(optionalLong) + '}';
    }

    public jnu() {
        throw null;
    }
}
