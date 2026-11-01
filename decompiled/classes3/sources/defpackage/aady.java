package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aady {
    private int e;
    public final aca b = new aca();
    private final aca d = new aca();
    public final zzx c = new zzx((char[]) null);
    private boolean f = false;
    public final aca a = new aca();

    public aady(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aadf aadfVar = (aadf) it.next();
            aadx aadxVarF = aadfVar.f();
            this.a.put(aadxVarF, (java.lang.Object) null);
            this.b.put(aadxVarF, aadfVar);
        }
        this.e = ((aec) this.a).d;
    }

    public final void a(aadx aadxVar, com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str) {
        aca acaVar = this.a;
        acaVar.put(aadxVar, connectionResult);
        aca acaVar2 = this.d;
        acaVar2.put(aadxVar, str);
        this.e--;
        if (!connectionResult.d()) {
            this.f = true;
        }
        if (this.e == 0) {
            if (this.f) {
                this.c.h(new defpackage.aacx(acaVar));
            } else {
                this.c.i(acaVar2);
            }
            this.b.clear();
        }
    }
}
