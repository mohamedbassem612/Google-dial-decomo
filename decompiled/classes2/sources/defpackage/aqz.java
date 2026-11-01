package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aqz extends aomg implements aonn {
    java.lang.Object a;
    int b;
    int c;
    final /* synthetic */ aoop d;
    final /* synthetic */ aoot e;
    final /* synthetic */ aoot f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqz(aoop aoopVar, aoot aootVar, aoot aootVar2, aoln aolnVar) {
        super(aolnVar);
        this.d = aoopVar;
        this.e = aootVar;
        this.f = aootVar2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f A[LOOP:2: B:13:0x0041->B:16:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0053 A[EDGE_INSN: B:64:0x0053->B:18:0x0053 BREAK  A[LOOP:2: B:13:0x0041->B:16:0x004f], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0092 -> B:31:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqz.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aqz aqzVar = new defpackage.aqz(this.d, this.e, this.f, aolnVar);
        aqzVar.g = obj;
        return aqzVar;
    }
}
