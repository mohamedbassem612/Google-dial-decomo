package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ysz extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysz(ucm ucmVar, defpackage.yse yseVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ucmVar;
        this.d = yseVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoxi) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:16:0x0029, B:36:0x00a4, B:38:0x00ae, B:40:0x00b7, B:42:0x00bb, B:44:0x00c2, B:43:0x00c0), top: B:74:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:16:0x0029, B:36:0x00a4, B:38:0x00ae, B:40:0x00b7, B:42:0x00bb, B:44:0x00c2, B:43:0x00c0), top: B:74:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:16:0x0029, B:36:0x00a4, B:38:0x00ae, B:40:0x00b7, B:42:0x00bb, B:44:0x00c2, B:43:0x00c0), top: B:74:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, usa] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [aoxi] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        aoxi aoxiVar;
        ?? r3;
        aoxi aoxiVar2;
        aoyq aoyqVarA;
        aoxi aoxiVar3;
        java.lang.Exception e;
        aoxi aoxiVar4;
        java.lang.Object obj2;
        defpackage.ury uryVar;
        defpackage.utm utmVar;
        defpackage.tgl tglVar;
        java.util.List listAY;
        defpackage.tgi tgiVar;
        if (this.$cid == 0) {
            aolu aoluVar = aolu.a;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    java.lang.Object obj3 = this.a;
                    aoxiVar = (aoxi) this.e;
                    aooc.af(obj);
                    r3 = obj3;
                } else if (i != 2) {
                    aooc.af(obj);
                } else {
                    aoxiVar2 = (aoxi) this.e;
                    aooc.af(obj);
                    aoyqVarA = ((ucm) this.c).a((defpackage.yse) this.d);
                    this.e = null;
                    this.b = 3;
                    if (aoov.aG(aoxiVar2, aoyqVarA, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            aooc.af(obj);
            aoxi aoxiVar5 = (aoxi) this.e;
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.d;
            this.e = aoxiVar5;
            this.a = aoxiVar5;
            this.b = 1;
            java.lang.Object objA = ((defpackage.ysy) ((ucm) obj4).c).a((defpackage.yse) obj5, this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            aoxiVar = aoxiVar5;
            obj = objA;
            r3 = aoxiVar;
            this.e = aoxiVar;
            this.a = null;
            this.b = 2;
            if (r3.a(obj, this) == aoluVar) {
                return aoluVar;
            }
            aoxiVar2 = aoxiVar;
            aoyqVarA = ((ucm) this.c).a((defpackage.yse) this.d);
            this.e = null;
            this.b = 3;
            if (aoov.aG(aoxiVar2, aoyqVarA, this) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.b;
        if (i2 == 0) {
            aooc.af(obj);
            aoxi aoxiVar6 = (aoxi) this.e;
            ucm ucmVar = (ucm) ((defpackage.utl) this.c).c.g().orElse((java.lang.Object) null);
            if (ucmVar == null) {
                defpackage.tgi tgiVar2 = new defpackage.tgi(new java.lang.RuntimeException("Tried to fetch keeper data when the feature is disabled."));
                this.b = 1;
                if (aoxiVar6.a(tgiVar2, this) == aoluVar2) {
                    return aoluVar2;
                }
            } else {
                java.lang.String str = ((defpackage.tei) this.d).a;
                int length = new aorg("[^0-9]").b(str, "").length();
                if (length == 10 || length == 11) {
                    try {
                        ajcq ajcqVarA = ucmVar.c.a(str);
                        this.e = aoxiVar6;
                        this.a = ucmVar;
                        this.b = 3;
                        java.lang.Object objD = aosv.D(ajcqVarA, this);
                        if (objD == aoluVar2) {
                            return aoluVar2;
                        }
                        aoxiVar4 = aoxiVar6;
                        obj = objD;
                        obj2 = ucmVar;
                        uryVar = (defpackage.ury) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
                        if (uryVar != null) {
                            utmVar = new defpackage.utm((ucm) obj2, uryVar);
                        } else {
                            utmVar = null;
                        }
                        if (utmVar != null) {
                            listAY = ajsz.aY(utmVar);
                        } else {
                            listAY = aokc.a;
                        }
                        tglVar = new defpackage.tgl(listAY);
                        this.e = aoxiVar4;
                        this.a = null;
                        this.b = 4;
                        if (aoxiVar4.a(tglVar, this) == aoluVar2) {
                            return aoluVar2;
                        }
                    } catch (java.lang.Exception e2) {
                        aoxiVar3 = aoxiVar6;
                        e = e2;
                        if (e instanceof java.util.concurrent.CancellationException) {
                            throw e;
                        }
                        defpackage.utl.a.b().k(e).l("com/android/dialer/timekeeper/search/TimeKeeperSearchDataSource", "search$<anonymous>", 56, "TimeKeeperSearchDataSource.kt").v("failed to fetch TimeKeeperDetails");
                        tgiVar = new defpackage.tgi(e);
                        this.e = null;
                        this.a = null;
                        this.b = 5;
                        if (aoxiVar3.a(tgiVar, this) == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                } else {
                    defpackage.tgj tgjVar = defpackage.tgj.a;
                    this.b = 2;
                    if (aoxiVar6.a(tgjVar, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            aooc.af(obj);
        } else if (i2 == 3) {
            obj2 = this.a;
            aoxiVar4 = (aoxi) this.e;
            try {
                aooc.af(obj);
                uryVar = (defpackage.ury) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
                if (uryVar != null) {
                    utmVar = new defpackage.utm((ucm) obj2, uryVar);
                } else {
                    utmVar = null;
                }
                if (utmVar != null) {
                    listAY = ajsz.aY(utmVar);
                } else {
                    listAY = aokc.a;
                }
                tglVar = new defpackage.tgl(listAY);
                this.e = aoxiVar4;
                this.a = null;
                this.b = 4;
                if (aoxiVar4.a(tglVar, this) == aoluVar2) {
                    return aoluVar2;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                aoxiVar3 = aoxiVar4;
                if (e instanceof java.util.concurrent.CancellationException) {
                    throw e;
                }
                defpackage.utl.a.b().k(e).l("com/android/dialer/timekeeper/search/TimeKeeperSearchDataSource", "search$<anonymous>", 56, "TimeKeeperSearchDataSource.kt").v("failed to fetch TimeKeeperDetails");
                tgiVar = new defpackage.tgi(e);
                this.e = null;
                this.a = null;
                this.b = 5;
                if (aoxiVar3.a(tgiVar, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
        } else if (i2 == 4) {
            aoxiVar3 = (aoxi) this.e;
            try {
                aooc.af(obj);
            } catch (java.lang.Exception e4) {
                e = e4;
                if (e instanceof java.util.concurrent.CancellationException) {
                    throw e;
                }
                defpackage.utl.a.b().k(e).l("com/android/dialer/timekeeper/search/TimeKeeperSearchDataSource", "search$<anonymous>", 56, "TimeKeeperSearchDataSource.kt").v("failed to fetch TimeKeeperDetails");
                tgiVar = new defpackage.tgi(e);
                this.e = null;
                this.a = null;
                this.b = 5;
                if (aoxiVar3.a(tgiVar, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
        } else {
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.c;
        if (i != 0) {
            defpackage.ysz yszVar = new defpackage.ysz((defpackage.utl) obj2, (defpackage.tei) this.d, aolnVar, 1);
            yszVar.e = obj;
            return yszVar;
        }
        defpackage.ysz yszVar2 = new defpackage.ysz((ucm) obj2, (defpackage.yse) this.d, aolnVar, 0);
        yszVar2.e = obj;
        return yszVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysz(defpackage.utl utlVar, defpackage.tei teiVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = utlVar;
        this.d = teiVar;
    }
}
