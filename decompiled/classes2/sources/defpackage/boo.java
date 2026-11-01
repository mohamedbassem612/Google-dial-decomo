package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class boo implements aonn {
    public final /* synthetic */ aonn a;
    public final /* synthetic */ dkz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ aonn d;
    public final /* synthetic */ defpackage.bod e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ awa g;
    public final /* synthetic */ ayy h;

    public /* synthetic */ boo(aonn aonnVar, dkz dkzVar, long j, aonn aonnVar2, defpackage.bod bodVar, boolean z, awa awaVar, ayy ayyVar) {
        this.a = aonnVar;
        this.b = dkzVar;
        this.c = j;
        this.d = aonnVar2;
        this.e = bodVar;
        this.f = z;
        this.g = awaVar;
        this.h = ayyVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        long j;
        long j2;
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        int i2 = iIntValue & 1;
        boc bocVar = boq.a;
        if (cavVar.H(i != 2, i2)) {
            boolean z = this.f;
            defpackage.bod bodVar = this.e;
            if (z) {
                j = bodVar.b;
                j2 = bodVar.c;
            } else {
                j = bodVar.e;
                j2 = bodVar.f;
            }
            ayy ayyVar = this.h;
            awa awaVar = this.g;
            aonn aonnVar = this.d;
            long j3 = this.c;
            boq.i(this.a, this.b, j3, aonnVar, j, j2, awaVar, ayyVar, cavVar, 24576, 0);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
