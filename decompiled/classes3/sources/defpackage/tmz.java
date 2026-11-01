package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tmz implements defpackage.pzc {
    private static final j$.time.Duration a;
    private final android.content.Context b;
    private final defpackage.uxy c;
    private final aolr d;

    static {
        j$.time.Duration durationOfMinutes = j$.time.Duration.ofMinutes(6L);
        aooh.e(durationOfMinutes, "ofMinutes(...)");
        a = durationOfMinutes;
    }

    public tmz(android.content.Context context, defpackage.uxy uxyVar, aolr aolrVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        this.b = context;
        this.c = uxyVar;
        this.d = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pzc
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.tmy tmyVar;
        if (aolnVar instanceof defpackage.tmy) {
            tmyVar = (defpackage.tmy) aolnVar;
            int i = tmyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmyVar.c = i - Integer.MIN_VALUE;
            } else {
                tmyVar = new defpackage.tmy(this, aolnVar);
            }
        } else {
            tmyVar = new defpackage.tmy(this, aolnVar);
        }
        java.lang.Object objAj = tmyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tmyVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.d;
            defpackage.tkx tkxVar = new defpackage.tkx(this, (aoln) null, 8);
            tmyVar.c = 1;
            objAj = aoov.aj(aolrVar, tkxVar, tmyVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        return new defpackage.pyw(defpackage.pyx.c, new defpackage.pyy(new hxx((java.io.File) objAj), a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(int i, java.lang.String str, aoln aolnVar) {
        defpackage.tmx tmxVar;
        if (aolnVar instanceof defpackage.tmx) {
            tmxVar = (defpackage.tmx) aolnVar;
            int i2 = tmxVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tmxVar.c = i2 - Integer.MIN_VALUE;
            } else {
                tmxVar = new defpackage.tmx(this, aolnVar);
            }
        } else {
            tmxVar = new defpackage.tmx(this, aolnVar);
        }
        java.lang.Object objD = tmxVar.a;
        aolu aoluVar = aolu.a;
        int i3 = tmxVar.c;
        if (i3 == 0) {
            aooc.af(objD);
            java.io.File file = new java.io.File(this.b.getCacheDir().getAbsolutePath(), str);
            if (file.exists()) {
                return file;
            }
            ajcq ajcqVarA = this.c.a(i, str);
            tmxVar.c = 1;
            objD = aosv.D(ajcqVarA, tmxVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        java.io.File file2 = (java.io.File) aooh.q((j$.util.Optional) objD);
        if (file2 == null) {
            throw new java.lang.IllegalStateException("Sound file is not available.");
        }
        return file2;
    }
}
