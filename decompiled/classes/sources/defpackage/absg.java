package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class absg {
    public final java.lang.String a;
    public final int b;
    public final boolean c;
    public final defpackage.absi d;

    public absg(java.lang.String str, int i, boolean z, defpackage.absi absiVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = absiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.absg) {
            defpackage.absg absgVar = (defpackage.absg) obj;
            if (this.a.equals(absgVar.a) && this.b == absgVar.b && this.c == absgVar.c && this.d.equals(absgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Integer.MAX_VALUE) * 1000003) ^ Integer.MAX_VALUE) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ThreadPoolConfig{name=" + this.a + ", numThreads=" + this.b + ", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=" + this.c + ", listener=" + this.d.toString() + '}';
    }

    public absg() {
        throw null;
    }
}
