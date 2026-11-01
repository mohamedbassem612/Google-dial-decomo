package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zzs {
    public final j$.time.Instant a;

    public zzs(j$.time.Instant instant) {
        if (instant == null) {
            throw new java.lang.NullPointerException("Null eventTime");
        }
        this.a = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zzs) {
            return this.a.equals(((defpackage.zzs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "LogSamplerProperties{eventTime=" + this.a.toString() + '}';
    }

    public zzs() {
        throw null;
    }
}
