package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adlf implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ adlf(defpackage.aexi aexiVar, java.lang.String str, java.util.concurrent.Executor executor, android.content.Context context, int i) {
        this.$cid = i;
        this.d = aexiVar;
        this.b = str;
        this.a = executor;
        this.c = context;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adli */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v21, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r8v17, types: [aexi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v33, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kfh] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) throws java.io.IOException, adli {
        defpackage.ajcq ajcqVarY;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.d;
            java.lang.Object obj3 = this.c;
            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) this.b;
            ((defpackage.gat) this.a).s(packManifest, (defpackage.adhw) obj3, (defpackage.adhw) obj2);
            return defpackage.gat.u(packManifest);
        }
        if (i == 1) {
            ?? r9 = this.c;
            defpackage.aenj aenjVarA = r9.a();
            ((defpackage.aimw) ((defpackage.aimw) defpackage.kjw.a.b()).l("com/android/dialer/calllog/refresh/impl/RefreshAnnotatedCallLogWorker", "fillAndTime", 293, "RefreshAnnotatedCallLogWorker.java")).y("filling %s", aenjVarA);
            defpackage.kcq.v(aenjVarA.a);
            ?? r1 = this.d;
            java.lang.Object obj4 = this.a;
            defpackage.ajcq ajcqVarB = r9.b(r1);
            ((defpackage.kjw) obj4).a(defpackage.kjw.b, aenjVarA, ajcqVarB);
            return ajcqVarB;
        }
        if (i == 2) {
            defpackage.gat gatVar = (defpackage.gat) this.a;
            defpackage.adjd adjdVar = ((defpackage.adjz) gatVar.e).d;
            java.lang.Object obj5 = this.c;
            java.lang.Throwable th = (java.lang.Throwable) obj;
            try {
                ((defpackage.adjo) adjdVar).b.getWritableDatabase().execSQL("UPDATE file_metadata SET validation_count=validation_count+1 WHERE namespace=? AND name=?", new java.lang.String[]{((defpackage.adhb) obj5).a, ((defpackage.adhb) obj5).b});
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.d;
                ((defpackage.tvn) gatVar.b).P(new adlh(gatVar, (defpackage.adhw) obj7, (com.google.android.libraries.micore.superpacks.common.PackManifest) obj6, (defpackage.adhw) obj5, th, 1));
                return defpackage.aiql.y(th);
            } catch (android.database.sqlite.SQLiteException e) {
                defpackage.adiz adizVar = ((defpackage.adjo) adjdVar).b;
                java.io.IOException iOException = new java.io.IOException("SqliteFileMetadataTable#incrementValidationFailureCount, SQL update failed, name: ".concat(obj5.toString()), e);
                adizVar.a(iOException);
                throw iOException;
            }
        }
        if (i != 3) {
            java.util.concurrent.TimeoutException timeoutException = (java.util.concurrent.TimeoutException) obj;
            ?? r0 = this.d;
            int i2 = defpackage.ahrc.a;
            if (!r0.isDone()) {
                ?? r2 = this.c;
                if (r2 != 0) {
                    timeoutException.setStackTrace(defpackage.ahrc.l(r2, null));
                    defpackage.ahrc.i(r2, timeoutException);
                    defpackage.ahrc.g(r2, timeoutException);
                }
                defpackage.aiql.K(this.a, r0);
            }
            return this.b;
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.Object obj8 = this.b;
        int i3 = 14;
        if (zBooleanValue) {
            return defpackage.ajck.w(this.d.k((java.lang.String) obj8)).x(new defpackage.vut(obj8, i3), this.a);
        }
        defpackage.aewq aewqVarA = defpackage.aewq.a((android.content.Context) this.c);
        if (aewqVarA == null) {
            defpackage.aewq.e();
            throw new java.lang.IllegalStateException();
        }
        defpackage.aezd aezdVar = (defpackage.aezd) defpackage.aezd.a(aewqVarA.c).get(obj8);
        if (aezdVar == null) {
            ajcqVarY = new defpackage.ajdd(new java.lang.IllegalStateException(defpackage.a.bk((java.lang.String) obj8, "Config package ", " does not use declarative registration. See go/phenotype-android-integration#phenotype for more information.")));
        } else {
            defpackage.aezw aezwVar = aewqVarA.f;
            defpackage.aezt aeztVar = new defpackage.aezt(aewqVarA, (java.lang.String) obj8, "", aezdVar.c);
            ajcqVarY = defpackage.ajck.w(aezwVar.d(false)).u(java.lang.Throwable.class, new defpackage.aeqw(7), aewqVarA.c()).x(new adek(aeztVar, 16), aewqVarA.c()).y(new aczq(aewqVarA, obj8, aeztVar, 14), aewqVarA.c());
        }
        return defpackage.ajck.w(ajcqVarY);
    }

    public /* synthetic */ adlf(defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2, defpackage.ahpj ahpjVar, defpackage.ajcq ajcqVar3, int i) {
        this.$cid = i;
        this.d = ajcqVar;
        this.b = ajcqVar2;
        this.c = ahpjVar;
        this.a = ajcqVar3;
    }

    public /* synthetic */ adlf(defpackage.gat gatVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, defpackage.adhw adhwVar, defpackage.adhw adhwVar2, int i) {
        this.$cid = i;
        this.a = gatVar;
        this.b = packManifest;
        this.c = adhwVar;
        this.d = adhwVar2;
    }

    public /* synthetic */ adlf(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.d = obj3;
        this.b = obj4;
    }
}
