package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bro extends ddl implements defpackage.dri {
    private final android.view.Window a;
    private final ccp b;
    private boolean c;

    public bro(android.content.Context context, android.view.Window window) {
        super(context, (android.util.AttributeSet) null, 0, 6, (aooc) null);
        this.a = window;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.bow.a, cdu.c);
    }

    @Override // defpackage.dri
    public final android.view.Window a() {
        return this.a;
    }

    public final void b(cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(576708319);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            ((aonn) this.b.a()).a(cavVarB, 0);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(this, i, 8);
        }
    }

    public final void c(caz cazVar, aonn aonnVar) {
        super.j(cazVar);
        this.b.b(aonnVar);
        this.c = true;
        f();
    }

    protected final boolean d() {
        return this.c;
    }
}
