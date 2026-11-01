package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class yvh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl");
    public final defpackage.aolr b;
    public final defpackage.tmi c;
    private final defpackage.aoss d;
    private final defpackage.ugs e;
    private final yth f;
    private final ysb g;
    private final defpackage.zzx h;

    public yvh(defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.ugs ugsVar, yth ythVar, ysb ysbVar, defpackage.zzx zzxVar, defpackage.tmi tmiVar) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        defpackage.aooh.f(ysbVar, "aiCoreAvailability");
        defpackage.aooh.f(tmiVar, "sharpieConfigProvider");
        this.d = aossVar;
        this.b = aolrVar;
        this.e = ugsVar;
        this.f = ythVar;
        this.g = ysbVar;
        this.h = zzxVar;
        this.c = tmiVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[Catch: abbe -> 0x00d6, TryCatch #0 {abbe -> 0x00d6, blocks: (B:13:0x002f, B:40:0x00d3, B:18:0x003e, B:32:0x008d, B:35:0x0097, B:36:0x00ad, B:37:0x00b2, B:38:0x00b3, B:21:0x0044, B:26:0x0057, B:28:0x005f, B:30:0x0081, B:24:0x004b), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad A[Catch: abbe -> 0x00d6, TryCatch #0 {abbe -> 0x00d6, blocks: (B:13:0x002f, B:40:0x00d3, B:18:0x003e, B:32:0x008d, B:35:0x0097, B:36:0x00ad, B:37:0x00b2, B:38:0x00b3, B:21:0x0044, B:26:0x0057, B:28:0x005f, B:30:0x0081, B:24:0x004b), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: abbe -> 0x00d6, TryCatch #0 {abbe -> 0x00d6, blocks: (B:13:0x002f, B:40:0x00d3, B:18:0x003e, B:32:0x008d, B:35:0x0097, B:36:0x00ad, B:37:0x00b2, B:38:0x00b3, B:21:0x0044, B:26:0x0057, B:28:0x005f, B:30:0x0081, B:24:0x004b), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object a(zdm zdmVar, defpackage.aoln aolnVar) {
        defpackage.aoln yvbVar;
        zdm zdmVar2;
        zdm zdmVar3;
        int iOrdinal;
        defpackage.ugs ugsVar;
        if (aolnVar instanceof yvb) {
            yvbVar = (yvb) aolnVar;
            int i = ((yvb) yvbVar).d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ((yvb) yvbVar).d = i - Integer.MIN_VALUE;
            } else {
                yvbVar = new yvb(this, aolnVar);
            }
        } else {
            yvbVar = new yvb(this, aolnVar);
        }
        java.lang.Object objG = ((yvb) yvbVar).b;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = ((yvb) yvbVar).d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    java.lang.Object obj2 = ((yvb) yvbVar).a;
                    defpackage.aooc.af(objG);
                    zdmVar2 = obj2;
                } else if (i2 == 2) {
                    java.lang.Object obj3 = ((yvb) yvbVar).a;
                    defpackage.aooc.af(objG);
                    zdmVar3 = obj3;
                    zdmVar3 = zdmVar2;
                    iOrdinal = ((zdp) objG).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            throw new defpackage.aois();
                        }
                        ((defpackage.aimw) a.b().l("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl", "awaitDownloadHadesProtectionForRole", 109, "SharpieDownloaderImpl.kt")).y("Hades protection already downloaded for role: %s", zdmVar3);
                        return java.lang.Boolean.TRUE;
                    }
                    ((defpackage.aimw) a.b().l("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl", "awaitDownloadHadesProtectionForRole", 113, "SharpieDownloaderImpl.kt")).y("Attempting to download Hades protection for role: %s", zdmVar3);
                    ugsVar = this.e;
                    ((yvb) yvbVar).a = null;
                    ((yvb) yvbVar).d = 3;
                    if (ugsVar.c(zdmVar3, yvbVar) == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.aooc.af(objG);
                }
                return java.lang.Boolean.TRUE;
            }
            defpackage.aooc.af(objG);
            defpackage.ugs ugsVar2 = this.e;
            ((yvb) yvbVar).a = zdmVar;
            ((yvb) yvbVar).d = 1;
            objG = ugsVar2.g(zdmVar, yvbVar);
            zdmVar2 = zdmVar;
            if (objG == obj) {
                return obj;
            }
            if (!((java.lang.Boolean) objG).booleanValue()) {
                ((defpackage.aimw) a.b().l("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl", "awaitDownloadHadesProtectionForRole", 101, "SharpieDownloaderImpl.kt")).y("Moirai integration not available for role: %s", zdmVar2);
                this.h.l(new defpackage.zbq(zbr.ar));
                return java.lang.Boolean.FALSE;
            }
            defpackage.ugs ugsVar3 = this.e;
            ((yvb) yvbVar).a = zdmVar2;
            ((yvb) yvbVar).d = 2;
            objG = ugsVar3.f(zdmVar2, yvbVar);
            if (objG == obj) {
                zdmVar3 = zdmVar2;
                return obj;
            }
            zdmVar3 = zdmVar2;
            iOrdinal = ((zdp) objG).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    throw new defpackage.aois();
                }
                ((defpackage.aimw) a.b().l("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl", "awaitDownloadHadesProtectionForRole", 109, "SharpieDownloaderImpl.kt")).y("Hades protection already downloaded for role: %s", zdmVar3);
                return java.lang.Boolean.TRUE;
            }
            ((defpackage.aimw) a.b().l("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl", "awaitDownloadHadesProtectionForRole", 113, "SharpieDownloaderImpl.kt")).y("Attempting to download Hades protection for role: %s", zdmVar3);
            ugsVar = this.e;
            ((yvb) yvbVar).a = null;
            ((yvb) yvbVar).d = 3;
            if (ugsVar.c(zdmVar3, yvbVar) == obj) {
                return obj;
            }
            return java.lang.Boolean.TRUE;
        } catch (defpackage.abbe e) {
            boolean zA = e.a();
            defpackage.aimz aimzVar = a;
            if (zA) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).k(e).l("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl", "awaitDownloadHadesProtectionForRole", 123, "SharpieDownloaderImpl.kt")).v("Retryable MoiraiException caught while downloading Hades protections");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).k(e).l("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl", "awaitDownloadHadesProtectionForRole", 128, "SharpieDownloaderImpl.kt")).v("MoiraiException caught while downloading Hades protections");
            }
            this.h.l(new defpackage.zbq(zbr.ao));
            return java.lang.Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        yvc yvcVar;
        ysc yscVar;
        boolean zBooleanValue;
        java.util.ArrayList arrayList;
        yta ytaVar;
        yuy yuyVar;
        if (aolnVar instanceof yvc) {
            yvcVar = (yvc) aolnVar;
            int i = yvcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yvcVar.c = i - Integer.MIN_VALUE;
            } else {
                yvcVar = new yvc(this, aolnVar);
            }
        } else {
            yvcVar = new yvc(this, aolnVar);
        }
        java.lang.Object objA = yvcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = yvcVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yscVar = yvcVar.d;
                defpackage.aooc.af(objA);
            }
            zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
            arrayList = new java.util.ArrayList();
            if (!yscVar.b) {
                arrayList.add(yuy.a);
            }
            ytaVar = yscVar.a;
            defpackage.aooh.f(ytaVar, "<this>");
            switch (ytaVar.ordinal()) {
                case 0:
                    yuyVar = yuy.b;
                    break;
                case 1:
                    yuyVar = yuy.c;
                    break;
                case 2:
                    yuyVar = yuy.d;
                    break;
                case 3:
                    yuyVar = yuy.e;
                    break;
                case 4:
                    yuyVar = yuy.f;
                    break;
                case 5:
                    yuyVar = null;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    yuyVar = yuy.g;
                    break;
                default:
                    throw new defpackage.aois();
            }
            if (yuyVar != null) {
                arrayList.add(yuyVar);
            }
            if (!zBooleanValue) {
                arrayList.add(yuy.i);
            }
            return arrayList.isEmpty() ? yuz.a : new yux(arrayList);
        }
        defpackage.aooc.af(objA);
        yvcVar.c = 1;
        objA = this.g.a(yse.d, yvcVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        ysc yscVar2 = (ysc) objA;
        ugv ugvVar = ugv.d;
        yvcVar.d = yscVar2;
        yvcVar.c = 2;
        java.lang.Object objF = f(ugvVar, yvcVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        objA = objF;
        yscVar = yscVar2;
        zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
        arrayList = new java.util.ArrayList();
        if (!yscVar.b) {
            arrayList.add(yuy.a);
        }
        ytaVar = yscVar.a;
        defpackage.aooh.f(ytaVar, "<this>");
        switch (ytaVar.ordinal()) {
            case 0:
                yuyVar = yuy.b;
                break;
            case 1:
                yuyVar = yuy.c;
                break;
            case 2:
                yuyVar = yuy.d;
                break;
            case 3:
                yuyVar = yuy.e;
                break;
            case 4:
                yuyVar = yuy.f;
                break;
            case 5:
                yuyVar = null;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                yuyVar = yuy.g;
                break;
            default:
                throw new defpackage.aois();
        }
        if (yuyVar != null) {
            arrayList.add(yuyVar);
        }
        if (!zBooleanValue) {
            arrayList.add(yuy.i);
        }
        if (arrayList.isEmpty()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        yvd yvdVar;
        if (aolnVar instanceof yvd) {
            yvdVar = (yvd) aolnVar;
            int i = yvdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yvdVar.c = i - Integer.MIN_VALUE;
            } else {
                yvdVar = new yvd(this, aolnVar);
            }
        } else {
            yvdVar = new yvd(this, aolnVar);
        }
        java.lang.Object objF = yvdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = yvdVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objF);
            ugv ugvVar = ugv.c;
            yvdVar.c = 1;
            objF = f(ugvVar, yvdVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objF);
        }
        return ((java.lang.Boolean) objF).booleanValue() ? yuz.a : new yux(defpackage.ajsz.aY(yuy.h));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r7 != r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aoln r7) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvh.d(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        yvf yvfVar;
        if (aolnVar instanceof yvf) {
            yvfVar = (yvf) aolnVar;
            int i = yvfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yvfVar.c = i - Integer.MIN_VALUE;
            } else {
                yvfVar = new yvf(this, aolnVar);
            }
        } else {
            yvfVar = new yvf(this, aolnVar);
        }
        java.lang.Object objB = yvfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = yvfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objB);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objB);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objB);
        defpackage.tmi tmiVar = this.c;
        yvfVar.c = 1;
        objB = tmiVar.b(yvfVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        yus yusVar = ((yuw) objB).a;
        int iS = defpackage.anty.S(yusVar);
        if (iS == 0) {
            yse yseVar = yusVar.a;
            yvfVar.c = 2;
            defpackage.aoov.an(this.d, null, 0, new xtn(this, (defpackage.aoln) null, 5, (byte[]) null), 3);
            ((defpackage.aimw) a.b().l("com/google/android/callcoreshared/sharpie/downloader/SharpieDownloaderImpl", "downloadAiCoreModel", 138, "SharpieDownloaderImpl.kt")).v("maybe downloading AiCore model");
            this.f.c(yseVar);
            if (defpackage.aojh.a == aoluVar) {
                return aoluVar;
            }
        } else {
            if (iS != 1) {
                throw new defpackage.aois();
            }
            yvfVar.c = 3;
            defpackage.aoov.an(this.d, null, 0, new xtn(this, (defpackage.aoln) null, 6, (char[]) null), 3);
            if (defpackage.aojh.a == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(zdm zdmVar, defpackage.aoln aolnVar) {
        yvg yvgVar;
        if (aolnVar instanceof yvg) {
            yvgVar = (yvg) aolnVar;
            int i = yvgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yvgVar.c = i - Integer.MIN_VALUE;
            } else {
                yvgVar = new yvg(this, aolnVar);
            }
        } else {
            yvgVar = new yvg(this, aolnVar);
        }
        java.lang.Object objF = yvgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = yvgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objF);
            defpackage.ugs ugsVar = this.e;
            yvgVar.c = 1;
            objF = ugsVar.f(zdmVar, yvgVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objF);
        }
        return java.lang.Boolean.valueOf(objF == zdp.b);
    }
}
