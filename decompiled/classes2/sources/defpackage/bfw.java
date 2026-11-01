package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bfw extends amy {
    public boolean j;
    public aonj k;
    public final aomy l;

    public bfw(boolean z, kaw kawVar, any anyVar, boolean z2, dib dibVar, aonj aonjVar) {
        super(kawVar, anyVar, false, z2, (java.lang.String) null, dibVar, new defpackage.bfv(aonjVar, z, 0));
        this.j = z;
        this.k = aonjVar;
        this.l = new defpackage.apv(this, 11);
    }

    public final void d(diq diqVar) {
        defpackage.cne cneVar;
        diqVar.a(din.L, defpackage.wx.j(this.j));
        diqVar.a(din.s, cnh.c);
        int i = 1;
        if (this.j) {
            cneVar = defpackage.rt.a;
            if (cneVar == null) {
                cneVar = new defpackage.cne(aa$.ExternalSyntheticApiModelOutline0.m(true));
                defpackage.rt.a = cneVar;
            }
        } else {
            cneVar = defpackage.rt.b;
            if (cneVar == null) {
                cneVar = new defpackage.cne(aa$.ExternalSyntheticApiModelOutline0.m(false));
                defpackage.rt.b = cneVar;
            }
        }
        if (cneVar != null) {
            diqVar.a(din.t, cneVar);
        }
        diqVar.a(did.h, new dhr((java.lang.String) null, new defpackage.bgf(this, i)));
    }
}
