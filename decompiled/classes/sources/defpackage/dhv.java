package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dhv extends defpackage.cmv implements defpackage.ddc {
    public boolean a;
    public defpackage.aonj b;
    private final boolean c;

    public dhv(boolean z, boolean z2, defpackage.aonj aonjVar) {
        this.a = z;
        this.c = z2;
        this.b = aonjVar;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        this.b.a(diqVar);
    }

    @Override // defpackage.ddc
    public final boolean w() {
        return this.c;
    }

    @Override // defpackage.ddc
    public final boolean x() {
        return this.a;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean y() {
        return true;
    }
}
