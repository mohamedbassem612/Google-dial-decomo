package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftf extends defpackage.afst {
    final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftf(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, defpackage.amdx amdxVar) {
        super(extendedFloatingActionButton, amdxVar);
        j$.util.Objects.requireNonNull(extendedFloatingActionButton);
        this.b = extendedFloatingActionButton;
    }

    @Override // defpackage.afst, defpackage.afto
    public final void e() {
        super.e();
        this.c = true;
    }

    @Override // defpackage.afst, defpackage.afto
    public final void f() {
        super.f();
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.t = 0;
        if (this.c) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // defpackage.afst, defpackage.afto
    public final void g(android.animation.Animator animator) {
        super.g(animator);
        this.c = false;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.t = 1;
    }

    @Override // defpackage.afto
    public final int h() {
        return 2130837550;
    }

    @Override // defpackage.afto
    public final void i() {
        this.b.setVisibility(8);
    }

    @Override // defpackage.afto
    public final boolean j() {
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.t;
        if (visibility == 0) {
            if (i == 1) {
                return true;
            }
        } else if (i != 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afto
    public final void k() {
    }
}
