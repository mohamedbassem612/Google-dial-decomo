package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sbm extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(amzg amzgVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = amzgVar;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [amzg, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return new defpackage.sbm((defpackage.sbo) this.b, (aoln) obj, 0).b(aojh.a);
            case 1:
                return new defpackage.sbm((defpackage.sbo) this.b, (aoln) obj, 1, (byte[]) null).b(aojh.a);
            case 2:
                return new defpackage.sbm((defpackage.thj) this.b, (aoln) obj, 2).b(aojh.a);
            case 3:
                return new defpackage.sbm((amzg) this.b, (aoln) obj, 3).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.sbm((amzg) this.b, (aoln) obj, 4, (byte[]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.sbm((amzg) this.b, (aoln) obj, 5, (char[]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 6).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 7, (byte[]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 8, (char[]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 9, (short[]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 10, (int[]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 11, (boolean[]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 12, (float[]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 13, (byte[][]) null).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 14, (char[][]) null).b(aojh.a);
            case 15:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 15, (short[][]) null).b(aojh.a);
            case 16:
                return new defpackage.sbm((defpackage.toj) this.b, (aoln) obj, 16, (int[][]) null).b(aojh.a);
            case 17:
                return new defpackage.sbm((defpackage.tqd) this.b, (aoln) obj, 17).b(aojh.a);
            case 18:
                return new defpackage.sbm((defpackage.tqd) this.b, (aoln) obj, 18, (byte[]) null).b(aojh.a);
            case 19:
                return new defpackage.sbm((defpackage.uss) this.b, (aoln) obj, 19).b(aojh.a);
            default:
                return new defpackage.sbm((defpackage.wbk) this.b, (aoln) obj, 20).b(aojh.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x03d7 A[PHI: r12
      0x03d7: PHI (r12v26 java.lang.Object) = (r12v0 java.lang.Object), (r12v31 java.lang.Object) binds: [B:167:0x03c7, B:169:0x03d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x03e1  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025a, code lost:
    
        if (((defpackage.toj) r12).e(r1, r11) != r0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a5, code lost:
    
        if (((defpackage.toj) r12).k(r11) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c6, code lost:
    
        if (((defpackage.toj) r12).s(r11) != r0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02de, code lost:
    
        if (((defpackage.toj) r12).k(r11) != r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02f8, code lost:
    
        if (((defpackage.toj) r12).z.c(r11) != r0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0348, code lost:
    
        if (r12.s(r11) != r0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0362, code lost:
    
        if (r12 != r0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b3, code lost:
    
        if (r12 != r0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0421, code lost:
    
        if (r12 != r0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04a9, code lost:
    
        if (r12 == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (r12.d(r11) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        if (r12.u(r2, false, r11) != r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        if (((defpackage.toj) r12).s(r11) != r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a2, code lost:
    
        if (r12.s(r11) != r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ba, code lost:
    
        if (((defpackage.toj) r12).k(r11) != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fb, code lost:
    
        if (r12.s(r11) != r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0213, code lost:
    
        if (((defpackage.toj) r12).k(r11) != r0) goto L97;
     */
    /* JADX WARN: Type inference failed for: r12v29, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v35, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v49, types: [amzg, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbm.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(amzg amzgVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = amzgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(amzg amzgVar, aoln aolnVar, int i, char[] cArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = amzgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.sbo sboVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = sboVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.sbo sboVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = sboVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.thj thjVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = thjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, char[] cArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, float[] fArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, int[] iArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, short[] sArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, boolean[] zArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, byte[][] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, char[][] cArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, int[][] iArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.toj tojVar, aoln aolnVar, int i, short[][] sArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.tqd tqdVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tqdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.tqd tqdVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tqdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.uss ussVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = ussVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm(defpackage.wbk wbkVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = wbkVar;
    }
}
