package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoae implements defpackage.anpm {
    private final java.util.List a;
    private final defpackage.anpl b;

    public aoae(java.util.List list, defpackage.anpl anplVar) {
        this.a = defpackage.aify.n(list);
        this.b = anplVar;
    }

    @Override // defpackage.anpm
    public final void a(anqd anqdVar, java.util.List list, java.util.List list2) {
        java.util.List list3 = anqdVar.c;
        int size = list3.size();
        int i = ((defpackage.aike) list).d;
        defpackage.ahvr.bP(i == size, "Incorrect number of required labels provided. Expected: %s", list3.size());
        java.util.List list4 = anqdVar.d;
        int size2 = list4.size();
        int i2 = ((defpackage.aike) list2).d;
        defpackage.ahvr.bP(i2 == size2, "Incorrect number of optional labels provided. Expected: %s", list4.size());
        for (anpn anpnVar : this.a) {
            if (anpnVar.a() <= anqdVar.a) {
                this.b.c();
                anpnVar.d();
            }
            anpnVar.b();
        }
    }

    @Override // defpackage.anpm
    public final void b(anqd anqdVar, java.util.List list, java.util.List list2) {
        java.util.List list3 = anqdVar.c;
        int size = list3.size();
        int i = ((defpackage.aike) list).d;
        defpackage.ahvr.bP(i == size, "Incorrect number of required labels provided. Expected: %s", list3.size());
        java.util.List list4 = anqdVar.d;
        int size2 = list4.size();
        int i2 = ((defpackage.aike) list2).d;
        defpackage.ahvr.bP(i2 == size2, "Incorrect number of optional labels provided. Expected: %s", list4.size());
        for (anpn anpnVar : this.a) {
            if (anpnVar.a() <= anqdVar.a) {
                this.b.c();
                anpnVar.d();
            }
            anpnVar.c();
        }
    }
}
