package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acch implements defpackage.accf {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final defpackage.amwu b;
    public final defpackage.amwu c;
    private final defpackage.aoin d;
    private final defpackage.ajct e;
    private final defpackage.aduj f;

    public acch(defpackage.amwu amwuVar, defpackage.aoin aoinVar, defpackage.amwu amwuVar2, defpackage.ajct ajctVar, defpackage.aduj adujVar) {
        this.b = amwuVar;
        this.d = aoinVar;
        this.c = amwuVar2;
        this.e = ajctVar;
        this.f = adujVar;
    }

    @Override // defpackage.accf
    public final defpackage.ajcq a(defpackage.akiq akiqVar) {
        defpackage.aoin aoinVar = this.d;
        j$.util.Objects.requireNonNull(aoinVar);
        defpackage.vcz vczVar = new defpackage.vcz(aoinVar, 5);
        defpackage.aduj adujVar = this.f;
        java.util.concurrent.Callable callableD = adujVar.d(vczVar);
        defpackage.ajct ajctVar = this.e;
        defpackage.ajcq ajcqVarSubmit = ajctVar.submit(callableD);
        return defpackage.ajck.w(ajcqVarSubmit).y(adujVar.c(new defpackage.kjs(this, akiqVar, 19, null)), ajctVar).y(adujVar.c(new defpackage.accg(this, ajcqVarSubmit, akiqVar, 0)), ajctVar);
    }
}
