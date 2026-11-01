package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yuf extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuf(sin sinVar, java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = sinVar;
        this.f = list;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:22:0x0055, B:24:0x005d, B:28:0x0078, B:29:0x007f, B:20:0x0044), top: B:50:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:22:0x0055, B:24:0x005d, B:28:0x0078, B:29:0x007f, B:20:0x0044), top: B:50:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Collection] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object objZ;
        java.lang.Throwable th;
        ?? r7;
        java.lang.Object objE;
        ?? r2;
        java.lang.Object objC;
        ?? r8;
        if (this.$cid == 0) {
            aolu aoluVar = aolu.a;
            if (this.d != 0) {
                obj3 = this.c;
                obj2 = this.b;
                obj4 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                java.lang.Object obj6 = this.e;
                java.lang.Object obj7 = this.f;
                java.lang.Object obj8 = ((defpackage.uyg) obj6).a;
                this.a = obj8;
                this.b = obj6;
                this.c = obj7;
                this.d = 1;
                if (((apdp) obj8).b(this) == aoluVar) {
                    return aoluVar;
                }
                obj2 = obj6;
                obj3 = obj7;
                obj4 = obj8;
            }
            try {
                j$.util.Collection.-EL.removeIf((java.util.Collection) ((defpackage.uyg) obj2).b, new vpl(new defpackage.xms(obj3, 7), 16));
                return aojh.a;
            } finally {
                ((apdp) obj4).d();
            }
        }
        aolu aoluVar2 = aolu.a;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                r7 = (java.io.Closeable) this.a;
                try {
                    aooc.af(obj);
                    r8 = r7;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } else {
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.b;
                obj5 = (sin) this.a;
                try {
                    aooc.af(obj);
                    objE = obj;
                    objZ = obj9;
                    r2 = obj10;
                    if (((java.lang.Boolean) objE).booleanValue()) {
                        throw new java.lang.IllegalStateException("My Calling Card Storage API is not available");
                    }
                    sia siaVar = ((sin) obj5).d;
                    this.a = objZ;
                    this.b = null;
                    this.c = null;
                    this.d = 2;
                    objC = siaVar.c((java.util.List) r2, this);
                    if (objC != aoluVar2) {
                        return aoluVar2;
                    }
                    java.lang.Object obj11 = objZ;
                    obj = objC;
                    r8 = obj11;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    r7 = obj9;
                }
            }
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak((java.io.Closeable) r7, th);
                throw th4;
            }
        }
        aooc.af(obj);
        obj5 = this.e;
        java.lang.Object obj12 = this.f;
        if (!ahvr.R(u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        objZ = ahvr.Z(809, "PatrickStorage_deleteMyCallingCard");
        try {
            this.a = obj5;
            this.b = obj12;
            this.c = objZ;
            this.d = 1;
            objE = ((sin) obj5).e(this);
            r2 = obj12;
            if (objE == aoluVar2) {
                return aoluVar2;
            }
            if (((java.lang.Boolean) objE).booleanValue()) {
                throw new java.lang.IllegalStateException("My Calling Card Storage API is not available");
            }
            sia siaVar2 = ((sin) obj5).d;
            this.a = objZ;
            this.b = null;
            this.c = null;
            this.d = 2;
            objC = siaVar2.c((java.util.List) r2, this);
            if (objC != aoluVar2) {
                return aoluVar2;
            }
            java.lang.Object obj13 = objZ;
            obj = objC;
            r8 = obj13;
        } catch (java.lang.Throwable th5) {
            th = th5;
            r7 = objZ;
        }
        ajsz.ak((java.io.Closeable) r8, (java.lang.Throwable) null);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.e;
        if (i != 0) {
            return new defpackage.yuf((sin) obj2, (java.util.List) this.f, aolnVar, 1);
        }
        return new defpackage.yuf((defpackage.uyg) obj2, (java.util.UUID) this.f, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuf(defpackage.uyg uygVar, java.util.UUID uuid, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = uygVar;
        this.f = uuid;
    }
}
