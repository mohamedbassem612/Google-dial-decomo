package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class jzp extends defpackage.aomh implements defpackage.aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.jzr b;
    final /* synthetic */ defpackage.kcw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzp(defpackage.jzr jzrVar, defpackage.kcw kcwVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = jzrVar;
        this.c = kcwVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.jzp) c((defpackage.kiu) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v0 kbx, still in use, count: 1, list:
          (r15v0 kbx) from 0x025b: MOVE (r10v13 kbx) = (r15v0 kbx) (LINE:604)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.jzp jzpVar = new defpackage.jzp(this.b, this.c, aolnVar);
        jzpVar.a = obj;
        return jzpVar;
    }
}
