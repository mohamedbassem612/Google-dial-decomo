package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class txm extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(defpackage.afcw afcwVar, defpackage.typ typVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = afcwVar;
        this.b = typVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (((aogc) r10).as((android.database.sqlite.SQLiteDatabase) r1, r9) != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03ac, code lost:
    
        if (r3.c(r9) != r0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03d0, code lost:
    
        if (((defpackage.txp) r10).f((akzc) r1, r9) != r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ee, code lost:
    
        if (((defpackage.txp) r10).f((akzc) r3, r9) == r0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03ff, code lost:
    
        if (r10 == r0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0123, code lost:
    
        if (r10 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fc, code lost:
    
        if (r10 != r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02fd, code lost:
    
        if (((defpackage.tyg) r10).a.c((akzc) r3, r9) == r0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031a, code lost:
    
        if (((defpackage.tyg) r10).a.c((akzc) r1, r9) != r0) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws aois {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txm.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.txm((defpackage.txp) this.b, (akzc) this.c, aolnVar, 0);
            case 1:
                return new defpackage.txm((defpackage.txp) this.b, (akzc) this.c, aolnVar, 1, (byte[]) null);
            case 2:
                return new defpackage.txm((android.content.Intent) this.b, (defpackage.txv) this.c, aolnVar, 2);
            case 3:
                return new defpackage.txm((defpackage.tyg) this.b, (akzc) this.c, aolnVar, 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.txm((defpackage.tyg) this.b, (akzc) this.c, aolnVar, 4, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.txm((defpackage.afcw) this.c, (defpackage.typ) this.b, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.txm((defpackage.tzb) this.b, (akff) this.c, aolnVar, 6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new defpackage.txm((lmq) this.b, (defpackage.udg) this.c, aolnVar, 7);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new defpackage.txm((ueh) this.c, (hkd) this.b, aolnVar, 8);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new defpackage.txm((aogc) this.c, (android.database.sqlite.SQLiteDatabase) this.b, aolnVar, 9);
            default:
                return new defpackage.txm((uft) this.b, (java.lang.String) this.c, aolnVar, 10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(android.content.Intent intent, defpackage.txv txvVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = intent;
        this.c = txvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(aogc aogcVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aogcVar;
        this.b = sQLiteDatabase;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(lmq lmqVar, defpackage.udg udgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = lmqVar;
        this.c = udgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(defpackage.txp txpVar, akzc akzcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = txpVar;
        this.c = akzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(defpackage.txp txpVar, akzc akzcVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = txpVar;
        this.c = akzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(defpackage.tyg tygVar, akzc akzcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tygVar;
        this.c = akzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(defpackage.tyg tygVar, akzc akzcVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tygVar;
        this.c = akzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(defpackage.tzb tzbVar, akff akffVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tzbVar;
        this.c = akffVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(ueh uehVar, hkd hkdVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = uehVar;
        this.b = hkdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txm(uft uftVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = uftVar;
        this.c = str;
    }
}
