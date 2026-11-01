package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agow implements agxi {
    private final agpb a;
    private final adag b;

    public agow(adag adagVar, agpb agpbVar) {
        this.b = adagVar;
        this.a = agpbVar;
    }

    public final ajbg a() {
        ajcq ajcqVarC = this.a.c();
        ajcq ajcqVarH = this.b.h();
        return new ajbg(aiql.ab(new ajcq[]{ajcqVarC, ajcqVarH}).b(ahqx.i(new defpackage.afgu(ajcqVarC, ajcqVarH, 3, null)), ajbm.a));
    }

    public final ajcq b() {
        return this.a.a();
    }

    public final java.lang.Object e() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
