package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesv implements defpackage.aepy {
    private final long a;
    private final defpackage.aihd b;
    private final int c;

    public aesv(int i, long j, defpackage.aihd aihdVar) {
        this.c = 2;
        this.a = j;
        this.b = aihdVar;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aesv) {
            defpackage.aesv aesvVar = (defpackage.aesv) obj;
            int i = this.c;
            int i2 = aesvVar.c;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == aesvVar.a && this.b.equals(aesvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        defpackage.anty.aJ(i);
        int i2 = ((defpackage.aikn) this.b).c;
        long j = this.a;
        return ((((i ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i2;
    }

    public final java.lang.String toString() {
        return "DebugMemoryConfigurations{enablement=" + defpackage.aepz.a(this.c) + ", debugMemoryServiceThrottleMs=" + this.a + ", debugMemoryEventsToSample=" + java.lang.String.valueOf(this.b) + '}';
    }

    public aesv() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
