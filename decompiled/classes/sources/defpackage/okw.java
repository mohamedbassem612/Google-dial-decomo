package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class okw {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/externals/ari/impl/DialerAriImpl");
    public final android.content.Context b;
    public final defpackage.aolr c;
    private final defpackage.aonj d;

    public okw(android.content.Context context, defpackage.aolr aolrVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.b = context;
        this.c = aolrVar;
        new defpackage.aiuo(new defpackage.edt(this, (defpackage.aoln) null, 3, (byte[]) null));
        this.d = new defpackage.aiuo(new defpackage.edt(this, (defpackage.aoln) null, 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        oku okuVar;
        long j;
        if (aolnVar instanceof oku) {
            okuVar = (oku) aolnVar;
            int i = okuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                okuVar.c = i - Integer.MIN_VALUE;
            } else {
                okuVar = new oku(this, aolnVar);
            }
        } else {
            okuVar = new oku(this, aolnVar);
        }
        java.lang.Object objA = okuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = okuVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objA);
                defpackage.aonj aonjVar = this.d;
                okuVar.c = 1;
                objA = aonjVar.a(okuVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objA);
            }
            j = ((oks) objA).a;
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/ari/impl/DialerAriImpl", "getAndroidId", 79, "DialerAriImpl.kt")).v("Failed to get Android ID");
            j = 0;
        }
        return new oks(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(akle akleVar, defpackage.aoln aolnVar) {
        okv okvVar;
        if (aolnVar instanceof okv) {
            okvVar = (okv) aolnVar;
            int i = okvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                okvVar.c = i - Integer.MIN_VALUE;
            } else {
                okvVar = new okv(this, aolnVar);
            }
        } else {
            okvVar = new okv(this, aolnVar);
        }
        java.lang.Object objK = okvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = okvVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            okvVar.c = 1;
            defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(okvVar), 1);
            aoscVar.z();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(akleVar.i());
            try {
                new zwf(this.b).a(new com.google.android.gms.audit.LogAuditRecordsRequest(2, 286, (java.lang.String) null, (byte[][]) arrayList.toArray(new byte[0][]), (byte[]) null, (byte[]) null)).m(new ahsk(aoscVar, 1));
                objK = aoscVar.k();
                if (objK == aoluVar) {
                    return aoluVar;
                }
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalStateException(e.getMessage(), e);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objK);
        }
        return ((defpackage.aoiw) objK).a;
    }
}
