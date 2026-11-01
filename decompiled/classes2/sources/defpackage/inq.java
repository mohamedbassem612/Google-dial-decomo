package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class inq extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.inu d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inq(defpackage.inu inuVar, ifv ifvVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.d = inuVar;
        this.e = ifvVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return new defpackage.inq(this.d, (igf) this.e, (aoln) obj, 1).b(aojh.a);
        }
        return new defpackage.inq(this.d, (ifv) this.e, (aoln) obj, 0).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar;
        java.io.Closeable closeableZ;
        defpackage.inu inuVar;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.io.Closeable closeableZ2;
        defpackage.inu inuVar2;
        java.lang.Throwable th2;
        java.io.Closeable closeable2;
        defpackage.ihu ihuVar;
        if (this.$cid != 0) {
            aoluVar = aolu.a;
            int i = this.c;
            if (i != 0) {
                java.lang.Object obj2 = this.b;
                if (i != 1) {
                    defpackage.ihu ihuVar2 = (defpackage.ihu) obj2;
                    closeable2 = (java.io.Closeable) this.a;
                    try {
                        aooc.af(obj);
                        ihuVar = ihuVar2;
                    } catch (java.lang.Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th4) {
                            ajsz.ak(closeable2, th2);
                            throw th4;
                        }
                    }
                } else {
                    closeableZ2 = (java.io.Closeable) obj2;
                    inuVar2 = (defpackage.inu) this.a;
                    try {
                        aooc.af(obj);
                    } catch (java.lang.Throwable th5) {
                        th2 = th5;
                        closeable2 = closeableZ2;
                        throw th2;
                    }
                }
                ajsz.ak(closeable2, (java.lang.Throwable) null);
                return ihuVar;
            }
            aooc.af(obj);
            defpackage.inu inuVar3 = this.d;
            java.lang.Object obj3 = this.e;
            if (!ahvr.R(u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            closeableZ2 = ahvr.Z(128, "AudioPrismSessionImpl_start");
            try {
                defpackage.mfz mfzVar = inuVar3.e;
                gus.aw("Start");
                mfzVar.c();
                this.a = inuVar3;
                this.b = closeableZ2;
                this.c = 1;
                java.lang.Object objM = aosv.m(new defpackage.inp((igf) obj3, inuVar3, null), this);
                if (objM != aoluVar) {
                    inuVar2 = inuVar3;
                    obj = objM;
                }
            } catch (java.lang.Throwable th6) {
                th2 = th6;
                closeable2 = closeableZ2;
                throw th2;
            }
            defpackage.ihu ihuVar3 = (defpackage.ihu) obj;
            aimz aimzVar = defpackage.inu.a;
            defpackage.mfz mfzVar2 = inuVar2.e;
            gus.aw("Start");
            mfzVar2.c();
            defpackage.ijt ijtVar = inuVar2.f;
            this.a = closeableZ2;
            this.b = ihuVar3;
            this.c = 2;
            java.lang.Object objAj = aoov.aj(ijtVar.a, new defpackage.blj(ijtVar, ihuVar3, (aoln) null, 12), this);
            if (objAj != aoluVar) {
                objAj = aojh.a;
            }
            if (objAj != aoluVar) {
                ihuVar = ihuVar3;
                closeable2 = closeableZ2;
                ajsz.ak(closeable2, (java.lang.Throwable) null);
                return ihuVar;
            }
        } else {
            aoluVar = aolu.a;
            int i2 = this.c;
            if (i2 != 0) {
                java.lang.Object obj4 = this.b;
                if (i2 != 1) {
                    aolu aoluVar2 = (defpackage.ihw) obj4;
                    closeable = (java.io.Closeable) this.a;
                    try {
                        aooc.af(obj);
                        aoluVar = aoluVar2;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th8) {
                            ajsz.ak(closeable, th);
                            throw th8;
                        }
                    }
                } else {
                    closeableZ = (java.io.Closeable) obj4;
                    inuVar = (defpackage.inu) this.a;
                    try {
                        aooc.af(obj);
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        closeable = closeableZ;
                        throw th;
                    }
                }
                ajsz.ak(closeable, (java.lang.Throwable) null);
            } else {
                aooc.af(obj);
                defpackage.inu inuVar4 = this.d;
                java.lang.Object obj5 = this.e;
                if (!ahvr.R(u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                closeableZ = ahvr.Z(129, "AudioPrismSessionImpl_stop");
                try {
                    defpackage.mfz mfzVar3 = inuVar4.e;
                    gus.aw("Stop");
                    mfzVar3.c();
                    this.a = inuVar4;
                    this.b = closeableZ;
                    this.c = 1;
                    java.lang.Object objJ = inuVar4.j((ifv) obj5, this);
                    if (objJ != aoluVar) {
                        inuVar = inuVar4;
                        obj = objJ;
                    }
                } catch (java.lang.Throwable th10) {
                    th = th10;
                    closeable = closeableZ;
                    throw th;
                }
            }
            aolu aoluVar3 = (defpackage.ihw) obj;
            aimz aimzVar2 = defpackage.inu.a;
            defpackage.mfz mfzVar4 = inuVar.e;
            gus.aw("Stop");
            mfzVar4.c();
            defpackage.ijt ijtVar2 = inuVar.f;
            this.a = closeableZ;
            this.b = aoluVar3;
            this.c = 2;
            java.lang.Object objAj2 = aoov.aj(ijtVar2.a, new defpackage.blj(ijtVar2, (defpackage.ihw) aoluVar3, (aoln) null, 13), this);
            if (objAj2 != aoluVar) {
                objAj2 = aojh.a;
            }
            if (objAj2 != aoluVar) {
                aoluVar = aoluVar3;
                closeable = closeableZ;
                ajsz.ak(closeable, (java.lang.Throwable) null);
            }
        }
        return aoluVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inq(defpackage.inu inuVar, igf igfVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.d = inuVar;
        this.e = igfVar;
    }
}
