package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afg {
    public final alg a;
    public final ccp b;
    public final ccp c;
    public ajl d;
    public cpn e;
    public cpn f;
    private final aomy g;
    private final aonj h;
    private final ccp i;
    private final aonj j;
    private final ahj k;

    public afg(ahj ahjVar, alg algVar, defpackage.ett ettVar, defpackage.afk afkVar, aomy aomyVar) {
        this.k = ahjVar;
        this.a = algVar;
        this.g = aomyVar;
        cdu cduVar = cdu.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(ettVar, cduVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(afkVar, cduVar);
        this.d = defpackage.afi.a;
        this.h = new nm(this, 12);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.j = new nm(this, 13);
    }

    public final cer a() {
        return (cer) this.i.a();
    }

    public final cpn b() {
        cer cerVarA;
        cpn cpnVar;
        if (!this.k.i() || (cerVarA = a()) == null || (cpnVar = (cpn) cerVarA.a()) == null) {
            return null;
        }
        long j = ((cpm) this.g.a()).a;
        return !anty.ah(j, 0L) ? cpnVar.g(j) : cpnVar;
    }

    public final void c(cpn cpnVar, cpn cpnVar2, defpackage.afk afkVar, cpn cpnVar3, aiv aivVar) {
        if (this.k.i()) {
            this.e = cpnVar;
            this.f = cpnVar2;
            if (a() == null) {
                if (afkVar == null) {
                    afkVar = (defpackage.afk) this.c.a();
                }
                this.d = afkVar.a(cpnVar);
            }
            d(g().c(this.h, cpnVar3, aivVar, this.j));
        }
    }

    public final void d(cer cerVar) {
        this.i.b(cerVar);
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.a.h()).booleanValue();
    }

    public final boolean f() {
        alg algVar = this.a;
        while (true) {
            alg algVar2 = algVar.a;
            if (algVar2 == null) {
                break;
            }
            algVar = algVar2;
        }
        return !aooh.n(algVar.f(), algVar.h());
    }

    public final defpackage.ett g() {
        return (defpackage.ett) this.b.a();
    }
}
