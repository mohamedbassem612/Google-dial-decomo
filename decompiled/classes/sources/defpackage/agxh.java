package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agxh {
    public static final defpackage.agxh a = new defpackage.agxh(null, j$.time.Instant.EPOCH, false);
    private final java.lang.Object b;
    private final defpackage.agxg c;

    public agxh(java.lang.Object obj, j$.time.Instant instant, boolean z) {
        this.b = obj;
        this.c = new defpackage.agxg(instant, obj != null, z);
    }

    public static defpackage.agxh a(java.lang.Object obj, j$.time.Instant instant) {
        obj.getClass();
        return new defpackage.agxh(obj, instant, true);
    }

    public static defpackage.agxh b(java.lang.Object obj) {
        defpackage.ahvr.ci(obj);
        return new defpackage.agxh(obj, j$.time.Instant.EPOCH, false);
    }

    public final j$.time.Instant c() {
        defpackage.ahvr.bZ(e(), "Cannot get timestamp for a CacheResult that does not have content");
        defpackage.ahvr.bZ(f(), "Cannot get timestamp for an invalid CacheResult");
        return (j$.time.Instant) this.c.c;
    }

    public final java.lang.Object d() {
        defpackage.ahvr.bZ(e(), "Cannot get data for a CacheResult that does not have content");
        return this.b;
    }

    public final boolean e() {
        return this.c.a;
    }

    public final boolean f() {
        defpackage.ahvr.bZ(e(), "Cannot call isValid() for a CacheResult that does not have content");
        return this.c.b;
    }

    public final java.lang.String toString() {
        defpackage.agxg agxgVar = this.c;
        if (!agxgVar.a) {
            return "CacheResult.cacheMiss";
        }
        boolean z = agxgVar.b;
        java.lang.Object obj = this.b;
        if (!z) {
            return "CacheResult.cacheInvalid{data=" + java.lang.String.valueOf(obj) + '}';
        }
        java.lang.Object obj2 = agxgVar.c;
        return "CacheResult.cacheHit{data=" + java.lang.String.valueOf(obj) + ", timestamp=" + obj2.toString() + '}';
    }
}
