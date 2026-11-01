package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uce implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ uce(android.content.Context context, aoin aoinVar, aoin aoinVar2, int i) {
        this.$cid = i;
        this.a = context;
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, rlv] */
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            ?? r0 = this.c;
            return new defpackage.ucf((android.content.Context) this.a, this.b, r0);
        }
        ?? r1 = this.c;
        if (i != 1) {
            return new defpackage.wqj(this.b, (aogc) this.a, r1);
        }
        java.lang.Object obj = this.a;
        final defpackage.swi swiVar = (defpackage.swi) this.b;
        final defpackage.pqo pqoVar = (defpackage.pqo) obj;
        final java.lang.String str = (java.lang.String) r1;
        return new zog() { // from class: swe
            public final /* synthetic */ int a() {
                return 0;
            }

            public final void b(android.telecom.Call.Details details) {
                aooh.f(details, "callDetails");
                aooh.f(details, "callDetails");
                defpackage.pqo pqoVar2 = pqoVar;
                aooh.f(pqoVar2, "callDirection");
                java.lang.String str2 = str;
                aooh.f(str2, "callId");
                aimz aimzVar = zih.a;
                defpackage.swi swiVar2 = swiVar;
                swiVar2.c(aoov.al(swiVar2.c, zih.b.plus(aols.a), 1, new defpackage.zgt((aoln) null, swiVar2, details, pqoVar2, str2, 1)));
            }
        };
    }

    public /* synthetic */ uce(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
