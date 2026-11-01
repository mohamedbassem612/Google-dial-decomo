package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sij extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ java.lang.String f;
    final /* synthetic */ java.lang.String g;
    final /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sij(adzd adzdVar, java.lang.String str, java.lang.String str2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.h = adzdVar;
        this.f = str;
        this.g = str2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ahoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ahoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.io.Closeable] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        aolu aoluVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        ?? Z;
        java.lang.Object obj4;
        java.lang.Throwable th;
        ?? r9;
        ?? r10;
        java.lang.Object obj5;
        java.lang.Object obj6;
        ?? Z2;
        java.lang.Object obj7;
        java.lang.Throwable th2;
        ?? r11;
        ?? r12;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Throwable th3;
        java.lang.Object obj12;
        int i = this.$cid;
        if (i == 0) {
            aoluVar = aolu.a;
            int i2 = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    r9 = (java.io.Closeable) this.a;
                    try {
                        aooc.af(obj);
                        r10 = r9;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th5) {
                            ajsz.ak((java.io.Closeable) r9, th);
                            throw th5;
                        }
                    }
                } else {
                    Z = this.d;
                    obj4 = this.c;
                    obj3 = this.b;
                    obj2 = (sin) this.a;
                    try {
                        aooc.af(obj);
                        Z = Z;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r9 = Z;
                        throw th;
                    }
                }
                ajsz.ak((java.io.Closeable) r10, (java.lang.Throwable) null);
                return obj;
            }
            aooc.af(obj);
            obj2 = this.h;
            obj3 = this.f;
            java.lang.String str = this.g;
            if (!ahvr.R(u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            Z = ahvr.Z(814, "PatrickStorage_loadSelfMyCallingCard");
            try {
                this.a = obj2;
                this.b = obj3;
                this.c = str;
                this.d = Z;
                this.e = 1;
                java.lang.Object objE = ((sin) obj2).e(this);
                if (objE != aoluVar) {
                    obj4 = str;
                    obj = objE;
                    Z = Z;
                }
                return aoluVar;
            } catch (java.lang.Throwable th7) {
                th = th7;
                r9 = Z;
                throw th;
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                ajsz.ak((java.io.Closeable) Z, (java.lang.Throwable) null);
                return null;
            }
            sia siaVar = ((sin) obj2).d;
            this.a = Z;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 2;
            obj = siaVar.g((java.lang.String) obj3, (java.lang.String) obj4, this);
            if (obj != aoluVar) {
                r10 = Z;
                ajsz.ak((java.io.Closeable) r10, (java.lang.Throwable) null);
                return obj;
            }
            return aoluVar;
        }
        if (i != 1) {
            aoluVar = aolu.a;
            int i3 = this.e;
            try {
                if (i3 == 0) {
                    aooc.af(obj);
                    obj8 = this.h;
                    java.lang.String str2 = this.f;
                    obj9 = this.g;
                    apdp apdpVar = ((adzd) obj8).e;
                    this.a = apdpVar;
                    this.b = obj8;
                    this.c = str2;
                    this.d = obj9;
                    this.e = 1;
                    if (apdpVar.b(this) != aoluVar) {
                        obj10 = str2;
                        obj11 = apdpVar;
                    }
                } else {
                    if (i3 != 1) {
                        obj12 = this.a;
                        try {
                            aooc.af(obj);
                            obj12 = obj12;
                            adtz adtzVar = (adtz) obj;
                            ((apdp) obj12).d();
                            return adtzVar;
                        } catch (java.lang.Throwable th8) {
                            th3 = th8;
                            ((apdp) obj12).d();
                            throw th3;
                        }
                    }
                    obj9 = this.d;
                    obj10 = this.c;
                    obj8 = this.b;
                    java.lang.Object obj13 = this.a;
                    aooc.af(obj);
                    obj11 = obj13;
                }
                this.a = obj11;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 2;
                int i4 = adzd.h;
                obj = ((adzd) obj8).p((java.lang.String) obj10, (java.lang.String) obj9, this);
                if (obj != aoluVar) {
                    obj12 = obj11;
                    adtz adtzVar2 = (adtz) obj;
                    ((apdp) obj12).d();
                    return adtzVar2;
                }
            } catch (java.lang.Throwable th9) {
                th3 = th9;
                obj12 = obj11;
                ((apdp) obj12).d();
                throw th3;
            }
        } else {
            aoluVar = aolu.a;
            int i5 = this.e;
            if (i5 != 0) {
                if (i5 != 1) {
                    r11 = (java.io.Closeable) this.a;
                    try {
                        aooc.af(obj);
                        r12 = r11;
                    } catch (java.lang.Throwable th10) {
                        th2 = th10;
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th11) {
                            ajsz.ak((java.io.Closeable) r11, th2);
                            throw th11;
                        }
                    }
                } else {
                    Z2 = this.d;
                    obj7 = this.c;
                    obj6 = this.b;
                    obj5 = (sin) this.a;
                    try {
                        aooc.af(obj);
                        Z2 = Z2;
                    } catch (java.lang.Throwable th12) {
                        th2 = th12;
                        r11 = Z2;
                        throw th2;
                    }
                }
                ajsz.ak((java.io.Closeable) r12, (java.lang.Throwable) null);
                return obj;
            }
            aooc.af(obj);
            obj5 = this.h;
            obj6 = this.g;
            java.lang.String str3 = this.f;
            if (!ahvr.R(u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            Z2 = ahvr.Z(813, "PatrickStorage_fetchMyCallingCard");
            try {
                this.a = obj5;
                this.b = obj6;
                this.c = str3;
                this.d = Z2;
                this.e = 1;
                java.lang.Object objE2 = ((sin) obj5).e(this);
                if (objE2 != aoluVar) {
                    obj7 = str3;
                    obj = objE2;
                    Z2 = Z2;
                }
            } catch (java.lang.Throwable th13) {
                th2 = th13;
                r11 = Z2;
                throw th2;
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                ajsz.ak((java.io.Closeable) Z2, (java.lang.Throwable) null);
                return null;
            }
            sia siaVar2 = ((sin) obj5).d;
            this.a = Z2;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 2;
            obj = siaVar2.f((java.lang.String) obj6, (java.lang.String) obj7, this);
            if (obj != aoluVar) {
                r12 = Z2;
                ajsz.ak((java.io.Closeable) r12, (java.lang.Throwable) null);
                return obj;
            }
        }
        return aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.sij((sin) this.h, this.f, this.g, aolnVar, 0);
        }
        java.lang.Object obj2 = this.h;
        if (i != 1) {
            return new defpackage.sij((adzd) obj2, this.f, this.g, aolnVar, 2);
        }
        return new defpackage.sij((sin) obj2, this.g, this.f, aolnVar, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sij(sin sinVar, java.lang.String str, java.lang.String str2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.h = sinVar;
        this.f = str;
        this.g = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sij(sin sinVar, java.lang.String str, java.lang.String str2, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.h = sinVar;
        this.g = str;
        this.f = str2;
    }
}
