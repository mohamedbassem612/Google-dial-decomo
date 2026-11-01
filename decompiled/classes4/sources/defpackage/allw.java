package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class allw {
    public final j$.time.Duration a;
    public final boolean b;
    public final int c;

    public allw(j$.time.Duration duration, boolean z, int i) {
        if (duration == null) {
            throw new java.lang.NullPointerException("Null totalTimeoutDuration");
        }
        this.a = duration;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.allw) {
            defpackage.allw allwVar = (defpackage.allw) obj;
            if (this.a.equals(allwVar.a) && this.b == allwVar.b && this.c == allwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        int i = this.c;
        java.lang.String string = this.a.toString();
        java.lang.String str = i != 1 ? "HUMAN_SPEECH" : "BOT_SPEECH";
        return "TimeoutData{totalTimeoutDuration=" + string + ", shouldCheckSuspicion=" + this.b + ", timeoutType=" + str + '}';
    }

    public allw() {
        throw null;
    }
}
