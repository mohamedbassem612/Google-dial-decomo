package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mzz implements defpackage.igz {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyDaredevilListener");
    public final defpackage.nbr b;
    public final defpackage.nhq c;
    public final aoin d;
    public final aoin e;
    private final aoss f;
    private final ahda g;

    public mzz(aoss aossVar, defpackage.nbr nbrVar, defpackage.nhq nhqVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(nhqVar, "dobbySession");
        aooh.f(aoinVar, "enableDobbyDaredevilEvents");
        aooh.f(aoinVar2, "enableCslSodaPartialsForBargeIn");
        this.f = aossVar;
        this.b = nbrVar;
        this.c = nhqVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.g = new ahda((byte[]) null);
    }

    @Override // defpackage.igz
    public final java.lang.Object a(defpackage.ihc ihcVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.f, this.g, new defpackage.muz(new defpackage.mzy(this, ihcVar, null), (aoln) null, 13)).a(aolnVar);
        aolu aoluVar = aolu.a;
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        return objA != aoluVar ? aojh.a : objA;
    }
}
