package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afsy implements defpackage.afth {
    final /* synthetic */ defpackage.afth a;
    final /* synthetic */ defpackage.afth b;
    final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton c;

    public afsy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, defpackage.afth afthVar, defpackage.afth afthVar2) {
        this.a = afthVar;
        this.b = afthVar2;
        j$.util.Objects.requireNonNull(extendedFloatingActionButton);
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.afth
    public final int a() {
        int i = this.c.A;
        if (i == -1) {
            return this.a.a();
        }
        return (i == 0 || i == -2) ? this.b.a() : i;
    }

    @Override // defpackage.afth
    public final int b() {
        return this.c.v;
    }

    @Override // defpackage.afth
    public final int c() {
        return this.c.u;
    }

    @Override // defpackage.afth
    public final int d() {
        int i = this.c.z;
        if (i == -1) {
            return this.a.d();
        }
        return (i == 0 || i == -2) ? this.b.d() : i;
    }

    @Override // defpackage.afth
    public final android.view.ViewGroup.LayoutParams e() {
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int i = extendedFloatingActionButton.z;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.A;
        return new android.view.ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }
}
