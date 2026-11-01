package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aepm {
    public defpackage.aepn a;
    public defpackage.aepi b;
    public final defpackage.aepl c = new defpackage.aepl();

    public aepm(defpackage.tvn tvnVar, defpackage.aepu aepuVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        j$.util.Objects.requireNonNull(aoinVar);
        int i = 5;
        defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(new defpackage.aeex(aoinVar, i));
        j$.util.Objects.requireNonNull(aoinVar2);
        defpackage.ahzi ahziVarBI2 = defpackage.ahvr.bI(new defpackage.aeex(aoinVar2, i));
        if (!((java.lang.Boolean) ahziVarBI2.eZ()).booleanValue()) {
            d(tvnVar, ahziVarBI, ahziVarBI2);
            c(aepuVar, ahziVarBI, ahziVarBI2);
        } else if (((java.lang.Boolean) ahziVarBI.eZ()).booleanValue()) {
            c(aepuVar, ahziVarBI, ahziVarBI2);
        } else {
            d(tvnVar, ahziVarBI, ahziVarBI2);
        }
    }

    private final void c(defpackage.aepu aepuVar, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2) {
        this.b = new defpackage.aepi(new defpackage.aepk(this, ahziVar2, ahziVar, aepuVar, 0));
        aepuVar.g.add(this.b);
    }

    private final void d(defpackage.tvn tvnVar, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2) {
        defpackage.aepn aepnVar = new defpackage.aepn(new defpackage.aepk(this, ahziVar2, ahziVar, tvnVar, 1));
        this.a = aepnVar;
        tvnVar.w(aepnVar);
    }

    public final void a(defpackage.aepj aepjVar) {
        this.c.b.add(aepjVar);
    }

    public final void b(defpackage.aepj aepjVar) {
        this.c.b.remove(aepjVar);
    }
}
