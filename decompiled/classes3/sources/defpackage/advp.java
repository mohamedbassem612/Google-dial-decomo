package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class advp implements defpackage.advl {
    public static final aiof a = aiof.i("GnpSdk");
    public final android.content.Context b;
    public final java.util.Map c;
    public final aduj d;
    public final aduu e;
    public final amwu f;
    public final amwu g;
    public final amwu h;
    public final tvn i;
    private final aolr j;

    public advp(aazc aazcVar, android.content.Context context, java.util.Map map, aduj adujVar, aduu aduuVar, amwu amwuVar, amwu amwuVar2, amwu amwuVar3, aolr aolrVar, tvn tvnVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(context, "context");
        aooh.f(aduuVar, "gnpConfig");
        aooh.f(amwuVar, "clientStreamz");
        aooh.f(amwuVar2, "gnpClearcutLogger");
        aooh.f(amwuVar3, "logEventFactory");
        aooh.f(aolrVar, "lightweightContext");
        this.b = context;
        this.c = map;
        this.d = adujVar;
        this.e = aduuVar;
        this.f = amwuVar;
        this.g = amwuVar2;
        this.h = amwuVar3;
        this.j = aolrVar;
        this.i = tvnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.advl
    public final java.lang.Object a(grp grpVar, int i, aoln aolnVar) {
        defpackage.advm advmVar;
        java.lang.Throwable th;
        ahmv ahmvVar;
        if (aolnVar instanceof defpackage.advm) {
            advmVar = (defpackage.advm) aolnVar;
            int i2 = advmVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advmVar.c = i2 - Integer.MIN_VALUE;
            } else {
                advmVar = new defpackage.advm(this, aolnVar);
            }
        } else {
            advmVar = new defpackage.advm(this, aolnVar);
        }
        java.lang.Object obj = advmVar.a;
        gus gusVar = aolu.a;
        int i3 = advmVar.c;
        if (i3 == 0) {
            aooc.af(obj);
            ahmv ahmvVarH = ahns.h();
            try {
                aolr aolrVar = this.j;
                defpackage.advo advoVar = new defpackage.advo(this, grpVar, i, null);
                advmVar.d = ahmvVarH;
                advmVar.c = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, advoVar, advmVar);
                if (objAj != gusVar) {
                    obj = objAj;
                    ahmvVar = ahmvVarH;
                }
                return gusVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahmvVar = ahmvVarH;
                throw th;
            }
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahmvVar = advmVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahmvVar, th);
                throw th4;
            }
        }
        gusVar = (gus) obj;
        ajsz.ak(ahmvVar, (java.lang.Throwable) null);
        return gusVar;
    }

    public final void b(long j, java.lang.String str, adtz adtzVar) {
        java.lang.String strName;
        aooh.f(str, "jobKey");
        aeey aeeyVar = (aeey) this.f.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli() - j;
        java.lang.String packageName = this.b.getPackageName();
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String strE = adtzVar.e();
        adty adtyVarC = adtzVar.c();
        if (adtyVarC == null || (strName = adtyVarC.name()) == null) {
            strName = "";
        }
        ((afim) aeeyVar.b.eZ()).b(epochMilli, new java.lang.Object[]{packageName, this.e.a, java.lang.Integer.valueOf(i), str, strE, strName});
    }
}
