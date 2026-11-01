package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nuu {
    private static final aimz c = aimz.i("com/android/dialer/dobby/impl/wear/bam/synctophone/BamSyncActionsController");
    public final defpackage.nej a;
    public final aoin b;
    private final android.content.Context d;
    private final aolr e;
    private final defpackage.nbr f;
    private final ipc g;

    public nuu(android.content.Context context, aolr aolrVar, defpackage.nej nejVar, defpackage.nbr nbrVar, ipc ipcVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(nejVar, "dobbyLifecycleController");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.d = context;
        this.e = aolrVar;
        this.a = nejVar;
        this.f = nbrVar;
        this.g = ipcVar;
        this.b = aoinVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(int i, aoln aolnVar) throws aois {
        defpackage.nus nusVar;
        if (aolnVar instanceof defpackage.nus) {
            nusVar = (defpackage.nus) aolnVar;
            int i2 = nusVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nusVar.c = i2 - Integer.MIN_VALUE;
            } else {
                nusVar = new defpackage.nus(this, aolnVar);
            }
        } else {
            nusVar = new defpackage.nus(this, aolnVar);
        }
        java.lang.Object objB = nusVar.a;
        aolu aoluVar = aolu.a;
        int i3 = nusVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                aooc.af(objB);
                return aojh.a;
            }
            if (i3 == 2) {
                aooc.af(objB);
                ((java.lang.Boolean) objB).booleanValue();
                return aojh.a;
            }
            if (i3 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
            android.content.Context context = this.d;
            ipc ipcVar = this.g;
            otc otcVarAo = pez.ao();
            otcVarAo.e(false);
            otcVarAo.d(false);
            otcVarAo.b(false);
            ahqx.l(context, ipcVar.bk(otcVarAo.a()));
            return aojh.a;
        }
        aooc.af(objB);
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i4 == 0) {
            c.b().l("com/android/dialer/dobby/impl/wear/bam/synctophone/BamSyncActionsController", "triggerAction", 52, "BamSyncActionsController.kt").v("User initiated start BAM");
            aolr aolrVar = this.e;
            defpackage.nut nutVar = new defpackage.nut(this, (aoln) null, 0);
            nusVar.c = 3;
            if (aoov.aj(aolrVar, nutVar, nusVar) == aoluVar) {
                return aoluVar;
            }
            android.content.Context context2 = this.d;
            ipc ipcVar2 = this.g;
            otc otcVarAo2 = pez.ao();
            otcVarAo2.e(false);
            otcVarAo2.d(false);
            otcVarAo2.b(false);
            ahqx.l(context2, ipcVar2.bk(otcVarAo2.a()));
            return aojh.a;
        }
        if (i4 == 1) {
            c.b().l("com/android/dialer/dobby/impl/wear/bam/synctophone/BamSyncActionsController", "triggerAction", 42, "BamSyncActionsController.kt").v("User initiated answer BAM call");
            defpackage.nej nejVar = this.a;
            nusVar.c = 1;
            if (nejVar.a(nusVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        if (i4 != 2) {
            throw new aois();
        }
        c.b().l("com/android/dialer/dobby/impl/wear/bam/synctophone/BamSyncActionsController", "triggerAction", 46, "BamSyncActionsController.kt").v("User initiated decline BAM call");
        defpackage.nbr nbrVar = this.f;
        nusVar.c = 2;
        objB = nbrVar.b(nusVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        ((java.lang.Boolean) objB).booleanValue();
        return aojh.a;
    }
}
