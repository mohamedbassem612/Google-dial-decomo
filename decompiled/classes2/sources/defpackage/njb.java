package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class njb extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njb(java.lang.String str, defpackage.njd njdVar, java.lang.String str2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = str;
        this.e = njdVar;
        this.c = str2;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0163 A[Catch: Exception -> 0x0176, TryCatch #2 {Exception -> 0x0176, blocks: (B:25:0x0073, B:51:0x0163, B:52:0x0173, B:26:0x0078, B:31:0x00a4, B:33:0x00e1, B:34:0x00e7, B:37:0x0112, B:45:0x014a, B:48:0x014d, B:29:0x0096, B:38:0x0113, B:40:0x0117, B:42:0x0146), top: B:116:0x006d, inners: #3 }] */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x026c, code lost:
    
        if (r5.b(r12, r11) != r0) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njb.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.d;
            return new defpackage.njb((java.lang.String) obj2, (defpackage.njd) this.e, this.c, aolnVar, 0);
        }
        if (i == 1) {
            java.lang.Object obj3 = this.d;
            return new defpackage.njb((java.lang.String) obj3, (defpackage.njd) this.e, this.c, aolnVar, 1, null);
        }
        if (i == 2) {
            return new defpackage.njb((rzs) this.e, this.c, (java.lang.String) this.d, aolnVar, 2);
        }
        return new defpackage.njb(this.c, (sjy) this.e, (byte[]) this.d, aolnVar, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njb(java.lang.String str, defpackage.njd njdVar, java.lang.String str2, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = str;
        this.e = njdVar;
        this.c = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njb(java.lang.String str, sjy sjyVar, byte[] bArr, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = str;
        this.e = sjyVar;
        this.d = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njb(rzs rzsVar, java.lang.String str, java.lang.String str2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = rzsVar;
        this.c = str;
        this.d = str2;
    }
}
