package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lug {
    public static final aimz a = aimz.i("com/android/dialer/contactchecker/remote/ContactCheckerRemote");
    public final aoss b;
    public final zdt c;
    public zfu d;
    private final aoss e;
    private final aoin f;
    private final aoin g;
    private final aoin h;
    private final ahda i;
    private final afpl j;

    public lug(afpl afplVar, aoss aossVar, aoss aossVar2, zdt zdtVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "blockingScope");
        aooh.f(zdtVar, "commander");
        aooh.f(aoinVar, "rejectRetryLimit");
        aooh.f(aoinVar2, "timeoutRetryLimit");
        aooh.f(aoinVar3, "enableNonAckTransportation");
        this.j = afplVar;
        this.e = aossVar;
        this.b = aossVar2;
        this.c = zdtVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = aoinVar3;
        this.i = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.lue lueVar;
        if (aolnVar instanceof defpackage.lue) {
            lueVar = (defpackage.lue) aolnVar;
            int i = lueVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lueVar.c = i - Integer.MIN_VALUE;
            } else {
                lueVar = new defpackage.lue(this, aolnVar);
            }
        } else {
            lueVar = new defpackage.lue(this, aolnVar);
        }
        java.lang.Object objD = lueVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lueVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.j.X();
            lueVar.c = 1;
            objD = aosv.D(ajcqVarX, lueVar);
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
        ajcq ajcqVarAs = ((defpackage.lud) aooc.ar(objD, defpackage.lud.class)).as();
        lueVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAs, lueVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0090 -> B:35:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.ltu r18, aoln r19) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lug.b(ltu, aoln):java.lang.Object");
    }

    public final java.lang.Object c(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.e, this.i, new defpackage.ksy(this, (aoln) null, 18)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final boolean d() {
        zfu zfuVar = this.d;
        return (zfuVar == null || zfuVar.g) ? false : true;
    }

    public final java.lang.Object e(defpackage.luc lucVar, aoln aolnVar) {
        return ahvr.ag(this.e, this.i, new defpackage.kqd(this, lucVar, (aoln) null, 9, (byte[]) null)).a(aolnVar);
    }
}
