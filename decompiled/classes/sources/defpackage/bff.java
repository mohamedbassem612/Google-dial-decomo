package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bff implements defpackage.aqb {
    private final defpackage.aomy a;
    private final boolean b;
    private final defpackage.dpq c;
    private final boolean d;
    private final defpackage.aqb e;

    public bff(defpackage.aomy aomyVar, boolean z, defpackage.dpq dpqVar, boolean z2, defpackage.aqb aqbVar) {
        this.a = aomyVar;
        this.b = z;
        this.c = dpqVar;
        this.d = z2;
        this.e = aqbVar;
    }

    @Override // defpackage.aqb
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((java.lang.Number) this.a.a()).intValue();
        defpackage.dpq dpqVar = defpackage.dpq.b;
        boolean z = false;
        if (!this.d && this.c == dpqVar) {
            z = true;
        }
        if (this.b == z) {
            f -= fIntValue;
        }
        return this.e.a(f, f2, f3 - fIntValue);
    }

    @Override // defpackage.aqb
    public final /* synthetic */ defpackage.aiq b() {
        return defpackage.aqa.a;
    }
}
