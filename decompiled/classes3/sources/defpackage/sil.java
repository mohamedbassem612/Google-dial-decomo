package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sil extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    long e;
    int f;
    final /* synthetic */ sin g;
    final /* synthetic */ android.net.Uri h;
    final /* synthetic */ defpackage.abxt i;
    private /* synthetic */ java.lang.Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sil(sin sinVar, android.net.Uri uri, defpackage.abxt abxtVar, aoln aolnVar) {
        super(2, aolnVar);
        this.g = sinVar;
        this.h = uri;
        this.i = abxtVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe A[Catch: all -> 0x0026, TryCatch #2 {all -> 0x0026, blocks: (B:8:0x001f, B:48:0x0120, B:50:0x0128, B:51:0x013b, B:44:0x00f6, B:46:0x00fe, B:52:0x0141, B:33:0x00a7, B:35:0x00af, B:36:0x00b6, B:38:0x00bf, B:55:0x014b, B:31:0x0095), top: B:68:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: all -> 0x0026, TryCatch #2 {all -> 0x0026, blocks: (B:8:0x001f, B:48:0x0120, B:50:0x0128, B:51:0x013b, B:44:0x00f6, B:46:0x00fe, B:52:0x0141, B:33:0x00a7, B:35:0x00af, B:36:0x00b6, B:38:0x00bf, B:55:0x014b, B:31:0x0095), top: B:68:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0141 A[Catch: all -> 0x0026, TryCatch #2 {all -> 0x0026, blocks: (B:8:0x001f, B:48:0x0120, B:50:0x0128, B:51:0x013b, B:44:0x00f6, B:46:0x00fe, B:52:0x0141, B:33:0x00a7, B:35:0x00af, B:36:0x00b6, B:38:0x00bf, B:55:0x014b, B:31:0x0095), top: B:68:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final java.lang.Object b(java.lang.Object obj) {
        ?? r2;
        ?? r3;
        java.lang.Throwable th;
        sin sinVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object objD;
        java.lang.Object obj4;
        java.lang.Long l;
        java.lang.Object objA;
        sin sinVar2;
        java.lang.Object obj5;
        long j;
        long jLongValue;
        java.lang.Object objG;
        ?? r1;
        java.lang.Object objB;
        ?? r4;
        ?? r5;
        aolu aoluVar = aolu.a;
        int i = this.f;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        long j2 = this.e;
                        java.io.Closeable closeable = (java.io.Closeable) this.a;
                        sin sinVar3 = (sin) this.j;
                        try {
                            aooc.af(obj);
                            sinVar2 = sinVar3;
                            j = j2;
                            obj5 = closeable;
                            objA = obj;
                            try {
                                jLongValue = ((java.lang.Number) objA).longValue();
                                shq shqVar = sinVar2.b;
                                this.j = sinVar2;
                                this.a = obj5;
                                this.e = jLongValue;
                                this.f = 3;
                                objG = shqVar.g(j, jLongValue, this);
                                if (objG != aoluVar) {
                                    return aoluVar;
                                }
                                r1 = obj5;
                                if (((java.lang.Boolean) objG).booleanValue()) {
                                    l = new java.lang.Long(jLongValue);
                                    r4 = r1;
                                } else {
                                    sin.a.b().l("com/android/dialer/patrick/impl/storage/PatrickStorage", "storeContactCallingCard$<anonymous>$<anonymous>", 120, "PatrickStorage.kt").v("Error inserting patrick row id into CP2");
                                    sia siaVar = sinVar2.d;
                                    this.j = r1;
                                    this.a = null;
                                    this.f = 4;
                                    objB = siaVar.b(jLongValue, this);
                                    if (objB == aoluVar) {
                                        r5 = r1;
                                        return aoluVar;
                                    }
                                }
                                java.lang.Long l2 = l;
                                ajsz.ak((java.io.Closeable) r4, (java.lang.Throwable) null);
                                return l2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                r3 = obj5;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            r3 = closeable;
                        }
                    } else {
                        if (i == 3) {
                            long j3 = this.e;
                            r2 = (java.io.Closeable) this.a;
                            sin sinVar4 = (sin) this.j;
                            try {
                                aooc.af(obj);
                                sinVar2 = sinVar4;
                                jLongValue = j3;
                                r1 = r2;
                                objG = obj;
                                if (((java.lang.Boolean) objG).booleanValue()) {
                                    sin.a.b().l("com/android/dialer/patrick/impl/storage/PatrickStorage", "storeContactCallingCard$<anonymous>$<anonymous>", 120, "PatrickStorage.kt").v("Error inserting patrick row id into CP2");
                                    sia siaVar2 = sinVar2.d;
                                    this.j = r1;
                                    this.a = null;
                                    this.f = 4;
                                    objB = siaVar2.b(jLongValue, this);
                                    if (objB == aoluVar) {
                                        r5 = r1;
                                        return aoluVar;
                                    }
                                } else {
                                    l = new java.lang.Long(jLongValue);
                                    r4 = r1;
                                }
                                java.lang.Long l3 = l;
                                ajsz.ak((java.io.Closeable) r4, (java.lang.Throwable) null);
                                return l3;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                th = th;
                                r3 = r2;
                                throw th;
                            }
                        }
                        java.io.Closeable closeable2 = (java.io.Closeable) this.j;
                        aooc.af(obj);
                        objB = obj;
                        r5 = closeable2;
                    }
                    r5 = r1;
                    if (!((java.lang.Boolean) objB).booleanValue()) {
                        sin.a.d().l("com/android/dialer/patrick/impl/storage/PatrickStorage", "storeContactCallingCard$<anonymous>$<anonymous>", 122, "PatrickStorage.kt").v("Error removing failed entry from storage");
                    }
                    l = new java.lang.Long(-1L);
                    r4 = r5;
                    java.lang.Long l4 = l;
                    ajsz.ak((java.io.Closeable) r4, (java.lang.Throwable) null);
                    return l4;
                }
                java.lang.Object obj6 = this.d;
                java.lang.Object obj7 = this.c;
                obj2 = this.b;
                sinVar = (sin) this.a;
                try {
                    aooc.af(obj);
                    obj3 = obj7;
                    obj4 = obj6;
                    objD = obj;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    r3 = obj6;
                }
                try {
                    throw th;
                } catch (java.lang.Throwable th6) {
                    ajsz.ak((java.io.Closeable) r3, th);
                    throw th6;
                }
            }
            aooc.af(obj);
            aoss aossVar = (aoss) this.j;
            sinVar = this.g;
            obj2 = this.h;
            obj3 = this.i;
            if (!ahvr.R(u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(816, "PatrickStorage_store");
            this.j = aossVar;
            this.a = sinVar;
            this.b = obj2;
            this.c = obj3;
            this.d = ahoqVarZ;
            this.f = 1;
            objD = sinVar.d(this);
            obj4 = ahoqVarZ;
            if (objD == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objD).booleanValue()) {
                java.lang.String lastPathSegment = ((android.net.Uri) obj2).getLastPathSegment();
                if (lastPathSegment != null) {
                    long j4 = java.lang.Long.parseLong(lastPathSegment);
                    sia siaVar3 = sinVar.d;
                    this.j = sinVar;
                    this.a = obj4;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = j4;
                    this.f = 2;
                    objA = siaVar3.a((defpackage.abxt) obj3, this);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    sinVar2 = sinVar;
                    obj5 = obj4;
                    j = j4;
                    jLongValue = ((java.lang.Number) objA).longValue();
                    shq shqVar2 = sinVar2.b;
                    this.j = sinVar2;
                    this.a = obj5;
                    this.e = jLongValue;
                    this.f = 3;
                    objG = shqVar2.g(j, jLongValue, this);
                    if (objG != aoluVar) {
                        return aoluVar;
                    }
                    r1 = obj5;
                    if (((java.lang.Boolean) objG).booleanValue()) {
                        sin.a.b().l("com/android/dialer/patrick/impl/storage/PatrickStorage", "storeContactCallingCard$<anonymous>$<anonymous>", 120, "PatrickStorage.kt").v("Error inserting patrick row id into CP2");
                        sia siaVar4 = sinVar2.d;
                        this.j = r1;
                        this.a = null;
                        this.f = 4;
                        objB = siaVar4.b(jLongValue, this);
                        if (objB == aoluVar) {
                            r5 = r1;
                            return aoluVar;
                        }
                        r5 = r1;
                        if (!((java.lang.Boolean) objB).booleanValue()) {
                            sin.a.d().l("com/android/dialer/patrick/impl/storage/PatrickStorage", "storeContactCallingCard$<anonymous>$<anonymous>", 122, "PatrickStorage.kt").v("Error removing failed entry from storage");
                        }
                        l = new java.lang.Long(-1L);
                        r4 = r5;
                    } else {
                        l = new java.lang.Long(jLongValue);
                        r4 = r1;
                    }
                } else {
                    sin.a.d().k(new java.lang.IllegalArgumentException("Bad URI parameter")).l("com/android/dialer/patrick/impl/storage/PatrickStorage", "storeContactCallingCard$<anonymous>$<anonymous>$<anonymous>", 115, "PatrickStorage.kt").y("Error extracting raw contact id from URI: %s", obj2);
                    l = new java.lang.Long(-1L);
                    r4 = obj4;
                }
            } else {
                l = new java.lang.Long(-1L);
                r4 = obj4;
            }
            java.lang.Long l5 = l;
            ajsz.ak((java.io.Closeable) r4, (java.lang.Throwable) null);
            return l5;
        } catch (java.lang.Throwable th7) {
            th = th7;
            r2 = 3;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.sil silVar = new defpackage.sil(this.g, this.h, this.i, aolnVar);
        silVar.j = obj;
        return silVar;
    }
}
