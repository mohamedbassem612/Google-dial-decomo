package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sur extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sur(rsr rsrVar, java.lang.String str, java.util.List list, j$.util.Optional optional, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = rsrVar;
        this.d = str;
        this.e = list;
        this.f = optional;
        this.b = z;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r8 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r8 != r0) goto L17;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sur.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            boolean z = this.b;
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.d;
            izg izgVar = (izg) obj3;
            return new defpackage.sur(z, (iqm) obj2, izgVar, (iwy) this.f, (java.lang.String) this.e, aolnVar, 1);
        }
        java.lang.Object obj4 = this.c;
        java.lang.Object obj5 = this.d;
        return new defpackage.sur((rsr) obj4, (java.lang.String) obj5, (java.util.List) this.e, (j$.util.Optional) this.f, this.b, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sur(boolean z, iqm iqmVar, izg izgVar, iwy iwyVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = z;
        this.c = iqmVar;
        this.d = izgVar;
        this.f = iwyVar;
        this.e = str;
    }
}
