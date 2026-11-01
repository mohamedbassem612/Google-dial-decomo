package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class djq {
    public final int a;

    public static java.lang.String a(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : defpackage.a.bw((byte) 41, i, "Invalid(value=");
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.djq) && this.a == ((defpackage.djq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
