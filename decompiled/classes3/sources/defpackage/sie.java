package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sie extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    long c;
    int d;
    final /* synthetic */ sin e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sie(sin sinVar, long j, aoln aolnVar) {
        super(2, aolnVar);
        this.e = sinVar;
        this.f = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #0 {all -> 0x0096, blocks: (B:30:0x0074, B:32:0x0078, B:25:0x005d, B:27:0x0065, B:22:0x004c), top: B:46:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ahoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        long j;
        sin sinVar;
        sin sinVar2;
        ?? r9;
        ?? r1;
        ?? r10;
        java.lang.Long l;
        ?? r2;
        aolu aoluVar = aolu.a;
        ?? Z = this.d;
        if (Z != 0) {
            try {
                if (Z == 1) {
                    j = this.c;
                    java.lang.Object obj2 = this.b;
                    sinVar = (sin) this.a;
                    aooc.af(obj);
                    r2 = obj2;
                } else {
                    if (Z == 2) {
                        java.lang.Object obj3 = this.b;
                        sinVar2 = (sin) this.a;
                        aooc.af(obj);
                        Z = obj3;
                        l = (java.lang.Long) obj;
                        r1 = Z;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            sia siaVar = sinVar2.d;
                            this.a = Z;
                            this.b = null;
                            this.d = 3;
                            obj = siaVar.e(jLongValue, this);
                            if (obj != aoluVar) {
                                return aoluVar;
                            }
                            r10 = Z;
                        }
                        ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                        return null;
                    }
                    r9 = (java.io.Closeable) this.a;
                    try {
                        aooc.af(obj);
                        r10 = r9;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            ajsz.ak((java.io.Closeable) r9, th);
                            throw th2;
                        }
                    }
                }
                ajsz.ak((java.io.Closeable) r10, (java.lang.Throwable) null);
                return obj;
            } catch (java.lang.Throwable th3) {
                th = th3;
                r9 = Z;
                throw th;
            }
        }
        aooc.af(obj);
        sin sinVar3 = this.e;
        j = this.f;
        if (!ahvr.R(u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        Z = ahvr.Z(811, "PatrickStorage_fetchForContact_id");
        try {
            this.a = sinVar3;
            this.b = Z;
            this.c = j;
            this.d = 1;
            java.lang.Object objD = sinVar3.d(this);
            if (objD == aoluVar) {
                return aoluVar;
            }
            sinVar = sinVar3;
            obj = objD;
            r2 = Z;
        } catch (java.lang.Throwable th4) {
            th = th4;
            r9 = Z;
            throw th;
        }
        r1 = r2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            shq shqVar = sinVar.b;
            this.a = sinVar;
            this.b = r2;
            this.d = 2;
            obj = shqVar.d(j, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            sinVar2 = sinVar;
            Z = r2;
            l = (java.lang.Long) obj;
            r1 = Z;
            if (l != null) {
                long jLongValue2 = l.longValue();
                sia siaVar2 = sinVar2.d;
                this.a = Z;
                this.b = null;
                this.d = 3;
                obj = siaVar2.e(jLongValue2, this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                r10 = Z;
                ajsz.ak((java.io.Closeable) r10, (java.lang.Throwable) null);
                return obj;
            }
        }
        ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
        return null;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.sie(this.e, this.f, aolnVar);
    }
}
