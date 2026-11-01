package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbf extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbf(adzd adzdVar, defpackage.adyn adynVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = adzdVar;
        this.f = adynVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #6 {all -> 0x010a, blocks: (B:42:0x00b7, B:44:0x00bf), top: B:101:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5 A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #0 {all -> 0x0102, blocks: (B:47:0x00e1, B:49:0x00e5), top: B:89:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v28 */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        aolu aoluVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Throwable th;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Throwable th2;
        ?? r8;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        ?? r2;
        java.lang.Long l;
        ?? r9;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                aolu aoluVar2 = aolu.a;
                if (this.d != 0) {
                    obj13 = this.c;
                    obj12 = this.b;
                    obj14 = this.a;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    obj12 = this.e;
                    int i2 = adzd.h;
                    obj13 = this.f;
                    apdp apdpVar = ((adzd) obj12).f;
                    this.a = apdpVar;
                    this.b = obj12;
                    this.c = obj13;
                    this.d = 1;
                    if (apdpVar.b(this) == aoluVar2) {
                        return aoluVar2;
                    }
                    obj14 = apdpVar;
                }
                try {
                    int i3 = adzd.h;
                    return (aosy) ((adzd) obj12).d.remove(obj13);
                } finally {
                    ((apdp) obj14).d();
                }
            }
            aoluVar = aolu.a;
            int i4 = this.d;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        r8 = (java.io.Closeable) this.a;
                        try {
                            aooc.af(obj);
                            r9 = r8;
                        } catch (java.lang.Throwable th3) {
                            th2 = th3;
                        }
                    } else {
                        obj10 = (java.io.Closeable) this.b;
                        obj11 = (sin) this.a;
                        try {
                            aooc.af(obj);
                            obj10 = obj10;
                            try {
                                l = (java.lang.Long) obj;
                                if (l == null) {
                                    r2 = obj10;
                                    ajsz.ak((java.io.Closeable) r2, (java.lang.Throwable) null);
                                    return null;
                                }
                                long jLongValue = l.longValue();
                                sia siaVar = ((sin) obj11).d;
                                this.a = obj10;
                                this.b = null;
                                this.d = 3;
                                obj = siaVar.e(jLongValue, this);
                                if (obj != aoluVar) {
                                    r9 = obj10;
                                }
                            } catch (java.lang.Throwable th4) {
                                th2 = th4;
                                r8 = obj10;
                                throw th2;
                            }
                        } catch (java.lang.Throwable th5) {
                            th2 = th5;
                            r8 = obj10;
                            throw th2;
                        }
                    }
                    ajsz.ak((java.io.Closeable) r9, (java.lang.Throwable) null);
                    return obj;
                }
                obj9 = this.c;
                obj7 = (android.net.Uri) this.b;
                obj8 = (sin) this.a;
                try {
                    aooc.af(obj);
                    obj9 = obj9;
                    try {
                        r2 = obj9;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            android.net.Uri uriWithAppendedPath = android.net.Uri.withAppendedPath((android.net.Uri) obj7, "entity");
                            aooh.e(uriWithAppendedPath, "withAppendedPath(...)");
                            shq shqVar = ((sin) obj8).b;
                            this.a = obj8;
                            this.b = obj9;
                            this.c = null;
                            this.d = 2;
                            obj = shqVar.f(uriWithAppendedPath, this);
                            if (obj != aoluVar) {
                                obj10 = obj9;
                                obj11 = obj8;
                                l = (java.lang.Long) obj;
                                if (l == null) {
                                    long jLongValue2 = l.longValue();
                                    sia siaVar2 = ((sin) obj11).d;
                                    this.a = obj10;
                                    this.b = null;
                                    this.d = 3;
                                    obj = siaVar2.e(jLongValue2, this);
                                    if (obj != aoluVar) {
                                        r9 = obj10;
                                        ajsz.ak((java.io.Closeable) r9, (java.lang.Throwable) null);
                                        return obj;
                                    }
                                } else {
                                    r2 = obj10;
                                }
                            }
                        }
                        ajsz.ak((java.io.Closeable) r2, (java.lang.Throwable) null);
                        return null;
                    } catch (java.lang.Throwable th6) {
                        th2 = th6;
                        r8 = obj9;
                        throw th2;
                    }
                } catch (java.lang.Throwable th7) {
                    th2 = th7;
                    r8 = obj9;
                    throw th2;
                }
            }
            aooc.af(obj);
            java.lang.Object obj15 = this.e;
            obj7 = this.f;
            if (!ahvr.R(u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(812, "PatrickStorage_fetchForContact_uri");
            try {
                this.a = obj15;
                this.b = obj7;
                this.c = ahoqVarZ;
                this.d = 1;
                java.lang.Object objD = ((sin) obj15).d(this);
                if (objD != aoluVar) {
                    obj8 = obj15;
                    obj = objD;
                    obj9 = ahoqVarZ;
                    r2 = obj9;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        android.net.Uri uriWithAppendedPath2 = android.net.Uri.withAppendedPath((android.net.Uri) obj7, "entity");
                        aooh.e(uriWithAppendedPath2, "withAppendedPath(...)");
                        shq shqVar2 = ((sin) obj8).b;
                        this.a = obj8;
                        this.b = obj9;
                        this.c = null;
                        this.d = 2;
                        obj = shqVar2.f(uriWithAppendedPath2, this);
                        if (obj != aoluVar) {
                            obj10 = obj9;
                            obj11 = obj8;
                            l = (java.lang.Long) obj;
                            if (l == null) {
                                long jLongValue3 = l.longValue();
                                sia siaVar3 = ((sin) obj11).d;
                                this.a = obj10;
                                this.b = null;
                                this.d = 3;
                                obj = siaVar3.e(jLongValue3, this);
                                if (obj != aoluVar) {
                                    r9 = obj10;
                                    ajsz.ak((java.io.Closeable) r9, (java.lang.Throwable) null);
                                    return obj;
                                }
                            } else {
                                r2 = obj10;
                            }
                        }
                    }
                    ajsz.ak((java.io.Closeable) r2, (java.lang.Throwable) null);
                    return null;
                }
            } catch (java.lang.Throwable th8) {
                th2 = th8;
                r8 = ahoqVarZ;
            }
            try {
                throw th2;
            } catch (java.lang.Throwable th9) {
                ajsz.ak((java.io.Closeable) r8, th2);
                throw th9;
            }
        }
        aoluVar = aolu.a;
        int i5 = this.d;
        try {
            if (i5 == 0) {
                aooc.af(obj);
                obj2 = this.e;
                java.lang.Object obj16 = this.f;
                apdp apdpVar2 = ((defpackage.wbk) obj2).g;
                this.a = apdpVar2;
                this.b = obj2;
                this.c = obj16;
                this.d = 1;
                if (apdpVar2.b(this) != aoluVar) {
                    obj3 = obj16;
                    obj4 = apdpVar2;
                }
            } else {
                if (i5 != 1) {
                    obj5 = this.a;
                    try {
                        aooc.af(obj);
                        obj6 = obj5;
                        ((apdp) obj6).d();
                        return aojh.a;
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        ((apdp) obj5).d();
                        throw th;
                    }
                }
                obj3 = this.c;
                obj2 = this.b;
                java.lang.Object obj17 = this.a;
                aooc.af(obj);
                obj4 = obj17;
            }
            this.a = obj4;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (((defpackage.wbk) obj2).c((defpackage.wbe) obj3, this) != aoluVar) {
                obj6 = obj4;
                ((apdp) obj6).d();
                return aojh.a;
            }
        } catch (java.lang.Throwable th11) {
            th = th11;
            obj5 = obj4;
            ((apdp) obj5).d();
            throw th;
        }
        return aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.wbf((defpackage.wbk) this.e, (defpackage.wbe) this.f, aolnVar, 0);
        }
        java.lang.Object obj2 = this.e;
        if (i != 1) {
            return new defpackage.wbf((adzd) obj2, (defpackage.adyn) this.f, aolnVar, 2);
        }
        return new defpackage.wbf((sin) obj2, (android.net.Uri) this.f, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbf(sin sinVar, android.net.Uri uri, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = sinVar;
        this.f = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbf(defpackage.wbk wbkVar, defpackage.wbe wbeVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = wbkVar;
        this.f = wbeVar;
    }
}
