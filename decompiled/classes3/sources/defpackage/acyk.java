package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyk implements ajat {
    public final /* synthetic */ acyu a;
    public final /* synthetic */ defpackage.acvu b;
    public final /* synthetic */ defpackage.acvr c;
    public final /* synthetic */ defpackage.acwg d;
    public final /* synthetic */ defpackage.acwe e;
    public final /* synthetic */ java.lang.String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    public /* synthetic */ acyk(acyu acyuVar, defpackage.acvu acvuVar, defpackage.acvr acvrVar, defpackage.acwg acwgVar, defpackage.acwe acweVar, java.lang.String str, long j, int i) {
        this.a = acyuVar;
        this.b = acvuVar;
        this.c = acvrVar;
        this.d = acwgVar;
        this.e = acweVar;
        this.f = str;
        this.g = j;
        this.h = i;
    }

    public final ajcq a(java.lang.Object obj) {
        final acyu acyuVar = this.a;
        final int i = this.h;
        final defpackage.acvu acvuVar = this.b;
        final defpackage.acvr acvrVar = this.c;
        defpackage.acwg acwgVar = this.d;
        final defpackage.acwe acweVar = this.e;
        java.lang.String str = this.f;
        final long j = this.g;
        return acyuVar.q(acyuVar.z(acvuVar, acvrVar, acwgVar, acweVar, str, j, i), new ajat() { // from class: acyi
            public final ajcq a(java.lang.Object obj2) {
                if (((java.lang.Boolean) obj2).booleanValue() || i == 6) {
                    return ajcm.a;
                }
                long j2 = j;
                defpackage.acwe acweVar2 = acweVar;
                defpackage.acvr acvrVar2 = acvrVar;
                return acyuVar.r(acvuVar, acvrVar2, acweVar2, j2);
            }
        });
    }
}
