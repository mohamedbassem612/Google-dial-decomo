package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpb extends er {
    private final java.util.List a;
    private final java.util.List b;

    public abpb(java.util.List list, java.util.List list2) {
        aooh.f(list, "oldList");
        this.a = list;
        this.b = list2;
    }

    public final int a() {
        return this.b.size();
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean d(int i, int i2) {
        defpackage.abpg abpgVar = (defpackage.abpg) this.a.get(i);
        defpackage.abpg abpgVar2 = (defpackage.abpg) this.b.get(i2);
        aooh.f(abpgVar, "oldItem");
        aooh.f(abpgVar2, "newItem");
        return aooh.n(abpgVar, abpgVar2);
    }

    public final boolean e(int i, int i2) {
        defpackage.abpg abpgVar = (defpackage.abpg) this.a.get(i);
        defpackage.abpg abpgVar2 = (defpackage.abpg) this.b.get(i2);
        aooh.f(abpgVar, "oldItem");
        aooh.f(abpgVar2, "newItem");
        return aooh.n(abpgVar.a, abpgVar2.a);
    }
}
