package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cyh implements cyf {
    final /* synthetic */ int a;
    final /* synthetic */ cyi b;
    final /* synthetic */ aonj c;
    private final int d;
    private final int e;
    private final java.util.Map f;
    private final aonj g;
    private final aonn h;

    public cyh(int i, int i2, java.util.Map map, aonj aonjVar, aonn aonnVar, cyi cyiVar, aonj aonjVar2) {
        this.a = i;
        this.b = cyiVar;
        this.c = aonjVar2;
        this.d = i;
        this.e = i2;
        this.f = map;
        this.g = aonjVar;
        this.h = aonnVar;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.d;
    }

    public final java.util.Map f() {
        return this.f;
    }

    public final aonj g() {
        return this.g;
    }

    public final aonn h() {
        return this.h;
    }

    public final void i() {
        dbt dbtVar = this.b;
        boolean z = dbtVar instanceof dbt;
        aonj aonjVar = this.c;
        if (z) {
            aonjVar.a(dbtVar.o);
        } else {
            aonjVar.a(new defpackage.czj(this.a, dbtVar.p(), dbtVar.a(), dbtVar.b()));
        }
    }

    public final /* synthetic */ void j() {
    }
}
