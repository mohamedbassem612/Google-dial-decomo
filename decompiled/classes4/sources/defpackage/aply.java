package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aply extends defpackage.aplw {
    final /* synthetic */ defpackage.apmc c;
    private long d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aply(defpackage.apmc apmcVar, apiw apiwVar) {
        super(apmcVar, apiwVar);
        this.c = apmcVar;
        this.d = -1L;
        this.e = true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0140 A[ADDED_TO_REGION, EDGE_INSN: B:102:0x0140->B:68:0x0140 BREAK  A[LOOP:1: B:34:0x00a9->B:67:0x0138], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x010e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[Catch: NumberFormatException -> 0x01de, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01de, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:29:0x0081, B:30:0x0099, B:31:0x009a, B:34:0x00a9, B:36:0x00b6, B:39:0x00bc, B:50:0x00da, B:52:0x00e2, B:53:0x00f3, B:54:0x010d, B:44:0x00c9, B:49:0x00d6, B:62:0x0126, B:65:0x0134, B:68:0x0140, B:70:0x0163, B:72:0x0169, B:86:0x01b7, B:87:0x01d7, B:63:0x0130, B:58:0x0114, B:59:0x0121, B:88:0x01d8, B:89:0x01dd), top: B:95:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[Catch: NumberFormatException -> 0x01de, TryCatch #0 {NumberFormatException -> 0x01de, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:29:0x0081, B:30:0x0099, B:31:0x009a, B:34:0x00a9, B:36:0x00b6, B:39:0x00bc, B:50:0x00da, B:52:0x00e2, B:53:0x00f3, B:54:0x010d, B:44:0x00c9, B:49:0x00d6, B:62:0x0126, B:65:0x0134, B:68:0x0140, B:70:0x0163, B:72:0x0169, B:86:0x01b7, B:87:0x01d7, B:63:0x0130, B:58:0x0114, B:59:0x0121, B:88:0x01d8, B:89:0x01dd), top: B:95:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2 A[Catch: NumberFormatException -> 0x01de, LOOP:2: B:35:0x00b4->B:52:0x00e2, LOOP_END, TryCatch #0 {NumberFormatException -> 0x01de, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:29:0x0081, B:30:0x0099, B:31:0x009a, B:34:0x00a9, B:36:0x00b6, B:39:0x00bc, B:50:0x00da, B:52:0x00e2, B:53:0x00f3, B:54:0x010d, B:44:0x00c9, B:49:0x00d6, B:62:0x0126, B:65:0x0134, B:68:0x0140, B:70:0x0163, B:72:0x0169, B:86:0x01b7, B:87:0x01d7, B:63:0x0130, B:58:0x0114, B:59:0x0121, B:88:0x01d8, B:89:0x01dd), top: B:95:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0112 A[EDGE_INSN: B:57:0x0112->B:61:0x0124 BREAK  A[LOOP:2: B:35:0x00b4->B:52:0x00e2]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0126 A[Catch: NumberFormatException -> 0x01de, TryCatch #0 {NumberFormatException -> 0x01de, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:29:0x0081, B:30:0x0099, B:31:0x009a, B:34:0x00a9, B:36:0x00b6, B:39:0x00bc, B:50:0x00da, B:52:0x00e2, B:53:0x00f3, B:54:0x010d, B:44:0x00c9, B:49:0x00d6, B:62:0x0126, B:65:0x0134, B:68:0x0140, B:70:0x0163, B:72:0x0169, B:86:0x01b7, B:87:0x01d7, B:63:0x0130, B:58:0x0114, B:59:0x0121, B:88:0x01d8, B:89:0x01dd), top: B:95:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0130 A[Catch: NumberFormatException -> 0x01de, TryCatch #0 {NumberFormatException -> 0x01de, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:29:0x0081, B:30:0x0099, B:31:0x009a, B:34:0x00a9, B:36:0x00b6, B:39:0x00bc, B:50:0x00da, B:52:0x00e2, B:53:0x00f3, B:54:0x010d, B:44:0x00c9, B:49:0x00d6, B:62:0x0126, B:65:0x0134, B:68:0x0140, B:70:0x0163, B:72:0x0169, B:86:0x01b7, B:87:0x01d7, B:63:0x0130, B:58:0x0114, B:59:0x0121, B:88:0x01d8, B:89:0x01dd), top: B:95:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0134 A[Catch: NumberFormatException -> 0x01de, TryCatch #0 {NumberFormatException -> 0x01de, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:29:0x0081, B:30:0x0099, B:31:0x009a, B:34:0x00a9, B:36:0x00b6, B:39:0x00bc, B:50:0x00da, B:52:0x00e2, B:53:0x00f3, B:54:0x010d, B:44:0x00c9, B:49:0x00d6, B:62:0x0126, B:65:0x0134, B:68:0x0140, B:70:0x0163, B:72:0x0169, B:86:0x01b7, B:87:0x01d7, B:63:0x0130, B:58:0x0114, B:59:0x0121, B:88:0x01d8, B:89:0x01dd), top: B:95:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8 A[Catch: NumberFormatException -> 0x01de, TryCatch #0 {NumberFormatException -> 0x01de, blocks: (B:16:0x0036, B:17:0x0045, B:20:0x0063, B:29:0x0081, B:30:0x0099, B:31:0x009a, B:34:0x00a9, B:36:0x00b6, B:39:0x00bc, B:50:0x00da, B:52:0x00e2, B:53:0x00f3, B:54:0x010d, B:44:0x00c9, B:49:0x00d6, B:62:0x0126, B:65:0x0134, B:68:0x0140, B:70:0x0163, B:72:0x0169, B:86:0x01b7, B:87:0x01d7, B:63:0x0130, B:58:0x0114, B:59:0x0121, B:88:0x01d8, B:89:0x01dd), top: B:95:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x009a A[EDGE_INSN: B:96:0x009a->B:31:0x009a BREAK  A[LOOP:0: B:17:0x0045->B:27:0x0079], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r23.e != false) goto L79;
     */
    @Override // defpackage.aplw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(apoy r24, long r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aply.b(apoy, long):long");
    }

    public final void close() {
        if (this.a) {
            return;
        }
        if (this.e && !apjx.m(this, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            this.c.c.g();
            c(defpackage.apmc.a);
        }
        d();
    }
}
