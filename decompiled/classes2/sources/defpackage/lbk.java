package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lbk implements afig {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ lbk(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final java.lang.Object a(adag adagVar) {
        java.lang.Integer numE;
        switch (this.$cid) {
            case 0:
                long j = this.a;
                aimz aimzVar = lbl.a;
                adag adagVar2 = new adag((byte[]) null);
                adagVar2.n("SELECT call_creation_time_millis,call_recording_details FROM call_recording_info WHERE call_creation_time_millis < ?");
                adagVar2.o(java.lang.Long.valueOf(j));
                android.database.Cursor cursorY = adagVar.y(adagVar2.B());
                try {
                    if (cursorY.moveToFirst()) {
                        int columnIndexOrThrow = cursorY.getColumnIndexOrThrow("call_creation_time_millis");
                        int columnIndexOrThrow2 = cursorY.getColumnIndexOrThrow("call_recording_details");
                        aigb aigbVar = new aigb(4);
                        do {
                            aigbVar.i(java.lang.Long.valueOf(cursorY.getString(columnIndexOrThrow)), kui.a.m().e(cursorY.getBlob(columnIndexOrThrow2), akzq.a()).p());
                        } while (cursorY.moveToNext());
                        numE = aigbVar.e(true);
                    } else {
                        numE = aikj.b;
                    }
                    if (cursorY != null) {
                        cursorY.close();
                    }
                } catch (java.lang.Throwable th) {
                    if (cursorY != null) {
                        try {
                            cursorY.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        break;
                    }
                    throw th;
                }
                break;
            case 1:
                long j2 = this.a;
                aimz aimzVar2 = lbl.a;
                adag adagVar3 = new adag((byte[]) null);
                adagVar3.n("SELECT COUNT(*) FROM call_recording_info WHERE call_creation_time_millis > ?");
                adagVar3.o(java.lang.Long.valueOf(j2));
                android.database.Cursor cursorY2 = adagVar.y(adagVar3.B());
                try {
                    cursorY2.moveToFirst();
                    numE = java.lang.Integer.valueOf(cursorY2.getInt(0));
                    if (cursorY2 != null) {
                        cursorY2.close();
                    }
                } catch (java.lang.Throwable th3) {
                    if (cursorY2 != null) {
                        try {
                            cursorY2.close();
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        break;
                    }
                    throw th3;
                }
                break;
            case 2:
                aify aifyVarAq = gus.aq(adagVar, nri.b, this.a);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                ailk ailkVarY = aifyVarAq.y(0);
                while (ailkVarY.hasNext()) {
                    java.lang.Object next = ailkVarY.next();
                    defpackage.nsp nspVar = (defpackage.nsp) next;
                    defpackage.nsq nsqVar = nspVar.e;
                    if (nsqVar == null) {
                        nsqVar = defpackage.nsq.a;
                    }
                    if ((nsqVar.b & 8) != 0) {
                        defpackage.nsq nsqVar2 = nspVar.e;
                        if (((nsqVar2 == null ? defpackage.nsq.a : nsqVar2).b & 8) != 0) {
                            if (nsqVar2 == null) {
                                nsqVar2 = defpackage.nsq.a;
                            }
                            defpackage.nsm nsmVar = nsqVar2.f;
                            if (nsmVar == null) {
                                nsmVar = defpackage.nsm.a;
                            }
                            int iAR = a.aR(nsmVar.n);
                            if (iAR == 0 || iAR != 4) {
                            }
                        }
                    }
                    arrayList.add(next);
                }
                aify<defpackage.nsp> aifyVarBv = ahvr.bv(arrayList);
                gus.ao(aifyVarBv, 2);
                gus.ao(aifyVarBv, 3);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(aifyVarBv, 10));
                for (defpackage.nsp nspVar2 : aifyVarBv) {
                    defpackage.nsq nsqVar3 = nspVar2.e;
                    if (nsqVar3 == null) {
                        nsqVar3 = defpackage.nsq.a;
                    }
                    aooh.e(nsqVar3, "getData(...)");
                    defpackage.npw npwVarAn = mni.an(nsqVar3.p());
                    defpackage.npw npwVarAp = mni.ap(npwVarAn.k().p());
                    npwVarAp.e("");
                    npwVarAn.n(npwVarAp.d());
                    defpackage.nss nssVar = ((defpackage.nsq) ((akzx) npwVarAn.a).b).d;
                    if (nssVar == null) {
                        nssVar = defpackage.nss.a;
                    }
                    aooh.e(nssVar, "getTranscriptInfo(...)");
                    defpackage.npw npwVarAm = mni.am(nssVar.p());
                    npwVarAm.j("");
                    npwVarAn.q(npwVarAm.i());
                    arrayList2.add(java.lang.Integer.valueOf(nri.o(adagVar, nspVar2.c, gus.an(nspVar2, npwVarAn.l())) ? 1 : 0));
                }
                return java.lang.Integer.valueOf(ajsz.bz(arrayList2));
            case 3:
                return gus.aq(adagVar, nri.e, this.a);
            case 4:
                aify aifyVarAq2 = gus.aq(adagVar, nri.b, this.a);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                ailk ailkVarY2 = aifyVarAq2.y(0);
                while (ailkVarY2.hasNext()) {
                    java.lang.Object next2 = ailkVarY2.next();
                    defpackage.nsp nspVar3 = (defpackage.nsp) next2;
                    defpackage.nsq nsqVar4 = nspVar3.e;
                    if (nsqVar4 == null) {
                        nsqVar4 = defpackage.nsq.a;
                    }
                    if ((nsqVar4.b & 8) != 0) {
                        defpackage.nsq nsqVar5 = nspVar3.e;
                        if (((nsqVar5 == null ? defpackage.nsq.a : nsqVar5).b & 8) != 0) {
                            if (nsqVar5 == null) {
                                nsqVar5 = defpackage.nsq.a;
                            }
                            defpackage.nsm nsmVar2 = nsqVar5.f;
                            if (nsmVar2 == null) {
                                nsmVar2 = defpackage.nsm.a;
                            }
                            int iAR2 = a.aR(nsmVar2.n);
                            if (iAR2 == 0 || iAR2 != 4) {
                            }
                        }
                    }
                    arrayList3.add(next2);
                }
                aify<defpackage.nsp> aifyVarBv2 = ahvr.bv(arrayList3);
                gus.ao(aifyVarBv2, 2);
                java.util.ArrayList arrayList4 = new java.util.ArrayList(ajsz.bl(aifyVarBv2, 10));
                for (defpackage.nsp nspVar4 : aifyVarBv2) {
                    defpackage.nsq nsqVar6 = nspVar4.e;
                    if (nsqVar6 == null) {
                        nsqVar6 = defpackage.nsq.a;
                    }
                    aooh.e(nsqVar6, "getData(...)");
                    defpackage.npw npwVarAn2 = mni.an(nsqVar6.p());
                    defpackage.npw npwVarAp2 = mni.ap(npwVarAn2.k().p());
                    npwVarAp2.e("");
                    npwVarAn2.n(npwVarAp2.d());
                    arrayList4.add(java.lang.Integer.valueOf(nri.o(adagVar, nspVar4.c, gus.an(nspVar4, npwVarAn2.l())) ? 1 : 0));
                }
                return java.lang.Integer.valueOf(ajsz.bz(arrayList4));
            case 5:
                aify aifyVarAq3 = gus.aq(adagVar, nri.b, this.a);
                gus.ao(aifyVarAq3, 1);
                java.util.ArrayList arrayList5 = new java.util.ArrayList(ajsz.bl(aifyVarAq3, 10));
                ailk ailkVarY3 = aifyVarAq3.y(0);
                while (ailkVarY3.hasNext()) {
                    defpackage.nsp nspVar5 = (defpackage.nsp) ailkVarY3.next();
                    defpackage.npw npwVarAw = mni.aw(defpackage.nsm.a.m());
                    npwVarAw.w(false);
                    npwVarAw.u(false);
                    defpackage.npw npwVarAn3 = mni.an(gus.ap(nspVar5, npwVarAw.t()).p());
                    defpackage.nso nsoVar = ((defpackage.nsq) ((akzx) npwVarAn3.a).b).c;
                    if (nsoVar == null) {
                        nsoVar = defpackage.nso.a;
                    }
                    aooh.e(nsoVar, "getLogsInfo(...)");
                    defpackage.npw npwVarAv = mni.av(nsoVar.p());
                    npwVarAv.s("");
                    npwVarAn3.p(npwVarAv.r());
                    arrayList5.add(java.lang.Integer.valueOf(nri.o(adagVar, nspVar5.c, npwVarAn3.l()) ? 1 : 0));
                }
                return java.lang.Integer.valueOf(ajsz.bz(arrayList5));
            case 6:
                aimz aimzVar3 = nri.a;
                return gus.as(adagVar, this.a);
            default:
                return wqr.j(adagVar, this.a);
        }
        return numE;
    }
}
