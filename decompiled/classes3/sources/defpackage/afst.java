package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class afst implements defpackage.afto {
    public defpackage.afpg a;
    private final android.content.Context b;
    private final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton c;
    private final java.util.ArrayList d = new java.util.ArrayList();
    private defpackage.afpg e;
    private final defpackage.amdx f;

    public afst(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, defpackage.amdx amdxVar) {
        this.c = extendedFloatingActionButton;
        this.b = extendedFloatingActionButton.getContext();
        this.f = amdxVar;
    }

    @Override // defpackage.afto
    public android.animation.AnimatorSet a() {
        return b(c());
    }

    final android.animation.AnimatorSet b(defpackage.afpg afpgVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (afpgVar.f("opacity")) {
            arrayList.add(afpgVar.a("opacity", this.c, android.view.View.ALPHA));
        }
        if (afpgVar.f("scale")) {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
            arrayList.add(afpgVar.a("scale", extendedFloatingActionButton, android.view.View.SCALE_Y));
            arrayList.add(afpgVar.a("scale", extendedFloatingActionButton, android.view.View.SCALE_X));
        }
        if (afpgVar.f("width")) {
            arrayList.add(afpgVar.a("width", this.c, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.p));
        }
        if (afpgVar.f("height")) {
            arrayList.add(afpgVar.a("height", this.c, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.q));
        }
        if (afpgVar.f("paddingStart")) {
            arrayList.add(afpgVar.a("paddingStart", this.c, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.r));
        }
        if (afpgVar.f("paddingEnd")) {
            arrayList.add(afpgVar.a("paddingEnd", this.c, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.s));
        }
        if (afpgVar.f("labelOpacity")) {
            arrayList.add(afpgVar.a("labelOpacity", this.c, new defpackage.afss(this, java.lang.Float.class)));
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        afsq.h(animatorSet, arrayList);
        return animatorSet;
    }

    public final defpackage.afpg c() {
        defpackage.afpg afpgVarC = this.a;
        if (afpgVarC == null) {
            afpgVarC = this.e;
            if (afpgVarC == null) {
                afpgVarC = defpackage.afpg.c(this.b, h());
                this.e = afpgVarC;
            }
            dzk.x(afpgVarC);
        }
        return afpgVarC;
    }

    @Override // defpackage.afto
    public final java.util.List d() {
        return this.d;
    }

    @Override // defpackage.afto
    public void e() {
        this.f.h();
    }

    @Override // defpackage.afto
    public void f() {
        this.f.h();
    }

    @Override // defpackage.afto
    public void g(android.animation.Animator animator) {
        defpackage.amdx amdxVar = this.f;
        java.lang.Object obj = amdxVar.a;
        if (obj != null) {
            ((android.animation.Animator) obj).cancel();
        }
        amdxVar.a = animator;
    }
}
