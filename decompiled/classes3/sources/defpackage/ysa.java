package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ysa extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.ysb e;
    final /* synthetic */ defpackage.yse f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysa(defpackage.ysb ysbVar, defpackage.yse yseVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = ysbVar;
        this.f = yseVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:7:0x0016, B:21:0x0087, B:38:0x00c6, B:24:0x009a, B:27:0x00a1, B:28:0x00a7, B:29:0x00aa, B:40:0x00ef, B:41:0x00f2, B:31:0x00b0, B:32:0x00b7, B:10:0x0024, B:18:0x0070, B:15:0x0045), top: B:51:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:7:0x0016, B:21:0x0087, B:38:0x00c6, B:24:0x009a, B:27:0x00a1, B:28:0x00a7, B:29:0x00aa, B:40:0x00ef, B:41:0x00f2, B:31:0x00b0, B:32:0x00b7, B:10:0x0024, B:18:0x0070, B:15:0x0045), top: B:51:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:7:0x0016, B:21:0x0087, B:38:0x00c6, B:24:0x009a, B:27:0x00a1, B:28:0x00a7, B:29:0x00aa, B:40:0x00ef, B:41:0x00f2, B:31:0x00b0, B:32:0x00b7, B:10:0x0024, B:18:0x0070, B:15:0x0045), top: B:51:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:7:0x0016, B:21:0x0087, B:38:0x00c6, B:24:0x009a, B:27:0x00a1, B:28:0x00a7, B:29:0x00aa, B:40:0x00ef, B:41:0x00f2, B:31:0x00b0, B:32:0x00b7, B:10:0x0024, B:18:0x0070, B:15:0x0045), top: B:51:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.ysb ysbVar;
        aosy aosyVarAm;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.yta ytaVar;
        java.lang.Object obj4;
        defpackage.ysb ysbVar2;
        ?? r1;
        defpackage.ysc yscVar;
        int i;
        aolu aoluVar = aolu.a;
        ?? r2 = this.d;
        try {
            if (r2 != 0) {
                java.lang.Object obj5 = this.c;
                if (r2 != 1) {
                    ytaVar = (defpackage.yta) obj5;
                    java.lang.Object obj6 = this.b;
                    obj4 = this.a;
                    ysbVar2 = (defpackage.ysb) this.g;
                    aooc.af(obj);
                    r1 = obj6;
                } else {
                    aosyVarAm = (aosy) obj5;
                    java.lang.Object obj7 = this.b;
                    obj2 = this.a;
                    ysbVar = (defpackage.ysb) this.g;
                    aooc.af(obj);
                    obj3 = obj7;
                }
                yscVar = new defpackage.ysc(ytaVar, ((java.lang.Boolean) obj).booleanValue());
                if (yscVar.a()) {
                    i = 7;
                } else if (yscVar.b) {
                    switch (yscVar.a.ordinal()) {
                        case 0:
                            i = 10;
                            break;
                        case 1:
                            i = 8;
                            break;
                        case 2:
                            i = 17;
                            break;
                        case 3:
                            i = 9;
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            i = 11;
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            throw new java.lang.IllegalStateException("unexpected status");
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            i = 13;
                            break;
                        default:
                            throw new aois();
                    }
                } else {
                    i = 12;
                }
                zzx zzxVar = ysbVar2.h;
                xtq xtqVarE = wsc.E(ysv.a.m());
                xtqVarE.i(defpackage.yqm.e((defpackage.yse) obj4));
                xtqVarE.h(i);
                zzxVar.l(new ysw(xtqVarE.g()));
                ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                return yscVar;
            }
            aooc.af(obj);
            aoss aossVar = (aoss) this.g;
            ysbVar = this.e;
            defpackage.yse yseVar = this.f;
            if (!ahvr.R(u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1183, "AiCoreAvailability_getFreshAvailability");
            aosy aosyVarAm2 = aoov.am(aossVar, 0, new defpackage.vjf(ysbVar, yseVar, (aoln) null, 19), 3);
            aosyVarAm = aoov.am(aossVar, 0, new defpackage.vjf(ysbVar, yseVar, (aoln) null, 20, (byte[]) null), 3);
            this.g = ysbVar;
            this.a = yseVar;
            this.b = ahoqVarZ;
            this.c = aosyVarAm;
            this.d = 1;
            obj = aosyVarAm2.a(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj2 = yseVar;
            obj3 = ahoqVarZ;
            defpackage.yta ytaVar2 = (defpackage.yta) obj;
            this.g = ysbVar;
            this.a = obj2;
            this.b = obj3;
            this.c = ytaVar2;
            this.d = 2;
            java.lang.Object objA = aosyVarAm.a(this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            ytaVar = ytaVar2;
            obj4 = obj2;
            obj = objA;
            ysbVar2 = ysbVar;
            r1 = obj3;
            yscVar = new defpackage.ysc(ytaVar, ((java.lang.Boolean) obj).booleanValue());
            if (yscVar.a()) {
                i = 7;
            } else if (yscVar.b) {
                i = 12;
            } else {
                switch (yscVar.a.ordinal()) {
                    case 0:
                        i = 10;
                        break;
                    case 1:
                        i = 8;
                        break;
                    case 2:
                        i = 17;
                        break;
                    case 3:
                        i = 9;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        i = 11;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        throw new java.lang.IllegalStateException("unexpected status");
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        i = 13;
                        break;
                    default:
                        throw new aois();
                }
            }
            zzx zzxVar2 = ysbVar2.h;
            xtq xtqVarE2 = wsc.E(ysv.a.m());
            xtqVarE2.i(defpackage.yqm.e((defpackage.yse) obj4));
            xtqVarE2.h(i);
            zzxVar2.l(new ysw(xtqVarE2.g()));
            ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
            return yscVar;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak((java.io.Closeable) r2, th);
                throw th2;
            }
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ysa ysaVar = new defpackage.ysa(this.e, this.f, aolnVar);
        ysaVar.g = obj;
        return ysaVar;
    }
}
