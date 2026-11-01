package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajwm {
    public final java.lang.String a;
    private final long b;
    private final long c;

    public ajwm(java.lang.String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajwm) {
            defpackage.ajwm ajwmVar = (defpackage.ajwm) obj;
            if (this.a.equals(ajwmVar.a) && this.b == ajwmVar.b && this.c == ajwmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        long j2 = (j >>> 32) ^ j;
        long j3 = this.b;
        return (((iHashCode * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) j2);
    }

    public final java.lang.String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + '}';
    }

    public ajwm() {
        throw null;
    }
}
