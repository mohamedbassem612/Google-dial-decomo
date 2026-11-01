package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aily extends defpackage.ailq {
    public final int c;
    private final int d;
    private final ahzi e;
    private defpackage.ailq f;

    public aily(defpackage.aizh aizhVar, int i) {
        super(aizhVar);
        this.e = ahvr.bI(new defpackage.ailx(this));
        this.f = null;
        this.c = i;
        this.d = this.b.c;
    }

    @Override // defpackage.ailq
    public final int a(defpackage.aizh aizhVar, int i) {
        int i2 = this.d;
        int i3 = aizhVar.c;
        int iAbs = java.lang.Math.abs(i2 - i3);
        if (i < iAbs) {
            return iAbs;
        }
        if (i <= 0) {
            return this.b.equals(aizhVar) ? 0 : 1;
        }
        if (i <= 1) {
            return new defpackage.aill(defpackage.ailm.a, this.b).a(aizhVar, 1);
        }
        defpackage.ailq ailqVar = this.f;
        if (ailqVar != null) {
            return (i2 <= 64 || i >= i3 / 10) ? ((defpackage.ailq) this.e.eZ()).a(aizhVar, i) : ailqVar.a(aizhVar, i);
        }
        defpackage.aimh aimhVar = new defpackage.aimh(this.b);
        this.f = aimhVar;
        return aimhVar.a(aizhVar, i);
    }
}
