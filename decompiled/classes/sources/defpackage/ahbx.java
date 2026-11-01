package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahbx implements defpackage.ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahbx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [aonj, java.lang.Object] */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.a(obj);
                return null;
            case 1:
                return this.a.a(obj);
            case 2:
                return this.a;
            case 3:
                return this.a;
            case 4:
                return this.a.a(obj);
            case 5:
                return defpackage.a.l(this.a, obj);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r7 = this.a;
                defpackage.ahbq ahbqVar = defpackage.ahew.k;
                return defpackage.a.k(r7, obj);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ahbq ahbqVar2 = defpackage.ahew.k;
                return this.a.a(obj);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ?? r8 = this.a;
                defpackage.ahbq ahbqVar3 = defpackage.ahew.k;
                return defpackage.a.k(r8, obj);
            case 9:
                java.lang.Long l = (java.lang.Long) obj;
                defpackage.aca acaVar = new defpackage.aca();
                defpackage.ahmp ahmpVar = defpackage.ahmp.a;
                java.lang.Object obj2 = this.a;
                try {
                    for (defpackage.ahmo ahmoVar : ((defpackage.ahlm) obj2).a().d) {
                        long jLongValue = ahmoVar.e;
                        defpackage.ahmr ahmrVar = ahmoVar.c;
                        if (ahmrVar == null) {
                            ahmrVar = defpackage.ahmr.a;
                        }
                        defpackage.ahlv ahlvVar = new defpackage.ahlv(ahmrVar);
                        if (jLongValue <= 0) {
                            jLongValue = l.longValue();
                        }
                        acaVar.put(ahlvVar, java.lang.Long.valueOf(jLongValue));
                    }
                    return acaVar;
                } catch (java.io.IOException e) {
                    ((defpackage.ahlm) obj2).g(e);
                    return acaVar;
                }
            case 10:
                ((defpackage.ahlt) this.a).i((java.util.Set) obj);
                return null;
            case 11:
                defpackage.aimz aimzVar = defpackage.ahme.a;
                defpackage.ahlw ahlwVar = (defpackage.ahlw) this.a;
                java.util.Set set = ahlwVar.a;
                long j = ahlwVar.b;
                return null;
            default:
                android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) obj;
                if (activityLifecycleCallbacks == null) {
                    defpackage.aooh.i("callbacks");
                }
                return new defpackage.ahpu((defpackage.ahpz) this.a, activityLifecycleCallbacks);
        }
    }
}
