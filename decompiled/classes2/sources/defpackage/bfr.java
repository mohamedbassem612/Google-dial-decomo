package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bfr implements aono {
    final /* synthetic */ ans a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ aomy d;

    public bfr(ans ansVar, boolean z, boolean z2, aomy aomyVar) {
        this.a = ansVar;
        this.b = z;
        this.c = z2;
        this.d = aomyVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        cav cavVar = (cav) obj2;
        ((java.lang.Number) obj3).intValue();
        cavVar.u(-1525724089);
        java.lang.Object objG = cavVar.g();
        if (objG == cau.a) {
            objG = new kaw((byte[]) null, (char[]) null, (byte[]) null);
            cavVar.w(objG);
        }
        kaw kawVar = (kaw) objG;
        cmw cmwVarA = anu.a(cmw.c, kawVar, this.a).a(new bfq(this.b, kawVar, (any) null, this.c, this.d));
        cavVar.o();
        return cmwVarA;
    }
}
