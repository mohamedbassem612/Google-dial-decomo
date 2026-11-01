package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afun implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public afun(defpackage.afuw afuwVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afuwVar);
        this.a = afuwVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ge, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ahth, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws afeb {
        int i = this.$cid;
        boolean z = true;
        if (i == 0) {
            ?? r4 = this.a;
            defpackage.afuw afuwVar = (defpackage.afuw) r4;
            afuwVar.l(true);
            defpackage.fv fvVar = ((com.google.android.material.internal.NavigationMenuItemView) view).l;
            boolean zB = afuwVar.c.B(fvVar, r4, 0);
            if (fvVar != null && fvVar.isCheckable() && zB) {
                afuwVar.e.x(fvVar);
            } else {
                z = false;
            }
            afuwVar.l(false);
            if (z) {
                afuwVar.f(false);
                return;
            }
            return;
        }
        if (i == 1) {
            defpackage.ahvr.j(defpackage.rqm.a, (android.view.View) this.a);
            return;
        }
        if (i != 2) {
            defpackage.ahvr.j(this.a, view);
            return;
        }
        defpackage.fv fvVar2 = ((defpackage.afwm) view).h;
        defpackage.afwq afwqVar = (defpackage.afwq) this.a;
        boolean zB2 = afwqVar.H.a.B(fvVar2, afwqVar.G, 0);
        if (fvVar2 == null || !fvVar2.isCheckable()) {
            return;
        }
        if (!zB2 || fvVar2.isChecked()) {
            afwqVar.g(fvVar2);
        }
    }

    public /* synthetic */ afun(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public afun(defpackage.afwq afwqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afwqVar);
        this.a = afwqVar;
    }
}
