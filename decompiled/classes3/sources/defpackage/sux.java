package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sux extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ aoin b;
    final /* synthetic */ boolean c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;
    final /* synthetic */ java.lang.Object g;
    final /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sux(android.telecom.PhoneAccountHandle phoneAccountHandle, amzg amzgVar, defpackage.alin alinVar, aoin aoinVar, android.content.Context context, java.lang.String str, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = phoneAccountHandle;
        this.g = amzgVar;
        this.h = alinVar;
        this.b = aoinVar;
        this.d = context;
        this.f = str;
        this.c = z;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x021d, code lost:
    
        if (r13 != r12) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r13 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        if (r13 == r0) goto L56;
     */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v46, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sux.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r3v2, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.sux((android.telecom.PhoneAccountHandle) this.d, (rlv) this.e, (java.util.Set) this.f, this.b, (java.util.List) this.g, this.c, (defpackage.alin) this.h, aolnVar, 0);
        }
        java.lang.Object obj2 = this.e;
        if (i != 1) {
            ?? r3 = this.g;
            java.lang.Object obj3 = this.h;
            aoin aoinVar = this.b;
            java.lang.Object obj4 = this.d;
            return new defpackage.sux((android.telecom.PhoneAccountHandle) obj2, (amzg) r3, (defpackage.alin) obj3, aoinVar, (android.content.Context) obj4, (java.lang.String) this.f, this.c, aolnVar, 2);
        }
        aoin aoinVar2 = this.b;
        boolean z = this.c;
        java.lang.Object obj5 = this.d;
        java.lang.Object obj6 = this.f;
        return new defpackage.sux((hrc) obj2, aoinVar2, z, (gpd) obj5, (java.lang.String) obj6, (defpackage.spn) this.g, (defpackage.sdw) this.h, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sux(android.telecom.PhoneAccountHandle phoneAccountHandle, rlv rlvVar, java.util.Set set, aoin aoinVar, java.util.List list, boolean z, defpackage.alin alinVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = phoneAccountHandle;
        this.e = rlvVar;
        this.f = set;
        this.b = aoinVar;
        this.g = list;
        this.c = z;
        this.h = alinVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sux(hrc hrcVar, aoin aoinVar, boolean z, gpd gpdVar, java.lang.String str, defpackage.spn spnVar, defpackage.sdw sdwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = hrcVar;
        this.b = aoinVar;
        this.c = z;
        this.d = gpdVar;
        this.f = str;
        this.g = spnVar;
        this.h = sdwVar;
    }
}
