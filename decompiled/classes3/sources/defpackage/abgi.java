package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgi {
    public static final ajb a = new ajb(0.0f, 0.0f, 0.0f, 1.0f);
    public static final ajb b = new ajb(0.0f, 0.0f, 0.65f, 1.0f);
    public static final ajb c = new ajb(0.0f, 0.0f, 0.0f, 1.0f);
    public static final ajb d = new ajb(0.0f, 0.0f, 0.45f, 1.0f);
    public final aoss e;
    private final ccp f;

    public abgi(aoss aossVar) {
        aooh.f(aossVar, "scope");
        this.e = aossVar;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(aokc.a, cdu.c);
    }

    public static final java.util.List c(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!((defpackage.abhg) obj).c()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List a() {
        return (java.util.List) this.f.a();
    }

    public final void b(java.util.List list) {
        this.f.b(list);
    }
}
