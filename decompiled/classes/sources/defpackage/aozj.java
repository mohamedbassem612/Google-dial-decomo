package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aozj extends defpackage.aozs implements defpackage.aoxb, defpackage.apaj, defpackage.aozh, defpackage.aoyq {
    private final defpackage.aorq a;
    private int b;

    public aozj(java.lang.Object obj) {
        this.a = new defpackage.aorq(obj, defpackage.aorr.a);
    }

    private final boolean g(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        defpackage.aozu[] aozuVarArr;
        defpackage.apcm apcmVar;
        synchronized (this) {
            defpackage.aorq aorqVar = this.a;
            java.lang.Object obj3 = aorqVar.a;
            if (obj != null && !defpackage.aooh.n(obj3, obj)) {
                return false;
            }
            if (!defpackage.aooh.n(obj3, obj2)) {
                aorqVar.c(obj2);
                int i2 = this.b;
                if ((i2 & 1) == 0) {
                    int i3 = i2 + 1;
                    this.b = i3;
                    defpackage.aozu[] aozuVarArr2 = this.d;
                    while (true) {
                        defpackage.aozl[] aozlVarArr = (defpackage.aozl[]) aozuVarArr2;
                        if (aozlVarArr != null) {
                            for (defpackage.aozl aozlVar : aozlVarArr) {
                                if (aozlVar != null) {
                                    while (true) {
                                        java.util.concurrent.atomic.AtomicReference atomicReference = aozlVar.a;
                                        java.lang.Object obj4 = atomicReference.get();
                                        if (obj4 == null || obj4 == (apcmVar = defpackage.aozk.b)) {
                                            break;
                                        }
                                        defpackage.apcm apcmVar2 = defpackage.aozk.a;
                                        if (obj4 != apcmVar2) {
                                            if (defpackage.anty.Q(atomicReference, obj4, apcmVar2)) {
                                                ((defpackage.aosc) obj4).w(defpackage.aojh.a);
                                                break;
                                            }
                                        } else {
                                            if (defpackage.anty.Q(atomicReference, obj4, apcmVar)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i = this.b;
                            if (i == i3) {
                                break;
                            }
                            aozuVarArr = this.d;
                        }
                        aozuVarArr2 = aozuVarArr;
                        i3 = i;
                    }
                    this.b = i3 + 1;
                } else {
                    this.b = i2 + 2;
                }
            }
            return true;
        }
    }

    @Override // defpackage.aoyq, defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        e(obj);
        return defpackage.aojh.a;
    }

    @Override // defpackage.aozh
    public final java.lang.Object c() {
        defpackage.apcm apcmVar = defpackage.apam.a;
        java.lang.Object obj = this.a.a;
        if (obj == apcmVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.aoyq
    public final boolean d(java.lang.Object obj) {
        e(obj);
        return true;
    }

    public final void e(java.lang.Object obj) {
        if (obj == null) {
            obj = defpackage.apam.a;
        }
        g(null, obj);
    }

    public final boolean f(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            obj = defpackage.apam.a;
        }
        if (obj2 == null) {
            obj2 = defpackage.apam.a;
        }
        return g(obj, obj2);
    }

    @Override // defpackage.apaj
    public final defpackage.aoxh fL(defpackage.aolr aolrVar, int i, int i2) {
        return defpackage.aozk.b(this, aolrVar, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e A[Catch: all -> 0x00ef, PHI: r2 r7 r8 r13
      0x007e: PHI (r2v5 ??) = (r2v3 ??), (r2v4 ??), (r2v4 ??), (r2v4 ??), (r2v7 ??) binds: [B:29:0x006f, B:47:0x00b8, B:65:0x007e, B:58:0x00ec, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r7v5 aozl) = (r7v3 aozl), (r7v4 aozl), (r7v4 aozl), (r7v4 aozl), (r7v8 aozl) binds: [B:29:0x006f, B:47:0x00b8, B:65:0x007e, B:58:0x00ec, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r8v2 ??) = (r8v0 ??), (r8v1 ??), (r8v1 ??), (r8v1 ??), (r8v4 ??) binds: [B:29:0x006f, B:47:0x00b8, B:65:0x007e, B:58:0x00ec, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r13v5 java.lang.Object) = 
      (r13v3 java.lang.Object)
      (r13v4 java.lang.Object)
      (r13v4 java.lang.Object)
      (r13v4 java.lang.Object)
      (r13v15 java.lang.Object)
     binds: [B:29:0x006f, B:47:0x00b8, B:65:0x007e, B:58:0x00ec, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00ef, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b1, B:46:0x00b4, B:48:0x00ba, B:50:0x00d6, B:51:0x00db, B:55:0x00e5, B:57:0x00ea, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b1, B:46:0x00b4, B:48:0x00ba, B:50:0x00d6, B:51:0x00db, B:55:0x00e5, B:57:0x00ea, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0089 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b1, B:46:0x00b4, B:48:0x00ba, B:50:0x00d6, B:51:0x00db, B:55:0x00e5, B:57:0x00ea, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b1, B:46:0x00b4, B:48:0x00ba, B:50:0x00d6, B:51:0x00db, B:55:0x00e5, B:57:0x00ea, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b1, B:46:0x00b4, B:48:0x00ba, B:50:0x00d6, B:51:0x00db, B:55:0x00e5, B:57:0x00ea, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b1, B:46:0x00b4, B:48:0x00ba, B:50:0x00d6, B:51:0x00db, B:55:0x00e5, B:57:0x00ea, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #0 {all -> 0x00ef, blocks: (B:14:0x0032, B:30:0x007e, B:32:0x0084, B:34:0x0089, B:43:0x00a7, B:45:0x00b1, B:46:0x00b4, B:48:0x00ba, B:50:0x00d6, B:51:0x00db, B:55:0x00e5, B:57:0x00ea, B:36:0x008f, B:40:0x0096, B:19:0x0046, B:22:0x004e, B:29:0x006f, B:25:0x005c, B:27:0x0060), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [aozj, aozs] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [aoub] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00b8 -> B:30:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.aoxh
    public final java.lang.Object fM(defpackage.aoxi r13, defpackage.aoln r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aozj.fM(aoxi, aoln):java.lang.Object");
    }

    @Override // defpackage.aoyq
    public final void fN() {
        throw new java.lang.UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.aozs
    public final /* synthetic */ defpackage.aozu i() {
        return new defpackage.aozl();
    }

    @Override // defpackage.aozs
    public final /* bridge */ /* synthetic */ defpackage.aozu[] l() {
        return new defpackage.aozl[2];
    }
}
