package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaeq implements defpackage.aagb {
    public final defpackage.aacv a;
    public final defpackage.aadx b;
    public java.util.Set c;
    public boolean d;
    public final /* synthetic */ defpackage.aaet e;
    public aahb f;

    public aaeq(defpackage.aaet aaetVar, defpackage.aacv aacvVar, defpackage.aadx aadxVar) {
        j$.util.Objects.requireNonNull(aaetVar);
        this.e = aaetVar;
        this.f = null;
        this.c = null;
        this.d = false;
        this.a = aacvVar;
        this.b = aadxVar;
    }

    @Override // defpackage.aagb
    public final void a(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.e.r.post(new defpackage.an(this, connectionResult, 13));
    }

    public final void b(com.google.android.gms.common.ConnectionResult connectionResult) {
        defpackage.aaeo aaeoVar = (defpackage.aaeo) this.e.l.get(this.b);
        if (aaeoVar != null) {
            aaeoVar.l(connectionResult);
        }
    }

    public final void c() {
        aahb aahbVar;
        if (!this.d || (aahbVar = this.f) == null) {
            return;
        }
        this.a.s(aahbVar, this.c);
    }
}
