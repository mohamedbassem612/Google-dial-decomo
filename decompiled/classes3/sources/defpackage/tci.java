package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tci extends defpackage.akvt {
    final /* synthetic */ defpackage.tck a;

    public tci(defpackage.tck tckVar) {
        j$.util.Objects.requireNonNull(tckVar);
        this.a = tckVar;
    }

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
    @Override // defpackage.akvu
    public final void a(android.os.Bundle bundle) {
        boolean z = bundle.getBoolean("detected");
        bundle.getFloat("likelihood");
        bundle.getFloat("distance");
        bundle.getFloat("axialVelocity");
        bundle.getFloatArray("angle");
        if (z) {
            aimz aimzVar = defpackage.tck.a;
            aimzVar.b().l("com/android/dialer/ringing/OsloAction$ReachListener", "onGestureDetected", 108, "OsloAction.java").v("Oslo reach gesture received");
            defpackage.tck tckVar = this.a;
            j$.util.Optional optional = tckVar.b;
            if (true == optional.isPresent()) {
                ((ogj) optional.get()).e(0.125f);
                aimzVar.b().l("com/android/dialer/ringing/OsloAction$ReachListener", "onGestureDetected", 112, "OsloAction.java").v("Ringer volume attenuated");
            }
            tckVar.c.a(tckVar.f);
        }
    }
}
