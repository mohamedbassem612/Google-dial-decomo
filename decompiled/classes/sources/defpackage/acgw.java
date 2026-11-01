package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class acgw implements defpackage.afid {
    @Override // defpackage.afid
    public final void a(defpackage.adag adagVar) throws java.lang.InterruptedException {
        defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
        adagVar2.n("INSERT INTO chime_versioned_identifiers");
        adagVar2.n("(");
        adagVar2.n("account");
        adagVar2.n(",key");
        adagVar2.n(",value");
        adagVar2.n(")");
        adagVar2.n("SELECT ");
        adagVar2.n("promotions.account");
        adagVar2.n(", ");
        adagVar2.n("chime_versioned_identifiers.key");
        adagVar2.n(", ");
        adagVar2.n("chime_versioned_identifiers.value");
        adagVar2.n(" FROM ");
        adagVar2.n("chime_versioned_identifiers, promotions");
        adagVar2.n(" WHERE ");
        adagVar2.n("promotions.key");
        adagVar2.n(" = ");
        adagVar2.n("chime_versioned_identifiers.key");
        adagVar.A(adagVar2.B());
        wsk wskVar = new wsk("chime_versioned_identifiers");
        wskVar.e("account = ?");
        wskVar.f("noaccount");
        adagVar.x(wskVar.h());
        defpackage.adag adagVar3 = new defpackage.adag((byte[]) null);
        adagVar3.n("INSERT INTO versioned_identifiers");
        adagVar3.n("(");
        adagVar3.n("account");
        adagVar3.n(",key");
        adagVar3.n(",value");
        adagVar3.n(")");
        adagVar3.n("SELECT ");
        adagVar3.n("promotions.account");
        adagVar3.n(", ");
        adagVar3.n("versioned_identifiers.key");
        adagVar3.n(", ");
        adagVar3.n("versioned_identifiers.value");
        adagVar3.n(" FROM ");
        adagVar3.n("versioned_identifiers, promotions");
        adagVar3.n(" WHERE ");
        adagVar3.n("promotions.key");
        adagVar3.n(" = ");
        adagVar3.n("versioned_identifiers.key");
        adagVar.A(adagVar3.B());
        wsk wskVar2 = new wsk("versioned_identifiers");
        wskVar2.e("account = ?");
        wskVar2.f("noaccount");
        adagVar.x(wskVar2.h());
    }
}
