package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efn implements defpackage.ecs {
    private final defpackage.aonn a;
    private final defpackage.aono b;
    private final android.content.Context c;
    private final java.lang.String d;
    private final defpackage.aoir e;
    private final java.util.Set f;

    public efn(defpackage.aomy aomyVar, java.util.Set set, defpackage.aonn aonnVar, defpackage.aono aonoVar, android.content.Context context, java.lang.String str) {
        this.a = aonnVar;
        this.b = aonoVar;
        this.c = context;
        this.d = str;
        this.e = new defpackage.aoiy(aomyVar);
        this.f = set == defpackage.efo.a ? null : defpackage.ajsz.ce(set);
    }

    private final android.content.SharedPreferences d() {
        return (android.content.SharedPreferences) this.e.a();
    }

    @Override // defpackage.ecs
    public final java.lang.Object a(defpackage.aoln aolnVar) throws java.io.IOException {
        android.content.Context context;
        java.lang.String str;
        android.content.SharedPreferences.Editor editorEdit = d().edit();
        java.util.Set set = this.f;
        if (set == null) {
            editorEdit.clear();
        } else {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((java.lang.String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new java.io.IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (d().getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
            fh$.ExternalSyntheticApiModelOutline0.m(context, str);
        }
        if (set != null) {
            set.clear();
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.ecs
    public final java.lang.Object b(java.lang.Object obj, defpackage.aoln aolnVar) {
        return this.b.a(new defpackage.vx(d(), this.f), obj, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    public final java.lang.Object c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.efm efmVar;
        if (aolnVar instanceof defpackage.efm) {
            efmVar = (defpackage.efm) aolnVar;
            int i = efmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                efmVar.c = i - Integer.MIN_VALUE;
            } else {
                efmVar = new defpackage.efm(this, aolnVar);
            }
        } else {
            efmVar = new defpackage.efm(this, aolnVar);
        }
        java.lang.Object objA = efmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = efmVar.c;
        boolean z = true;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.aonn aonnVar = this.a;
            efmVar.c = 1;
            objA = aonnVar.a(obj, efmVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        if (!((java.lang.Boolean) objA).booleanValue()) {
            return java.lang.Boolean.FALSE;
        }
        java.util.Set set = this.f;
        if (set == null) {
            java.util.Map<java.lang.String, ?> all = d().getAll();
            defpackage.aooh.e(all, "getAll(...)");
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            android.content.SharedPreferences sharedPreferencesD = d();
            if (set.isEmpty()) {
                z = false;
            } else {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesD.contains((java.lang.String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public efn(defpackage.aomy aomyVar, java.util.Set set, defpackage.aonn aonnVar, defpackage.aono aonoVar) {
        this(aomyVar, set, aonnVar, aonoVar, null, null);
        if (set == null) {
            defpackage.aooh.i("keysToMigrate");
        }
    }
}
