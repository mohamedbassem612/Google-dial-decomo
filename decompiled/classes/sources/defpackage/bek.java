package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bek {
    public final java.lang.Object a;
    public int c;
    public boolean d;
    public defpackage.bek f;
    private final defpackage.bel g;
    public int b = -1;
    public final defpackage.ccp e = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);

    public bek(java.lang.Object obj, defpackage.bel belVar) {
        this.a = obj;
        this.g = belVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        if (this.c <= 0) {
            avo.d("Release should only be called once");
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            b();
        }
    }

    public final void b() {
        this.g.a.remove(this);
        defpackage.bek bekVar = this.f;
        if (bekVar != null) {
            bekVar.a();
        }
        this.f = null;
    }

    public final defpackage.bek c() {
        return (defpackage.bek) this.e.a();
    }

    public final void d() {
        if (this.d) {
            avo.d("Pin should not be called on an already disposed item ");
        }
        if (this.c == 0) {
            this.g.a.add(this);
            defpackage.bek bekVarC = c();
            if (bekVarC != null) {
                bekVarC.d();
            } else {
                bekVarC = null;
            }
            this.f = bekVarC;
        }
        this.c++;
    }
}
