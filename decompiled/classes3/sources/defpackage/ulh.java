package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ulh {
    public static final aimz a = aimz.i("com/android/dialer/spamnotification/impl/service/SpamReceiverControllerImpl");
    public final aolr b;
    public final defpackage.ujv c;
    public final j$.util.Optional d;
    public final defpackage.uhp e;
    private final aolr f;
    private final rlv g;

    public ulh(aolr aolrVar, aolr aolrVar2, rlv rlvVar, defpackage.ujv ujvVar, j$.util.Optional optional, defpackage.uhp uhpVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(optional, "spamNotificationSenderOptional");
        this.b = aolrVar;
        this.f = aolrVar2;
        this.g = rlvVar;
        this.c = ujvVar;
        this.d = optional;
        this.e = uhpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ulg ulgVar;
        if (aolnVar instanceof defpackage.ulg) {
            ulgVar = (defpackage.ulg) aolnVar;
            int i = ulgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ulgVar.c = i - Integer.MIN_VALUE;
            } else {
                ulgVar = new defpackage.ulg(this, aolnVar);
            }
        } else {
            ulgVar = new defpackage.ulg(this, aolnVar);
        }
        java.lang.Object obj = ulgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ulgVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aolr aolrVar = this.f;
            defpackage.txf txfVar = new defpackage.txf(this, (aoln) null, 18);
            ulgVar.c = 1;
            if (aoov.aj(aolrVar, txfVar, ulgVar) == aoluVar) {
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

    public final void b(rmw rmwVar, java.lang.String str, long j) {
        this.g.h(rmwVar, str, j);
    }
}
