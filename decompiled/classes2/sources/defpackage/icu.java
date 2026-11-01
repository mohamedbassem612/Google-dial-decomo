package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class icu implements defpackage.ica {
    public static final aimz b = aimz.i("com/android/dialer/audio/recorder/impl/RecorderImpl");
    public final java.io.File c;
    public final aoss d;
    public final aolr e;
    public android.media.MediaCodec f;
    public int g;
    public int h;
    public android.media.MediaMuxer i;
    public final ahda j;
    public final aogy k;
    public final aogy l;
    public final rai m;
    private final defpackage.icm n;
    private final aoss o;
    private final aonj p;

    public icu(defpackage.icm icmVar, java.io.File file, rai raiVar, aoss aossVar, aoss aossVar2, aolr aolrVar) {
        aooh.f(aossVar, "blockingScope");
        aooh.f(aossVar2, "lightweightScope");
        aooh.f(aolrVar, "backgroundContext");
        this.n = icmVar;
        this.c = file;
        this.m = raiVar;
        this.d = aossVar;
        this.o = aossVar2;
        this.e = aolrVar;
        this.j = new ahda((byte[]) null);
        this.k = new aogy((byte[]) null, (byte[]) null);
        this.l = new aogy((byte[]) null, (byte[]) null);
        this.p = new aiuo(new defpackage.blq(this, (aoln) null, 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ica
    public final java.lang.Object a(boolean z, aoln aolnVar) {
        defpackage.ics icsVar;
        if (aolnVar instanceof defpackage.ics) {
            icsVar = (defpackage.ics) aolnVar;
            int i = icsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                icsVar.d = i - Integer.MIN_VALUE;
            } else {
                icsVar = new defpackage.ics(this, aolnVar);
            }
        } else {
            icsVar = new defpackage.ics(this, aolnVar);
        }
        java.lang.Object obj = icsVar.b;
        aolu aoluVar = aolu.a;
        int i2 = icsVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            aonj aonjVar = this.p;
            icsVar.a = z;
            icsVar.d = 1;
            if (aonjVar.a(icsVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
                return ((aoiw) obj).a;
            }
            z = icsVar.a;
            aooc.af(obj);
        }
        defpackage.icm icmVar = this.n;
        defpackage.icv icvVar = new defpackage.icv(z);
        icsVar.d = 2;
        java.lang.Object objE = icmVar.e(this, icvVar, icsVar);
        return objE != aoluVar ? objE : aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.icn icnVar;
        if (aolnVar instanceof defpackage.icn) {
            icnVar = (defpackage.icn) aolnVar;
            int i = icnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                icnVar.c = i - Integer.MIN_VALUE;
            } else {
                icnVar = new defpackage.icn(this, aolnVar);
            }
        } else {
            icnVar = new defpackage.icn(this, aolnVar);
        }
        java.lang.Object obj = icnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = icnVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            icnVar.c = 1;
            if (c(icnVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        aoov.an(this.o, (aolr) null, 0, new icp(this, (aoln) null, 1, (byte[]) null), 3);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.ico icoVar;
        if (aolnVar instanceof defpackage.ico) {
            icoVar = (defpackage.ico) aolnVar;
            int i = icoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                icoVar.c = i - Integer.MIN_VALUE;
            } else {
                icoVar = new defpackage.ico(this, aolnVar);
            }
        } else {
            icoVar = new defpackage.ico(this, aolnVar);
        }
        java.lang.Object obj = icoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = icoVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        aonj aonjVar = this.p;
        icoVar.c = 1;
        if (aonjVar.a(icoVar) == aoluVar) {
            return aoluVar;
        }
        aolr aolrVar = this.e;
        icp icpVar = new icp(this, (aoln) null, 0);
        icoVar.c = 2;
        if (aoov.aj(aolrVar, icpVar, icoVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.Throwable th, aoln aolnVar) {
        defpackage.icq icqVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.icq) {
            icqVar = (defpackage.icq) aolnVar;
            int i = icqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                icqVar.d = i - Integer.MIN_VALUE;
            } else {
                icqVar = new defpackage.icq(this, aolnVar);
            }
        } else {
            icqVar = new defpackage.icq(this, aolnVar);
        }
        java.lang.Object obj2 = icqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = icqVar.d;
        if (i2 == 0) {
            aooc.af(obj2);
            icqVar.a = th;
            icqVar.d = 1;
            if (c(icqVar) == aoluVar) {
                obj = th;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = icqVar.a;
            aooc.af(obj2);
            obj = obj3;
        }
        obj = th;
        aoov.an(this.o, (aolr) null, 0, new huk(this, (java.lang.Throwable) obj, (aoln) null, 8), 3);
        return aojh.a;
    }

    public final java.lang.Object e(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.e, new defpackage.icr(this, (aoln) null, 2, (byte[]) null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object f(aogy aogyVar, akzc akzcVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.d, this.j, new defpackage.ict(aogyVar, akzcVar, this, null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }
}
