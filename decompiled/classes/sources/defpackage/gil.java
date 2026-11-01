package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gil implements defpackage.gig, defpackage.gih {
    public final defpackage.gig a;
    public android.os.Bundle b;
    public boolean c;

    public gil(defpackage.gig gigVar) {
        if (gigVar == null) {
            defpackage.aooh.i("value");
        }
        this.a = gigVar;
        this.b = null;
    }

    @Override // defpackage.gig
    public final android.os.Bundle a() {
        return this.a.a();
    }

    @Override // defpackage.gih
    public final void b(android.os.Bundle bundle) {
        this.c = true;
        defpackage.gig gigVar = this.a;
        if (gigVar instanceof defpackage.gih) {
            ((defpackage.gih) gigVar).b(bundle);
        } else {
            this.b = bundle;
        }
    }
}
