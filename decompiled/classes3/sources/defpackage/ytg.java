package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytg implements defpackage.ysd {
    final /* synthetic */ defpackage.yth a;
    final /* synthetic */ defpackage.yse b;
    private long c;
    private final defpackage.ysd d;

    public ytg(defpackage.yth ythVar, defpackage.yse yseVar) {
        this.a = ythVar;
        this.b = yseVar;
        aoin aoinVar = (aoin) ythVar.e.k().get(yseVar);
        this.d = aoinVar != null ? (defpackage.ysd) aoinVar.a() : null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ysd
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ytb ytbVar;
        if (aolnVar instanceof defpackage.ytb) {
            ytbVar = (defpackage.ytb) aolnVar;
            int i = ytbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ytbVar.c = i - Integer.MIN_VALUE;
            } else {
                ytbVar = new defpackage.ytb(this, aolnVar);
            }
        } else {
            ytbVar = new defpackage.ytb(this, aolnVar);
        }
        java.lang.Object obj = ytbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ytbVar.c;
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
        aimw aimwVarL = defpackage.yth.a.b().l("com/google/android/callcoreshared/aicore/modeldownloader/AiCoreModelDownloaderImpl$requestDownload$<anonymous>$<anonymous>", "onDownloadCompleted", 142, "AiCoreModelDownloaderImpl.kt");
        defpackage.yse yseVar = this.b;
        aimwVarL.y("[%s] onDownloadCompleted", yseVar);
        defpackage.yth ythVar = this.a;
        xtq xtqVarE = wsc.E(ysv.a.m());
        xtqVarE.i(defpackage.yqm.e(yseVar));
        xtqVarE.h(16);
        ythVar.f.l(new ysw(xtqVarE.g()));
        defpackage.ysd ysdVar = this.d;
        if (ysdVar != null) {
            ytbVar.c = 1;
            if (ysdVar.a(ytbVar) == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.yth ythVar2 = this.a;
        defpackage.yse yseVar2 = this.b;
        defpackage.yta ytaVar = defpackage.yta.f;
        ytbVar.c = 2;
        if (ythVar2.b(yseVar2, ytaVar, ytbVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ysd
    public final java.lang.Object b(defpackage.ymi ymiVar, aoln aolnVar) {
        defpackage.ytc ytcVar;
        if (aolnVar instanceof defpackage.ytc) {
            ytcVar = (defpackage.ytc) aolnVar;
            int i = ytcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ytcVar.c = i - Integer.MIN_VALUE;
            } else {
                ytcVar = new defpackage.ytc(this, aolnVar);
            }
        } else {
            ytcVar = new defpackage.ytc(this, aolnVar);
        }
        java.lang.Object obj = ytcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ytcVar.c;
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
        aimw aimwVarL = defpackage.yth.a.b().l("com/google/android/callcoreshared/aicore/modeldownloader/AiCoreModelDownloaderImpl$requestDownload$<anonymous>$<anonymous>", "onDownloadDidNotStart", 80, "AiCoreModelDownloaderImpl.kt");
        defpackage.yse yseVar = this.b;
        aimwVarL.I("[%s] onDownloadDidNotStart: %s", yseVar, ymiVar);
        defpackage.yth ythVar = this.a;
        xtq xtqVarE = wsc.E(ysv.a.m());
        xtqVarE.i(defpackage.yqm.e(yseVar));
        xtqVarE.h(15);
        ythVar.f.l(new ysw(xtqVarE.g()));
        defpackage.ysd ysdVar = this.d;
        if (ysdVar != null) {
            ytcVar.c = 1;
            if (ysdVar.b(ymiVar, ytcVar) == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.yth ythVar2 = this.a;
        defpackage.yse yseVar2 = this.b;
        defpackage.yta ytaVar = defpackage.yta.d;
        ytcVar.c = 2;
        if (ythVar2.b(yseVar2, ytaVar, ytcVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ysd
    public final java.lang.Object c(int i, defpackage.ymi ymiVar, aoln aolnVar) {
        defpackage.ytd ytdVar;
        defpackage.yth ythVar;
        defpackage.yse yseVar;
        if (aolnVar instanceof defpackage.ytd) {
            ytdVar = (defpackage.ytd) aolnVar;
            int i2 = ytdVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ytdVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ytdVar = new defpackage.ytd(this, aolnVar);
            }
        } else {
            ytdVar = new defpackage.ytd(this, aolnVar);
        }
        java.lang.Object obj = ytdVar.a;
        aolu aoluVar = aolu.a;
        int i3 = ytdVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                aooc.af(obj);
            } else if (i3 == 2) {
                aooc.af(obj);
                ythVar = this.a;
                yseVar = this.b;
                ytdVar.c = 3;
                if (ythVar.a(yseVar, 0.0f, ytdVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i3 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        aimw aimwVarL = defpackage.yth.a.b().l("com/google/android/callcoreshared/aicore/modeldownloader/AiCoreModelDownloaderImpl$requestDownload$<anonymous>$<anonymous>", "onDownloadFailed", 114, "AiCoreModelDownloaderImpl.kt");
        defpackage.yse yseVar2 = this.b;
        aimwVarL.M("[%s] onDownloadFailed: %s %s", yseVar2, new java.lang.Integer(i), ymiVar);
        defpackage.yth ythVar2 = this.a;
        xtq xtqVarE = wsc.E(ysv.a.m());
        xtqVarE.i(defpackage.yqm.e(yseVar2));
        xtqVarE.h(14);
        ythVar2.f.l(new ysw(xtqVarE.g()));
        defpackage.ysd ysdVar = this.d;
        if (ysdVar != null) {
            ytdVar.c = 1;
            if (ysdVar.c(i, ymiVar, ytdVar) == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.yth ythVar3 = this.a;
        defpackage.yse yseVar3 = this.b;
        defpackage.yta ytaVar = defpackage.yta.d;
        ytdVar.c = 2;
        if (ythVar3.b(yseVar3, ytaVar, ytdVar) == aoluVar) {
            return aoluVar;
        }
        ythVar = this.a;
        yseVar = this.b;
        ytdVar.c = 3;
        if (ythVar.a(yseVar, 0.0f, ytdVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ysd
    public final java.lang.Object d(long j, aoln aolnVar) {
        defpackage.yte yteVar;
        float f;
        if (aolnVar instanceof defpackage.yte) {
            yteVar = (defpackage.yte) aolnVar;
            int i = yteVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yteVar.d = i - Integer.MIN_VALUE;
            } else {
                yteVar = new defpackage.yte(this, aolnVar);
            }
        } else {
            yteVar = new defpackage.yte(this, aolnVar);
        }
        java.lang.Object obj = yteVar.b;
        aolu aoluVar = aolu.a;
        int i2 = yteVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                j = yteVar.a;
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
        defpackage.yth.a.b().l("com/google/android/callcoreshared/aicore/modeldownloader/AiCoreModelDownloaderImpl$requestDownload$<anonymous>$<anonymous>", "onDownloadProgress", 129, "AiCoreModelDownloaderImpl.kt").H("[%s] onDownloadProgress: %s", this.b, j);
        defpackage.ysd ysdVar = this.d;
        if (ysdVar != null) {
            yteVar.a = j;
            yteVar.d = 1;
            if (ysdVar.d(j, yteVar) == aoluVar) {
                return aoluVar;
            }
        }
        long j2 = this.c;
        if (j2 == 0) {
            f = 0.0f;
        } else {
            f = j > j2 ? 100.0f : (j * 100.0f) / j2;
        }
        defpackage.yth ythVar = this.a;
        defpackage.yse yseVar = this.b;
        yteVar.d = 2;
        if (ythVar.a(yseVar, f, yteVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ysd
    public final java.lang.Object e(long j, aoln aolnVar) {
        defpackage.ytf ytfVar;
        defpackage.yth ythVar;
        defpackage.yse yseVar;
        if (aolnVar instanceof defpackage.ytf) {
            ytfVar = (defpackage.ytf) aolnVar;
            int i = ytfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ytfVar.c = i - Integer.MIN_VALUE;
            } else {
                ytfVar = new defpackage.ytf(this, aolnVar);
            }
        } else {
            ytfVar = new defpackage.ytf(this, aolnVar);
        }
        java.lang.Object obj = ytfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ytfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else if (i2 == 2) {
                aooc.af(obj);
                ythVar = this.a;
                yseVar = this.b;
                ytfVar.c = 3;
                if (ythVar.a(yseVar, 0.0f, ytfVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.yth.a.b().l("com/google/android/callcoreshared/aicore/modeldownloader/AiCoreModelDownloaderImpl$requestDownload$<anonymous>$<anonymous>", "onDownloadStarted", 101, "AiCoreModelDownloaderImpl.kt").H("[%s] onDownloadStarted: %s", this.b, j);
        this.c = j;
        defpackage.ysd ysdVar = this.d;
        if (ysdVar != null) {
            ytfVar.c = 1;
            if (ysdVar.e(j, ytfVar) == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.yth ythVar2 = this.a;
        defpackage.yse yseVar2 = this.b;
        defpackage.yta ytaVar = defpackage.yta.e;
        ytfVar.c = 2;
        if (ythVar2.b(yseVar2, ytaVar, ytfVar) == aoluVar) {
            return aoluVar;
        }
        ythVar = this.a;
        yseVar = this.b;
        ytfVar.c = 3;
        if (ythVar.a(yseVar, 0.0f, ytfVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
