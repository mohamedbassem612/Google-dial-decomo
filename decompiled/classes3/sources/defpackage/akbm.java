package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbm {
    public final java.net.URI a;
    public final long b;
    public final java.lang.Integer c;
    public final java.lang.Integer d;
    public final java.lang.Integer e;
    private final long f;
    private final long g;

    public akbm(java.net.URI uri, long j, long j2, long j3, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        this.a = uri;
        this.b = j;
        this.f = j2;
        this.g = j3;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        java.lang.Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akbm) {
            defpackage.akbm akbmVar = (defpackage.akbm) obj;
            if (this.a.equals(akbmVar.a) && this.b == akbmVar.b && this.f == akbmVar.f && this.g == akbmVar.g && ((num = this.c) != null ? num.equals(akbmVar.c) : akbmVar.c == null) && ((num2 = this.d) != null ? num2.equals(akbmVar.d) : akbmVar.d == null)) {
                java.lang.Integer num3 = this.e;
                if (num3 == null) {
                    if (akbmVar.e == null) {
                        return true;
                    }
                } else if (num3.equals(akbmVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.Integer num = this.c;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        long j = this.b;
        long j2 = this.f;
        long j3 = this.g;
        int i = ((((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ iHashCode2) * 1000003;
        java.lang.Integer num2 = this.d;
        int iHashCode3 = (i ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        java.lang.Integer num3 = this.e;
        return iHashCode3 ^ (num3 != null ? num3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ChannelRuntimeConfig{uri=" + this.a.toString() + ", grpcIdleTimeoutMillis=" + this.b + ", grpcKeepAliveTimeMillis=" + this.f + ", grpcKeepAliveTimeoutMillis=" + this.g + ", trafficStatsUid=" + this.c + ", trafficStatsTag=" + this.d + ", maxMessageSize=" + this.e + '}';
    }

    public akbm() {
        throw null;
    }
}
