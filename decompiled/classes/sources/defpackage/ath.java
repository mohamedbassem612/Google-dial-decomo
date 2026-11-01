package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ath extends defpackage.apd implements defpackage.cuk {
    public final defpackage.ato d;
    public final defpackage.cpg j;
    private final defpackage.ate k;
    private final defpackage.aqi l;
    private final defpackage.aqm m;

    public ath(defpackage.ati atiVar, defpackage.amn amnVar, defpackage.ars arsVar, defpackage.aso asoVar, boolean z, boolean z2, defpackage.kaw kawVar, defpackage.aqb aqbVar) {
        super(z, kawVar, asoVar);
        defpackage.aqm aqmVar = new defpackage.aqm(new defpackage.kaw(new defpackage.ahw(defpackage.apg.c), (byte[]) null));
        this.m = aqmVar;
        defpackage.ato atoVar = new defpackage.ato(atiVar, amnVar, arsVar == null ? aqmVar : arsVar, asoVar, z2, ((defpackage.apd) this).a, this, new defpackage.ml(this, 10));
        this.d = atoVar;
        defpackage.ate ateVar = new defpackage.ate(atoVar, z);
        this.k = ateVar;
        defpackage.cpg cpgVar = new defpackage.cpg(2, false, null, 10);
        V(cpgVar);
        this.j = cpgVar;
        defpackage.aqi aqiVar = new defpackage.aqi(asoVar, atoVar, z2, aqbVar, new defpackage.ml(this, 11));
        V(aqiVar);
        this.l = aqiVar;
        defpackage.cuq cuqVar = ((defpackage.apd) this).a;
        defpackage.aomy aomyVar = defpackage.cuv.a;
        V(new defpackage.cuu(ateVar, cuqVar));
        V(new defpackage.bfp(aqiVar));
    }

    @Override // defpackage.cuk
    public final boolean A(android.view.KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.g) {
            return false;
        }
        if ((defpackage.un.k(keyEvent) != defpackage.un.h(93) && defpackage.un.k(keyEvent) != defpackage.un.h(92)) || defpackage.un.j(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean zK = this.d.k();
        defpackage.aqi aqiVar = this.l;
        if (zK) {
            float fD = (int) (aqiVar.d() & 4294967295L);
            if (defpackage.un.k(keyEvent) != defpackage.un.h(92)) {
                fD = -fD;
            }
            jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(fD)) & 4294967295L;
        } else {
            float fD2 = (int) (aqiVar.d() >> 32);
            if (defpackage.un.k(keyEvent) != defpackage.un.h(92)) {
                fD2 = -fD2;
            }
            jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(fD2)) << 32;
        }
        defpackage.aoov.an(M(), null, 0, new atg(this, jFloatToRawIntBits, (defpackage.aoln) null, 1, (byte[]) null), 3);
        return true;
    }

    @Override // defpackage.cuk
    public final boolean B(android.view.KeyEvent keyEvent) {
        return false;
    }

    public final void K(defpackage.ati atiVar, defpackage.aso asoVar, defpackage.amn amnVar, boolean z, boolean z2, defpackage.ars arsVar, defpackage.kaw kawVar, defpackage.aqb aqbVar) {
        boolean z3;
        if (this.g != z) {
            this.k.a = z;
            ((defpackage.apd) this).b = null;
            ((defpackage.apd) this).c = null;
            defpackage.cfo.A(this).I();
        }
        if (arsVar == null) {
            arsVar = this.m;
        }
        defpackage.ato atoVar = this.d;
        defpackage.cuq cuqVar = ((defpackage.apd) this).a;
        boolean z4 = true;
        if (defpackage.aooh.n(atoVar.a, atiVar)) {
            z3 = false;
        } else {
            atoVar.a = atiVar;
            z3 = true;
        }
        atoVar.k = amnVar;
        if (atoVar.c != asoVar) {
            atoVar.c = asoVar;
            z3 = true;
        }
        if (atoVar.d != z2) {
            atoVar.d = z2;
        } else {
            z4 = z3;
        }
        atoVar.b = arsVar;
        atoVar.e = cuqVar;
        defpackage.aqi aqiVar = this.l;
        aqiVar.a = asoVar;
        aqiVar.c = z2;
        aqiVar.d = aqbVar;
        J(defpackage.apg.a, z, kawVar, atoVar.k() ? defpackage.aso.a : defpackage.aso.b, z4);
    }

    @Override // defpackage.ark
    public final java.lang.Object cR(defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        defpackage.ato atoVar = this.d;
        java.lang.Object objI = atoVar.i(aoc.b, new apw(aonnVar, atoVar, (defpackage.aoln) null, 4), aolnVar);
        return objI != defpackage.aolu.a ? defpackage.aojh.a : objI;
    }

    @Override // defpackage.ark
    public final void cS(aqw aqwVar) {
        if (this.D) {
            defpackage.aoov.an(((defpackage.apd) this).a.f(), null, 0, new amg(aqwVar, this, (defpackage.aoln) null, 12), 3);
        }
    }

    @Override // defpackage.apd
    protected final ask d() {
        ni niVar = new ni(android.view.ViewConfiguration.get(defpackage.wl.f(this).getContext()), (byte[]) null);
        atf atfVar = new atf(this, 1, (byte[]) null);
        defpackage.dpf dpfVar = defpackage.cfo.A(this).r;
        defpackage.ato atoVar = this.d;
        return new asi(new asn(new apv(atoVar, 3)), atoVar, niVar, atfVar, dpfVar, new defpackage.agb(atoVar, 20));
    }

    @Override // defpackage.apd
    protected final ask f() {
        atf atfVar = new atf(this, 0);
        defpackage.dpf dpfVar = defpackage.cfo.A(this).r;
        defpackage.ato atoVar = this.d;
        return new aud(new asn(new apv(atoVar, 5)), atoVar, atfVar, dpfVar, new auj(atoVar, 1));
    }

    @Override // defpackage.apd
    protected final java.lang.Object g(long j, defpackage.aoln aolnVar) {
        return defpackage.atc.a(this.d, j, aolnVar);
    }

    @Override // defpackage.apd
    public final /* synthetic */ defpackage.ato j() {
        return this.d;
    }

    @Override // defpackage.apd
    protected final defpackage.aqm k() {
        return this.m;
    }
}
