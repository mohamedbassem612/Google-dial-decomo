package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ldz extends defpackage.dt {
    public defpackage.leb ak;

    @Override // defpackage.dt, defpackage.al
    public final android.app.Dialog eb(android.os.Bundle bundle) {
        afsn afsnVar = new afsn(z(), 0);
        afsnVar.x(2132017834);
        afsnVar.q(2131231118);
        defpackage.leb lebVar = this.ak;
        android.os.Bundle bundle2 = lebVar.d;
        afsnVar.s((bundle2 == null || bundle2.getString("phone_number") == null) ? lebVar.e.getApplicationContext().getString(2132017832) : lebVar.e.getApplicationContext().getString(2132017833, lebVar.d.getString("phone_number")));
        afsnVar.p(false);
        afsnVar.w(2132017775, new defpackage.ktq(this, 6));
        afsnVar.t(2132017774, new defpackage.ktq(this, 7));
        return afsnVar.create();
    }
}
