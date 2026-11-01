package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaaf extends defpackage.aada implements defpackage.zze {
    public static final defpackage.aaap a = new defpackage.aaap();

    public aaaf(android.content.Context context) {
        defpackage.acxg acxgVar = defpackage.zzd.l;
        defpackage.aact aactVar = defpackage.aacu.q;
        defpackage.aacy aacyVar = new defpackage.aacy();
        aacyVar.b = new defpackage.aais();
        super(context, null, acxgVar, aactVar, aacyVar.a());
    }

    public static boolean d(defpackage.ajcq ajcqVar) {
        if (!ajcqVar.isDone() || ajcqVar.isCancelled()) {
            return false;
        }
        try {
            defpackage.a.h(ajcqVar);
            return true;
        } catch (java.lang.RuntimeException | java.util.concurrent.ExecutionException unused) {
            return false;
        }
    }

    private final defpackage.aaum m(defpackage.zyy zyyVar, zyz zyzVar) {
        return zyzVar != null ? n(zyyVar, new defpackage.wym(this, zyzVar, 5)) : n(zyyVar, new defpackage.vut(this, 7));
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
    private static final defpackage.aaum n(defpackage.zyy zyyVar, defpackage.ahyc ahycVar) {
        int i;
        defpackage.ajcq ajcqVar;
        if (zyyVar.n) {
            android.util.Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            ajcqVar = defpackage.ajcm.a;
        } else {
            zyyVar.n = true;
            defpackage.zzl zzlVar = zyyVar.m;
            int i2 = 6;
            byte[] bArr = null;
            if (zzlVar == null || zzlVar.b != 6) {
                defpackage.zzj zzjVar = zyyVar.a.j;
                defpackage.zzl zzlVarA = zzjVar != null ? zzjVar.a() : null;
                if (zzlVarA != null && (i = zzlVarA.b) != 4 && i != 5) {
                    android.util.Log.e("AbstractLogEventBuilder", "The provided logger-level ProductIdOrigin value " + java.lang.Integer.toString(i - 1) + " is not one of the values expected for a logger-level provider: 3 or 4");
                    zzlVarA = null;
                }
                if (zzlVarA == null || zzlVarA.b != 4) {
                    defpackage.zzl zzlVar2 = zyyVar.k;
                    if (zzlVar2 != null && zzlVar2.b == 2) {
                        zyyVar.f(zzlVar2);
                    } else if (zzlVar != null) {
                        zyyVar.f(zzlVar);
                    } else if (zzlVarA != null) {
                        zyyVar.f(zzlVarA);
                    } else if (zzlVar2 != null) {
                        zyyVar.f(zzlVar2);
                    }
                } else {
                    zyyVar.f(zzlVarA);
                }
            } else {
                zyyVar.f(zzlVar);
            }
            if (zyyVar.a.d()) {
                ajcqVar = defpackage.ajcm.a;
            } else {
                defpackage.ajcq ajcqVar2 = defpackage.ajcm.a;
                defpackage.kjs kjsVar = new defpackage.kjs(zyyVar, ajcqVar2, 18, bArr);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                int i3 = defpackage.ajan.c;
                defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar2, kjsVar);
                ajcqVar2.c(ajalVar, defpackage.aiql.t(ajbmVar, ajalVar));
                defpackage.ajam ajamVar = new defpackage.ajam(ajalVar, new defpackage.vut(zyyVar, i2));
                ajalVar.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
                ajcqVar = ajamVar;
            }
        }
        return d(ajcqVar) ? (defpackage.aaum) ahycVar.apply(zyyVar) : abxl.A(ajcqVar).c(defpackage.ajbm.INSTANCE, new aaab(ahycVar, zyyVar, 1));
    }

    @Override // defpackage.zze
    public final defpackage.aaum a(defpackage.zzc zzcVar) {
        return m(zzcVar, ((defpackage.zzd) zzcVar.a).n);
    }

    @Override // defpackage.zze
    public final defpackage.aaum b(zzy zzyVar) {
        return m(zzyVar, null);
    }

    public final defpackage.aaum c(defpackage.zyy zyyVar, defpackage.zzt zztVar) {
        defpackage.aaaj.b().d(1007, this.b);
        defpackage.aaae aaaeVar = new defpackage.aaae(this, zyyVar, this.i, zztVar);
        super.k(2, aaaeVar);
        return defpackage.aahm.c(aaaeVar, new defpackage.aahj());
    }

    public final void e(com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            new defpackage.aauq().s(com.google.android.gms.common.api.Status.a);
            return;
        }
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(this, batchedLogErrorParcelable, 5);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.zzp.a};
        aafqVar.b();
        super.i(2, aafqVar.a());
    }
}
