package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ogu {
    public static final aimz a = aimz.i("com/android/dialer/expresso/remote/ExpressoRemote");
    public final aoss b;
    public final zdt c;
    public zfu d;
    private final aoss e;
    private final defpackage.ofc f;
    private final aoin g;
    private final aoin h;
    private final aoin i;
    private final aoin j;
    private final ahda k;
    private final afpl l;

    public ogu(afpl afplVar, aoss aossVar, aoss aossVar2, zdt zdtVar, defpackage.ofc ofcVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "blockingScope");
        aooh.f(zdtVar, "commander");
        aooh.f(ofcVar, "inCallLogger");
        aooh.f(aoinVar, "rejectRetryLimit");
        aooh.f(aoinVar2, "timeoutRetryLimit");
        aooh.f(aoinVar3, "expressoWaitTimeoutInSeconds");
        aooh.f(aoinVar4, "enableExpressoWaitTimeout");
        this.l = afplVar;
        this.e = aossVar;
        this.b = aossVar2;
        this.c = zdtVar;
        this.f = ofcVar;
        this.g = aoinVar;
        this.h = aoinVar2;
        this.i = aoinVar3;
        this.j = aoinVar4;
        this.k = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ogs ogsVar;
        if (aolnVar instanceof defpackage.ogs) {
            ogsVar = (defpackage.ogs) aolnVar;
            int i = ogsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ogsVar.c = i - Integer.MIN_VALUE;
            } else {
                ogsVar = new defpackage.ogs(this, aolnVar);
            }
        } else {
            ogsVar = new defpackage.ogs(this, aolnVar);
        }
        java.lang.Object objD = ogsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ogsVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.l.X();
            ogsVar.c = 1;
            objD = aosv.D(ajcqVarX, ogsVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarAs = ((defpackage.ogr) aooc.ar(objD, defpackage.ogr.class)).as();
        ogsVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAs, ogsVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ac -> B:33:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00be -> B:33:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.ogp r18, aoln r19) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogu.b(ogp, aoln):java.lang.Object");
    }

    public final java.lang.Object c(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.e, this.k, new defpackage.ogf(this, (aoln) null, 2)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object d(defpackage.ogq ogqVar, boolean z, aoln aolnVar) {
        return ahvr.ag(this.e, this.k, new defpackage.hyg(this, z, ogqVar, (aoln) null, 7)).a(aolnVar);
    }
}
