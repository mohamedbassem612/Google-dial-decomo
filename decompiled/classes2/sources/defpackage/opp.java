package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class opp implements dsf {
    public final /* synthetic */ ops a;
    public final /* synthetic */ abwd b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ defpackage.oph e;

    public /* synthetic */ opp(ops opsVar, abwd abwdVar, int i, int i2, defpackage.oph ophVar) {
        this.a = opsVar;
        this.b = abwdVar;
        this.c = i;
        this.d = i2;
        this.e = ophVar;
    }

    public final java.lang.Object a(dsd dsdVar) {
        ops opsVar = this.a;
        ahhl ahhlVarL = afsq.L(opsVar.c);
        ahhk ahhkVarR = ahhlVarL.r(android.graphics.drawable.Drawable.class);
        abwd abwdVar = this.b;
        ahhk ahhkVarD = opsVar.d(ahhkVarR, abwdVar);
        int i = this.c;
        int i2 = this.d;
        defpackage.opq opqVar = new defpackage.opq(opsVar, i, i2, dsdVar, i, i2);
        if (((java.lang.Boolean) opsVar.d.a()).booleanValue()) {
            opsVar.f.add(dsdVar);
        }
        defpackage.oph ophVar = this.e;
        dsdVar.a(new defpackage.abb(opsVar, ahhlVarL, opqVar, dsdVar, 6, (char[]) null), opsVar.e);
        opsVar.i(ahhkVarD, abwdVar, ophVar, false);
        ahhkVarD.k(opqVar);
        return "GlidePhotoManagerImpl.loadContactPhotoIntoBitmap";
    }
}
