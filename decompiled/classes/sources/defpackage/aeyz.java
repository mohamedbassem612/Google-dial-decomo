package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeyz {
    private volatile defpackage.aeyt a;
    private defpackage.aeyy b;

    public aeyz(defpackage.aeyt aeytVar) {
        this.a = aeytVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    public final defpackage.aeyy a(final defpackage.aewq aewqVar) {
        final defpackage.aeyt aeytVar = this.a;
        defpackage.aeyt aeytVar2 = defpackage.aeyy.b;
        if (aeytVar != aeytVar2) {
            android.content.Context context = aewqVar.c;
            defpackage.aeyx aeyxVar = defpackage.aeyy.a;
            final boolean[] zArr = new boolean[1];
            defpackage.zzx zzxVar = (defpackage.zzx) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(aeyxVar.b, aeytVar.a(context), new java.util.function.Function() { // from class: aeyw
                @Override // java.util.function.Function
                public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                    return j$.util.function.Function.-CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    defpackage.aewq aewqVar2 = aewqVar;
                    defpackage.aeyt aeytVar3 = aeytVar;
                    defpackage.aeyy aeyyVar = new defpackage.aeyy(aewqVar2, aeytVar3);
                    boolean z = aeytVar3.b;
                    defpackage.zzx zzxVar2 = new defpackage.zzx(aeyyVar);
                    zArr[0] = true;
                    return zzxVar2;
                }

                @Override // java.util.function.Function
                public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                    return j$.util.function.Function.-CC.$default$compose(this, function);
                }
            });
            if (zArr[0]) {
                defpackage.aezw aezwVar = aewqVar.f;
                boolean z = aeytVar.a;
                defpackage.ajsw ajswVar = defpackage.ajsw.FILE;
                if (defpackage.aewo.d()) {
                    defpackage.aezl.a(context, null, new defpackage.apnt(aeyxVar));
                } else if (z) {
                    defpackage.aexw aexwVarB = aezwVar.b();
                    if (aexwVarB.e && new defpackage.alam(aexwVarB.i, defpackage.aexw.a).contains(ajswVar) && aexwVarB.n) {
                        defpackage.aezl.a(context, null, new defpackage.apnt(aeyxVar));
                    } else {
                        defpackage.aezl.a(context, new defpackage.apnt(aeyxVar), new defpackage.apnt(aeyxVar));
                    }
                } else {
                    defpackage.aexv aexvVarA = aezwVar.a();
                    if (aexvVarA.e && new defpackage.alam(aexvVarA.j, defpackage.aexv.a).contains(ajswVar) && aexvVarA.o) {
                        defpackage.aezl.a(context, null, new defpackage.apnt(aeyxVar));
                    } else {
                        defpackage.aezl.a(context, new defpackage.apnt(aeyxVar), new defpackage.apnt(aeyxVar));
                    }
                }
                boolean z2 = aeytVar.b;
            }
            this.b = (defpackage.aeyy) zzxVar.a;
            this.a = aeytVar2;
        }
        return this.b;
    }
}
