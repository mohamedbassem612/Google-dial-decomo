package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abon implements aonp {
    public final /* synthetic */ abof a;
    public final /* synthetic */ defpackage.abom b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ abon(abof abofVar, defpackage.abom abomVar, boolean z) {
        this.a = abofVar;
        this.b = abomVar;
        this.c = z;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.abok abokVar = (defpackage.abok) obj2;
        cav cavVar = (cav) obj3;
        int iIntValue = ((java.lang.Integer) obj4).intValue();
        aooh.f((aer) obj, "$this$AnimatedContent");
        aooh.f(abokVar, "metadata");
        if ((iIntValue & 48) == 0) {
            iIntValue |= true != cavVar.B(abokVar) ? 16 : 32;
        }
        if (!cavVar.H((iIntValue & 145) != 144, iIntValue & 1)) {
            cavVar.s();
        } else if (abokVar instanceof aboj) {
            cavVar.u(946436701);
            cavVar.o();
        } else {
            boolean z = this.c;
            defpackage.abom abomVar = this.b;
            abof abofVar = this.a;
            cavVar.u(946270200);
            abts.z(abomVar, abofVar.a, abokVar, z, den.ba(cmw.c, 0.0f, 4.0f, 0.0f, 0.0f), cavVar, ((iIntValue << 3) & 896) | 24576);
            cavVar.o();
        }
        return aojh.a;
    }
}
