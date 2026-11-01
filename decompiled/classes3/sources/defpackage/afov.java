package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afov extends eoa {
    public final aoss a;
    public final boolean b;
    public final defpackage.afof c;
    public final defpackage.afof d;
    public final defpackage.afof e;
    public final aozh f;
    public final defpackage.afoo g;
    public final aozj i;
    public int j;
    public final defpackage.wyw k;
    private final android.accounts.Account l;

    public afov(aoss aossVar, defpackage.aprf aprfVar, afsq afsqVar, enr enrVar) {
        aooh.f(aossVar, "coroutineScope");
        aooh.f(aprfVar, "photosRepositoryFactory");
        aooh.f(afsqVar, "clustersRepositoryFactory");
        aooh.f(enrVar, "savedStateHandle");
        this.a = aossVar;
        java.lang.Object objA = enrVar.a("profiles_account");
        if (objA == null) {
            throw new java.lang.IllegalArgumentException("account must be specified");
        }
        android.accounts.Account account = (android.accounts.Account) objA;
        this.l = account;
        java.lang.Object objA2 = enrVar.a("include_me_cluster");
        if (objA2 == null) {
            throw new java.lang.IllegalArgumentException("me cluster inclusion must be specified");
        }
        boolean zBooleanValue = ((java.lang.Boolean) objA2).booleanValue();
        this.b = zBooleanValue;
        this.k = new defpackage.wyw(account, aprfVar);
        defpackage.afok afokVarM = aprfVar.m(account, 2, null, 15, 16);
        this.c = afokVarM;
        defpackage.afok afokVarM2 = aprfVar.m(account, 1, null, 17, 18);
        this.d = afokVarM2;
        defpackage.afof afofVarA = afsqVar.a(account);
        this.e = afofVarA;
        this.j = 1;
        aozj aozjVarA = aozk.a(new defpackage.afop(aokc.a, 1, 0));
        this.i = aozjVarA;
        this.f = new aoys(aozjVarA, (aoub) null);
        this.g = new defpackage.afoo(afokVarM, afofVarA, afokVarM2, zBooleanValue, aossVar);
        aoov.an(aossVar, (aolr) null, 0, new defpackage.adzb(this, (aoln) null, 9), 3);
    }
}
