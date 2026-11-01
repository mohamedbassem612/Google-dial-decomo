package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aejc extends er {
    final /* synthetic */ java.util.List a;
    final /* synthetic */ java.util.List b;
    final /* synthetic */ defpackage.aejd c;

    public aejc(defpackage.aejd aejdVar, java.util.List list, java.util.List list2) {
        this.a = list;
        this.b = list2;
        j$.util.Objects.requireNonNull(aejdVar);
        this.c = aejdVar;
    }

    public final int a() {
        return this.b.size();
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean d(int i, int i2) {
        java.lang.Object obj = this.a.get(i);
        java.lang.Object obj2 = this.b.get(i2);
        defpackage.aehm aehmVar = this.c.a;
        return defpackage.aehr.a(obj, aehmVar).equals(defpackage.aehr.a(obj2, aehmVar));
    }

    public final boolean e(int i, int i2) {
        defpackage.aehm aehmVar = this.c.a;
        return aehmVar.b(this.a.get(i)).equals(aehmVar.b(this.b.get(i2)));
    }
}
