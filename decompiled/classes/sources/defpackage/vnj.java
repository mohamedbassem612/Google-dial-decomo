package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vnj implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/receivers/VvmDailyWorker");
    public final defpackage.aolr b;
    public final defpackage.zzx c;
    private final defpackage.aoss d;
    private final defpackage.aoin e;
    private final defpackage.zjs f;
    private final defpackage.zjm g;

    public vnj(defpackage.aoss aossVar, defpackage.zzx zzxVar, defpackage.zjm zjmVar, defpackage.aoin aoinVar, defpackage.zjs zjsVar, defpackage.aolr aolrVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (zjsVar == null) {
            defpackage.aooh.i("dialerTelecom");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.d = aossVar;
        this.c = zzxVar;
        this.g = zjmVar;
        this.e = aoinVar;
        this.f = zjsVar;
        this.b = aolrVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        ((defpackage.aimw) a.b().l("com/android/dialer/voicemail/service/receivers/VvmDailyWorker", "startWork", 52, "VvmDailyWorker.kt")).v("startWork");
        return defpackage.aosv.F(this.d, 0, new defpackage.eee(this, (defpackage.aoln) null, 13), 3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [vcc] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    public final java.lang.Object c(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        defpackage.vng vngVar;
        java.lang.Object objD;
        java.lang.Object obj;
        android.telecom.PhoneAccountHandle phoneAccountHandle2;
        ?? r8;
        java.lang.Object obj2;
        ?? r9;
        java.lang.Object objD2;
        if (aolnVar instanceof defpackage.vng) {
            vngVar = (defpackage.vng) aolnVar;
            int i = vngVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vngVar.d = i - Integer.MIN_VALUE;
            } else {
                vngVar = new defpackage.vng(this, aolnVar);
            }
        } else {
            vngVar = new defpackage.vng(this, aolnVar);
        }
        java.lang.Object obj3 = vngVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vngVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = vngVar.e;
                defpackage.aooc.af(obj3);
                obj = obj3;
            } else {
                if (i2 == 2) {
                    java.lang.Object obj4 = vngVar.a;
                    phoneAccountHandle2 = vngVar.e;
                    defpackage.aooc.af(obj3);
                    r8 = obj4;
                    obj2 = obj3;
                    r9 = (java.lang.Boolean) obj2;
                    if (!r9.booleanValue() && ((java.lang.Boolean) this.e.a()).booleanValue()) {
                        defpackage.ajcq ajcqVarB = r8.b(phoneAccountHandle2);
                        vngVar.e = null;
                        vngVar.a = null;
                        vngVar.d = 3;
                        objD2 = defpackage.aosv.D(ajcqVarB, vngVar);
                        if (objD2 == aoluVar) {
                            r9 = objD2;
                            return aoluVar;
                        }
                    } else if (r9 == 0) {
                        defpackage.aooh.g();
                    }
                    return r9;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj3);
                r9 = obj3;
            }
            r9 = objD2;
            defpackage.aooh.e(r9, "await(...)");
            return r9;
        }
        defpackage.aooc.af(obj3);
        defpackage.ajcq ajcqVarK = this.g.k(phoneAccountHandle);
        vngVar.e = phoneAccountHandle;
        vngVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarK, vngVar);
        if (objD == aoluVar) {
            obj = objD;
            return aoluVar;
        }
        obj = objD;
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (!optional.isPresent()) {
            return java.lang.Boolean.FALSE;
        }
        defpackage.vcc vccVar = (defpackage.vcc) optional.orElseThrow();
        defpackage.ajcq ajcqVarD = vccVar.d(phoneAccountHandle);
        defpackage.aooh.e(ajcqVarD, "isVvmEnabled(...)");
        vngVar.e = phoneAccountHandle;
        vngVar.a = vccVar;
        vngVar.d = 2;
        java.lang.Object objD3 = defpackage.aosv.D(ajcqVarD, vngVar);
        if (objD3 == aoluVar) {
            return aoluVar;
        }
        phoneAccountHandle2 = phoneAccountHandle;
        r8 = vccVar;
        obj2 = objD3;
        r9 = (java.lang.Boolean) obj2;
        if (!r9.booleanValue()) {
        }
        if (r9 == 0) {
            defpackage.aooh.g();
        }
        return r9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [aoss] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final java.lang.Object d(defpackage.aoss aossVar, defpackage.aoln aolnVar) {
        defpackage.vnh vnhVar;
        ?? r9;
        if (aolnVar instanceof defpackage.vnh) {
            vnhVar = (defpackage.vnh) aolnVar;
            int i = vnhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnhVar.d = i - Integer.MIN_VALUE;
            } else {
                vnhVar = new defpackage.vnh(this, aolnVar);
            }
        } else {
            vnhVar = new defpackage.vnh(this, aolnVar);
        }
        java.lang.Object objD = vnhVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vnhVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = vnhVar.a;
                defpackage.aooc.af(objD);
                r9 = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            return new defpackage.gsf();
        }
        defpackage.aooc.af(objD);
        defpackage.ajcq ajcqVarD = this.f.d();
        vnhVar.a = aossVar;
        vnhVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarD, vnhVar);
        if (objD == aoluVar) {
            r9 = aossVar;
            return aoluVar;
        }
        r9 = aossVar;
        java.util.List list = (java.util.List) objD;
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(defpackage.aoov.am(r9, 0, new defpackage.bur(this, (android.telecom.PhoneAccountHandle) it.next(), (defpackage.aoln) null, 20), 3));
        }
        vnhVar.a = null;
        vnhVar.d = 2;
        if (defpackage.aooh.v(arrayList, vnhVar) == aoluVar) {
            return aoluVar;
        }
        return new defpackage.gsf();
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) throws java.lang.Throwable {
        vni vniVar;
        defpackage.vee veeVar;
        defpackage.ajcq ajcqVarI;
        if (aolnVar instanceof vni) {
            vniVar = (vni) aolnVar;
            int i = vniVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vniVar.c = i - Integer.MIN_VALUE;
            } else {
                vniVar = new vni(this, aolnVar);
            }
        } else {
            vniVar = new vni(this, aolnVar);
        }
        java.lang.Object objD = vniVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vniVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = vniVar.d;
                defpackage.aooc.af(objD);
            } else if (i2 == 2) {
                veeVar = vniVar.e;
                phoneAccountHandle = vniVar.d;
                defpackage.aooc.af(objD);
                ajcqVarI = veeVar.i(phoneAccountHandle);
                vniVar.d = null;
                vniVar.e = null;
                vniVar.c = 3;
                if (defpackage.aosv.D(ajcqVarI, vniVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objD);
        defpackage.ajcq ajcqVarM = this.g.m(phoneAccountHandle);
        vniVar.d = phoneAccountHandle;
        vniVar.c = 1;
        objD = defpackage.aosv.D(ajcqVarM, vniVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        j$.util.Optional optional = (j$.util.Optional) objD;
        if (optional.isPresent()) {
            veeVar = (defpackage.vee) optional.orElseThrow();
            defpackage.ajcq ajcqVarJ = veeVar.j(phoneAccountHandle);
            vniVar.d = phoneAccountHandle;
            vniVar.e = veeVar;
            vniVar.c = 2;
            if (defpackage.aosv.D(ajcqVarJ, vniVar) == aoluVar) {
                return aoluVar;
            }
            ajcqVarI = veeVar.i(phoneAccountHandle);
            vniVar.d = null;
            vniVar.e = null;
            vniVar.c = 3;
            if (defpackage.aosv.D(ajcqVarI, vniVar) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
