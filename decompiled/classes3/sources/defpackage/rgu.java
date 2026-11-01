package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgu {
    public final java.lang.String a;
    public final int b;
    private final long c;

    public rgu(java.lang.String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rgu) {
            defpackage.rgu rguVar = (defpackage.rgu) obj;
            if (this.a.equals(rguVar.a)) {
                int i = this.b;
                int i2 = rguVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c == rguVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        anty.aJ(i);
        long j = this.c;
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        if (i == 1) {
            str = "NEW_LINE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "NONE";
        } else {
            str = "PREPEND_SPACE";
        }
        return "TranscriptSnippet{text=" + this.a + ", renderingGuide=" + str + ", creationTimeMillis=" + this.c + '}';
    }

    public rgu() {
        throw null;
    }
}
