package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class aaiz {
    private final defpackage.acxg a;

    public aaiz(android.content.Context context) {
        android.content.Context context2;
        defpackage.aewq.d(context);
        if (defpackage.aajj.a.compareAndSet(false, true)) {
            java.lang.String strA = defpackage.anee.a(context);
            final boolean zContains = defpackage.anez.a.contains(defpackage.aewo.c(strA));
            defpackage.aewq aewqVarA = defpackage.aewq.a(context);
            if (aewqVarA == null) {
                defpackage.aewq.e();
                throw new java.lang.IllegalStateException();
            }
            defpackage.aexi aexiVarB = aewqVarA.b();
            defpackage.ajcu ajcuVarC = aewqVarA.c();
            final defpackage.aezw aezwVar = aewqVarA.f;
            context2 = context;
            defpackage.ajck.w(aezwVar.d(false)).x(new defpackage.ahyc() { // from class: aezo
                /* JADX WARN: Code duplicated, block: B:13:0x003b  */
                @Override // defpackage.ahyc
                public final java.lang.Object apply(java.lang.Object obj) {
                    defpackage.aezw aezwVar2 = aezwVar;
                    boolean z = zContains;
                    defpackage.ajsw ajswVar = defpackage.ajsw.FILE;
                    boolean z2 = true;
                    if (z) {
                        defpackage.aexw aexwVarB = aezwVar2.b();
                        if (!aexwVarB.e || !new defpackage.alam(aexwVarB.i, defpackage.aexw.a).contains(ajswVar)) {
                            z2 = false;
                        }
                    } else {
                        defpackage.aexv aexvVarA = aezwVar2.a();
                        if (!aexvVarA.e || !new defpackage.alam(aexvVarA.j, defpackage.aexv.a).contains(ajswVar)) {
                            z2 = false;
                        }
                    }
                    return java.lang.Boolean.valueOf(z2);
                }
            }, ajcuVarC).u(java.lang.Exception.class, new defpackage.adcu(18), ajcuVarC).y(new defpackage.adlf(aexiVarB, strA, (java.util.concurrent.Executor) ajcuVarC, context2, 3), ajcuVarC).x(new defpackage.adcu(19), ajcuVarC);
        } else {
            context2 = context;
        }
        this.a = new defpackage.acxg(context2, defpackage.aazc.A(context2));
    }

    public final java.lang.String a(java.lang.String str, java.util.Map map) {
        return this.a.t(str, map);
    }
}
