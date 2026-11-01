package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bes extends defpackage.cmv implements defpackage.ddc {
    public defpackage.aomy a;
    public defpackage.beq b;
    public defpackage.aso c;
    public boolean d;
    public boolean e;
    private defpackage.dic f;
    private final defpackage.aonj g = new defpackage.afz(this, 15);
    private defpackage.aonj h;

    public bes(defpackage.aomy aomyVar, defpackage.beq beqVar, defpackage.aso asoVar, boolean z, boolean z2) {
        this.a = aomyVar;
        this.b = beqVar;
        this.c = asoVar;
        this.d = z;
        this.e = z2;
        b();
    }

    public final void b() {
        int i = 16;
        this.f = new defpackage.dic(new defpackage.ml(this, i), new defpackage.ml(this, 17), this.e);
        this.h = this.d ? new defpackage.afz(this, i) : null;
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.n, java.lang.Boolean.TRUE);
        diqVar.a(defpackage.din.Q, this.g);
        defpackage.aso asoVar = this.c;
        defpackage.aso asoVar2 = defpackage.aso.a;
        defpackage.dic dicVar = this.f;
        if (asoVar == asoVar2) {
            if (dicVar == null) {
                defpackage.aooh.j("scrollAxisRange");
                dicVar = null;
            }
            diqVar.a(defpackage.din.x, dicVar);
        } else {
            if (dicVar == null) {
                defpackage.aooh.j("scrollAxisRange");
                dicVar = null;
            }
            diqVar.a(defpackage.din.w, dicVar);
        }
        defpackage.aonj aonjVar = this.h;
        if (aonjVar != null) {
            diqVar.a(defpackage.did.f, new defpackage.dhr(null, aonjVar));
        }
        diqVar.a(defpackage.did.B, new defpackage.dhr(null, new defpackage.ddz(new defpackage.ml(this, 18), 9)));
        diqVar.a(defpackage.din.f, this.b.e());
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean y() {
        return true;
    }
}
