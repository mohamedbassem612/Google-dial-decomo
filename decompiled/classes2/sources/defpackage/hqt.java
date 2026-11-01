package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqt extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqt(defpackage.hlk hlkVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = hlkVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((defpackage.ze) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aojh) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0124 A[Catch: all -> 0x0199, TryCatch #6 {all -> 0x0199, blocks: (B:28:0x00b9, B:39:0x011c, B:41:0x0124, B:43:0x0144, B:44:0x0147, B:37:0x010b, B:46:0x014b, B:47:0x014f, B:49:0x0156, B:51:0x015a, B:52:0x015e, B:54:0x0164, B:56:0x0174), top: B:198:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0144 A[Catch: all -> 0x0199, TryCatch #6 {all -> 0x0199, blocks: (B:28:0x00b9, B:39:0x011c, B:41:0x0124, B:43:0x0144, B:44:0x0147, B:37:0x010b, B:46:0x014b, B:47:0x014f, B:49:0x0156, B:51:0x015a, B:52:0x015e, B:54:0x0164, B:56:0x0174), top: B:198:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x014b A[Catch: all -> 0x0199, TryCatch #6 {all -> 0x0199, blocks: (B:28:0x00b9, B:39:0x011c, B:41:0x0124, B:43:0x0144, B:44:0x0147, B:37:0x010b, B:46:0x014b, B:47:0x014f, B:49:0x0156, B:51:0x015a, B:52:0x015e, B:54:0x0164, B:56:0x0174), top: B:198:0x00b9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011a -> B:39:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqt.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.hqt((defpackage.hqv) this.e, aolnVar, 0);
        }
        if (i == 1) {
            return new defpackage.hqt((defpackage.hlk) this.e, aolnVar, 1);
        }
        java.lang.Object obj2 = this.e;
        return i != 2 ? new defpackage.hqt((defpackage.mvl) obj2, aolnVar, 3) : new defpackage.hqt((defpackage.hxv) obj2, aolnVar, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqt(defpackage.hqv hqvVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = hqvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqt(defpackage.hxv hxvVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = hxvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqt(defpackage.mvl mvlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = mvlVar;
    }
}
