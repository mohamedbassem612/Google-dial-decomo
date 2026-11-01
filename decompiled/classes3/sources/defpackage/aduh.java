package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aduh implements defpackage.adue {
    public static final aiof a = aiof.i("GnpSdk");
    public final aeee b;
    public final android.content.Context c;
    public final java.util.Set d;
    private final aolr e;

    public aduh(aeee aeeeVar, aolr aolrVar, android.content.Context context, java.util.Set set) {
        aooh.f(aeeeVar, "gnpAccountStorage");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(context, "context");
        aooh.f(set, "accountCleaners");
        this.b = aeeeVar;
        this.e = aolrVar;
        this.c = context;
        this.d = set;
    }

    @Override // defpackage.adue
    public final java.lang.Object a(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, aoln aolnVar) {
        return aoov.aj(this.e, new defpackage.yzh(this, accountRepresentation, (aoln) null, 3), aolnVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aduy aduyVar, aoln aolnVar) throws aois {
        defpackage.adug adugVar;
        if (aolnVar instanceof defpackage.adug) {
            adugVar = (defpackage.adug) aolnVar;
            int i = adugVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adugVar.c = i - Integer.MIN_VALUE;
            } else {
                adugVar = new defpackage.adug(this, aolnVar);
            }
        } else {
            adugVar = new defpackage.adug(this, aolnVar);
        }
        java.lang.Object objA = adugVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adugVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aeee aeeeVar = this.b;
            com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentationB = aduyVar.b();
            adugVar.c = 1;
            objA = aeeeVar.a(accountRepresentationB, adugVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        adtv adtvVar = (adtz) objA;
        int iR = anty.R(adtvVar);
        if (iR == 0) {
            return ((java.lang.Number) ((adub) adtvVar).a).intValue() != 1 ? new defpackage.adtw(new java.lang.Exception("Failed deleting account"), adty.W) : new adub(aojh.a);
        }
        if (iR == 1) {
            return adtvVar;
        }
        throw new aois();
    }
}
