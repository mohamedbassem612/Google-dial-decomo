package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nux implements defpackage.nvh {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/wear/bam/synctowear/BamConversationStateSyncEventListener");
    public final defpackage.nuz b;
    public final aoin c;
    public boolean d;
    public final apdp e;
    private final aolr f;

    public nux(aolr aolrVar, defpackage.nuz nuzVar, aoin aoinVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.f = aolrVar;
        this.b = nuzVar;
        this.c = aoinVar;
        this.e = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nvh
    public final java.lang.Object a(defpackage.nvg nvgVar, aoln aolnVar) {
        defpackage.nuv nuvVar;
        if (aolnVar instanceof defpackage.nuv) {
            nuvVar = (defpackage.nuv) aolnVar;
            int i = nuvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nuvVar.c = i - Integer.MIN_VALUE;
            } else {
                nuvVar = new defpackage.nuv(this, aolnVar);
            }
        } else {
            nuvVar = new defpackage.nuv(this, aolnVar);
        }
        java.lang.Object obj = nuvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nuvVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aolr aolrVar = this.f;
            defpackage.lnb lnbVar = new defpackage.lnb(this, nvgVar, (aoln) null, 5);
            nuvVar.c = 1;
            if (aoov.aj(aolrVar, lnbVar, nuvVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
