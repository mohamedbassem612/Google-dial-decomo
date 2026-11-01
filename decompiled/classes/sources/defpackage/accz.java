package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class accz implements defpackage.accr {
    private static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private final defpackage.acbd b;
    private final defpackage.accq c;

    public accz(defpackage.acbd acbdVar) {
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.b = acbdVar;
        this.c = defpackage.accq.i;
    }

    @Override // defpackage.accr
    public final defpackage.accq a() {
        return this.c;
    }

    @Override // defpackage.accu
    public final boolean b(akkj akkjVar, acct acctVar) {
        defpackage.aooh.f(akkjVar, "triggeringConditions");
        akki akkiVarB = akki.b(akkjVar.i);
        if (akkiVarB == null) {
            akkiVarB = akki.a;
        }
        if (akkiVarB != akki.b) {
            return true;
        }
        anfb anfbVar = anfb.a;
        if (anfbVar.b().b()) {
            ((defpackage.aiob) a.d()).v("Promotion is shown because there is a Google account on device");
            return true;
        }
        if (!anfbVar.b().a()) {
            return true;
        }
        this.b.b(acctVar.b, "Promotion blocked: Dasher account on device", new java.lang.Object[0]);
        return false;
    }
}
