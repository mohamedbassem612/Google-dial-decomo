package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgs {
    public static final aimz a = aimz.i("com/android/dialer/incall/cachedphonelookup/CachedPhoneLookup");
    public final sqn b;
    public final ajcu c;
    public final ruc d;
    public final ajct e;
    public final j$.util.concurrent.ConcurrentHashMap f = new j$.util.concurrent.ConcurrentHashMap();
    public final zpz g;
    public final sqi h;
    public final jig i;
    public final rsr j;
    public final rsr k;
    public final ahbv l;
    private final android.content.Context m;
    private final aoin n;

    public pgs(android.content.Context context, sqi sqiVar, sqn sqnVar, ajcu ajcuVar, zpz zpzVar, ruc rucVar, ajct ajctVar, rsr rsrVar, jig jigVar, rsr rsrVar2, ahbv ahbvVar, aoin aoinVar) {
        this.m = context;
        this.h = sqiVar;
        this.b = sqnVar;
        this.c = ajcuVar;
        this.g = zpzVar;
        this.d = rucVar;
        this.e = ajctVar;
        this.j = rsrVar;
        this.k = rsrVar2;
        this.n = aoinVar;
        this.i = jigVar;
        this.l = ahbvVar;
    }

    public static android.net.Uri a(android.telecom.Call.Details details) {
        android.net.Uri uriA = defpackage.ura.a(details);
        return uriA == null ? android.net.Uri.EMPTY : uriA;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ajcq, java.lang.Object] */
    public final defpackage.aliq b(android.telecom.Call.Details details) {
        defpackage.zmy zmyVar;
        a.b().l("com/android/dialer/incall/cachedphonelookup/CachedPhoneLookup", "phoneLookup", 143, "CachedPhoneLookup.java").v("enter");
        defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
        int iM = da$.ExternalSyntheticApiModelOutline0.m(details);
        int iM2 = da$.ExternalSyntheticApiModelOutline0.m(details);
        if (iM == 0) {
            zmyVar = defpackage.zmy.a;
        } else {
            zmyVar = iM2 == 1 ? defpackage.zmy.b : defpackage.zmy.c;
        }
        ruc rucVar = this.d;
        ajcq ajcqVarZ = aiql.z(zmyVar);
        rucVar.j(ruc.T);
        aliqVar.b = ahrv.g(this.b.d(this.m, details, ajcqVarZ)).h(new mjl(this, 17), ajbm.a);
        ?? r4 = aliqVar.b;
        defpackage.pgr pgrVar = new defpackage.pgr(this, 0);
        ajcu ajcuVar = this.c;
        ahvr.J((ajcq) r4, pgrVar, ajcuVar);
        zpz zpzVar = this.g;
        zpzVar.a((ajcq) aliqVar.b);
        rucVar.j(ruc.U);
        aliqVar.c = ahrv.g(aiql.A((ajcq) aliqVar.b)).j(100L, java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).e(java.util.concurrent.TimeoutException.class, new mjl(this, 18), ajcuVar);
        ahvr.J((ajcq) aliqVar.c, new defpackage.pgr(this, 2, (byte[]) null), ajcuVar);
        rucVar.j(ruc.S);
        if (((java.lang.Boolean) this.n.a()).booleanValue()) {
            aliqVar.a = ahrv.g((ajcq) aliqVar.b).e(java.lang.Exception.class, new onp(12), ajcuVar).i(new juo(this, details, ajcqVarZ, 15), ajcuVar);
        } else {
            aliqVar.a = this.h.b(details, ajcqVarZ);
        }
        ahvr.J((ajcq) aliqVar.a, new kxp(this, details, 3), ajcuVar);
        zpzVar.a((ajcq) aliqVar.a);
        return aliqVar;
    }
}
