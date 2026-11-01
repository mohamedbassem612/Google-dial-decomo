package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abid implements aono {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bni b;
    public final /* synthetic */ bni c;
    public final /* synthetic */ defpackage.abhh d;

    public /* synthetic */ abid(boolean z, bni bniVar, bni bniVar2, defpackage.abhh abhhVar) {
        this.a = z;
        this.b = bniVar;
        this.c = bniVar2;
        this.d = abhhVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        axx axxVar = (axx) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f(axxVar, "$this$FlowRow");
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != cavVar.B(axxVar) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            boolean z = this.a;
            bni bniVar = this.c;
            bni bniVar2 = this.b;
            int i = iIntValue & 14;
            aehj.bo(axxVar, (defpackage.abhh) null, z, z, bniVar2, bniVar, cavVar, i);
            aehj.bo(axxVar, this.d, z, z, bniVar2, bniVar, cavVar, i);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
