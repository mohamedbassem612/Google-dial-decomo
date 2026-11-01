package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ttw {
    private static final aimz a = aimz.i("com/android/dialer/sharpie/impl/storage/SharpieStorageDataWriter");
    private final tts b;
    private final long c;
    private final java.lang.String d;
    private final ucr e;
    private final defpackage.afpl f;

    public ttw(tts ttsVar, long j, java.lang.String str, ucr ucrVar, defpackage.afpl afplVar) {
        aooh.f(str, "callId");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        this.b = ttsVar;
        this.c = j;
        this.d = str;
        this.e = ucrVar;
        this.f = afplVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ttu ttuVar;
        if (aolnVar instanceof defpackage.ttu) {
            ttuVar = (defpackage.ttu) aolnVar;
            int i = ttuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttuVar.c = i - Integer.MIN_VALUE;
            } else {
                ttuVar = new defpackage.ttu(this, aolnVar);
            }
        } else {
            ttuVar = new defpackage.ttu(this, aolnVar);
        }
        java.lang.Object objD = ttuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ttuVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aooh.q((j$.util.Optional) objD);
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.f.X();
        ttuVar.c = 1;
        objD = aosv.D(ajcqVarX, ttuVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarR = ((defpackage.ttt) aooc.ar(objD, defpackage.ttt.class)).R();
        ttuVar.c = 2;
        objD = aosv.D(ajcqVarR, ttuVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object b(defpackage.ttg ttgVar, aoln aolnVar) {
        defpackage.ttv ttvVar;
        int i;
        int i2;
        int i3;
        hkd hkdVar;
        ajcq ajcqVarO;
        if (aolnVar instanceof defpackage.ttv) {
            ttvVar = (defpackage.ttv) aolnVar;
            int i4 = ttvVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ttvVar.c = i4 - Integer.MIN_VALUE;
            } else {
                ttvVar = new defpackage.ttv(this, aolnVar);
            }
        } else {
            ttvVar = new defpackage.ttv(this, aolnVar);
        }
        java.lang.Object objA = ttvVar.a;
        aolu aoluVar = aolu.a;
        int i5 = ttvVar.c;
        byte[] bArr = null;
        if (i5 != 0) {
            if (i5 == 1) {
                i2 = ttvVar.d;
                aooc.af(objA);
            } else if (i5 == 2) {
                i2 = ttvVar.d;
                aooc.af(objA);
                hkdVar = (hkd) objA;
                if (hkdVar != null && i2 == 2) {
                    udy udyVar = this.e;
                    java.lang.String str = hkdVar.c;
                    uek uekVar = udyVar.b;
                    uek uekVar2 = uekVar;
                    uex uexVar = uekVar2.h;
                    ajcq ajcqVarE = ahvr.E(new defpackage.rqy(uexVar, str, 9, bArr), uexVar.d);
                    ajcq ajcqVarA = uekVar2.i.a(defpackage.ugv.a);
                    defpackage.tak takVar = new defpackage.tak(uekVar, hkdVar, 17);
                    ajct ajctVar = uekVar2.d;
                    ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarE, ahvr.I(ajcqVarA, takVar, ajctVar)}).o(new onq(11), ajctVar);
                    ttvVar.d = 0;
                    ttvVar.c = 3;
                    if (aosv.D(ajcqVarO, ttvVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i5 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        if (!ttgVar.b) {
            a.b().l("com/android/dialer/sharpie/impl/storage/SharpieStorageDataWriter", "write", 46, "SharpieStorageDataWriter.kt").v("skip writing as scam detection was not run");
            return aojh.a;
        }
        boolean z = ttgVar.c;
        int i6 = true != z ? 1 : 2;
        if (z) {
            int i7 = ttgVar.d;
            if (i7 == 0) {
                i3 = 2;
            } else if (i7 == 1) {
                i3 = 3;
            } else if (i7 != 2) {
                i3 = i7 != 3 ? 0 : 5;
            } else {
                i3 = 4;
            }
            if (i3 == 0) {
                i3 = 1;
            }
            defpackage.tue tueVar = defpackage.tue.UNKNOWN;
            defpackage.tud tudVar = defpackage.tud.UNKNOWN;
            int i8 = i3 - 2;
            if (i8 == 1) {
                i = 4;
            } else if (i8 == 2) {
                i = 3;
            } else if (i8 == 3) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            i = 1;
        }
        j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(this.c);
        aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
        defpackage.ttk ttkVar = new defpackage.ttk(instantOfEpochMilli, this.d, i6, 1, i);
        tts ttsVar = this.b;
        ttvVar.d = i6;
        ttvVar.c = 1;
        java.lang.Object objAj = aoov.aj(ttsVar.b, new defpackage.rir(ttkVar, ttsVar, (aoln) null, 6), ttvVar);
        if (objAj != aoluVar) {
            objAj = aojh.a;
        }
        if (objAj == aoluVar) {
            return aoluVar;
        }
        i2 = i6;
        ttvVar.d = i2;
        ttvVar.c = 2;
        objA = a(ttvVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        hkdVar = (hkd) objA;
        if (hkdVar != null) {
            udy udyVar2 = this.e;
            java.lang.String str2 = hkdVar.c;
            uek uekVar3 = udyVar2.b;
            uek uekVar4 = uekVar3;
            uex uexVar2 = uekVar4.h;
            ajcq ajcqVarE2 = ahvr.E(new defpackage.rqy(uexVar2, str2, 9, bArr), uexVar2.d);
            ajcq ajcqVarA2 = uekVar4.i.a(defpackage.ugv.a);
            defpackage.tak takVar2 = new defpackage.tak(uekVar3, hkdVar, 17);
            ajct ajctVar2 = uekVar4.d;
            ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarE2, ahvr.I(ajcqVarA2, takVar2, ajctVar2)}).o(new onq(11), ajctVar2);
            ttvVar.d = 0;
            ttvVar.c = 3;
            if (aosv.D(ajcqVarO, ttvVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
