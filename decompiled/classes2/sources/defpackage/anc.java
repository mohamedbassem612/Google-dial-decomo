package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class anc implements aoxi {
    final /* synthetic */ aoor a;
    final /* synthetic */ aoor b;
    final /* synthetic */ aoor c;
    final /* synthetic */ defpackage.and d;

    public anc(aoor aoorVar, aoor aoorVar2, aoor aoorVar3, defpackage.and andVar) {
        this.a = aoorVar;
        this.b = aoorVar2;
        this.c = aoorVar3;
        this.d = andVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        aoor aoorVar;
        int i;
        avj avjVar = (avj) obj;
        boolean z = true;
        if (avjVar instanceof avl) {
            this.a.a++;
        } else {
            if ((avjVar instanceof defpackage.avm) || (avjVar instanceof defpackage.avk)) {
                aoorVar = this.a;
            } else {
                if (avjVar instanceof avh) {
                    aoorVar = this.b;
                } else if (avjVar instanceof defpackage.avi) {
                    aoorVar = this.b;
                } else if (avjVar instanceof avd) {
                    aoorVar = this.c;
                } else if (avjVar instanceof defpackage.ave) {
                    aoorVar = this.c;
                }
                i = aoorVar.a + 1;
                aoorVar.a = i;
            }
            i = aoorVar.a - 1;
            aoorVar.a = i;
        }
        boolean z2 = false;
        boolean z3 = this.a.a > 0;
        boolean z4 = this.b.a > 0;
        boolean z5 = this.c.a > 0;
        defpackage.and andVar = this.d;
        if (andVar.a != z3) {
            andVar.a = z3;
            z2 = true;
        }
        if (andVar.b != z4) {
            andVar.b = z4;
        } else {
            z = z2;
        }
        if (andVar.c == z5) {
            if (z) {
            }
            return aojh.a;
        }
        andVar.c = z5;
        cfo.w(andVar);
        return aojh.a;
    }
}
