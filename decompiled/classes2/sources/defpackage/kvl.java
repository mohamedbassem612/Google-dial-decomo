package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kvl implements kfy {
    private final rlv a;
    private final kfz b;

    public kvl(rlv rlvVar) {
        aooh.f(rlvVar, "loggingBindings");
        this.a = rlvVar;
        this.b = new kfz(2132017751);
    }

    public final kfz a() {
        return this.b;
    }

    public final java.util.List b(java.util.List list) {
        aooh.f(list, "calls");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (defpackage.hhb.q(((defpackage.kdc) obj).a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List c(java.util.List list) {
        aooh.f(list, "coalescedRows");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (defpackage.hhb.q((kiu) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void d() {
        this.a.o(rmx.sy);
    }
}
